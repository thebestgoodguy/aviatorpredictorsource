package o1;

import android.content.Context;
import b3.f1;
import b3.g;
import b3.u0;
import com.google.firebase.firestore.u;

/* loaded from: classes.dex */
public class u {

    /* renamed from: g, reason: collision with root package name */
    private static final u0.g<String> f6930g;

    /* renamed from: h, reason: collision with root package name */
    private static final u0.g<String> f6931h;

    /* renamed from: i, reason: collision with root package name */
    private static final u0.g<String> f6932i;

    /* renamed from: j, reason: collision with root package name */
    private static volatile String f6933j;

    /* renamed from: a, reason: collision with root package name */
    private final p1.g f6934a;

    /* renamed from: b, reason: collision with root package name */
    private final g1.a<g1.j> f6935b;

    /* renamed from: c, reason: collision with root package name */
    private final g1.a<String> f6936c;

    /* renamed from: d, reason: collision with root package name */
    private final d0 f6937d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6938e;

    /* renamed from: f, reason: collision with root package name */
    private final e0 f6939f;

    class a extends g.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0 f6940a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b3.g[] f6941b;

        a(f0 f0Var, b3.g[] gVarArr) {
            this.f6940a = f0Var;
            this.f6941b = gVarArr;
        }

        @Override // b3.g.a
        public void a(f1 f1Var, b3.u0 u0Var) {
            try {
                this.f6940a.b(f1Var);
            } catch (Throwable th) {
                u.this.f6934a.u(th);
            }
        }

        @Override // b3.g.a
        public void b(b3.u0 u0Var) {
            try {
                this.f6940a.d(u0Var);
            } catch (Throwable th) {
                u.this.f6934a.u(th);
            }
        }

        @Override // b3.g.a
        public void c(Object obj) {
            try {
                this.f6940a.c(obj);
                this.f6941b[0].c(1);
            } catch (Throwable th) {
                u.this.f6934a.u(th);
            }
        }

        @Override // b3.g.a
        public void d() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
    class b<ReqT, RespT> extends b3.z<ReqT, RespT> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b3.g[] f6943a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0.h f6944b;

        b(b3.g[] gVarArr, o0.h hVar) {
            this.f6943a = gVarArr;
            this.f6944b = hVar;
        }

        @Override // b3.z, b3.z0, b3.g
        public void b() {
            if (this.f6943a[0] == null) {
                this.f6944b.f(u.this.f6934a.o(), new o0.f() { // from class: o1.v
                    @Override // o0.f
                    public final void d(Object obj) {
                        ((b3.g) obj).b();
                    }
                });
            } else {
                super.b();
            }
        }

        @Override // b3.z, b3.z0
        protected b3.g<ReqT, RespT> f() {
            p1.b.d(this.f6943a[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.f6943a[0];
        }
    }

    class c extends g.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f6946a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b3.g f6947b;

        c(e eVar, b3.g gVar) {
            this.f6946a = eVar;
            this.f6947b = gVar;
        }

        @Override // b3.g.a
        public void a(f1 f1Var, b3.u0 u0Var) {
            this.f6946a.a(f1Var);
        }

        @Override // b3.g.a
        public void c(Object obj) {
            this.f6946a.b(obj);
            this.f6947b.c(1);
        }
    }

    class d extends g.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0.i f6949a;

        d(o0.i iVar) {
            this.f6949a = iVar;
        }

        @Override // b3.g.a
        public void a(f1 f1Var, b3.u0 u0Var) {
            if (!f1Var.o()) {
                this.f6949a.b(u.this.f(f1Var));
            } else {
                if (this.f6949a.a().o()) {
                    return;
                }
                this.f6949a.b(new com.google.firebase.firestore.u("Received onClose with status OK, but no message.", u.a.INTERNAL));
            }
        }

        @Override // b3.g.a
        public void c(Object obj) {
            this.f6949a.c(obj);
        }
    }

    public static abstract class e<T> {
        public abstract void a(f1 f1Var);

        public abstract void b(T t4);
    }

    static {
        u0.d<String> dVar = b3.u0.f903e;
        f6930g = u0.g.e("x-goog-api-client", dVar);
        f6931h = u0.g.e("google-cloud-resource-prefix", dVar);
        f6932i = u0.g.e("x-goog-request-params", dVar);
        f6933j = "gl-java/";
    }

    u(p1.g gVar, Context context, g1.a<g1.j> aVar, g1.a<String> aVar2, i1.m mVar, e0 e0Var) {
        this.f6934a = gVar;
        this.f6939f = e0Var;
        this.f6935b = aVar;
        this.f6936c = aVar2;
        this.f6937d = new d0(gVar, context, mVar, new q(aVar, aVar2));
        l1.f a5 = mVar.a();
        this.f6938e = String.format("projects/%s/databases/%s", a5.k(), a5.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.firebase.firestore.u f(f1 f1Var) {
        return m.h(f1Var) ? new com.google.firebase.firestore.u("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", u.a.g(f1Var.m().h()), f1Var.l()) : p1.g0.r(f1Var);
    }

    private String g() {
        return String.format("%s fire/%s grpc/", f6933j, "24.2.1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(b3.g[] gVarArr, f0 f0Var, o0.h hVar) {
        gVarArr[0] = (b3.g) hVar.m();
        gVarArr[0].e(new a(f0Var, gVarArr), l());
        f0Var.a();
        gVarArr[0].c(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(o0.i iVar, Object obj, o0.h hVar) {
        b3.g gVar = (b3.g) hVar.m();
        gVar.e(new d(iVar), l());
        gVar.c(2);
        gVar.d(obj);
        gVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(e eVar, Object obj, o0.h hVar) {
        b3.g gVar = (b3.g) hVar.m();
        gVar.e(new c(eVar, gVar), l());
        gVar.c(1);
        gVar.d(obj);
        gVar.b();
    }

    private b3.u0 l() {
        b3.u0 u0Var = new b3.u0();
        u0Var.p(f6930g, g());
        u0Var.p(f6931h, this.f6938e);
        u0Var.p(f6932i, this.f6938e);
        e0 e0Var = this.f6939f;
        if (e0Var != null) {
            e0Var.a(u0Var);
        }
        return u0Var;
    }

    public static void p(String str) {
        f6933j = str;
    }

    public void h() {
        this.f6935b.b();
        this.f6936c.b();
    }

    <ReqT, RespT> b3.g<ReqT, RespT> m(b3.v0<ReqT, RespT> v0Var, final f0<RespT> f0Var) {
        final b3.g[] gVarArr = {null};
        o0.h<b3.g<ReqT, RespT>> i4 = this.f6937d.i(v0Var);
        i4.b(this.f6934a.o(), new o0.d() { // from class: o1.t
            @Override // o0.d
            public final void a(o0.h hVar) {
                u.this.i(gVarArr, f0Var, hVar);
            }
        });
        return new b(gVarArr, i4);
    }

    <ReqT, RespT> o0.h<RespT> n(b3.v0<ReqT, RespT> v0Var, final ReqT reqt) {
        final o0.i iVar = new o0.i();
        this.f6937d.i(v0Var).b(this.f6934a.o(), new o0.d() { // from class: o1.r
            @Override // o0.d
            public final void a(o0.h hVar) {
                u.this.j(iVar, reqt, hVar);
            }
        });
        return iVar.a();
    }

    <ReqT, RespT> void o(b3.v0<ReqT, RespT> v0Var, final ReqT reqt, final e<RespT> eVar) {
        this.f6937d.i(v0Var).b(this.f6934a.o(), new o0.d() { // from class: o1.s
            @Override // o0.d
            public final void a(o0.h hVar) {
                u.this.k(eVar, reqt, hVar);
            }
        });
    }

    public void q() {
        this.f6937d.u();
    }
}
