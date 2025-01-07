package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f2316a = Logger.getLogger(x3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f2317b = new AtomicReference(new b3());

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap f2318c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f2319d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap f2320e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap f2321f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private static final ConcurrentMap f2322g = new ConcurrentHashMap();

    private x3() {
    }

    @Deprecated
    public static u2 a(String str) {
        return ((b3) f2317b.get()).a(str);
    }

    public static u2 b(String str) {
        return ((b3) f2317b.get()).c(str);
    }

    public static synchronized sc c(xc xcVar) {
        sc b5;
        synchronized (x3.class) {
            u2 b6 = b(xcVar.D());
            if (!((Boolean) f2319d.get(xcVar.D())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(xcVar.D())));
            }
            b5 = b6.b(xcVar.C());
        }
        return b5;
    }

    public static synchronized e0 d(xc xcVar) {
        e0 f5;
        synchronized (x3.class) {
            u2 b5 = b(xcVar.D());
            if (!((Boolean) f2319d.get(xcVar.D())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(xcVar.D())));
            }
            f5 = b5.f(xcVar.C());
        }
        return f5;
    }

    public static Class e(Class cls) {
        t3 t3Var = (t3) f2321f.get(cls);
        if (t3Var == null) {
            return null;
        }
        return t3Var.a();
    }

    @Deprecated
    public static Object f(sc scVar) {
        String D = scVar.D();
        return ((b3) f2317b.get()).a(D).a(scVar.C());
    }

    public static Object g(sc scVar, Class cls) {
        return h(scVar.D(), scVar.C(), cls);
    }

    public static Object h(String str, hr hrVar, Class cls) {
        return ((b3) f2317b.get()).b(str, cls).a(hrVar);
    }

    public static Object i(String str, e0 e0Var, Class cls) {
        return ((b3) f2317b.get()).b(str, cls).e(e0Var);
    }

    public static Object j(String str, byte[] bArr, Class cls) {
        return h(str, hr.A(bArr), cls);
    }

    public static Object k(s3 s3Var, Class cls) {
        t3 t3Var = (t3) f2321f.get(cls);
        if (t3Var == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(s3Var.a().getName()));
        }
        if (t3Var.a().equals(s3Var.a())) {
            return t3Var.c(s3Var);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + t3Var.a().toString() + ", got " + s3Var.a().toString());
    }

    static synchronized Map l() {
        Map unmodifiableMap;
        synchronized (x3.class) {
            unmodifiableMap = Collections.unmodifiableMap(f2322g);
        }
        return unmodifiableMap;
    }

    public static synchronized void m(s7 s7Var, q7 q7Var, boolean z4) {
        synchronized (x3.class) {
            AtomicReference atomicReference = f2317b;
            b3 b3Var = new b3((b3) atomicReference.get());
            b3Var.d(s7Var, q7Var);
            String c5 = s7Var.c();
            String c6 = q7Var.c();
            p(c5, s7Var.a().c(), true);
            p(c6, Collections.emptyMap(), false);
            if (!((b3) atomicReference.get()).f(c5)) {
                f2318c.put(c5, new w3(s7Var));
                q(s7Var.c(), s7Var.a().c());
            }
            ConcurrentMap concurrentMap = f2319d;
            concurrentMap.put(c5, Boolean.TRUE);
            concurrentMap.put(c6, Boolean.FALSE);
            atomicReference.set(b3Var);
        }
    }

    public static synchronized void n(q7 q7Var, boolean z4) {
        synchronized (x3.class) {
            AtomicReference atomicReference = f2317b;
            b3 b3Var = new b3((b3) atomicReference.get());
            b3Var.e(q7Var);
            String c5 = q7Var.c();
            p(c5, q7Var.a().c(), true);
            if (!((b3) atomicReference.get()).f(c5)) {
                f2318c.put(c5, new w3(q7Var));
                q(c5, q7Var.a().c());
            }
            f2319d.put(c5, Boolean.TRUE);
            atomicReference.set(b3Var);
        }
    }

    public static synchronized void o(t3 t3Var) {
        synchronized (x3.class) {
            if (t3Var == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class b5 = t3Var.b();
            ConcurrentMap concurrentMap = f2321f;
            if (concurrentMap.containsKey(b5)) {
                t3 t3Var2 = (t3) concurrentMap.get(b5);
                if (!t3Var.getClass().getName().equals(t3Var2.getClass().getName())) {
                    f2316a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(b5.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", b5.getName(), t3Var2.getClass().getName(), t3Var.getClass().getName()));
                }
            }
            concurrentMap.put(b5, t3Var);
        }
    }

    private static synchronized void p(String str, Map map, boolean z4) {
        synchronized (x3.class) {
            if (z4) {
                ConcurrentMap concurrentMap = f2319d;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((b3) f2317b.get()).f(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f2322g.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f2322g.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.firebase-auth-api.e0, java.lang.Object] */
    private static void q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f2322g.put((String) entry.getKey(), c3.e(str, ((o7) entry.getValue()).f1988a.m(), ((o7) entry.getValue()).f1989b));
        }
    }
}
