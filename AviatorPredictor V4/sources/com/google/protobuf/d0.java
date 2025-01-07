package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f2846a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f2847b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f2848c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f2849d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f2850e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f2851f;

    public interface a extends i<Boolean> {
    }

    public interface b extends i<Double> {
    }

    public interface c {
        int e();
    }

    public interface d<T extends c> {
        T a(int r12);
    }

    public interface e {
        boolean a(int r12);
    }

    public interface f extends i<Float> {
    }

    public interface g extends i<Integer> {
    }

    public interface h extends i<Long> {
    }

    public interface i<E> extends List<E>, RandomAccess {
        void h();

        i<E> k(int r12);

        boolean n();
    }

    static {
        byte[] bArr = new byte[0];
        f2849d = bArr;
        f2850e = ByteBuffer.wrap(bArr);
        f2851f = k.j(bArr);
    }

    static <T> T a(T t4) {
        Objects.requireNonNull(t4);
        return t4;
    }

    static <T> T b(T t4, String str) {
        Objects.requireNonNull(t4, str);
        return t4;
    }

    public static int c(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int r12, int r22) {
        int i4 = i(r22, bArr, r12, r22);
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public static int f(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return a2.s(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((v0) obj).e().C((v0) obj2).K();
    }

    static int i(int r22, byte[] bArr, int r4, int r5) {
        for (int r02 = r4; r02 < r4 + r5; r02++) {
            r22 = (r22 * 31) + bArr[r02];
        }
        return r22;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f2847b);
    }
}
