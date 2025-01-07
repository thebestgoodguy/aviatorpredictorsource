package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class x8 extends ks implements f0 {
    private static final x8 zzb;
    private e9 zze;
    private xb zzf;

    static {
        x8 x8Var = new x8();
        zzb = x8Var;
        ks.n(x8.class, x8Var);
    }

    private x8() {
    }

    public static x8 B(hr hrVar, yr yrVar) {
        return (x8) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void E(x8 x8Var, e9 e9Var) {
        e9Var.getClass();
        x8Var.zze = e9Var;
    }

    static /* synthetic */ void F(x8 x8Var, xb xbVar) {
        xbVar.getClass();
        x8Var.zzf = xbVar;
    }

    public static w8 z() {
        return (w8) zzb.s();
    }

    public final e9 C() {
        e9 e9Var = this.zze;
        return e9Var == null ? e9.C() : e9Var;
    }

    public final xb D() {
        xb xbVar = this.zzf;
        return xbVar == null ? xb.C() : xbVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new x8();
        }
        v8 v8Var = null;
        if (r23 == 4) {
            return new w8(v8Var);
        }
        if (r23 != 5) {
            return null;
        }
        return zzb;
    }
}
