package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class v5 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f2229a = Logger.getLogger(v5.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f2230b = new AtomicBoolean(false);

    private v5() {
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f2229a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return f2230b.get();
    }
}
