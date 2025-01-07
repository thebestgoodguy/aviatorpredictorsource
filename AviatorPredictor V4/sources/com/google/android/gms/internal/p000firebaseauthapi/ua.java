package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class ua extends ks implements f0 {
    private static final ua zzb;
    private xc zze;

    static {
        ua uaVar = new ua();
        zzb = uaVar;
        ks.n(ua.class, uaVar);
    }

    private ua() {
    }

    public static ua B() {
        return zzb;
    }

    static /* synthetic */ void D(ua uaVar, xc xcVar) {
        xcVar.getClass();
        uaVar.zze = xcVar;
    }

    public static ta z() {
        return (ta) zzb.s();
    }

    public final xc C() {
        xc xcVar = this.zze;
        return xcVar == null ? xc.B() : xcVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r12, Object obj, Object obj2) {
        int r13 = r12 - 1;
        if (r13 == 0) {
            return (byte) 1;
        }
        if (r13 == 2) {
            return ks.f(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        if (r13 == 3) {
            return new ua();
        }
        sa saVar = null;
        if (r13 == 4) {
            return new ta(saVar);
        }
        if (r13 != 5) {
            return null;
        }
        return zzb;
    }
}
