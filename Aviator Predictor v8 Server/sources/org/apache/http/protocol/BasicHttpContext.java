package org.apache.http.protocol;

@Deprecated
/* loaded from: classes.dex */
public class BasicHttpContext implements HttpContext {
    public BasicHttpContext() {
        throw new RuntimeException("Stub!");
    }

    public BasicHttpContext(HttpContext parentContext) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String id) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String id, Object obj) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String id) {
        throw new RuntimeException("Stub!");
    }
}
