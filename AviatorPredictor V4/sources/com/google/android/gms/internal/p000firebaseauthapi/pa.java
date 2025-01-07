package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class pa extends ks implements f0 {
    private static final pa zzb;

    static {
        pa paVar = new pa();
        zzb = paVar;
        ks.n(pa.class, paVar);
    }

    private pa() {
    }

    public static pa A() {
        return zzb;
    }

    public static pa B(hr hrVar, yr yrVar) {
        return (pa) ks.v(zzb, hrVar, yrVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r12, Object obj, Object obj2) {
        int r13 = r12 - 1;
        if (r13 == 0) {
            return (byte) 1;
        }
        na naVar = null;
        if (r13 == 2) {
            return ks.f(zzb, "\u0000\u0000", null);
        }
        if (r13 == 3) {
            return new pa();
        }
        if (r13 == 4) {
            return new oa(naVar);
        }
        if (r13 != 5) {
            return null;
        }
        return zzb;
    }
}
