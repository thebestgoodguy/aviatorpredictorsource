package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class m0 {

    /* renamed from: c, reason: collision with root package name */
    private static final m0 f1910c = new m0();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f1912b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final r0 f1911a = new v();

    private m0() {
    }

    public static m0 a() {
        return f1910c;
    }

    public final q0 b(Class cls) {
        f.f(cls, "messageType");
        q0 q0Var = (q0) this.f1912b.get(cls);
        if (q0Var == null) {
            q0Var = this.f1911a.a(cls);
            f.f(cls, "messageType");
            f.f(q0Var, "schema");
            q0 q0Var2 = (q0) this.f1912b.putIfAbsent(cls, q0Var);
            if (q0Var2 != null) {
                return q0Var2;
            }
        }
        return q0Var;
    }
}
