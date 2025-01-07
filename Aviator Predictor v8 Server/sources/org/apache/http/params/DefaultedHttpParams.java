package org.apache.http.params;

@Deprecated
/* loaded from: classes.dex */
public final class DefaultedHttpParams extends AbstractHttpParams {
    public DefaultedHttpParams(HttpParams local, HttpParams defaults) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams copy() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public Object getParameter(String name) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public boolean removeParameter(String name) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setParameter(String name, Object value) {
        throw new RuntimeException("Stub!");
    }

    public HttpParams getDefaults() {
        throw new RuntimeException("Stub!");
    }
}
