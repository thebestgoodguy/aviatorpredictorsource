package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class z9 extends ks implements f0 {
    private static final z9 zzb;
    private int zze;
    private hr zzf = hr.f1739f;

    static {
        z9 z9Var = new z9();
        zzb = z9Var;
        ks.n(z9.class, z9Var);
    }

    private z9() {
    }

    public static y9 A() {
        return (y9) zzb.s();
    }

    public static z9 C(hr hrVar, yr yrVar) {
        return (z9) ks.v(zzb, hrVar, yrVar);
    }

    public final hr D() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new z9();
        }
        x9 x9Var = null;
        if (r23 == 4) {
            return new y9(x9Var);
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
