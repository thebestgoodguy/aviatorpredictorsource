package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class pc extends ks implements f0 {
    private static final pc zzb;
    private int zze;
    private jc zzf;
    private hr zzg = hr.f1739f;

    static {
        pc pcVar = new pc();
        zzb = pcVar;
        ks.n(pc.class, pcVar);
    }

    private pc() {
    }

    public static oc B() {
        return (oc) zzb.s();
    }

    public static pc D() {
        return zzb;
    }

    public static pc E(hr hrVar, yr yrVar) {
        return (pc) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void H(pc pcVar, jc jcVar) {
        jcVar.getClass();
        pcVar.zzf = jcVar;
    }

    public final jc A() {
        jc jcVar = this.zzf;
        return jcVar == null ? jc.B() : jcVar;
    }

    public final hr F() {
        return this.zzg;
    }

    public final boolean J() {
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
            return new pc();
        }
        nc ncVar = null;
        if (r33 == 4) {
            return new oc(ncVar);
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
