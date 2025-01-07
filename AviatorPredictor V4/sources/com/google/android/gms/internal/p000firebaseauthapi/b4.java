package com.google.android.gms.internal.p000firebaseauthapi;

@Deprecated
/* loaded from: classes.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public static final xc f1407a = b(16);

    /* renamed from: b, reason: collision with root package name */
    public static final xc f1408b = b(32);

    /* renamed from: c, reason: collision with root package name */
    public static final xc f1409c = a(16, 16);

    /* renamed from: d, reason: collision with root package name */
    public static final xc f1410d = a(32, 16);

    /* renamed from: e, reason: collision with root package name */
    public static final xc f1411e = c(16, 16, 32, 16, 5);

    /* renamed from: f, reason: collision with root package name */
    public static final xc f1412f = c(32, 16, 32, 32, 5);

    /* renamed from: g, reason: collision with root package name */
    public static final xc f1413g;

    /* renamed from: h, reason: collision with root package name */
    public static final xc f1414h;

    static {
        wc z4 = xc.z();
        new w4();
        z4.p("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        z4.r(3);
        f1413g = (xc) z4.f();
        wc z5 = xc.z();
        new h5();
        z5.p("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        z5.r(3);
        f1414h = (xc) z5.f();
    }

    public static xc a(int r12, int r22) {
        m9 A = n9.A();
        A.p(r12);
        p9 A2 = q9.A();
        A2.p(16);
        A.q((q9) A2.f());
        n9 n9Var = (n9) A.f();
        wc z4 = xc.z();
        z4.q(n9Var.g());
        new n4();
        z4.p("type.googleapis.com/google.crypto.tink.AesEaxKey");
        z4.r(3);
        return (xc) z4.f();
    }

    public static xc b(int r12) {
        v9 A = w9.A();
        A.p(r12);
        w9 w9Var = (w9) A.f();
        wc z4 = xc.z();
        z4.q(w9Var.g());
        new q4();
        z4.p("type.googleapis.com/google.crypto.tink.AesGcmKey");
        z4.r(3);
        return (xc) z4.f();
    }

    public static xc c(int r02, int r12, int r22, int r32, int r4) {
        c9 A = e9.A();
        g9 A2 = h9.A();
        A2.p(16);
        A.q((h9) A2.f());
        A.p(r02);
        e9 e9Var = (e9) A.f();
        wb A3 = xb.A();
        zb A4 = ac.A();
        A4.q(5);
        A4.p(r32);
        A3.q((ac) A4.f());
        A3.p(32);
        xb xbVar = (xb) A3.f();
        w8 z4 = x8.z();
        z4.p(e9Var);
        z4.q(xbVar);
        x8 x8Var = (x8) z4.f();
        wc z5 = xc.z();
        z5.q(x8Var.g());
        new h4();
        z5.p("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        z5.r(3);
        return (xc) z5.f();
    }
}
