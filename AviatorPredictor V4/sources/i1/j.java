package i1;

import android.content.Context;
import k1.z3;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private k1.z0 f4106a;

    /* renamed from: b, reason: collision with root package name */
    private k1.f0 f4107b;

    /* renamed from: c, reason: collision with root package name */
    private b1 f4108c;

    /* renamed from: d, reason: collision with root package name */
    private o1.n0 f4109d;

    /* renamed from: e, reason: collision with root package name */
    private p f4110e;

    /* renamed from: f, reason: collision with root package name */
    private o1.k f4111f;

    /* renamed from: g, reason: collision with root package name */
    private k1.k f4112g;

    /* renamed from: h, reason: collision with root package name */
    private z3 f4113h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4114a;

        /* renamed from: b, reason: collision with root package name */
        private final p1.g f4115b;

        /* renamed from: c, reason: collision with root package name */
        private final m f4116c;

        /* renamed from: d, reason: collision with root package name */
        private final o1.m f4117d;

        /* renamed from: e, reason: collision with root package name */
        private final g1.j f4118e;

        /* renamed from: f, reason: collision with root package name */
        private final int f4119f;

        /* renamed from: g, reason: collision with root package name */
        private final com.google.firebase.firestore.v f4120g;

        public a(Context context, p1.g gVar, m mVar, o1.m mVar2, g1.j jVar, int r6, com.google.firebase.firestore.v vVar) {
            this.f4114a = context;
            this.f4115b = gVar;
            this.f4116c = mVar;
            this.f4117d = mVar2;
            this.f4118e = jVar;
            this.f4119f = r6;
            this.f4120g = vVar;
        }

        p1.g a() {
            return this.f4115b;
        }

        Context b() {
            return this.f4114a;
        }

        m c() {
            return this.f4116c;
        }

        o1.m d() {
            return this.f4117d;
        }

        g1.j e() {
            return this.f4118e;
        }

        int f() {
            return this.f4119f;
        }

        com.google.firebase.firestore.v g() {
            return this.f4120g;
        }
    }

    protected abstract o1.k a(a aVar);

    protected abstract p b(a aVar);

    protected abstract z3 c(a aVar);

    protected abstract k1.k d(a aVar);

    protected abstract k1.f0 e(a aVar);

    protected abstract k1.z0 f(a aVar);

    protected abstract o1.n0 g(a aVar);

    protected abstract b1 h(a aVar);

    protected o1.k i() {
        return (o1.k) p1.b.e(this.f4111f, "connectivityMonitor not initialized yet", new Object[0]);
    }

    public p j() {
        return (p) p1.b.e(this.f4110e, "eventManager not initialized yet", new Object[0]);
    }

    public z3 k() {
        return this.f4113h;
    }

    public k1.k l() {
        return this.f4112g;
    }

    public k1.f0 m() {
        return (k1.f0) p1.b.e(this.f4107b, "localStore not initialized yet", new Object[0]);
    }

    public k1.z0 n() {
        return (k1.z0) p1.b.e(this.f4106a, "persistence not initialized yet", new Object[0]);
    }

    public o1.n0 o() {
        return (o1.n0) p1.b.e(this.f4109d, "remoteStore not initialized yet", new Object[0]);
    }

    public b1 p() {
        return (b1) p1.b.e(this.f4108c, "syncEngine not initialized yet", new Object[0]);
    }

    public void q(a aVar) {
        k1.z0 f5 = f(aVar);
        this.f4106a = f5;
        f5.m();
        this.f4107b = e(aVar);
        this.f4111f = a(aVar);
        this.f4109d = g(aVar);
        this.f4108c = h(aVar);
        this.f4110e = b(aVar);
        this.f4107b.j0();
        this.f4109d.O();
        this.f4113h = c(aVar);
        this.f4112g = d(aVar);
    }
}
