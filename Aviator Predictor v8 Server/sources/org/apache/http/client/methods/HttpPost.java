package org.apache.http.client.methods;

import java.net.URI;

@Deprecated
/* loaded from: classes.dex */
public class HttpPost extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "POST";

    public HttpPost() {
        throw new RuntimeException("Stub!");
    }

    public HttpPost(URI uri) {
        throw new RuntimeException("Stub!");
    }

    public HttpPost(String uri) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        throw new RuntimeException("Stub!");
    }
}
