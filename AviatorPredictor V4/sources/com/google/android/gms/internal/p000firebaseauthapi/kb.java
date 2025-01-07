package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class kb extends ks implements f0 {
    private static final kb zzb;
    private int zze;
    private int zzf;
    private hr zzg = hr.f1739f;

    static {
        kb kbVar = new kb();
        zzb = kbVar;
        ks.n(kb.class, kbVar);
    }

    private kb() {
    }

    public static kb B() {
        return zzb;
    }

    public static jb z() {
        return (jb) zzb.s();
    }

    public final hr C() {
        return this.zzg;
    }

    public final int E() {
        int r02 = this.zze;
        int r12 = 5;
        if (r02 == 0) {
            r12 = 2;
        } else if (r02 == 2) {
            r12 = 4;
        } else if (r02 != 3) {
            r12 = r02 != 4 ? r02 != 5 ? 0 : 7 : 6;
        }
        if (r12 == 0) {
            return 1;
        }
        return r12;
    }

    public final int F() {
        int b5 = rb.b(this.zzf);
        if (b5 == 0) {
            return 1;
        }
        return b5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (r33 == 3) {
            return new kb();
        }
        ib ibVar = null;
        if (r33 == 4) {
            return new jb(ibVar);
        }
        if (r33 != 5) {
            return null;
        }
        return zzb;
    }
}
