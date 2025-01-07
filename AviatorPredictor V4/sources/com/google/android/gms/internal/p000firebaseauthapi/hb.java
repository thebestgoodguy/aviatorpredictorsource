package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class hb extends ks implements f0 {
    private static final hb zzb;
    private int zze;
    private ab zzf;
    private hr zzg;
    private hr zzh;

    static {
        hb hbVar = new hb();
        zzb = hbVar;
        ks.n(hb.class, hbVar);
    }

    private hb() {
        hr hrVar = hr.f1739f;
        this.zzg = hrVar;
        this.zzh = hrVar;
    }

    public static gb B() {
        return (gb) zzb.s();
    }

    public static hb D() {
        return zzb;
    }

    public static hb E(hr hrVar, yr yrVar) {
        return (hb) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void I(hb hbVar, ab abVar) {
        abVar.getClass();
        hbVar.zzf = abVar;
    }

    public final ab A() {
        ab abVar = this.zzf;
        return abVar == null ? ab.C() : abVar;
    }

    public final hr F() {
        return this.zzg;
    }

    public final hr G() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r4, Object obj, Object obj2) {
        int r42 = r4 - 1;
        if (r42 == 0) {
            return (byte) 1;
        }
        if (r42 == 2) {
            return ks.f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (r42 == 3) {
            return new hb();
        }
        eb ebVar = null;
        if (r42 == 4) {
            return new gb(ebVar);
        }
        if (r42 != 5) {
            return null;
        }
        return zzb;
    }

    public final int z() {
        return this.zze;
    }
}
