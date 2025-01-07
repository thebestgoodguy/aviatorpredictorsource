package q0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final q0.a f7153a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7154b;

    /* renamed from: c, reason: collision with root package name */
    private final b f7155c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7156d;

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0.a f7157a;

        a(q0.a aVar) {
            this.f7157a = aVar;
        }
    }

    private interface b {
    }

    private m(b bVar) {
        this(bVar, false, q0.a.c(), Integer.MAX_VALUE);
    }

    private m(b bVar, boolean z4, q0.a aVar, int r4) {
        this.f7155c = bVar;
        this.f7154b = z4;
        this.f7153a = aVar;
        this.f7156d = r4;
    }

    public static m a(char c5) {
        return b(q0.a.b(c5));
    }

    public static m b(q0.a aVar) {
        l.n(aVar);
        return new m(new a(aVar));
    }

    public m c() {
        return d(q0.a.e());
    }

    public m d(q0.a aVar) {
        l.n(aVar);
        return new m(this.f7155c, this.f7154b, aVar, this.f7156d);
    }
}
