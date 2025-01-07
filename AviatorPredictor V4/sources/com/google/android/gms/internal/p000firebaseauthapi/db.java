package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class db extends ks implements f0 {
    private static final db zzb;
    private int zze;
    private hb zzf;
    private hr zzg = hr.f1739f;

    static {
        db dbVar = new db();
        zzb = dbVar;
        ks.n(db.class, dbVar);
    }

    private db() {
    }

    public static cb A() {
        return (cb) zzb.s();
    }

    public static db C(hr hrVar, yr yrVar) {
        return (db) ks.v(zzb, hrVar, yrVar);
    }

    static /* synthetic */ void G(db dbVar, hb hbVar) {
        hbVar.getClass();
        dbVar.zzf = hbVar;
    }

    public final hb D() {
        hb hbVar = this.zzf;
        return hbVar == null ? hb.D() : hbVar;
    }

    public final hr E() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (r33 == 3) {
            return new db();
        }
        bb bbVar = null;
        if (r33 == 4) {
            return new cb(bbVar);
        }
        if (r33 != 5) {
            return null;
        }
        return zzb;
    }

    public final int z() {
        return this.zze;
    }
}
