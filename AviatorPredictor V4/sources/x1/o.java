package x1;

import b3.v0;
import h3.b;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static volatile v0<c, d> f8192a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile v0<e, f> f8193b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile v0<z, a0> f8194c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile v0<p, q> f8195d;

    class a implements b.a<b> {
        a() {
        }

        @Override // h3.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(b3.d dVar, b3.c cVar) {
            return new b(dVar, cVar, null);
        }
    }

    public static final class b extends h3.a<b> {
        private b(b3.d dVar, b3.c cVar) {
            super(dVar, cVar);
        }

        /* synthetic */ b(b3.d dVar, b3.c cVar, a aVar) {
            this(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h3.b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b a(b3.d dVar, b3.c cVar) {
            return new b(dVar, cVar);
        }
    }

    private o() {
    }

    public static v0<c, d> a() {
        v0<c, d> v0Var = f8192a;
        if (v0Var == null) {
            synchronized (o.class) {
                v0Var = f8192a;
                if (v0Var == null) {
                    v0Var = v0.g().f(v0.d.SERVER_STREAMING).b(v0.b("google.firestore.v1.Firestore", "BatchGetDocuments")).e(true).c(g3.b.b(c.Y())).d(g3.b.b(d.U())).a();
                    f8192a = v0Var;
                }
            }
        }
        return v0Var;
    }

    public static v0<e, f> b() {
        v0<e, f> v0Var = f8193b;
        if (v0Var == null) {
            synchronized (o.class) {
                v0Var = f8193b;
                if (v0Var == null) {
                    v0Var = v0.g().f(v0.d.UNARY).b(v0.b("google.firestore.v1.Firestore", "Commit")).e(true).c(g3.b.b(e.Y())).d(g3.b.b(f.V())).a();
                    f8193b = v0Var;
                }
            }
        }
        return v0Var;
    }

    public static v0<p, q> c() {
        v0<p, q> v0Var = f8195d;
        if (v0Var == null) {
            synchronized (o.class) {
                v0Var = f8195d;
                if (v0Var == null) {
                    v0Var = v0.g().f(v0.d.BIDI_STREAMING).b(v0.b("google.firestore.v1.Firestore", "Listen")).e(true).c(g3.b.b(p.Y())).d(g3.b.b(q.U())).a();
                    f8195d = v0Var;
                }
            }
        }
        return v0Var;
    }

    public static v0<z, a0> d() {
        v0<z, a0> v0Var = f8194c;
        if (v0Var == null) {
            synchronized (o.class) {
                v0Var = f8194c;
                if (v0Var == null) {
                    v0Var = v0.g().f(v0.d.BIDI_STREAMING).b(v0.b("google.firestore.v1.Firestore", "Write")).e(true).c(g3.b.b(z.Z())).d(g3.b.b(a0.V())).a();
                    f8194c = v0Var;
                }
            }
        }
        return v0Var;
    }

    public static b e(b3.d dVar) {
        return (b) h3.a.e(new a(), dVar);
    }
}
