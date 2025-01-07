package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2431a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ce f2432b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ce f2433c;

    static {
        new y5();
        f2431a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        f2432b = ce.A();
        f2433c = ce.A();
        try {
            x3.o(new c6());
            if (v5.b()) {
                return;
            }
            x3.n(new y5(), true);
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }
}
