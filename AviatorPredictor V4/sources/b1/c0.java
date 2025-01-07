package b1;

import r1.a;

/* loaded from: classes.dex */
class c0<T> implements r1.b<T>, r1.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC0081a<Object> f614c = new a.InterfaceC0081a() { // from class: b1.a0
        @Override // r1.a.InterfaceC0081a
        public final void a(r1.b bVar) {
            c0.f(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final r1.b<Object> f615d = new r1.b() { // from class: b1.b0
        @Override // r1.b
        public final Object get() {
            Object g5;
            g5 = c0.g();
            return g5;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private a.InterfaceC0081a<T> f616a;

    /* renamed from: b, reason: collision with root package name */
    private volatile r1.b<T> f617b;

    private c0(a.InterfaceC0081a<T> interfaceC0081a, r1.b<T> bVar) {
        this.f616a = interfaceC0081a;
        this.f617b = bVar;
    }

    static <T> c0<T> e() {
        return new c0<>(f614c, f615d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(r1.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC0081a interfaceC0081a, a.InterfaceC0081a interfaceC0081a2, r1.b bVar) {
        interfaceC0081a.a(bVar);
        interfaceC0081a2.a(bVar);
    }

    static <T> c0<T> i(r1.b<T> bVar) {
        return new c0<>(null, bVar);
    }

    @Override // r1.a
    public void a(final a.InterfaceC0081a<T> interfaceC0081a) {
        r1.b<T> bVar;
        r1.b<T> bVar2 = this.f617b;
        r1.b<Object> bVar3 = f615d;
        if (bVar2 != bVar3) {
            interfaceC0081a.a(bVar2);
            return;
        }
        r1.b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f617b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                final a.InterfaceC0081a<T> interfaceC0081a2 = this.f616a;
                this.f616a = new a.InterfaceC0081a() { // from class: b1.z
                    @Override // r1.a.InterfaceC0081a
                    public final void a(r1.b bVar5) {
                        c0.h(a.InterfaceC0081a.this, interfaceC0081a, bVar5);
                    }
                };
            }
        }
        if (bVar4 != null) {
            interfaceC0081a.a(bVar);
        }
    }

    @Override // r1.b
    public T get() {
        return this.f617b.get();
    }

    void j(r1.b<T> bVar) {
        a.InterfaceC0081a<T> interfaceC0081a;
        if (this.f617b != f615d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0081a = this.f616a;
            this.f616a = null;
            this.f617b = bVar;
        }
        interfaceC0081a.a(bVar);
    }
}
