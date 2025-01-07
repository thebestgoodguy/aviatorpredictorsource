package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2430a = Charset.forName("UTF-8");

    public static ld a(fd fdVar) {
        id z4 = ld.z();
        z4.q(fdVar.A());
        for (ed edVar : fdVar.F()) {
            jd A = kd.A();
            A.q(edVar.A().D());
            A.s(edVar.G());
            A.r(edVar.H());
            A.p(edVar.z());
            z4.p((kd) A.f());
        }
        return (ld) z4.f();
    }

    public static void b(fd fdVar) {
        int A = fdVar.A();
        int r32 = 0;
        boolean z4 = false;
        boolean z5 = true;
        for (ed edVar : fdVar.F()) {
            if (edVar.G() == 3) {
                if (!edVar.F()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(edVar.z())));
                }
                if (edVar.H() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(edVar.z())));
                }
                if (edVar.G() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(edVar.z())));
                }
                if (edVar.z() == A) {
                    if (z4) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z4 = true;
                }
                z5 &= edVar.A().G() == 5;
                r32++;
            }
        }
        if (r32 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z4 && !z5) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
