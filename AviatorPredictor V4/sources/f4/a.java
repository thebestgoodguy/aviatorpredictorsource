package f4;

import n3.g;
import u3.p;

/* loaded from: classes.dex */
public final class a implements g.b {

    /* renamed from: g, reason: collision with root package name */
    public static final C0040a f3781g = new C0040a(null);

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f3782e;

    /* renamed from: f, reason: collision with root package name */
    private final g.c<?> f3783f = f3781g;

    /* renamed from: f4.a$a, reason: collision with other inner class name */
    public static final class C0040a implements g.c<a> {
        private C0040a() {
        }

        public /* synthetic */ C0040a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public a(Throwable th) {
        this.f3782e = th;
    }

    @Override // n3.g
    public <R> R fold(R r4, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r4, pVar);
    }

    @Override // n3.g.b, n3.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // n3.g.b
    public g.c<?> getKey() {
        return this.f3783f;
    }

    @Override // n3.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // n3.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
