package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class ga extends ks implements f0 {
    private static final ga zzb;
    private int zze;
    private hr zzf = hr.f1739f;

    static {
        ga gaVar = new ga();
        zzb = gaVar;
        ks.n(ga.class, gaVar);
    }

    private ga() {
    }

    public static fa A() {
        return (fa) zzb.s();
    }

    public static ga C(hr hrVar, yr yrVar) {
        return (ga) ks.v(zzb, hrVar, yrVar);
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
            return new ga();
        }
        da daVar = null;
        if (r23 == 4) {
            return new fa(daVar);
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
