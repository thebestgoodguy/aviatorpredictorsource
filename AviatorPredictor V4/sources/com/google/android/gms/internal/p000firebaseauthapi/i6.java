package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final ce f1767a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ce f1768b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ce f1769c;

    static {
        new h6();
        new f6();
        f1767a = ce.A();
        f1768b = ce.A();
        f1769c = ce.A();
        try {
            a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static void a() {
        x3.o(new k6());
        x3.o(new m6());
        a4.a();
        if (v5.b()) {
            return;
        }
        x3.m(new f6(), new h6(), true);
        x3.m(new a7(), new d7(), true);
    }
}
