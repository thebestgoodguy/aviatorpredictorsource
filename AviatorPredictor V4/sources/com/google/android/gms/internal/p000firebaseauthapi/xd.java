package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class xd extends ks implements f0 {
    private static final xd zzb;
    private String zze = "";
    private xc zzf;

    static {
        xd xdVar = new xd();
        zzb = xdVar;
        ks.n(xd.class, xdVar);
    }

    private xd() {
    }

    public static xd B() {
        return zzb;
    }

    public static xd C(hr hrVar, yr yrVar) {
        return (xd) ks.v(zzb, hrVar, yrVar);
    }

    public final String D() {
        return this.zze;
    }

    public final boolean E() {
        return this.zzf != null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new xd();
        }
        vd vdVar = null;
        if (r23 == 4) {
            return new wd(vdVar);
        }
        if (r23 != 5) {
            return null;
        }
        return zzb;
    }

    public final xc z() {
        xc xcVar = this.zzf;
        return xcVar == null ? xc.B() : xcVar;
    }
}
