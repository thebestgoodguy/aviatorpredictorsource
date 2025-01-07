package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class p6 implements ve {

    /* renamed from: a, reason: collision with root package name */
    private final String f2012a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2013b;

    /* renamed from: c, reason: collision with root package name */
    private t9 f2014c;

    /* renamed from: d, reason: collision with root package name */
    private u8 f2015d;

    /* renamed from: e, reason: collision with root package name */
    private int f2016e;

    /* renamed from: f, reason: collision with root package name */
    private ga f2017f;

    p6(xc xcVar) {
        String D = xcVar.D();
        this.f2012a = D;
        if (D.equals(a4.f1375b)) {
            try {
                w9 C = w9.C(xcVar.C(), yr.a());
                this.f2014c = (t9) x3.d(xcVar);
                this.f2013b = C.z();
                return;
            } catch (h e5) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e5);
            }
        }
        if (D.equals(a4.f1374a)) {
            try {
                x8 B = x8.B(xcVar.C(), yr.a());
                this.f2015d = (u8) x3.d(xcVar);
                this.f2016e = B.C().z();
                this.f2013b = this.f2016e + B.D().z();
                return;
            } catch (h e6) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e6);
            }
        }
        if (!D.equals(z5.f2431a)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(D)));
        }
        try {
            ja C2 = ja.C(xcVar.C(), yr.a());
            this.f2017f = (ga) x3.d(xcVar);
            this.f2013b = C2.z();
        } catch (h e7) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e7);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ve
    public final int a() {
        return this.f2013b;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ve
    public final g7 b(byte[] bArr) {
        if (bArr.length != this.f2013b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.f2012a.equals(a4.f1375b)) {
            s9 A = t9.A();
            A.e(this.f2014c);
            A.p(hr.B(bArr, 0, this.f2013b));
            return new g7((m2) x3.i(this.f2012a, (t9) A.f(), m2.class));
        }
        if (!this.f2012a.equals(a4.f1374a)) {
            if (!this.f2012a.equals(z5.f2431a)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            fa A2 = ga.A();
            A2.e(this.f2017f);
            A2.p(hr.B(bArr, 0, this.f2013b));
            return new g7((q2) x3.i(this.f2012a, (ga) A2.f(), q2.class));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f2016e);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f2016e, this.f2013b);
        z8 A3 = a9.A();
        A3.e(this.f2015d.D());
        A3.p(hr.A(copyOfRange));
        a9 a9Var = (a9) A3.f();
        tb A4 = ub.A();
        A4.e(this.f2015d.E());
        A4.p(hr.A(copyOfRange2));
        ub ubVar = (ub) A4.f();
        t8 A5 = u8.A();
        A5.r(this.f2015d.z());
        A5.p(a9Var);
        A5.q(ubVar);
        return new g7((m2) x3.i(this.f2012a, (u8) A5.f(), m2.class));
    }
}
