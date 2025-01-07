package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class b3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f1405b = Logger.getLogger(b3.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f1406a;

    b3() {
        this.f1406a = new ConcurrentHashMap();
    }

    b3(b3 b3Var) {
        this.f1406a = new ConcurrentHashMap(b3Var.f1406a);
    }

    private final u2 g(String str, Class cls) {
        a3 h5 = h(str);
        if (cls == null) {
            return h5.b();
        }
        if (h5.d().contains(cls)) {
            return h5.a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(h5.c());
        Set<Class> d5 = h5.d();
        StringBuilder sb = new StringBuilder();
        boolean z4 = true;
        for (Class cls2 : d5) {
            if (!z4) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z4 = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb.toString());
    }

    private final synchronized a3 h(String str) {
        if (!this.f1406a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (a3) this.f1406a.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        r6.f1406a.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void i(com.google.android.gms.internal.p000firebaseauthapi.a3 r7, boolean r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.firebase-auth-api.u2 r0 = r7.b()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.d()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.ConcurrentMap r1 = r6.f1406a     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.firebase-auth-api.a3 r1 = (com.google.android.gms.internal.p000firebaseauthapi.a3) r1     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L5b
            java.lang.Class r2 = r1.c()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r3 = r7.c()     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L22
            goto L5b
        L22:
            java.util.logging.Logger r8 = com.google.android.gms.internal.p000firebaseauthapi.b3.f1405b     // Catch: java.lang.Throwable -> L6b
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "com.google.crypto.tink.KeyManagerRegistry"
            java.lang.String r4 = "registerKeyManagerContainer"
            java.lang.String r5 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r5 = r5.concat(r0)     // Catch: java.lang.Throwable -> L6b
            r8.logp(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6b
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L6b
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6b
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> L6b
            r0 = 1
            java.lang.Class r1 = r1.c()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r0] = r1     // Catch: java.lang.Throwable -> L6b
            r0 = 2
            java.lang.Class r7 = r7.c()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r0] = r7     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r7 = java.lang.String.format(r7, r2)     // Catch: java.lang.Throwable -> L6b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L6b
            throw r8     // Catch: java.lang.Throwable -> L6b
        L5b:
            if (r8 != 0) goto L64
            java.util.concurrent.ConcurrentMap r8 = r6.f1406a     // Catch: java.lang.Throwable -> L6b
            r8.putIfAbsent(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L64:
            java.util.concurrent.ConcurrentMap r8 = r6.f1406a     // Catch: java.lang.Throwable -> L6b
            r8.put(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L6b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.b3.i(com.google.android.gms.internal.firebase-auth-api.a3, boolean):void");
    }

    @Deprecated
    final u2 a(String str) {
        return g(str, null);
    }

    final u2 b(String str, Class cls) {
        return g(str, cls);
    }

    final u2 c(String str) {
        return h(str).b();
    }

    final synchronized void d(s7 s7Var, q7 q7Var) {
        Class e5;
        int e6 = q7Var.e();
        if (!u5.a(1)) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(s7Var.getClass()) + " as it is not FIPS compatible.");
        }
        if (!u5.a(e6)) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(q7Var.getClass()) + " as it is not FIPS compatible.");
        }
        String c5 = s7Var.c();
        String c6 = q7Var.c();
        if (this.f1406a.containsKey(c5) && ((a3) this.f1406a.get(c5)).e() != null && (e5 = ((a3) this.f1406a.get(c5)).e()) != null && !e5.getName().equals(q7Var.getClass().getName())) {
            f1405b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + c5 + " with inconsistent public key type " + c6);
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", s7Var.getClass().getName(), e5.getName(), q7Var.getClass().getName()));
        }
        i(new z2(s7Var, q7Var), true);
        i(new y2(q7Var), false);
    }

    final synchronized void e(q7 q7Var) {
        if (!u5.a(q7Var.e())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(q7Var.getClass()) + " as it is not FIPS compatible.");
        }
        i(new y2(q7Var), false);
    }

    final boolean f(String str) {
        return this.f1406a.containsKey(str);
    }
}
