package b3;

import b3.a;
import b3.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.c<Map<String, ?>> f850a = a.c.a("health-checking-config");

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<x> f851a;

        /* renamed from: b, reason: collision with root package name */
        private final b3.a f852b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[][] f853c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private List<x> f854a;

            /* renamed from: b, reason: collision with root package name */
            private b3.a f855b = b3.a.f683b;

            /* renamed from: c, reason: collision with root package name */
            private Object[][] f856c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public <T> a c(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.f856c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public b b() {
                return new b(this.f854a, this.f855b, this.f856c);
            }

            public a d(x xVar) {
                this.f854a = Collections.singletonList(xVar);
                return this;
            }

            public a e(List<x> list) {
                q0.l.e(!list.isEmpty(), "addrs is empty");
                this.f854a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a f(b3.a aVar) {
                this.f855b = (b3.a) q0.l.o(aVar, "attrs");
                return this;
            }
        }

        private b(List<x> list, b3.a aVar, Object[][] objArr) {
            this.f851a = (List) q0.l.o(list, "addresses are not set");
            this.f852b = (b3.a) q0.l.o(aVar, "attrs");
            this.f853c = (Object[][]) q0.l.o(objArr, "customOptions");
        }

        public static a c() {
            return new a();
        }

        public List<x> a() {
            return this.f851a;
        }

        public b3.a b() {
            return this.f852b;
        }

        public a d() {
            return c().e(this.f851a).f(this.f852b).c(this.f853c);
        }

        public String toString() {
            return q0.h.c(this).d("addrs", this.f851a).d("attrs", this.f852b).d("customOptions", Arrays.deepToString(this.f853c)).toString();
        }
    }

    public static abstract class c {
        public abstract n0 a(d dVar);
    }

    public static abstract class d {
        public h a(b bVar) {
            throw new UnsupportedOperationException();
        }

        public b3.f b() {
            throw new UnsupportedOperationException();
        }

        public j1 c() {
            throw new UnsupportedOperationException();
        }

        public void d() {
            throw new UnsupportedOperationException();
        }

        public abstract void e(p pVar, i iVar);
    }

    public static final class e {

        /* renamed from: e, reason: collision with root package name */
        private static final e f857e = new e(null, null, f1.f756f, false);

        /* renamed from: a, reason: collision with root package name */
        private final h f858a;

        /* renamed from: b, reason: collision with root package name */
        private final k.a f859b;

        /* renamed from: c, reason: collision with root package name */
        private final f1 f860c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f861d;

        private e(h hVar, k.a aVar, f1 f1Var, boolean z4) {
            this.f858a = hVar;
            this.f859b = aVar;
            this.f860c = (f1) q0.l.o(f1Var, "status");
            this.f861d = z4;
        }

        public static e e(f1 f1Var) {
            q0.l.e(!f1Var.o(), "drop status shouldn't be OK");
            return new e(null, null, f1Var, true);
        }

        public static e f(f1 f1Var) {
            q0.l.e(!f1Var.o(), "error status shouldn't be OK");
            return new e(null, null, f1Var, false);
        }

        public static e g() {
            return f857e;
        }

        public static e h(h hVar) {
            return i(hVar, null);
        }

        public static e i(h hVar, k.a aVar) {
            return new e((h) q0.l.o(hVar, "subchannel"), aVar, f1.f756f, false);
        }

        public f1 a() {
            return this.f860c;
        }

        public k.a b() {
            return this.f859b;
        }

        public h c() {
            return this.f858a;
        }

        public boolean d() {
            return this.f861d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return q0.i.a(this.f858a, eVar.f858a) && q0.i.a(this.f860c, eVar.f860c) && q0.i.a(this.f859b, eVar.f859b) && this.f861d == eVar.f861d;
        }

        public int hashCode() {
            return q0.i.b(this.f858a, this.f860c, this.f859b, Boolean.valueOf(this.f861d));
        }

        public String toString() {
            return q0.h.c(this).d("subchannel", this.f858a).d("streamTracerFactory", this.f859b).d("status", this.f860c).e("drop", this.f861d).toString();
        }
    }

    public static abstract class f {
        public abstract b3.c a();

        public abstract u0 b();

        public abstract v0<?, ?> c();
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final List<x> f862a;

        /* renamed from: b, reason: collision with root package name */
        private final b3.a f863b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f864c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private List<x> f865a;

            /* renamed from: b, reason: collision with root package name */
            private b3.a f866b = b3.a.f683b;

            /* renamed from: c, reason: collision with root package name */
            private Object f867c;

            a() {
            }

            public g a() {
                return new g(this.f865a, this.f866b, this.f867c);
            }

            public a b(List<x> list) {
                this.f865a = list;
                return this;
            }

            public a c(b3.a aVar) {
                this.f866b = aVar;
                return this;
            }

            public a d(Object obj) {
                this.f867c = obj;
                return this;
            }
        }

        private g(List<x> list, b3.a aVar, Object obj) {
            this.f862a = Collections.unmodifiableList(new ArrayList((Collection) q0.l.o(list, "addresses")));
            this.f863b = (b3.a) q0.l.o(aVar, "attributes");
            this.f864c = obj;
        }

        public static a d() {
            return new a();
        }

        public List<x> a() {
            return this.f862a;
        }

        public b3.a b() {
            return this.f863b;
        }

        public Object c() {
            return this.f864c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return q0.i.a(this.f862a, gVar.f862a) && q0.i.a(this.f863b, gVar.f863b) && q0.i.a(this.f864c, gVar.f864c);
        }

        public int hashCode() {
            return q0.i.b(this.f862a, this.f863b, this.f864c);
        }

        public String toString() {
            return q0.h.c(this).d("addresses", this.f862a).d("attributes", this.f863b).d("loadBalancingPolicyConfig", this.f864c).toString();
        }
    }

    public static abstract class h {
        public final x a() {
            List<x> b5 = b();
            q0.l.w(b5.size() == 1, "%s does not have exactly one group", b5);
            return b5.get(0);
        }

        public List<x> b() {
            throw new UnsupportedOperationException();
        }

        public abstract b3.a c();

        public Object d() {
            throw new UnsupportedOperationException();
        }

        public abstract void e();

        public abstract void f();

        public void g(j jVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void h(List<x> list) {
            throw new UnsupportedOperationException();
        }
    }

    public static abstract class i {
        public abstract e a(f fVar);

        @Deprecated
        public void b() {
        }
    }

    public interface j {
        void a(q qVar);
    }

    public boolean a() {
        return false;
    }

    public abstract void b(f1 f1Var);

    public abstract void c(g gVar);

    public void d() {
    }

    public abstract void e();
}
