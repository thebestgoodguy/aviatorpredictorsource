package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class ja extends ks implements f0 {
    private static final ja zzb;
    private int zze;
    private int zzf;

    static {
        ja jaVar = new ja();
        zzb = jaVar;
        ks.n(ja.class, jaVar);
    }

    private ja() {
    }

    public static ia A() {
        return (ia) zzb.s();
    }

    public static ja C(hr hrVar, yr yrVar) {
        return (ja) ks.v(zzb, hrVar, yrVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new ja();
        }
        ha haVar = null;
        if (r23 == 4) {
            return new ia(haVar);
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
