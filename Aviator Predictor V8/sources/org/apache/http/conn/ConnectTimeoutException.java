package org.apache.http.conn;

import java.io.InterruptedIOException;

@Deprecated
/* loaded from: classes.dex */
public class ConnectTimeoutException extends InterruptedIOException {
    public ConnectTimeoutException() {
        throw new RuntimeException("Stub!");
    }

    public ConnectTimeoutException(String message) {
        throw new RuntimeException("Stub!");
    }
}
