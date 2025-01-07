package org.apache.http.params;

@Deprecated
/* loaded from: classes.dex */
public abstract class AbstractHttpParams implements HttpParams {
    protected AbstractHttpParams() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public long getLongParameter(String name, long defaultValue) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setLongParameter(String name, long value) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public int getIntParameter(String name, int defaultValue) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setIntParameter(String name, int value) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public double getDoubleParameter(String name, double defaultValue) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setDoubleParameter(String name, double value) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public boolean getBooleanParameter(String name, boolean defaultValue) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setBooleanParameter(String name, boolean value) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public boolean isParameterTrue(String name) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.params.HttpParams
    public boolean isParameterFalse(String name) {
        throw new RuntimeException("Stub!");
    }
}
