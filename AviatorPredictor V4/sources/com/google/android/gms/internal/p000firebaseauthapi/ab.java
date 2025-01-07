package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class ab extends ks implements f0 {
    private static final ab zzb;
    private kb zze;
    private ua zzf;
    private int zzg;

    static {
        ab abVar = new ab();
        zzb = abVar;
        ks.n(ab.class, abVar);
    }

    private ab() {
    }

    public static za A() {
        return (za) zzb.s();
    }

    public static ab C() {
        return zzb;
    }

    static /* synthetic */ void E(ab abVar, kb kbVar) {
        kbVar.getClass();
        abVar.zze = kbVar;
    }

    static /* synthetic */ void F(ab abVar, ua uaVar) {
        uaVar.getClass();
        abVar.zzf = uaVar;
    }

    public final kb D() {
        kb kbVar = this.zze;
        return kbVar == null ? kb.B() : kbVar;
    }

    public final int G() {
        int r02 = this.zzg;
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

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (r33 == 3) {
            return new ab();
        }
        ya yaVar = null;
        if (r33 == 4) {
            return new za(yaVar);
        }
        if (r33 != 5) {
            return null;
        }
        return zzb;
    }

    public final ua z() {
        ua uaVar = this.zzf;
        return uaVar == null ? ua.B() : uaVar;
    }
}
