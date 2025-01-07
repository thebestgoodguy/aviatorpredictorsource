package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class o6 {
    public static void a(ab abVar) {
        af.f(c(abVar.D().E()));
        b(abVar.D().F());
        if (abVar.G() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        x3.c(abVar.z().C());
    }

    public static String b(int r22) {
        int r02 = r22 - 2;
        if (r02 == 1) {
            return "HmacSha1";
        }
        if (r02 == 2) {
            return "HmacSha384";
        }
        if (r02 == 3) {
            return "HmacSha256";
        }
        if (r02 == 4) {
            return "HmacSha512";
        }
        if (r02 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(rb.a(r22))));
    }

    public static int c(int r32) {
        int r02 = r32 - 2;
        if (r02 == 2) {
            return 1;
        }
        if (r02 == 3) {
            return 2;
        }
        if (r02 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(mb.a(r32))));
    }

    public static int d(int r22) {
        int r02 = r22 - 2;
        int r12 = 1;
        if (r02 != 1) {
            r12 = 2;
            if (r02 != 2) {
                if (r02 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(ra.a(r22))));
            }
        }
        return r12;
    }
}
