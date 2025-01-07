package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class ca extends ks implements f0 {
    private static final ca zzb;
    private int zze;
    private int zzf;

    static {
        ca caVar = new ca();
        zzb = caVar;
        ks.n(ca.class, caVar);
    }

    private ca() {
    }

    public static ba A() {
        return (ba) zzb.s();
    }

    public static ca C(hr hrVar, yr yrVar) {
        return (ca) ks.v(zzb, hrVar, yrVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        if (r23 == 3) {
            return new ca();
        }
        aa aaVar = null;
        if (r23 == 4) {
            return new ba(aaVar);
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
