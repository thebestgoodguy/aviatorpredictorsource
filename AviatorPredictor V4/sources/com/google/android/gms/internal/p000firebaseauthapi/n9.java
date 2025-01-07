package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class n9 extends ks implements f0 {
    private static final n9 zzb;
    private q9 zze;
    private int zzf;

    static {
        n9 n9Var = new n9();
        zzb = n9Var;
        ks.n(n9.class, n9Var);
    }

    private n9() {
    }

    public static m9 A() {
        return (m9) zzb.s();
    }

    public static n9 C(hr hrVar, yr yrVar) {
        return (n9) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void E(n9 n9Var, q9 q9Var) {
        q9Var.getClass();
        n9Var.zze = q9Var;
    }

    public final q9 D() {
        q9 q9Var = this.zze;
        return q9Var == null ? q9.C() : q9Var;
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
            return new n9();
        }
        l9 l9Var = null;
        if (r23 == 4) {
            return new m9(l9Var);
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
