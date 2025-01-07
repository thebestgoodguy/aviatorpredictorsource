package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    private final fd f1541a;

    private e3(fd fdVar) {
        this.f1541a = fdVar;
    }

    static final e3 a(fd fdVar) {
        i(fdVar);
        return new e3(fdVar);
    }

    public static final e3 h(m7 m7Var, m2 m2Var) {
        byte[] bArr = new byte[0];
        pb a5 = m7Var.a();
        if (a5 == null || a5.C().q() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            fd E = fd.E(m2Var.a(a5.C().G(), bArr), yr.a());
            i(E);
            return new e3(E);
        } catch (h unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static void i(fd fdVar) {
        if (fdVar == null || fdVar.z() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final e3 b() {
        if (this.f1541a == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        cd B = fd.B();
        for (ed edVar : this.f1541a.F()) {
            sc A = edVar.A();
            if (A.G() != 4) {
                throw new GeneralSecurityException("The keyset contains a non-private key");
            }
            String D = A.D();
            hr C = A.C();
            u2 a5 = x3.a(D);
            if (!(a5 instanceof u3)) {
                throw new GeneralSecurityException("manager for key type " + D + " is not a PrivateKeyManager");
            }
            sc c5 = ((u3) a5).c(C);
            x3.f(c5);
            dd B2 = ed.B();
            B2.e(edVar);
            B2.p(c5);
            B.q((ed) B2.f());
        }
        B.r(this.f1541a.A());
        return new e3((fd) B.f());
    }

    final fd c() {
        return this.f1541a;
    }

    public final ld d() {
        return z3.a(this.f1541a);
    }

    public final Object e(Class cls) {
        Class e5 = x3.e(cls);
        if (e5 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        z3.b(this.f1541a);
        l3 l3Var = new l3(e5, null);
        for (ed edVar : this.f1541a.F()) {
            if (edVar.G() == 3) {
                Object g5 = x3.g(edVar.A(), e5);
                if (edVar.z() == this.f1541a.A()) {
                    l3Var.a(g5, edVar);
                } else {
                    l3Var.b(g5, edVar);
                }
            }
        }
        return x3.k(l3Var.c(), cls);
    }

    public final void f(g3 g3Var, m2 m2Var) {
        byte[] bArr = new byte[0];
        fd fdVar = this.f1541a;
        byte[] b5 = m2Var.b(fdVar.m(), bArr);
        try {
            if (!fd.E(m2Var.a(b5, bArr), yr.a()).equals(fdVar)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            ob z4 = pb.z();
            z4.p(hr.A(b5));
            z4.q(z3.a(fdVar));
            g3Var.a((pb) z4.f());
        } catch (h unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final void g(g3 g3Var) {
        for (ed edVar : this.f1541a.F()) {
            if (edVar.A().G() == 2 || edVar.A().G() == 3 || edVar.A().G() == 4) {
                Object[] objArr = new Object[2];
                int G = edVar.A().G();
                objArr[0] = G != 2 ? G != 3 ? G != 4 ? G != 5 ? G != 6 ? "UNRECOGNIZED" : "REMOTE" : "ASYMMETRIC_PUBLIC" : "ASYMMETRIC_PRIVATE" : "SYMMETRIC" : "UNKNOWN_KEYMATERIAL";
                objArr[1] = edVar.A().D();
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", objArr));
            }
        }
        g3Var.b(this.f1541a);
    }

    public final String toString() {
        return z3.a(this.f1541a).toString();
    }
}
