package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class r8 extends ks implements f0 {
    private static final r8 zzb;
    private int zze;

    static {
        r8 r8Var = new r8();
        zzb = r8Var;
        ks.n(r8.class, r8Var);
    }

    private r8() {
    }

    public static q8 A() {
        return (q8) zzb.s();
    }

    public static r8 C() {
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
            return new r8();
        }
        p8 p8Var = null;
        if (r13 == 4) {
            return new q8(p8Var);
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
