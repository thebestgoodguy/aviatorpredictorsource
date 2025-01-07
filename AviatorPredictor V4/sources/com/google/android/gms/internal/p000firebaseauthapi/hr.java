package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class hr implements Iterable, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final hr f1739f = new er(f.f1634d);

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator f1740g;

    /* renamed from: h, reason: collision with root package name */
    private static final gr f1741h;

    /* renamed from: e, reason: collision with root package name */
    private int f1742e = 0;

    static {
        int r02 = tq.f2176a;
        f1741h = new gr(null);
        f1740g = new zq();
    }

    hr() {
    }

    public static hr A(byte[] bArr) {
        return B(bArr, 0, bArr.length);
    }

    public static hr B(byte[] bArr, int r4, int r5) {
        y(r4, r4 + r5, bArr.length);
        byte[] bArr2 = new byte[r5];
        System.arraycopy(bArr, r4, bArr2, 0, r5);
        return new er(bArr2);
    }

    public static hr C(String str) {
        return new er(str.getBytes(f.f1632b));
    }

    static hr D(byte[] bArr) {
        return new er(bArr);
    }

    static int y(int r32, int r4, int r5) {
        int r02 = r4 - r32;
        if ((r32 | r4 | r02 | (r5 - r4)) >= 0) {
            return r02;
        }
        if (r32 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + r32 + " < 0");
        }
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + r32 + ", " + r4);
        }
        throw new IndexOutOfBoundsException("End index: " + r4 + " >= " + r5);
    }

    public final String E(Charset charset) {
        return q() == 0 ? "" : v(charset);
    }

    public final boolean F() {
        return q() == 0;
    }

    public final byte[] G() {
        int q4 = q();
        if (q4 == 0) {
            return f.f1634d;
        }
        byte[] bArr = new byte[q4];
        r(bArr, 0, 0, q4);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int r02 = this.f1742e;
        if (r02 == 0) {
            int q4 = q();
            r02 = s(q4, 0, q4);
            if (r02 == 0) {
                r02 = 1;
            }
            this.f1742e = r02;
        }
        return r02;
    }

    public abstract byte i(int r12);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new yq(this);
    }

    abstract byte p(int r12);

    public abstract int q();

    protected abstract void r(byte[] bArr, int r22, int r32, int r4);

    protected abstract int s(int r12, int r22, int r32);

    public abstract hr t(int r12, int r22);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(q());
        objArr[2] = q() <= 50 ? g1.a(this) : g1.a(t(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract lr u();

    protected abstract String v(Charset charset);

    abstract void w(xq xqVar);

    public abstract boolean x();

    protected final int z() {
        return this.f1742e;
    }
}
