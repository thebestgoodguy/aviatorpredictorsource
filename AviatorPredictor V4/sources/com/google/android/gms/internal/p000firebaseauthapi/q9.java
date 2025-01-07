package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class q9 extends ks implements f0 {
    private static final q9 zzb;
    private int zze;

    static {
        q9 q9Var = new q9();
        zzb = q9Var;
        ks.n(q9.class, q9Var);
    }

    private q9() {
    }

    public static p9 A() {
        return (p9) zzb.s();
    }

    public static q9 C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r12, Object obj, Object obj2) {
        int r13 = r12 - 1;
        if (r13 == 0) {
            return (byte) 1;
        }
        if (r13 == 2) {
            return ks.f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (r13 == 3) {
            return new q9();
        }
        o9 o9Var = null;
        if (r13 == 4) {
            return new p9(o9Var);
        }
        if (r13 != 5) {
            return null;
        }
        return zzb;
    }

    public final int z() {
        return this.zze;
    }
}
