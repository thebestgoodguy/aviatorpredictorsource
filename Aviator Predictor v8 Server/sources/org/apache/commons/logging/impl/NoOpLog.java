package org.apache.commons.logging.impl;

import java.io.Serializable;
import org.apache.commons.logging.Log;

@Deprecated
/* loaded from: classes.dex */
public class NoOpLog implements Log, Serializable {
    public NoOpLog() {
        throw new RuntimeException("Stub!");
    }

    public NoOpLog(String name) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object message) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object message, Throwable t) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object message) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object message, Throwable t) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object message) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object message, Throwable t) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object message) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object message, Throwable t) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object message) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object message, Throwable t) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object message) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object message, Throwable t) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isDebugEnabled() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isErrorEnabled() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isFatalEnabled() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isInfoEnabled() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isTraceEnabled() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isWarnEnabled() {
        throw new RuntimeException("Stub!");
    }
}
