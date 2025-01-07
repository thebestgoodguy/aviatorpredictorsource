package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class ac extends ks implements f0 {
    private static final ac zzb;
    private int zze;
    private int zzf;

    static {
        ac acVar = new ac();
        zzb = acVar;
        ks.n(ac.class, acVar);
    }

    private ac() {
    }

    public static zb A() {
        return (zb) zzb.s();
    }

    public static ac C() {
        return zzb;
    }

    public final int E() {
        int b5 = rb.b(this.zze);
        if (b5 == 0) {
            return 1;
        }
        return b5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new ac();
        }
        yb ybVar = null;
        if (r23 == 4) {
            return new zb(ybVar);
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
