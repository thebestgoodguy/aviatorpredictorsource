package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class u8 extends ks implements f0 {
    private static final u8 zzb;
    private int zze;
    private a9 zzf;
    private ub zzg;

    static {
        u8 u8Var = new u8();
        zzb = u8Var;
        ks.n(u8.class, u8Var);
    }

    private u8() {
    }

    public static t8 A() {
        return (t8) zzb.s();
    }

    public static u8 C(hr hrVar, yr yrVar) {
        return (u8) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void G(u8 u8Var, a9 a9Var) {
        a9Var.getClass();
        u8Var.zzf = a9Var;
    }

    static /* synthetic */ void H(u8 u8Var, ub ubVar) {
        ubVar.getClass();
        u8Var.zzg = ubVar;
    }

    public final a9 D() {
        a9 a9Var = this.zzf;
        return a9Var == null ? a9.C() : a9Var;
    }

    public final ub E() {
        ub ubVar = this.zzg;
        return ubVar == null ? ub.C() : ubVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (r33 == 3) {
            return new u8();
        }
        s8 s8Var = null;
        if (r33 == 4) {
            return new t8(s8Var);
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
