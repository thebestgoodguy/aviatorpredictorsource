package b1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Class<? super T>> f618a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<q> f619b;

    /* renamed from: c, reason: collision with root package name */
    private final int f620c;

    /* renamed from: d, reason: collision with root package name */
    private final int f621d;

    /* renamed from: e, reason: collision with root package name */
    private final h<T> f622e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f623f;

    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<? super T>> f624a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<q> f625b;

        /* renamed from: c, reason: collision with root package name */
        private int f626c;

        /* renamed from: d, reason: collision with root package name */
        private int f627d;

        /* renamed from: e, reason: collision with root package name */
        private h<T> f628e;

        /* renamed from: f, reason: collision with root package name */
        private Set<Class<?>> f629f;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f624a = hashSet;
            this.f625b = new HashSet();
            this.f626c = 0;
            this.f627d = 0;
            this.f629f = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                d0.c(cls2, "Null interface");
            }
            Collections.addAll(this.f624a, clsArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> f() {
            this.f627d = 1;
            return this;
        }

        private b<T> g(int r32) {
            d0.d(this.f626c == 0, "Instantiation type has already been set.");
            this.f626c = r32;
            return this;
        }

        private void h(Class<?> cls) {
            d0.a(!this.f624a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            d0.c(qVar, "Null dependency");
            h(qVar.c());
            this.f625b.add(qVar);
            return this;
        }

        public d<T> c() {
            d0.d(this.f628e != null, "Missing required property: factory.");
            return new d<>(new HashSet(this.f624a), new HashSet(this.f625b), this.f626c, this.f627d, this.f628e, this.f629f);
        }

        public b<T> d() {
            return g(2);
        }

        public b<T> e(h<T> hVar) {
            this.f628e = (h) d0.c(hVar, "Null factory");
            return this;
        }
    }

    private d(Set<Class<? super T>> set, Set<q> set2, int r32, int r4, h<T> hVar, Set<Class<?>> set3) {
        this.f618a = Collections.unmodifiableSet(set);
        this.f619b = Collections.unmodifiableSet(set2);
        this.f620c = r32;
        this.f621d = r4;
        this.f622e = hVar;
        this.f623f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> i(final T t4, Class<T> cls) {
        return j(cls).e(new h() { // from class: b1.b
            @Override // b1.h
            public final Object a(e eVar) {
                Object n4;
                n4 = d.n(t4, eVar);
                return n4;
            }
        }).c();
    }

    public static <T> b<T> j(Class<T> cls) {
        return c(cls).f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object n(Object obj, e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object o(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> p(final T t4, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).e(new h() { // from class: b1.c
            @Override // b1.h
            public final Object a(e eVar) {
                Object o4;
                o4 = d.o(t4, eVar);
                return o4;
            }
        }).c();
    }

    public Set<q> e() {
        return this.f619b;
    }

    public h<T> f() {
        return this.f622e;
    }

    public Set<Class<? super T>> g() {
        return this.f618a;
    }

    public Set<Class<?>> h() {
        return this.f623f;
    }

    public boolean k() {
        return this.f620c == 1;
    }

    public boolean l() {
        return this.f620c == 2;
    }

    public boolean m() {
        return this.f621d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f618a.toArray()) + ">{" + this.f620c + ", type=" + this.f621d + ", deps=" + Arrays.toString(this.f619b.toArray()) + "}";
    }
}
