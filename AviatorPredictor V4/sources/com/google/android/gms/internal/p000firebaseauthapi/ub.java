package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class ub extends ks implements f0 {
    private static final ub zzb;
    private int zze;
    private ac zzf;
    private hr zzg = hr.f1739f;

    static {
        ub ubVar = new ub();
        zzb = ubVar;
        ks.n(ub.class, ubVar);
    }

    private ub() {
    }

    public static tb A() {
        return (tb) zzb.s();
    }

    public static ub C() {
        return zzb;
    }

    public static ub D(hr hrVar, yr yrVar) {
        return (ub) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void H(ub ubVar, ac acVar) {
        acVar.getClass();
        ubVar.zzf = acVar;
    }

    public final ac E() {
        ac acVar = this.zzf;
        return acVar == null ? ac.C() : acVar;
    }

    public final hr F() {
        return this.zzg;
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
            return new ub();
        }
        sb sbVar = null;
        if (r33 == 4) {
            return new tb(sbVar);
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
