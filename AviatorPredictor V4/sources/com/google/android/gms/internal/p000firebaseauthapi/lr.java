package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public abstract class lr {

    /* renamed from: d, reason: collision with root package name */
    private static volatile int f1902d = 100;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f1903e = 0;

    /* renamed from: a, reason: collision with root package name */
    int f1904a;

    /* renamed from: b, reason: collision with root package name */
    final int f1905b = f1902d;

    /* renamed from: c, reason: collision with root package name */
    mr f1906c;

    /* synthetic */ lr(kr krVar) {
    }

    public static int l(int r12) {
        return (-(r12 & 1)) ^ (r12 >>> 1);
    }

    public static long m(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    static lr n(byte[] bArr, int r7, int r8, boolean z4) {
        jr jrVar = new jr(bArr, 0, r8, z4, null);
        try {
            jrVar.b(r8);
            return jrVar;
        } catch (h e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public abstract int a();

    public abstract int b(int r12);

    public abstract int c();

    public abstract hr d();

    public abstract String e();

    public abstract String f();

    public abstract void g(int r12);

    public abstract void h(int r12);

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k(int r12);
}
