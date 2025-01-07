package b1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class e0 extends b1.a {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Class<?>> f630a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Class<?>> f631b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Class<?>> f632c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<Class<?>> f633d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<Class<?>> f634e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f635f;

    /* renamed from: g, reason: collision with root package name */
    private final e f636g;

    private static class a implements f1.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f637a;

        /* renamed from: b, reason: collision with root package name */
        private final f1.c f638b;

        public a(Set<Class<?>> set, f1.c cVar) {
            this.f637a = set;
            this.f638b = cVar;
        }

        @Override // f1.c
        public void a(f1.a<?> aVar) {
            if (!this.f637a.contains(aVar.a())) {
                throw new s(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f638b.a(aVar);
        }
    }

    e0(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : dVar.e()) {
            if (qVar.e()) {
                boolean g5 = qVar.g();
                Class<?> c5 = qVar.c();
                if (g5) {
                    hashSet4.add(c5);
                } else {
                    hashSet.add(c5);
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else {
                boolean g6 = qVar.g();
                Class<?> c6 = qVar.c();
                if (g6) {
                    hashSet5.add(c6);
                } else {
                    hashSet2.add(c6);
                }
            }
        }
        if (!dVar.h().isEmpty()) {
            hashSet.add(f1.c.class);
        }
        this.f630a = Collections.unmodifiableSet(hashSet);
        this.f631b = Collections.unmodifiableSet(hashSet2);
        this.f632c = Collections.unmodifiableSet(hashSet3);
        this.f633d = Collections.unmodifiableSet(hashSet4);
        this.f634e = Collections.unmodifiableSet(hashSet5);
        this.f635f = dVar.h();
        this.f636g = eVar;
    }

    @Override // b1.a, b1.e
    public <T> T a(Class<T> cls) {
        if (!this.f630a.contains(cls)) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t4 = (T) this.f636g.a(cls);
        return !cls.equals(f1.c.class) ? t4 : (T) new a(this.f635f, (f1.c) t4);
    }

    @Override // b1.e
    public <T> r1.b<T> b(Class<T> cls) {
        if (this.f631b.contains(cls)) {
            return this.f636g.b(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // b1.a, b1.e
    public <T> Set<T> c(Class<T> cls) {
        if (this.f633d.contains(cls)) {
            return this.f636g.c(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // b1.e
    public <T> r1.b<Set<T>> d(Class<T> cls) {
        if (this.f634e.contains(cls)) {
            return this.f636g.d(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // b1.e
    public <T> r1.a<T> e(Class<T> cls) {
        if (this.f632c.contains(cls)) {
            return this.f636g.e(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
