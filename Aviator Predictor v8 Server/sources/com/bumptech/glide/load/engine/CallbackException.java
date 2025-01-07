package com.bumptech.glide.load.engine;

/* loaded from: classes54.dex */
final class CallbackException extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    CallbackException(Throwable cause) {
        super("Unexpected exception thrown by non-Glide code", cause);
    }
}
