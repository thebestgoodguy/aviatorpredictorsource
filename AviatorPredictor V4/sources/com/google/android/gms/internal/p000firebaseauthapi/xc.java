package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class xc extends ks implements f0 {
    private static final xc zzb;
    private String zze = "";
    private hr zzf = hr.f1739f;
    private int zzg;

    static {
        xc xcVar = new xc();
        zzb = xcVar;
        ks.n(xc.class, xcVar);
    }

    private xc() {
    }

    public static xc B() {
        return zzb;
    }

    static /* synthetic */ void E(xc xcVar, String str) {
        str.getClass();
        xcVar.zze = str;
    }

    public static wc z() {
        return (wc) zzb.s();
    }

    public final hr C() {
        return this.zzf;
    }

    public final String D() {
        return this.zze;
    }

    public final int G() {
        int b5 = zd.b(this.zzg);
        if (b5 == 0) {
            return 1;
        }
        return b5;
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
            return new xc();
        }
        vc vcVar = null;
        if (r33 == 4) {
            return new wc(vcVar);
        }
        if (r33 != 5) {
            return null;
        }
        return zzb;
    }
}
