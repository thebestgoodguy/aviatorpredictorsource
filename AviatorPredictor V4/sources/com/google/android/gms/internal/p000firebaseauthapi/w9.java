package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class w9 extends ks implements f0 {
    private static final w9 zzb;
    private int zze;
    private int zzf;

    static {
        w9 w9Var = new w9();
        zzb = w9Var;
        ks.n(w9.class, w9Var);
    }

    private w9() {
    }

    public static v9 A() {
        return (v9) zzb.s();
    }

    public static w9 C(hr hrVar, yr yrVar) {
        return (w9) ks.v(zzb, hrVar, yrVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new w9();
        }
        u9 u9Var = null;
        if (r23 == 4) {
            return new v9(u9Var);
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
