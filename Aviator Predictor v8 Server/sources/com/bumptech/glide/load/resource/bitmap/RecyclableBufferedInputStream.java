package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes54.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {
    private volatile byte[] buf;
    private final ArrayPool byteArrayPool;
    private int count;
    private int marklimit;
    private int markpos;
    private int pos;

    public RecyclableBufferedInputStream(@NonNull InputStream in, @NonNull ArrayPool byteArrayPool) {
        this(in, byteArrayPool, 65536);
    }

    @VisibleForTesting
    RecyclableBufferedInputStream(@NonNull InputStream in, @NonNull ArrayPool byteArrayPool, int bufferSize) {
        super(in);
        this.markpos = -1;
        this.byteArrayPool = byteArrayPool;
        this.buf = (byte[]) byteArrayPool.get(bufferSize, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream localIn;
        localIn = this.in;
        if (this.buf == null || localIn == null) {
            throw streamClosed();
        }
        return (this.count - this.pos) + localIn.available();
    }

    private static IOException streamClosed() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized void fixMarkLimit() {
        this.marklimit = this.buf.length;
    }

    public synchronized void release() {
        if (this.buf != null) {
            this.byteArrayPool.put(this.buf);
            this.buf = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.buf != null) {
            this.byteArrayPool.put(this.buf);
            this.buf = null;
        }
        InputStream localIn = this.in;
        this.in = null;
        if (localIn != null) {
            localIn.close();
        }
    }

    private int fillbuf(InputStream localIn, byte[] localBuf) throws IOException {
        if (this.markpos == -1 || this.pos - this.markpos >= this.marklimit) {
            int result = localIn.read(localBuf);
            if (result > 0) {
                this.markpos = -1;
                this.pos = 0;
                this.count = result;
            }
            return result;
        }
        if (this.markpos == 0 && this.marklimit > localBuf.length && this.count == localBuf.length) {
            int newLength = localBuf.length * 2;
            if (newLength > this.marklimit) {
                newLength = this.marklimit;
            }
            byte[] newbuf = (byte[]) this.byteArrayPool.get(newLength, byte[].class);
            System.arraycopy(localBuf, 0, newbuf, 0, localBuf.length);
            this.buf = newbuf;
            localBuf = newbuf;
            this.byteArrayPool.put(localBuf);
        } else if (this.markpos > 0) {
            System.arraycopy(localBuf, this.markpos, localBuf, 0, localBuf.length - this.markpos);
        }
        this.pos -= this.markpos;
        this.markpos = 0;
        this.count = 0;
        int bytesread = localIn.read(localBuf, this.pos, localBuf.length - this.pos);
        this.count = bytesread <= 0 ? this.pos : this.pos + bytesread;
        return bytesread;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int readlimit) {
        this.marklimit = Math.max(this.marklimit, readlimit);
        this.markpos = this.pos;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int r2 = -1;
        synchronized (this) {
            byte[] localBuf = this.buf;
            InputStream localIn = this.in;
            if (localBuf == null || localIn == null) {
                throw streamClosed();
            }
            if (this.pos < this.count || fillbuf(localIn, localBuf) != -1) {
                if (localBuf != this.buf && (localBuf = this.buf) == null) {
                    throw streamClosed();
                }
                if (this.count - this.pos > 0) {
                    int r22 = this.pos;
                    this.pos = r22 + 1;
                    r2 = localBuf[r22] & 255;
                }
            }
        }
        return r2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x000b, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:7:0x000a, B:13:0x0013, B:15:0x0017, B:16:0x001b, B:17:0x001c, B:19:0x0022, B:22:0x002a, B:24:0x0036, B:26:0x0045, B:28:0x0048, B:30:0x004c, B:32:0x004f, B:45:0x0057, B:34:0x0086, B:36:0x0092, B:46:0x005c, B:62:0x0064, B:48:0x0067, B:50:0x006b, B:53:0x006f, B:54:0x0073, B:55:0x0074, B:58:0x007c, B:59:0x008b, B:64:0x003e), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089 A[SYNTHETIC] */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int read(@androidx.annotation.NonNull byte[] r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            r5 = -1
            monitor-enter(r8)
            byte[] r1 = r8.buf     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Le
            java.io.IOException r5 = streamClosed()     // Catch: java.lang.Throwable -> Lb
            throw r5     // Catch: java.lang.Throwable -> Lb
        Lb:
            r5 = move-exception
            monitor-exit(r8)
            throw r5
        Le:
            if (r11 != 0) goto L13
            r5 = 0
        L11:
            monitor-exit(r8)
            return r5
        L13:
            java.io.InputStream r2 = r8.in     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L1c
            java.io.IOException r5 = streamClosed()     // Catch: java.lang.Throwable -> Lb
            throw r5     // Catch: java.lang.Throwable -> Lb
        L1c:
            int r6 = r8.pos     // Catch: java.lang.Throwable -> Lb
            int r7 = r8.count     // Catch: java.lang.Throwable -> Lb
            if (r6 >= r7) goto L5a
            int r6 = r8.count     // Catch: java.lang.Throwable -> Lb
            int r7 = r8.pos     // Catch: java.lang.Throwable -> Lb
            int r6 = r6 - r7
            if (r6 < r11) goto L3e
            r0 = r11
        L2a:
            int r6 = r8.pos     // Catch: java.lang.Throwable -> Lb
            java.lang.System.arraycopy(r1, r6, r9, r10, r0)     // Catch: java.lang.Throwable -> Lb
            int r6 = r8.pos     // Catch: java.lang.Throwable -> Lb
            int r6 = r6 + r0
            r8.pos = r6     // Catch: java.lang.Throwable -> Lb
            if (r0 == r11) goto L3c
            int r6 = r2.available()     // Catch: java.lang.Throwable -> Lb
            if (r6 != 0) goto L45
        L3c:
            r5 = r0
            goto L11
        L3e:
            int r6 = r8.count     // Catch: java.lang.Throwable -> Lb
            int r7 = r8.pos     // Catch: java.lang.Throwable -> Lb
            int r0 = r6 - r7
            goto L2a
        L45:
            int r10 = r10 + r0
            int r4 = r11 - r0
        L48:
            int r6 = r8.markpos     // Catch: java.lang.Throwable -> Lb
            if (r6 != r5) goto L5c
            int r6 = r1.length     // Catch: java.lang.Throwable -> Lb
            if (r4 < r6) goto L5c
            int r3 = r2.read(r9, r10, r4)     // Catch: java.lang.Throwable -> Lb
            if (r3 != r5) goto L86
            if (r4 == r11) goto L11
            int r5 = r11 - r4
            goto L11
        L5a:
            r4 = r11
            goto L48
        L5c:
            int r6 = r8.fillbuf(r2, r1)     // Catch: java.lang.Throwable -> Lb
            if (r6 != r5) goto L67
            if (r4 == r11) goto L11
            int r5 = r11 - r4
            goto L11
        L67:
            byte[] r6 = r8.buf     // Catch: java.lang.Throwable -> Lb
            if (r1 == r6) goto L74
            byte[] r1 = r8.buf     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto L74
            java.io.IOException r5 = streamClosed()     // Catch: java.lang.Throwable -> Lb
            throw r5     // Catch: java.lang.Throwable -> Lb
        L74:
            int r6 = r8.count     // Catch: java.lang.Throwable -> Lb
            int r7 = r8.pos     // Catch: java.lang.Throwable -> Lb
            int r6 = r6 - r7
            if (r6 < r4) goto L8b
            r3 = r4
        L7c:
            int r6 = r8.pos     // Catch: java.lang.Throwable -> Lb
            java.lang.System.arraycopy(r1, r6, r9, r10, r3)     // Catch: java.lang.Throwable -> Lb
            int r6 = r8.pos     // Catch: java.lang.Throwable -> Lb
            int r6 = r6 + r3
            r8.pos = r6     // Catch: java.lang.Throwable -> Lb
        L86:
            int r4 = r4 - r3
            if (r4 != 0) goto L92
            r5 = r11
            goto L11
        L8b:
            int r6 = r8.count     // Catch: java.lang.Throwable -> Lb
            int r7 = r8.pos     // Catch: java.lang.Throwable -> Lb
            int r3 = r6 - r7
            goto L7c
        L92:
            int r6 = r2.available()     // Catch: java.lang.Throwable -> Lb
            if (r6 != 0) goto L9c
            int r5 = r11 - r4
            goto L11
        L9c:
            int r10 = r10 + r3
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read(byte[], int, int):int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.buf == null) {
            throw new IOException("Stream is closed");
        }
        if (-1 == this.markpos) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.pos + " markLimit: " + this.marklimit);
        }
        this.pos = this.markpos;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long byteCount) throws IOException {
        if (byteCount < 1) {
            byteCount = 0;
        } else {
            byte[] localBuf = this.buf;
            if (localBuf == null) {
                throw streamClosed();
            }
            InputStream localIn = this.in;
            if (localIn == null) {
                throw streamClosed();
            }
            if (this.count - this.pos >= byteCount) {
                this.pos = (int) (this.pos + byteCount);
            } else {
                long read = this.count - this.pos;
                this.pos = this.count;
                if (this.markpos != -1 && byteCount <= this.marklimit) {
                    if (fillbuf(localIn, localBuf) == -1) {
                        byteCount = read;
                    } else if (this.count - this.pos >= byteCount - read) {
                        this.pos = (int) ((this.pos + byteCount) - read);
                    } else {
                        this.pos = this.count;
                        byteCount = (this.count + read) - this.pos;
                    }
                } else {
                    long skipped = localIn.skip(byteCount - read);
                    if (skipped > 0) {
                        this.markpos = -1;
                    }
                    byteCount = read + skipped;
                }
            }
        }
        return byteCount;
    }

    static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        InvalidMarkException(String detailMessage) {
            super(detailMessage);
        }
    }
}
