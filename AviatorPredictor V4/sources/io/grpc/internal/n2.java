package io.grpc.internal;

/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: l, reason: collision with root package name */
    private static final b f5484l = new b(k2.f5425a);

    /* renamed from: a, reason: collision with root package name */
    private final k2 f5485a;

    /* renamed from: b, reason: collision with root package name */
    private long f5486b;

    /* renamed from: c, reason: collision with root package name */
    private long f5487c;

    /* renamed from: d, reason: collision with root package name */
    private long f5488d;

    /* renamed from: e, reason: collision with root package name */
    private long f5489e;

    /* renamed from: f, reason: collision with root package name */
    private long f5490f;

    /* renamed from: g, reason: collision with root package name */
    private c f5491g;

    /* renamed from: h, reason: collision with root package name */
    private long f5492h;

    /* renamed from: i, reason: collision with root package name */
    private long f5493i;

    /* renamed from: j, reason: collision with root package name */
    private final d1 f5494j;

    /* renamed from: k, reason: collision with root package name */
    private volatile long f5495k;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final k2 f5496a;

        public b(k2 k2Var) {
            this.f5496a = k2Var;
        }

        public n2 a() {
            return new n2(this.f5496a);
        }
    }

    public interface c {
    }

    public n2() {
        this.f5494j = e1.a();
        this.f5485a = k2.f5425a;
    }

    private n2(k2 k2Var) {
        this.f5494j = e1.a();
        this.f5485a = k2Var;
    }

    public static b a() {
        return f5484l;
    }

    public void b() {
        this.f5490f++;
    }

    public void c() {
        this.f5486b++;
        this.f5487c = this.f5485a.a();
    }

    public void d() {
        this.f5494j.a(1L);
        this.f5495k = this.f5485a.a();
    }

    public void e(int r5) {
        if (r5 == 0) {
            return;
        }
        this.f5492h += r5;
        this.f5493i = this.f5485a.a();
    }

    public void f(boolean z4) {
        if (z4) {
            this.f5488d++;
        } else {
            this.f5489e++;
        }
    }

    public void g(c cVar) {
        this.f5491g = (c) q0.l.n(cVar);
    }
}
