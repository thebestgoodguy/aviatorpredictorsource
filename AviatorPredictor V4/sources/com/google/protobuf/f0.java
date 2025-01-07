package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
class f0 extends InputStream {

    /* renamed from: e, reason: collision with root package name */
    private Iterator<ByteBuffer> f2866e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f2867f;

    /* renamed from: g, reason: collision with root package name */
    private int f2868g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f2869h;

    /* renamed from: i, reason: collision with root package name */
    private int f2870i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2871j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f2872k;

    /* renamed from: l, reason: collision with root package name */
    private int f2873l;

    /* renamed from: m, reason: collision with root package name */
    private long f2874m;

    f0(Iterable<ByteBuffer> iterable) {
        this.f2866e = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f2868g++;
        }
        this.f2869h = -1;
        if (a()) {
            return;
        }
        this.f2867f = d0.f2850e;
        this.f2869h = 0;
        this.f2870i = 0;
        this.f2874m = 0L;
    }

    private boolean a() {
        this.f2869h++;
        if (!this.f2866e.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f2866e.next();
        this.f2867f = next;
        this.f2870i = next.position();
        if (this.f2867f.hasArray()) {
            this.f2871j = true;
            this.f2872k = this.f2867f.array();
            this.f2873l = this.f2867f.arrayOffset();
        } else {
            this.f2871j = false;
            this.f2874m = z1.k(this.f2867f);
            this.f2872k = null;
        }
        return true;
    }

    private void d(int r22) {
        int r02 = this.f2870i + r22;
        this.f2870i = r02;
        if (r02 == this.f2867f.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f2869h == this.f2868g) {
            return -1;
        }
        int w4 = (this.f2871j ? this.f2872k[this.f2870i + this.f2873l] : z1.w(this.f2870i + this.f2874m)) & 255;
        d(1);
        return w4;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int r5, int r6) {
        if (this.f2869h == this.f2868g) {
            return -1;
        }
        int limit = this.f2867f.limit();
        int r12 = this.f2870i;
        int r02 = limit - r12;
        if (r6 > r02) {
            r6 = r02;
        }
        if (this.f2871j) {
            System.arraycopy(this.f2872k, r12 + this.f2873l, bArr, r5, r6);
        } else {
            int position = this.f2867f.position();
            this.f2867f.position(this.f2870i);
            this.f2867f.get(bArr, r5, r6);
            this.f2867f.position(position);
        }
        d(r6);
        return r6;
    }
}
