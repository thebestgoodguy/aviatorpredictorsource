package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1374a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f1375b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ce f1376c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ce f1377d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final ce f1378e;

    static {
        new h4();
        f1374a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new q4();
        f1375b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new t4();
        new n4();
        new a5();
        new e5();
        new w4();
        new h5();
        ce A = ce.A();
        f1376c = A;
        f1377d = A;
        f1378e = A;
        try {
            a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static void a() {
        x3.o(new e4());
        a8.a();
        x3.n(new h4(), true);
        x3.n(new q4(), true);
        if (v5.b()) {
            return;
        }
        x3.n(new n4(), true);
        t4.k(true);
        x3.n(new w4(), true);
        x3.n(new a5(), true);
        x3.n(new e5(), true);
        x3.n(new h5(), true);
    }
}
