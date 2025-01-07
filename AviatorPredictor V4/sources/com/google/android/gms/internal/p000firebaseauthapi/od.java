package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class od extends ks implements f0 {
    private static final od zzb;
    private int zze;
    private rd zzf;

    static {
        od odVar = new od();
        zzb = odVar;
        ks.n(od.class, odVar);
    }

    private od() {
    }

    public static nd A() {
        return (nd) zzb.s();
    }

    public static od C(hr hrVar, yr yrVar) {
        return (od) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void F(od odVar, rd rdVar) {
        rdVar.getClass();
        odVar.zzf = rdVar;
    }

    public final rd D() {
        rd rdVar = this.zzf;
        return rdVar == null ? rd.A() : rdVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new od();
        }
        md mdVar = null;
        if (r23 == 4) {
            return new nd(mdVar);
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
