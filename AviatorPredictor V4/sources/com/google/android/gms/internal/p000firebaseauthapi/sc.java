package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class sc extends ks implements f0 {
    private static final sc zzb;
    private String zze = "";
    private hr zzf = hr.f1739f;
    private int zzg;

    static {
        sc scVar = new sc();
        zzb = scVar;
        ks.n(sc.class, scVar);
    }

    private sc() {
    }

    public static sc B() {
        return zzb;
    }

    public static rc z() {
        return (rc) zzb.s();
    }

    public final hr C() {
        return this.zzf;
    }

    public final String D() {
        return this.zze;
    }

    public final int G() {
        int r02 = this.zzg;
        int r12 = 4;
        if (r02 == 0) {
            r12 = 2;
        } else if (r02 == 1) {
            r12 = 3;
        } else if (r02 != 2) {
            r12 = r02 != 3 ? r02 != 4 ? 0 : 6 : 5;
        }
        if (r12 == 0) {
            return 1;
        }
        return r12;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (r33 == 3) {
            return new sc();
        }
        qc qcVar = null;
        if (r33 == 4) {
            return new rc(qcVar);
        }
        if (r33 != 5) {
            return null;
        }
        return zzb;
    }
}
