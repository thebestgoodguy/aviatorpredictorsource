package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class kd extends ks implements f0 {
    private static final kd zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        kd kdVar = new kd();
        zzb = kdVar;
        ks.n(kd.class, kdVar);
    }

    private kd() {
    }

    public static jd A() {
        return (jd) zzb.s();
    }

    static /* synthetic */ void C(kd kdVar, String str) {
        str.getClass();
        kdVar.zze = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r4, Object obj, Object obj2) {
        int r42 = r4 - 1;
        if (r42 == 0) {
            return (byte) 1;
        }
        if (r42 == 2) {
            return ks.f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (r42 == 3) {
            return new kd();
        }
        gd gdVar = null;
        if (r42 == 4) {
            return new jd(gdVar);
        }
        if (r42 != 5) {
            return null;
        }
        return zzb;
    }

    public final int z() {
        return this.zzg;
    }
}
