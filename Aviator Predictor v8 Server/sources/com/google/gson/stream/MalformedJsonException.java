package com.google.gson.stream;

import java.io.IOException;

/* loaded from: classes53.dex */
public final class MalformedJsonException extends IOException {
    private static final long serialVersionUID = 1;

    public MalformedJsonException(String msg) {
        super(msg);
    }

    public MalformedJsonException(String msg, Throwable throwable) {
        super(msg);
        initCause(throwable);
    }

    public MalformedJsonException(Throwable throwable) {
        initCause(throwable);
    }
}
