package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class fe extends ks implements f0 {
    private static final fe zzb;
    private int zze;
    private hr zzf = hr.f1739f;

    static {
        fe feVar = new fe();
        zzb = feVar;
        ks.n(fe.class, feVar);
    }

    private fe() {
    }

    public static ee A() {
        return (ee) zzb.s();
    }

    public static fe C(hr hrVar, yr yrVar) {
        return (fe) ks.v(zzb, hrVar, yrVar);
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
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new fe();
        }
        de deVar = null;
        if (r23 == 4) {
            return new ee(deVar);
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
