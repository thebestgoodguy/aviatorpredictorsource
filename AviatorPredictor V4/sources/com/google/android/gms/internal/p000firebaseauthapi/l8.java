package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class l8 extends ks implements f0 {
    private static final l8 zzb;
    private int zze;
    private hr zzf = hr.f1739f;
    private r8 zzg;

    static {
        l8 l8Var = new l8();
        zzb = l8Var;
        ks.n(l8.class, l8Var);
    }

    private l8() {
    }

    public static k8 A() {
        return (k8) zzb.s();
    }

    public static l8 C(hr hrVar, yr yrVar) {
        return (l8) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void H(l8 l8Var, r8 r8Var) {
        r8Var.getClass();
        l8Var.zzg = r8Var;
    }

    public final r8 D() {
        r8 r8Var = this.zzg;
        return r8Var == null ? r8.C() : r8Var;
    }

    public final hr E() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (r33 == 3) {
            return new l8();
        }
        j8 j8Var = null;
        if (r33 == 4) {
            return new k8(j8Var);
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
