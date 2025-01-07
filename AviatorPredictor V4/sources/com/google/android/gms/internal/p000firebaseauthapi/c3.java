package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    private final xc f1449a;

    private c3(xc xcVar) {
        this.f1449a = xcVar;
    }

    public static c3 e(String str, byte[] bArr, int r4) {
        wc z4 = xc.z();
        z4.p(str);
        z4.q(hr.A(bArr));
        int r42 = r4 - 1;
        z4.r(r42 != 0 ? r42 != 1 ? r42 != 2 ? 6 : 5 : 4 : 3);
        return new c3((xc) z4.f());
    }

    final xc a() {
        return this.f1449a;
    }

    public final String b() {
        return this.f1449a.D();
    }

    public final byte[] c() {
        return this.f1449a.C().G();
    }

    public final int d() {
        int G = this.f1449a.G() - 2;
        int r12 = 1;
        if (G != 1) {
            r12 = 2;
            if (G != 2) {
                r12 = 3;
                if (G != 3) {
                    if (G == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return r12;
    }
}
