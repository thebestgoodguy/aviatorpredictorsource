package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class ud extends ks implements f0 {
    private static final ud zzb;
    private int zze;
    private xd zzf;

    static {
        ud udVar = new ud();
        zzb = udVar;
        ks.n(ud.class, udVar);
    }

    private ud() {
    }

    public static td A() {
        return (td) zzb.s();
    }

    public static ud C(hr hrVar, yr yrVar) {
        return (ud) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void F(ud udVar, xd xdVar) {
        xdVar.getClass();
        udVar.zzf = xdVar;
    }

    public final xd D() {
        xd xdVar = this.zzf;
        return xdVar == null ? xd.B() : xdVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new ud();
        }
        sd sdVar = null;
        if (r23 == 4) {
            return new td(sdVar);
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
