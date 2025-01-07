package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class rd extends ks implements f0 {
    private static final rd zzb;
    private String zze = "";

    static {
        rd rdVar = new rd();
        zzb = rdVar;
        ks.n(rd.class, rdVar);
    }

    private rd() {
    }

    public static rd A() {
        return zzb;
    }

    public static rd B(hr hrVar, yr yrVar) {
        return (rd) ks.v(zzb, hrVar, yrVar);
    }

    public final String C() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r12, Object obj, Object obj2) {
        int r13 = r12 - 1;
        if (r13 == 0) {
            return (byte) 1;
        }
        if (r13 == 2) {
            return ks.f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        if (r13 == 3) {
            return new rd();
        }
        pd pdVar = null;
        if (r13 == 4) {
            return new qd(pdVar);
        }
        if (r13 != 5) {
            return null;
        }
        return zzb;
    }
}
