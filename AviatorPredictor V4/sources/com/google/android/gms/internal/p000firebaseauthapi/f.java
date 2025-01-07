package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f1631a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f1632b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f1633c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1634d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f1635e;

    /* renamed from: f, reason: collision with root package name */
    public static final lr f1636f;

    static {
        byte[] bArr = new byte[0];
        f1634d = bArr;
        f1635e = ByteBuffer.wrap(bArr);
        int r22 = lr.f1903e;
        f1636f = lr.n(bArr, 0, 0, false);
    }

    public static int a(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int d5 = d(length, bArr, 0, length);
        if (d5 == 0) {
            return 1;
        }
        return d5;
    }

    public static int c(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    static int d(int r12, byte[] bArr, int r32, int r4) {
        for (int r33 = 0; r33 < r4; r33++) {
            r12 = (r12 * 31) + bArr[r33];
        }
        return r12;
    }

    static Object e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    static Object f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    static Object g(Object obj, Object obj2) {
        return ((e0) obj).j().M((e0) obj2).i();
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f1632b);
    }

    public static boolean i(byte[] bArr) {
        return x1.e(bArr);
    }
}
