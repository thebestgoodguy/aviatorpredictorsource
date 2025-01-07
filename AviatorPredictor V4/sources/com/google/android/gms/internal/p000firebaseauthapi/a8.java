package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class a8 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final ce f1379a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ce f1380b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ce f1381c;

    static {
        new z7();
        ce A = ce.A();
        f1379a = A;
        f1380b = A;
        f1381c = A;
        try {
            a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static void a() {
        x3.o(new e8());
        x3.n(new z7(), true);
        if (v5.b()) {
            return;
        }
        x3.n(new w7(), true);
    }
}
