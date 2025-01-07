package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class a9 extends ks implements f0 {
    private static final a9 zzb;
    private int zze;
    private h9 zzf;
    private hr zzg = hr.f1739f;

    static {
        a9 a9Var = new a9();
        zzb = a9Var;
        ks.n(a9.class, a9Var);
    }

    private a9() {
    }

    public static z8 A() {
        return (z8) zzb.s();
    }

    public static a9 C() {
        return zzb;
    }

    public static a9 D(hr hrVar, yr yrVar) {
        return (a9) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void H(a9 a9Var, h9 h9Var) {
        h9Var.getClass();
        a9Var.zzf = h9Var;
    }

    public final h9 E() {
        h9 h9Var = this.zzf;
        return h9Var == null ? h9.C() : h9Var;
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
            return new a9();
        }
        y8 y8Var = null;
        if (r33 == 4) {
            return new z8(y8Var);
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
