package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class q7 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f2054a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f2055b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f2056c;

    @SafeVarargs
    protected q7(Class cls, r7... r7VarArr) {
        this.f2054a = cls;
        HashMap hashMap = new HashMap();
        for (int r12 = 0; r12 <= 0; r12++) {
            r7 r7Var = r7VarArr[r12];
            if (hashMap.containsKey(r7Var.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(r7Var.b().getCanonicalName())));
            }
            hashMap.put(r7Var.b(), r7Var);
        }
        this.f2056c = r7VarArr[0].b();
        this.f2055b = Collections.unmodifiableMap(hashMap);
    }

    public p7 a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract e0 b(hr hrVar);

    public abstract String c();

    public abstract void d(e0 e0Var);

    public int e() {
        return 1;
    }

    public abstract int f();

    public final Class g() {
        return this.f2056c;
    }

    public final Class h() {
        return this.f2054a;
    }

    public final Object i(e0 e0Var, Class cls) {
        r7 r7Var = (r7) this.f2055b.get(cls);
        if (r7Var != null) {
            return r7Var.a(e0Var);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set j() {
        return this.f2055b.keySet();
    }
}
