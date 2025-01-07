package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes54.dex */
public class HttpUrlFetcher implements DataFetcher<InputStream> {

    @VisibleForTesting
    static final HttpUrlConnectionFactory DEFAULT_CONNECTION_FACTORY = new DefaultHttpUrlConnectionFactory();

    @VisibleForTesting
    static final int INVALID_STATUS_CODE = -1;
    private static final int MAXIMUM_REDIRECTS = 5;

    @VisibleForTesting
    static final String REDIRECT_HEADER_FIELD = "Location";
    private static final String TAG = "HttpUrlFetcher";
    private final HttpUrlConnectionFactory connectionFactory;
    private final GlideUrl glideUrl;
    private volatile boolean isCancelled;
    private InputStream stream;
    private final int timeout;
    private HttpURLConnection urlConnection;

    interface HttpUrlConnectionFactory {
        HttpURLConnection build(URL url) throws IOException;
    }

    public HttpUrlFetcher(GlideUrl glideUrl, int timeout) {
        this(glideUrl, timeout, DEFAULT_CONNECTION_FACTORY);
    }

    @VisibleForTesting
    HttpUrlFetcher(GlideUrl glideUrl, int timeout, HttpUrlConnectionFactory connectionFactory) {
        this.glideUrl = glideUrl;
        this.timeout = timeout;
        this.connectionFactory = connectionFactory;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super InputStream> callback) {
        long startTime = LogTime.getLogTime();
        try {
            try {
                InputStream result = loadDataWithRedirects(this.glideUrl.toURL(), 0, null, this.glideUrl.getHeaders());
                callback.onDataReady(result);
                if (Log.isLoggable(TAG, 2)) {
                    Log.v(TAG, "Finished http url fetcher fetch in " + LogTime.getElapsedMillis(startTime));
                }
            } catch (IOException e) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Failed to load data for url", e);
                }
                callback.onLoadFailed(e);
                if (Log.isLoggable(TAG, 2)) {
                    Log.v(TAG, "Finished http url fetcher fetch in " + LogTime.getElapsedMillis(startTime));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Finished http url fetcher fetch in " + LogTime.getElapsedMillis(startTime));
            }
            throw th;
        }
    }

    private InputStream loadDataWithRedirects(URL url, int redirects, URL lastUrl, Map<String, String> headers) throws HttpException {
        if (redirects >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (lastUrl != null) {
            try {
                if (url.toURI().equals(lastUrl.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException e) {
            }
        }
        this.urlConnection = buildAndConfigureConnection(url, headers);
        try {
            this.urlConnection.connect();
            this.stream = this.urlConnection.getInputStream();
            if (this.isCancelled) {
                return null;
            }
            int statusCode = getHttpStatusCodeOrInvalid(this.urlConnection);
            if (isHttpOk(statusCode)) {
                return getStreamForSuccessfulRequest(this.urlConnection);
            }
            if (isHttpRedirect(statusCode)) {
                String redirectUrlString = this.urlConnection.getHeaderField(REDIRECT_HEADER_FIELD);
                if (TextUtils.isEmpty(redirectUrlString)) {
                    throw new HttpException("Received empty or null redirect url", statusCode);
                }
                try {
                    URL redirectUrl = new URL(url, redirectUrlString);
                    cleanup();
                    return loadDataWithRedirects(redirectUrl, redirects + 1, url, headers);
                } catch (MalformedURLException e2) {
                    throw new HttpException("Bad redirect url: " + redirectUrlString, statusCode, e2);
                }
            }
            if (statusCode == -1) {
                throw new HttpException(statusCode);
            }
            try {
                throw new HttpException(this.urlConnection.getResponseMessage(), statusCode);
            } catch (IOException e3) {
                throw new HttpException("Failed to get a response message", statusCode, e3);
            }
        } catch (IOException e4) {
            throw new HttpException("Failed to connect or obtain data", getHttpStatusCodeOrInvalid(this.urlConnection), e4);
        }
    }

    private static int getHttpStatusCodeOrInvalid(HttpURLConnection urlConnection) {
        try {
            return urlConnection.getResponseCode();
        } catch (IOException e) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Failed to get a response code", e);
            }
            return -1;
        }
    }

    private HttpURLConnection buildAndConfigureConnection(URL url, Map<String, String> headers) throws HttpException {
        try {
            HttpURLConnection urlConnection = this.connectionFactory.build(url);
            for (Map.Entry<String, String> headerEntry : headers.entrySet()) {
                urlConnection.addRequestProperty(headerEntry.getKey(), headerEntry.getValue());
            }
            urlConnection.setConnectTimeout(this.timeout);
            urlConnection.setReadTimeout(this.timeout);
            urlConnection.setUseCaches(false);
            urlConnection.setDoInput(true);
            urlConnection.setInstanceFollowRedirects(false);
            return urlConnection;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    private static boolean isHttpOk(int statusCode) {
        return statusCode / 100 == 2;
    }

    private static boolean isHttpRedirect(int statusCode) {
        return statusCode / 100 == 3;
    }

    private InputStream getStreamForSuccessfulRequest(HttpURLConnection urlConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(urlConnection.getContentEncoding())) {
                int contentLength = urlConnection.getContentLength();
                this.stream = ContentLengthInputStream.obtain(urlConnection.getInputStream(), contentLength);
            } else {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Got non empty content encoding: " + urlConnection.getContentEncoding());
                }
                this.stream = urlConnection.getInputStream();
            }
            return this.stream;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", getHttpStatusCodeOrInvalid(urlConnection), e);
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        if (this.stream != null) {
            try {
                this.stream.close();
            } catch (IOException e) {
            }
        }
        if (this.urlConnection != null) {
            this.urlConnection.disconnect();
        }
        this.urlConnection = null;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
        this.isCancelled = true;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    private static class DefaultHttpUrlConnectionFactory implements HttpUrlConnectionFactory {
        DefaultHttpUrlConnectionFactory() {
        }

        @Override // com.bumptech.glide.load.data.HttpUrlFetcher.HttpUrlConnectionFactory
        public HttpURLConnection build(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }
}
