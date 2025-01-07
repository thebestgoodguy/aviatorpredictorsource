package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class i1 {

    /* renamed from: c, reason: collision with root package name */
    private static final i1 f2911c = new i1();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, n1<?>> f2913b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final o1 f2912a = new n0();

    private i1() {
    }

    public static i1 a() {
        return f2911c;
    }

    public <T> void b(T t4, l1 l1Var, r rVar) {
        e(t4).c(t4, l1Var, rVar);
    }

    public n1<?> c(Class<?> cls, n1<?> n1Var) {
        d0.b(cls, "messageType");
        d0.b(n1Var, "schema");
        return this.f2913b.putIfAbsent(cls, n1Var);
    }

    public <T> n1<T> d(Class<T> cls) {
        d0.b(cls, "messageType");
        n1<T> n1Var = (n1) this.f2913b.get(cls);
        if (n1Var != null) {
            return n1Var;
        }
        n1<T> a5 = this.f2912a.a(cls);
        n1<T> n1Var2 = (n1<T>) c(cls, a5);
        return n1Var2 != null ? n1Var2 : a5;
    }

    public <T> n1<T> e(T t4) {
        return d(t4.getClass());
    }
}
