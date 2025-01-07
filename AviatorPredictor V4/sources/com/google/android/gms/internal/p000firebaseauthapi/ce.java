package com.google.android.gms.internal.p000firebaseauthapi;

@Deprecated
/* loaded from: classes.dex */
public final class ce extends ks implements f0 {
    private static final ce zzb;
    private String zze = "";
    private e zzf = ks.x();

    static {
        ce ceVar = new ce();
        zzb = ceVar;
        ks.n(ce.class, ceVar);
    }

    private ce() {
    }

    public static ce A() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r32, Object obj, Object obj2) {
        int r33 = r32 - 1;
        if (r33 == 0) {
            return (byte) 1;
        }
        if (r33 == 2) {
            return ks.f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", ad.class});
        }
        if (r33 == 3) {
            return new ce();
        }
        ae aeVar = null;
        if (r33 == 4) {
            return new be(aeVar);
        }
        if (r33 != 5) {
            return null;
        }
        return zzb;
    }
}
