package com.bumptech.glide.util;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes54.dex */
public final class ExceptionPassthroughInputStream extends InputStream {

    @GuardedBy("POOL")
    private static final Queue<ExceptionPassthroughInputStream> POOL = Util.createQueue(0);
    private IOException exception;
    private InputStream wrapped;

    @NonNull
    public static ExceptionPassthroughInputStream obtain(@NonNull InputStream toWrap) {
        ExceptionPassthroughInputStream result;
        synchronized (POOL) {
            result = POOL.poll();
        }
        if (result == null) {
            result = new ExceptionPassthroughInputStream();
        }
        result.setInputStream(toWrap);
        return result;
    }

    static void clearQueue() {
        synchronized (POOL) {
            while (!POOL.isEmpty()) {
                POOL.remove();
            }
        }
    }

    ExceptionPassthroughInputStream() {
    }

    void setInputStream(@NonNull InputStream toWrap) {
        this.wrapped = toWrap;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.wrapped.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.wrapped.close();
    }

    @Override // java.io.InputStream
    public void mark(int readLimit) {
        this.wrapped.mark(readLimit);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.wrapped.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.wrapped.read();
        } catch (IOException e) {
            this.exception = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer) throws IOException {
        try {
            return this.wrapped.read(buffer);
        } catch (IOException e) {
            this.exception = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer, int byteOffset, int byteCount) throws IOException {
        try {
            return this.wrapped.read(buffer, byteOffset, byteCount);
        } catch (IOException e) {
            this.exception = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.wrapped.reset();
    }

    @Override // java.io.InputStream
    public long skip(long byteCount) throws IOException {
        try {
            return this.wrapped.skip(byteCount);
        } catch (IOException e) {
            this.exception = e;
            throw e;
        }
    }

    @Nullable
    public IOException getException() {
        return this.exception;
    }

    public void release() {
        this.exception = null;
        this.wrapped = null;
        synchronized (POOL) {
            POOL.offer(this);
        }
    }
}
