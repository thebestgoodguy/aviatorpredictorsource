package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class jc extends ks implements f0 {
    private static final jc zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        jc jcVar = new jc();
        zzb = jcVar;
        ks.n(jc.class, jcVar);
    }

    private jc() {
    }

    public static jc B() {
        return zzb;
    }

    public static ic z() {
        return (ic) zzb.s();
    }

    public final int C() {
        int r02 = this.zzg;
        int r12 = 3;
        if (r02 == 0) {
            r12 = 2;
        } else if (r02 != 1) {
            r12 = r02 != 2 ? r02 != 3 ? 0 : 5 : 4;
        }
        if (r12 == 0) {
            return 1;
        }
        return r12;
    }

    public final int D() {
        int r02 = this.zzf;
        int r03 = r02 != 0 ? r02 != 1 ? 0 : 3 : 2;
        if (r03 == 0) {
            return 1;
        }
        return r03;
    }

    public final int E() {
        int r02 = this.zze;
        int r03 = r02 != 0 ? r02 != 1 ? 0 : 3 : 2;
        if (r03 == 0) {
            return 1;
        }
        return r03;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (r33 == 3) {
            return new jc();
        }
        hc hcVar = null;
        if (r33 == 4) {
            return new ic(hcVar);
        }
        if (r33 != 5) {
            return null;
        }
        return zzb;
    }
}
