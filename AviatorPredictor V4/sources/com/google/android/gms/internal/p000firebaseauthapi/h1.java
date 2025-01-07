package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class h1 extends RuntimeException {
    public h1(e0 e0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final h a() {
        return new h(getMessage());
    }
}
