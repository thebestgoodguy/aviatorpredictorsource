package com.google.firebase.auth;

/* loaded from: classes.dex */
public class k {
    public static h a(String str, String str2) {
        w.r.e(str);
        w.r.e(str2);
        return new j(str, str2, null, null, false);
    }

    public static h b(String str, String str2) {
        if (j.t0(str2)) {
            return new j(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
