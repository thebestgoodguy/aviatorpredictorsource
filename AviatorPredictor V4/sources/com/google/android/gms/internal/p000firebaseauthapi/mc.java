package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class mc extends ks implements f0 {
    private static final mc zzb;
    private int zze;
    private pc zzf;
    private hr zzg = hr.f1739f;

    static {
        mc mcVar = new mc();
        zzb = mcVar;
        ks.n(mc.class, mcVar);
    }

    private mc() {
    }

    public static lc A() {
        return (lc) zzb.s();
    }

    public static mc C(hr hrVar, yr yrVar) {
        return (mc) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void G(mc mcVar, pc pcVar) {
        pcVar.getClass();
        mcVar.zzf = pcVar;
    }

    public final pc D() {
        pc pcVar = this.zzf;
        return pcVar == null ? pc.D() : pcVar;
    }

    public final hr E() {
        return this.zzg;
    }

    public final boolean I() {
        return this.zzf != null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (r33 == 3) {
            return new mc();
        }
        kc kcVar = null;
        if (r33 == 4) {
            return new lc(kcVar);
        }
        if (r33 != 5) {
            return null;
        }
        return zzb;
    }

    public final int z() {
        return this.zze;
    }
}
