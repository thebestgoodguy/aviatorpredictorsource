package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class ld extends ks implements f0 {
    private static final ld zzb;
    private int zze;
    private e zzf = ks.x();

    static {
        ld ldVar = new ld();
        zzb = ldVar;
        ks.n(ld.class, ldVar);
    }

    private ld() {
    }

    static /* synthetic */ void D(ld ldVar, kd kdVar) {
        kdVar.getClass();
        e eVar = ldVar.zzf;
        if (!eVar.c()) {
            ldVar.zzf = ks.y(eVar);
        }
        ldVar.zzf.add(kdVar);
    }

    public static id z() {
        return (id) zzb.s();
    }

    public final kd A(int r22) {
        return (kd) this.zzf.get(0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", kd.class});
        }
        if (r33 == 3) {
            return new ld();
        }
        gd gdVar = null;
        if (r33 == 4) {
            return new id(gdVar);
        }
        if (r33 != 5) {
            return null;
        }
        return zzb;
    }
}
