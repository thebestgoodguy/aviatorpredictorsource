package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class je extends ks implements f0 {
    private static final je zzb;
    private int zze;

    static {
        je jeVar = new je();
        zzb = jeVar;
        ks.n(je.class, jeVar);
    }

    private je() {
    }

    public static je A() {
        return zzb;
    }

    public static je B(hr hrVar, yr yrVar) {
        return (je) ks.v(zzb, hrVar, yrVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ks
    protected final Object r(int r12, Object obj, Object obj2) {
        int r13 = r12 - 1;
        if (r13 == 0) {
            return (byte) 1;
        }
        if (r13 == 2) {
            return ks.f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (r13 == 3) {
            return new je();
        }
        ge geVar = null;
        if (r13 == 4) {
            return new he(geVar);
        }
        if (r13 != 5) {
            return null;
        }
        return zzb;
    }
}
