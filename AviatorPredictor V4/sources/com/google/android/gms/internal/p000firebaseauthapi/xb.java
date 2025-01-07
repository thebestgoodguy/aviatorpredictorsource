package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class xb extends ks implements f0 {
    private static final xb zzb;
    private ac zze;
    private int zzf;
    private int zzg;

    static {
        xb xbVar = new xb();
        zzb = xbVar;
        ks.n(xb.class, xbVar);
    }

    private xb() {
    }

    public static wb A() {
        return (wb) zzb.s();
    }

    public static xb C() {
        return zzb;
    }

    public static xb D(hr hrVar, yr yrVar) {
        return (xb) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void F(xb xbVar, ac acVar) {
        acVar.getClass();
        xbVar.zze = acVar;
    }

    public final ac E() {
        ac acVar = this.zze;
        return acVar == null ? ac.C() : acVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        if (r33 == 3) {
            return new xb();
        }
        vb vbVar = null;
        if (r33 == 4) {
            return new wb(vbVar);
        }
        if (r33 != 5) {
            return null;
        }
        return zzb;
    }

    public final int z() {
        return this.zzf;
    }
}
