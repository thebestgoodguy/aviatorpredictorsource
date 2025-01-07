package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class o8 extends ks implements f0 {
    private static final o8 zzb;
    private int zze;
    private r8 zzf;

    static {
        o8 o8Var = new o8();
        zzb = o8Var;
        ks.n(o8.class, o8Var);
    }

    private o8() {
    }

    public static n8 A() {
        return (n8) zzb.s();
    }

    public static o8 C(hr hrVar, yr yrVar) {
        return (o8) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void F(o8 o8Var, r8 r8Var) {
        r8Var.getClass();
        o8Var.zzf = r8Var;
    }

    public final r8 D() {
        r8 r8Var = this.zzf;
        return r8Var == null ? r8.C() : r8Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new o8();
        }
        m8 m8Var = null;
        if (r23 == 4) {
            return new n8(m8Var);
        }
        if (r23 != 5) {
            return null;
        }
        return zzb;
    }

    public final int z() {
        return this.zze;
    }
}
