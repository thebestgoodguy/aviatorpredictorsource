package okhttp3.internal.http;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AUTH;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.protocol.HTTP;

/* loaded from: classes59.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private final boolean forWebSocket;
    private StreamAllocation streamAllocation;

    public RetryAndFollowUpInterceptor(OkHttpClient client, boolean forWebSocket) {
        this.client = client;
        this.forWebSocket = forWebSocket;
    }

    public void cancel() {
        this.canceled = true;
        StreamAllocation streamAllocation = this.streamAllocation;
        if (streamAllocation != null) {
            streamAllocation.cancel();
        }
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public void setCallStackTrace(Object callStackTrace) {
        this.callStackTrace = callStackTrace;
    }

    public StreamAllocation streamAllocation() {
        return this.streamAllocation;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response response;
        Request followUp;
        Request request = chain.request();
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        Call call = realChain.call();
        EventListener eventListener = realChain.eventListener();
        this.streamAllocation = new StreamAllocation(this.client.connectionPool(), createAddress(request.url()), call, eventListener, this.callStackTrace);
        int followUpCount = 0;
        Response priorResponse = null;
        while (!this.canceled) {
            boolean releaseConnection = true;
            try {
                try {
                    response = realChain.proceed(request, this.streamAllocation, null, null);
                    releaseConnection = false;
                    if (priorResponse != null) {
                        response = response.newBuilder().priorResponse(priorResponse.newBuilder().body(null).build()).build();
                    }
                    followUp = followUpRequest(response);
                } catch (IOException e) {
                    boolean requestSendStarted = !(e instanceof ConnectionShutdownException);
                    if (!recover(e, requestSendStarted, request)) {
                        throw e;
                    }
                    if (0 != 0) {
                        this.streamAllocation.streamFailed(null);
                        this.streamAllocation.release();
                    }
                } catch (RouteException e2) {
                    if (!recover(e2.getLastConnectException(), false, request)) {
                        throw e2.getLastConnectException();
                    }
                    if (0 != 0) {
                        this.streamAllocation.streamFailed(null);
                        this.streamAllocation.release();
                    }
                }
                if (followUp == null) {
                    if (!this.forWebSocket) {
                        this.streamAllocation.release();
                    }
                    return response;
                }
                Util.closeQuietly(response.body());
                followUpCount++;
                if (followUpCount > 20) {
                    this.streamAllocation.release();
                    throw new ProtocolException("Too many follow-up requests: " + followUpCount);
                }
                if (followUp.body() instanceof UnrepeatableRequestBody) {
                    this.streamAllocation.release();
                    throw new HttpRetryException("Cannot retry streamed HTTP body", response.code());
                }
                if (!sameConnection(response, followUp.url())) {
                    this.streamAllocation.release();
                    this.streamAllocation = new StreamAllocation(this.client.connectionPool(), createAddress(followUp.url()), call, eventListener, this.callStackTrace);
                } else if (this.streamAllocation.codec() != null) {
                    throw new IllegalStateException("Closing the body of " + response + " didn't close its backing stream. Bad interceptor?");
                }
                request = followUp;
                priorResponse = response;
            } finally {
                if (releaseConnection) {
                    this.streamAllocation.streamFailed(null);
                    this.streamAllocation.release();
                }
            }
        }
        this.streamAllocation.release();
        throw new IOException("Canceled");
    }

    private Address createAddress(HttpUrl url) {
        SSLSocketFactory sslSocketFactory = null;
        HostnameVerifier hostnameVerifier = null;
        CertificatePinner certificatePinner = null;
        if (url.isHttps()) {
            sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        }
        return new Address(url.host(), url.port(), this.client.dns(), this.client.socketFactory(), sslSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private boolean recover(IOException e, boolean requestSendStarted, Request userRequest) {
        this.streamAllocation.streamFailed(e);
        if (this.client.retryOnConnectionFailure()) {
            return !(requestSendStarted && (userRequest.body() instanceof UnrepeatableRequestBody)) && isRecoverable(e, requestSendStarted) && this.streamAllocation.hasMoreRoutes();
        }
        return false;
    }

    private boolean isRecoverable(IOException e, boolean requestSendStarted) {
        if (e instanceof ProtocolException) {
            return false;
        }
        if (e instanceof InterruptedIOException) {
            return (e instanceof SocketTimeoutException) && !requestSendStarted;
        }
        return (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private Request followUpRequest(Response userResponse) throws IOException {
        String location;
        HttpUrl url;
        Proxy selectedProxy;
        if (userResponse == null) {
            throw new IllegalStateException();
        }
        Connection connection = this.streamAllocation.connection();
        Route route = connection != null ? connection.route() : null;
        int responseCode = userResponse.code();
        String method = userResponse.request().method();
        switch (responseCode) {
            case HttpStatus.SC_MULTIPLE_CHOICES /* 300 */:
            case 301:
            case 302:
            case 303:
                break;
            case 307:
            case 308:
                if (!method.equals(HttpGet.METHOD_NAME) && !method.equals(HttpHead.METHOD_NAME)) {
                    return null;
                }
                break;
            case 401:
                return this.client.authenticator().authenticate(route, userResponse);
            case HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED /* 407 */:
                if (route != null) {
                    selectedProxy = route.proxy();
                } else {
                    selectedProxy = this.client.proxy();
                }
                if (selectedProxy.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.client.proxyAuthenticator().authenticate(route, userResponse);
            case HttpStatus.SC_REQUEST_TIMEOUT /* 408 */:
                if (!this.client.retryOnConnectionFailure() || (userResponse.request().body() instanceof UnrepeatableRequestBody)) {
                    return null;
                }
                if (userResponse.priorResponse() == null || userResponse.priorResponse().code() != 408) {
                    return userResponse.request();
                }
                return null;
            default:
                return null;
        }
        if (!this.client.followRedirects() || (location = userResponse.header("Location")) == null || (url = userResponse.request().url().resolve(location)) == null) {
            return null;
        }
        boolean sameScheme = url.scheme().equals(userResponse.request().url().scheme());
        if (!sameScheme && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder requestBuilder = userResponse.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            boolean maintainBody = HttpMethod.redirectsWithBody(method);
            if (HttpMethod.redirectsToGet(method)) {
                requestBuilder.method(HttpGet.METHOD_NAME, null);
            } else {
                RequestBody requestBody = maintainBody ? userResponse.request().body() : null;
                requestBuilder.method(method, requestBody);
            }
            if (!maintainBody) {
                requestBuilder.removeHeader(HTTP.TRANSFER_ENCODING);
                requestBuilder.removeHeader(HTTP.CONTENT_LEN);
                requestBuilder.removeHeader(HTTP.CONTENT_TYPE);
            }
        }
        if (!sameConnection(userResponse, url)) {
            requestBuilder.removeHeader(AUTH.WWW_AUTH_RESP);
        }
        return requestBuilder.url(url).build();
    }

    private boolean sameConnection(Response response, HttpUrl followUp) {
        HttpUrl url = response.request().url();
        return url.host().equals(followUp.host()) && url.port() == followUp.port() && url.scheme().equals(followUp.scheme());
    }
}
