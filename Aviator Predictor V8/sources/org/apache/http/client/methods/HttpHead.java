package org.apache.http.client.methods;

import java.net.URI;

@Deprecated
/* loaded from: classes.dex */
public class HttpHead extends HttpRequestBase {
    public static final String METHOD_NAME = "HEAD";

    public HttpHead() {
        throw new RuntimeException("Stub!");
    }

    public HttpHead(URI uri) {
        throw new RuntimeException("Stub!");
    }

    public HttpHead(String uri) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        throw new RuntimeException("Stub!");
    }
}
