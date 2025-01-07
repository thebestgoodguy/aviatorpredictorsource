package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class ma extends ks implements f0 {
    private static final ma zzb;
    private int zze;
    private hr zzf = hr.f1739f;

    static {
        ma maVar = new ma();
        zzb = maVar;
        ks.n(ma.class, maVar);
    }

    private ma() {
    }

    public static la A() {
        return (la) zzb.s();
    }

    public static ma C(hr hrVar, yr yrVar) {
        return (ma) ks.v(zzb, hrVar, yrVar);
    }

    public final hr D() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new ma();
        }
        ka kaVar = null;
        if (r23 == 4) {
            return new la(kaVar);
        }
        if (r23 != 5) {
            return null;
        }
        return zzb;
    }

    public final int z() {
        return this.zze;
    }
}
