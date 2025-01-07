package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class e9 extends ks implements f0 {
    private static final e9 zzb;
    private h9 zze;
    private int zzf;

    static {
        e9 e9Var = new e9();
        zzb = e9Var;
        ks.n(e9.class, e9Var);
    }

    private e9() {
    }

    public static c9 A() {
        return (c9) zzb.s();
    }

    public static e9 C() {
        return zzb;
    }

    public static e9 D(hr hrVar, yr yrVar) {
        return (e9) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void F(e9 e9Var, h9 h9Var) {
        h9Var.getClass();
        e9Var.zze = h9Var;
    }

    public final h9 E() {
        h9 h9Var = this.zze;
        return h9Var == null ? h9.C() : h9Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new e9();
        }
        b9 b9Var = null;
        if (r23 == 4) {
            return new c9(b9Var);
        }
        if (r23 != 5) {
            return null;
        }
        return zzb;
    }

    public final int z() {
        return this.zzf;
    }
}
