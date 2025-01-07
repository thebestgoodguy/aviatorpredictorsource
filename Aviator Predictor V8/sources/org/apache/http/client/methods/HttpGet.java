package org.apache.http.client.methods;

import java.net.URI;

@Deprecated
/* loaded from: classes.dex */
public class HttpGet extends HttpRequestBase {
    public static final String METHOD_NAME = "GET";

    public HttpGet() {
        throw new RuntimeException("Stub!");
    }

    public HttpGet(URI uri) {
        throw new RuntimeException("Stub!");
    }

    public HttpGet(String uri) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        throw new RuntimeException("Stub!");
    }
}
