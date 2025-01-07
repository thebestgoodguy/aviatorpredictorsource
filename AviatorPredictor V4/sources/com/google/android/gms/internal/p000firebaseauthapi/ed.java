package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class ed extends ks implements f0 {
    private static final ed zzb;
    private sc zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        ed edVar = new ed();
        zzb = edVar;
        ks.n(ed.class, edVar);
    }

    private ed() {
    }

    public static dd B() {
        return (dd) zzb.s();
    }

    static /* synthetic */ void D(ed edVar, sc scVar) {
        scVar.getClass();
        edVar.zze = scVar;
    }

    public final sc A() {
        sc scVar = this.zze;
        return scVar == null ? sc.B() : scVar;
    }

    public final boolean F() {
        return this.zze != null;
    }

    public final int G() {
        int r02 = this.zzf;
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

    public final int H() {
        int b5 = zd.b(this.zzh);
        if (b5 == 0) {
            return 1;
        }
        return b5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r4, Object obj, Object obj2) {
        int r42 = r4 - 1;
        if (r42 == 0) {
            return (byte) 1;
        }
        if (r42 == 2) {
            return ks.f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (r42 == 3) {
            return new ed();
        }
        bd bdVar = null;
        if (r42 == 4) {
            return new dd(bdVar);
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
