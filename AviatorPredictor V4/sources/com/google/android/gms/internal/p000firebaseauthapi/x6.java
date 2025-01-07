package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class x6 {
    static t6 a(jc jcVar) {
        if (jcVar.C() == 3) {
            return new q6(16);
        }
        if (jcVar.C() == 4) {
            return new q6(32);
        }
        if (jcVar.C() == 5) {
            return new r6();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    static s6 b(jc jcVar) {
        if (jcVar.D() == 3) {
            return new s6("HmacSha256");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    static f7 c(jc jcVar) {
        if (jcVar.E() == 3) {
            return new f7(new s6("HmacSha256"));
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
