package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class xa extends ks implements f0 {
    private static final xa zzb;
    private ab zze;

    static {
        xa xaVar = new xa();
        zzb = xaVar;
        ks.n(xa.class, xaVar);
    }

    private xa() {
    }

    public static xa B(hr hrVar, yr yrVar) {
        return (xa) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void D(xa xaVar, ab abVar) {
        abVar.getClass();
        xaVar.zze = abVar;
    }

    public static wa z() {
        return (wa) zzb.s();
    }

    public final ab C() {
        ab abVar = this.zze;
        return abVar == null ? ab.C() : abVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r12, Object obj, Object obj2) {
        int r13 = r12 - 1;
        if (r13 == 0) {
            return (byte) 1;
        }
        if (r13 == 2) {
            return ks.f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (r13 == 3) {
            return new xa();
        }
        va vaVar = null;
        if (r13 == 4) {
            return new wa(vaVar);
        }
        if (r13 != 5) {
            return null;
        }
        return zzb;
    }
}
