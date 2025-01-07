package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes54.dex */
public final class HttpException extends IOException {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(int statusCode) {
        this("Http request failed", statusCode);
    }

    @Deprecated
    public HttpException(String message) {
        this(message, -1);
    }

    public HttpException(String message, int statusCode) {
        this(message, statusCode, null);
    }

    public HttpException(String message, int statusCode, @Nullable Throwable cause) {
        super(message + ", status code: " + statusCode, cause);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
