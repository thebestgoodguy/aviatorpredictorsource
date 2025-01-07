package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class t9 extends ks implements f0 {
    private static final t9 zzb;
    private int zze;
    private hr zzf = hr.f1739f;

    static {
        t9 t9Var = new t9();
        zzb = t9Var;
        ks.n(t9.class, t9Var);
    }

    private t9() {
    }

    public static s9 A() {
        return (s9) zzb.s();
    }

    public static t9 C(hr hrVar, yr yrVar) {
        return (t9) ks.v(zzb, hrVar, yrVar);
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
            return new t9();
        }
        r9 r9Var = null;
        if (r23 == 4) {
            return new s9(r9Var);
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
