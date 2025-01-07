package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class pb extends ks implements f0 {
    private static final pb zzb;
    private hr zze = hr.f1739f;
    private ld zzf;

    static {
        pb pbVar = new pb();
        zzb = pbVar;
        ks.n(pb.class, pbVar);
    }

    private pb() {
    }

    public static pb B(byte[] bArr, yr yrVar) {
        return (pb) ks.w(zzb, bArr, yrVar);
    }

    static /* synthetic */ void E(pb pbVar, ld ldVar) {
        ldVar.getClass();
        pbVar.zzf = ldVar;
    }

    public static ob z() {
        return (ob) zzb.s();
    }

    public final hr C() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r22, Object obj, Object obj2) {
        int r23 = r22 - 1;
        if (r23 == 0) {
            return (byte) 1;
        }
        if (r23 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zze", "zzf"});
        }
        if (r23 == 3) {
            return new pb();
        }
        nb nbVar = null;
        if (r23 == 4) {
            return new ob(nbVar);
        }
        if (r23 != 5) {
            return null;
        }
        return zzb;
    }
}
