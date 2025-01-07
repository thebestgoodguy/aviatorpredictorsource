package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class z7 extends q7 {
    public z7() {
        super(ub.class, new x7(j3.class));
    }

    public static final void l(ub ubVar) {
        wf.c(ubVar.z(), 0);
        if (ubVar.F().q() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        n(ubVar.E());
    }

    static /* bridge */ /* synthetic */ o7 m(int r32, int r4, int r5, int r6) {
        wb A = xb.A();
        zb A2 = ac.A();
        A2.q(r5);
        A2.p(r4);
        A.q((ac) A2.f());
        A.p(r32);
        return new o7((xb) A.f(), r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(ac acVar) {
        if (acVar.z() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int E = acVar.E() - 2;
        if (E == 1) {
            if (acVar.z() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (E == 2) {
            if (acVar.z() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (E == 3) {
            if (acVar.z() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (E == 4) {
            if (acVar.z() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (E != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (acVar.z() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new y7(this, xb.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return ub.D(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        l((ub) e0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int e() {
        return 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 3;
    }
}
