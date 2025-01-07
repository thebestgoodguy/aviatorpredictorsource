package io.grpc.internal;

/* loaded from: classes.dex */
final class m {

    /* renamed from: f, reason: collision with root package name */
    static final b f5461f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final k2 f5462a;

    /* renamed from: b, reason: collision with root package name */
    private final d1 f5463b = e1.a();

    /* renamed from: c, reason: collision with root package name */
    private final d1 f5464c = e1.a();

    /* renamed from: d, reason: collision with root package name */
    private final d1 f5465d = e1.a();

    /* renamed from: e, reason: collision with root package name */
    private volatile long f5466e;

    class a implements b {
        a() {
        }

        @Override // io.grpc.internal.m.b
        public m a() {
            return new m(k2.f5425a);
        }
    }

    public interface b {
        m a();
    }

    m(k2 k2Var) {
        this.f5462a = k2Var;
    }

    public void a(boolean z4) {
        (z4 ? this.f5464c : this.f5465d).a(1L);
    }

    public void b() {
        this.f5463b.a(1L);
        this.f5466e = this.f5462a.a();
    }
}
