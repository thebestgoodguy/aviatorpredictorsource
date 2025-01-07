package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okio.GzipSource;
import okio.Okio;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;

/* loaded from: classes59.dex */
public final class BridgeInterceptor implements Interceptor {
    private final CookieJar cookieJar;

    public BridgeInterceptor(CookieJar cookieJar) {
        this.cookieJar = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request userRequest = chain.request();
        Request.Builder requestBuilder = userRequest.newBuilder();
        RequestBody body = userRequest.body();
        if (body != null) {
            MediaType contentType = body.contentType();
            if (contentType != null) {
                requestBuilder.header(HTTP.CONTENT_TYPE, contentType.toString());
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                requestBuilder.header(HTTP.CONTENT_LEN, Long.toString(contentLength));
                requestBuilder.removeHeader(HTTP.TRANSFER_ENCODING);
            } else {
                requestBuilder.header(HTTP.TRANSFER_ENCODING, HTTP.CHUNK_CODING);
                requestBuilder.removeHeader(HTTP.CONTENT_LEN);
            }
        }
        if (userRequest.header(HTTP.TARGET_HOST) == null) {
            requestBuilder.header(HTTP.TARGET_HOST, Util.hostHeader(userRequest.url(), false));
        }
        if (userRequest.header(HTTP.CONN_DIRECTIVE) == null) {
            requestBuilder.header(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
        }
        boolean transparentGzip = false;
        if (userRequest.header("Accept-Encoding") == null && userRequest.header("Range") == null) {
            transparentGzip = true;
            requestBuilder.header("Accept-Encoding", "gzip");
        }
        List<Cookie> cookies = this.cookieJar.loadForRequest(userRequest.url());
        if (!cookies.isEmpty()) {
            requestBuilder.header(SM.COOKIE, cookieHeader(cookies));
        }
        if (userRequest.header(HTTP.USER_AGENT) == null) {
            requestBuilder.header(HTTP.USER_AGENT, Version.userAgent());
        }
        Response networkResponse = chain.proceed(requestBuilder.build());
        HttpHeaders.receiveHeaders(this.cookieJar, userRequest.url(), networkResponse.headers());
        Response.Builder responseBuilder = networkResponse.newBuilder().request(userRequest);
        if (transparentGzip && "gzip".equalsIgnoreCase(networkResponse.header(HTTP.CONTENT_ENCODING)) && HttpHeaders.hasBody(networkResponse)) {
            GzipSource responseBody = new GzipSource(networkResponse.body().source());
            Headers strippedHeaders = networkResponse.headers().newBuilder().removeAll(HTTP.CONTENT_ENCODING).removeAll(HTTP.CONTENT_LEN).build();
            responseBuilder.headers(strippedHeaders);
            responseBuilder.body(new RealResponseBody(networkResponse.header(HTTP.CONTENT_TYPE), -1L, Okio.buffer(responseBody)));
        }
        return responseBuilder.build();
    }

    private String cookieHeader(List<Cookie> cookies) {
        StringBuilder cookieHeader = new StringBuilder();
        int size = cookies.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cookieHeader.append("; ");
            }
            Cookie cookie = cookies.get(i);
            cookieHeader.append(cookie.name()).append('=').append(cookie.value());
        }
        return cookieHeader.toString();
    }
}
