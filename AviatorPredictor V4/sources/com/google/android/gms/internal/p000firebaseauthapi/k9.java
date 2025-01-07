package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class k9 extends ks implements f0 {
    private static final k9 zzb;
    private int zze;
    private q9 zzf;
    private hr zzg = hr.f1739f;

    static {
        k9 k9Var = new k9();
        zzb = k9Var;
        ks.n(k9.class, k9Var);
    }

    private k9() {
    }

    public static j9 A() {
        return (j9) zzb.s();
    }

    public static k9 C(hr hrVar, yr yrVar) {
        return (k9) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void G(k9 k9Var, q9 q9Var) {
        q9Var.getClass();
        k9Var.zzf = q9Var;
    }

    public final q9 D() {
        q9 q9Var = this.zzf;
        return q9Var == null ? q9.C() : q9Var;
    }

    public final hr E() {
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
            return new k9();
        }
        i9 i9Var = null;
        if (r33 == 4) {
            return new j9(i9Var);
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
