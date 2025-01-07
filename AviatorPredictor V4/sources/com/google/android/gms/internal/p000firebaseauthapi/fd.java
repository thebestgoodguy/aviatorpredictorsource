package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
public final class fd extends ks implements f0 {
    private static final fd zzb;
    private int zze;
    private e zzf = ks.x();

    static {
        fd fdVar = new fd();
        zzb = fdVar;
        ks.n(fd.class, fdVar);
    }

    private fd() {
    }

    public static cd B() {
        return (cd) zzb.s();
    }

    public static fd E(byte[] bArr, yr yrVar) {
        return (fd) ks.w(zzb, bArr, yrVar);
    }

    static /* synthetic */ void H(fd fdVar, ed edVar) {
        edVar.getClass();
        e eVar = fdVar.zzf;
        if (!eVar.c()) {
            fdVar.zzf = ks.y(eVar);
        }
        fdVar.zzf.add(edVar);
    }

    public final int A() {
        return this.zze;
    }

    public final ed C(int r22) {
        return (ed) this.zzf.get(r22);
    }

    public final List F() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", ed.class});
        }
        if (r33 == 3) {
            return new fd();
        }
        bd bdVar = null;
        if (r33 == 4) {
            return new cd(bdVar);
        }
        if (r33 != 5) {
            return null;
        }
        return zzb;
    }

    public final int z() {
        return this.zzf.size();
    }
}
