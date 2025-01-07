package b3;

import b3.g;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final g<Object, Object> f812a = new a();

    class a extends g<Object, Object> {
        a() {
        }

        @Override // b3.g
        public void a(String str, Throwable th) {
        }

        @Override // b3.g
        public void b() {
        }

        @Override // b3.g
        public void c(int r12) {
        }

        @Override // b3.g
        public void d(Object obj) {
        }

        @Override // b3.g
        public void e(g.a<Object> aVar, u0 u0Var) {
        }
    }

    private static class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private final d f813a;

        /* renamed from: b, reason: collision with root package name */
        private final h f814b;

        private b(d dVar, h hVar) {
            this.f813a = dVar;
            this.f814b = (h) q0.l.o(hVar, "interceptor");
        }

        /* synthetic */ b(d dVar, h hVar, i iVar) {
            this(dVar, hVar);
        }

        @Override // b3.d
        public String b() {
            return this.f813a.b();
        }

        @Override // b3.d
        public <ReqT, RespT> g<ReqT, RespT> h(v0<ReqT, RespT> v0Var, c cVar) {
            return this.f814b.a(v0Var, cVar, this.f813a);
        }
    }

    public static d a(d dVar, List<? extends h> list) {
        q0.l.o(dVar, "channel");
        Iterator<? extends h> it = list.iterator();
        while (it.hasNext()) {
            dVar = new b(dVar, it.next(), null);
        }
        return dVar;
    }
}
