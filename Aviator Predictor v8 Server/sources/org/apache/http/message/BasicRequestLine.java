package org.apache.http.message;

import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;

@Deprecated
/* loaded from: classes.dex */
public class BasicRequestLine implements RequestLine {
    public BasicRequestLine(String method, String uri, ProtocolVersion version) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.RequestLine
    public String getMethod() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.RequestLine
    public ProtocolVersion getProtocolVersion() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.RequestLine
    public String getUri() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
}
