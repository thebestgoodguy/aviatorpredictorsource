package a1;

import com.google.android.gms.internal.p000firebaseauthapi.cq;

/* loaded from: classes.dex */
public final class w0 {
    public static cq a(com.google.firebase.auth.h hVar, String str) {
        w.r.i(hVar);
        if (com.google.firebase.auth.e0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.e0.m0((com.google.firebase.auth.e0) hVar, str);
        }
        if (com.google.firebase.auth.l.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.l.m0((com.google.firebase.auth.l) hVar, str);
        }
        if (com.google.firebase.auth.v0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.v0.m0((com.google.firebase.auth.v0) hVar, str);
        }
        if (com.google.firebase.auth.c0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.c0.m0((com.google.firebase.auth.c0) hVar, str);
        }
        if (com.google.firebase.auth.t0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.t0.m0((com.google.firebase.auth.t0) hVar, str);
        }
        if (com.google.firebase.auth.n1.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.n1.o0((com.google.firebase.auth.n1) hVar, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
