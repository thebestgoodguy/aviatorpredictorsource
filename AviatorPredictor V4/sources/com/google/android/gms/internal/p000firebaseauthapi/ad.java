package com.google.android.gms.internal.p000firebaseauthapi;

@Deprecated
/* loaded from: classes.dex */
public final class ad extends ks implements f0 {
    private static final ad zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        ad adVar = new ad();
        zzb = adVar;
        ks.n(ad.class, adVar);
    }

    private ad() {
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r5, Object obj, Object obj2) {
        int r52 = r5 - 1;
        if (r52 == 0) {
            return (byte) 1;
        }
        if (r52 == 2) {
            return ks.f(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (r52 == 3) {
            return new ad();
        }
        yc ycVar = null;
        if (r52 == 4) {
            return new zc(ycVar);
        }
        if (r52 != 5) {
            return null;
        }
        return zzb;
    }
}
