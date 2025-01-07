package b3;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import q0.h;

/* loaded from: classes.dex */
public abstract class w0 {

    class a extends e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f947a;

        a(f fVar) {
            this.f947a = fVar;
        }

        @Override // b3.w0.e, b3.w0.f
        public void b(f1 f1Var) {
            this.f947a.b(f1Var);
        }

        @Override // b3.w0.e
        public void c(g gVar) {
            this.f947a.a(gVar.a(), gVar.b());
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f949a;

        /* renamed from: b, reason: collision with root package name */
        private final c1 f950b;

        /* renamed from: c, reason: collision with root package name */
        private final j1 f951c;

        /* renamed from: d, reason: collision with root package name */
        private final h f952d;

        /* renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f953e;

        /* renamed from: f, reason: collision with root package name */
        private final b3.f f954f;

        /* renamed from: g, reason: collision with root package name */
        private final Executor f955g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Integer f956a;

            /* renamed from: b, reason: collision with root package name */
            private c1 f957b;

            /* renamed from: c, reason: collision with root package name */
            private j1 f958c;

            /* renamed from: d, reason: collision with root package name */
            private h f959d;

            /* renamed from: e, reason: collision with root package name */
            private ScheduledExecutorService f960e;

            /* renamed from: f, reason: collision with root package name */
            private b3.f f961f;

            /* renamed from: g, reason: collision with root package name */
            private Executor f962g;

            a() {
            }

            public b a() {
                return new b(this.f956a, this.f957b, this.f958c, this.f959d, this.f960e, this.f961f, this.f962g, null);
            }

            public a b(b3.f fVar) {
                this.f961f = (b3.f) q0.l.n(fVar);
                return this;
            }

            public a c(int r12) {
                this.f956a = Integer.valueOf(r12);
                return this;
            }

            public a d(Executor executor) {
                this.f962g = executor;
                return this;
            }

            public a e(c1 c1Var) {
                this.f957b = (c1) q0.l.n(c1Var);
                return this;
            }

            public a f(ScheduledExecutorService scheduledExecutorService) {
                this.f960e = (ScheduledExecutorService) q0.l.n(scheduledExecutorService);
                return this;
            }

            public a g(h hVar) {
                this.f959d = (h) q0.l.n(hVar);
                return this;
            }

            public a h(j1 j1Var) {
                this.f958c = (j1) q0.l.n(j1Var);
                return this;
            }
        }

        private b(Integer num, c1 c1Var, j1 j1Var, h hVar, ScheduledExecutorService scheduledExecutorService, b3.f fVar, Executor executor) {
            this.f949a = ((Integer) q0.l.o(num, "defaultPort not set")).intValue();
            this.f950b = (c1) q0.l.o(c1Var, "proxyDetector not set");
            this.f951c = (j1) q0.l.o(j1Var, "syncContext not set");
            this.f952d = (h) q0.l.o(hVar, "serviceConfigParser not set");
            this.f953e = scheduledExecutorService;
            this.f954f = fVar;
            this.f955g = executor;
        }

        /* synthetic */ b(Integer num, c1 c1Var, j1 j1Var, h hVar, ScheduledExecutorService scheduledExecutorService, b3.f fVar, Executor executor, a aVar) {
            this(num, c1Var, j1Var, hVar, scheduledExecutorService, fVar, executor);
        }

        public static a f() {
            return new a();
        }

        public int a() {
            return this.f949a;
        }

        public Executor b() {
            return this.f955g;
        }

        public c1 c() {
            return this.f950b;
        }

        public h d() {
            return this.f952d;
        }

        public j1 e() {
            return this.f951c;
        }

        public String toString() {
            return q0.h.c(this).b("defaultPort", this.f949a).d("proxyDetector", this.f950b).d("syncContext", this.f951c).d("serviceConfigParser", this.f952d).d("scheduledExecutorService", this.f953e).d("channelLogger", this.f954f).d("executor", this.f955g).toString();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final f1 f963a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f964b;

        private c(f1 f1Var) {
            this.f964b = null;
            this.f963a = (f1) q0.l.o(f1Var, "status");
            q0.l.j(!f1Var.o(), "cannot use OK status: %s", f1Var);
        }

        private c(Object obj) {
            this.f964b = q0.l.o(obj, "config");
            this.f963a = null;
        }

        public static c a(Object obj) {
            return new c(obj);
        }

        public static c b(f1 f1Var) {
            return new c(f1Var);
        }

        public Object c() {
            return this.f964b;
        }

        public f1 d() {
            return this.f963a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return q0.i.a(this.f963a, cVar.f963a) && q0.i.a(this.f964b, cVar.f964b);
        }

        public int hashCode() {
            return q0.i.b(this.f963a, this.f964b);
        }

        public String toString() {
            h.b c5;
            Object obj;
            String str;
            if (this.f964b != null) {
                c5 = q0.h.c(this);
                obj = this.f964b;
                str = "config";
            } else {
                c5 = q0.h.c(this);
                obj = this.f963a;
                str = "error";
            }
            return c5.d(str, obj).toString();
        }
    }

    public static abstract class d {
        public abstract String a();

        public abstract w0 b(URI r12, b bVar);
    }

    public static abstract class e implements f {
        @Override // b3.w0.f
        @Deprecated
        public final void a(List<x> list, b3.a aVar) {
            c(g.d().b(list).c(aVar).a());
        }

        @Override // b3.w0.f
        public abstract void b(f1 f1Var);

        public abstract void c(g gVar);
    }

    public interface f {
        void a(List<x> list, b3.a aVar);

        void b(f1 f1Var);
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final List<x> f965a;

        /* renamed from: b, reason: collision with root package name */
        private final b3.a f966b;

        /* renamed from: c, reason: collision with root package name */
        private final c f967c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private List<x> f968a = Collections.emptyList();

            /* renamed from: b, reason: collision with root package name */
            private b3.a f969b = b3.a.f683b;

            /* renamed from: c, reason: collision with root package name */
            private c f970c;

            a() {
            }

            public g a() {
                return new g(this.f968a, this.f969b, this.f970c);
            }

            public a b(List<x> list) {
                this.f968a = list;
                return this;
            }

            public a c(b3.a aVar) {
                this.f969b = aVar;
                return this;
            }

            public a d(c cVar) {
                this.f970c = cVar;
                return this;
            }
        }

        g(List<x> list, b3.a aVar, c cVar) {
            this.f965a = Collections.unmodifiableList(new ArrayList(list));
            this.f966b = (b3.a) q0.l.o(aVar, "attributes");
            this.f967c = cVar;
        }

        public static a d() {
            return new a();
        }

        public List<x> a() {
            return this.f965a;
        }

        public b3.a b() {
            return this.f966b;
        }

        public c c() {
            return this.f967c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return q0.i.a(this.f965a, gVar.f965a) && q0.i.a(this.f966b, gVar.f966b) && q0.i.a(this.f967c, gVar.f967c);
        }

        public int hashCode() {
            return q0.i.b(this.f965a, this.f966b, this.f967c);
        }

        public String toString() {
            return q0.h.c(this).d("addresses", this.f965a).d("attributes", this.f966b).d("serviceConfig", this.f967c).toString();
        }
    }

    public static abstract class h {
        public abstract c a(Map<String, ?> map);
    }

    public abstract String a();

    public void b() {
    }

    public abstract void c();

    public void d(e eVar) {
        e(eVar);
    }

    public void e(f fVar) {
        if (fVar instanceof e) {
            d((e) fVar);
        } else {
            d(new a(fVar));
        }
    }
}
