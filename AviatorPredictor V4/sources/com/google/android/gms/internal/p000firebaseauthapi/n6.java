package com.google.android.gms.internal.p000firebaseauthapi;

@Deprecated
/* loaded from: classes.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f1953a;

    /* renamed from: b, reason: collision with root package name */
    public static final xc f1954b;

    /* renamed from: c, reason: collision with root package name */
    public static final xc f1955c;

    /* renamed from: d, reason: collision with root package name */
    public static final xc f1956d;

    static {
        byte[] bArr = new byte[0];
        f1953a = bArr;
        xc xcVar = b4.f1407a;
        f1954b = a(4, 5, 3, xcVar, 3, bArr);
        f1955c = a(4, 5, 4, xcVar, 5, bArr);
        f1956d = a(4, 5, 3, b4.f1411e, 3, bArr);
    }

    public static xc a(int r12, int r22, int r32, xc xcVar, int r5, byte[] bArr) {
        wa z4 = xa.z();
        jb z5 = kb.z();
        z5.q(4);
        z5.r(5);
        z5.p(hr.A(bArr));
        kb kbVar = (kb) z5.f();
        ta z6 = ua.z();
        z6.p(xcVar);
        ua uaVar = (ua) z6.f();
        za A = ab.A();
        A.q(kbVar);
        A.p(uaVar);
        A.r(r32);
        z4.p((ab) A.f());
        xa xaVar = (xa) z4.f();
        wc z7 = xc.z();
        new f6();
        z7.p("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        z7.r(r5);
        z7.q(xaVar.g());
        return (xc) z7.f();
    }
}
