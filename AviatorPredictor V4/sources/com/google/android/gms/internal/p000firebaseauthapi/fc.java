package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class fc extends ks implements f0 {
    private static final fc zzb;
    private jc zze;

    static {
        fc fcVar = new fc();
        zzb = fcVar;
        ks.n(fc.class, fcVar);
    }

    private fc() {
    }

    public static fc B(hr hrVar, yr yrVar) {
        return (fc) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void D(fc fcVar, jc jcVar) {
        jcVar.getClass();
        fcVar.zze = jcVar;
    }

    public static ec z() {
        return (ec) zzb.s();
    }

    public final jc C() {
        jc jcVar = this.zze;
        return jcVar == null ? jc.B() : jcVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r12, Object obj, Object obj2) {
        int r13 = r12 - 1;
        if (r13 == 0) {
            return (byte) 1;
        }
        if (r13 == 2) {
            return ks.f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (r13 == 3) {
            return new fc();
        }
        dc dcVar = null;
        if (r13 == 4) {
            return new ec(dcVar);
        }
        if (r13 != 5) {
            return null;
        }
        return zzb;
    }
}
