package g1;

import com.google.firebase.auth.b0;
import o0.k;
import p1.p;
import p1.u;
import p1.v;
import r1.a;

/* loaded from: classes.dex */
public final class i extends a<j> {

    /* renamed from: a, reason: collision with root package name */
    private final a1.a f3878a = new a1.a() { // from class: g1.f
        @Override // a1.a
        public final void a(s1.b bVar) {
            i.this.j(bVar);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private a1.b f3879b;

    /* renamed from: c, reason: collision with root package name */
    private u<j> f3880c;

    /* renamed from: d, reason: collision with root package name */
    private int f3881d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3882e;

    public i(r1.a<a1.b> aVar) {
        aVar.a(new a.InterfaceC0081a() { // from class: g1.h
            @Override // r1.a.InterfaceC0081a
            public final void a(r1.b bVar) {
                i.this.k(bVar);
            }
        });
    }

    private synchronized j h() {
        String e5;
        a1.b bVar = this.f3879b;
        e5 = bVar == null ? null : bVar.e();
        return e5 != null ? new j(e5) : j.f3883b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o0.h i(int r22, o0.h hVar) {
        synchronized (this) {
            if (r22 != this.f3881d) {
                v.a("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                return a();
            }
            if (hVar.p()) {
                return k.d(((b0) hVar.m()).g());
            }
            return k.c(hVar.l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(s1.b bVar) {
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(r1.b bVar) {
        synchronized (this) {
            this.f3879b = (a1.b) bVar.get();
            l();
            this.f3879b.h(this.f3878a);
        }
    }

    private synchronized void l() {
        this.f3881d++;
        u<j> uVar = this.f3880c;
        if (uVar != null) {
            uVar.a(h());
        }
    }

    @Override // g1.a
    public synchronized o0.h<String> a() {
        a1.b bVar = this.f3879b;
        if (bVar == null) {
            return k.c(new x0.b("auth is not available"));
        }
        o0.h<b0> g5 = bVar.g(this.f3882e);
        this.f3882e = false;
        final int r12 = this.f3881d;
        return g5.j(p.f7051b, new o0.a() { // from class: g1.g
            @Override // o0.a
            public final Object a(o0.h hVar) {
                o0.h i4;
                i4 = i.this.i(r12, hVar);
                return i4;
            }
        });
    }

    @Override // g1.a
    public synchronized void b() {
        this.f3882e = true;
    }

    @Override // g1.a
    public synchronized void c() {
        this.f3880c = null;
        a1.b bVar = this.f3879b;
        if (bVar != null) {
            bVar.f(this.f3878a);
        }
    }

    @Override // g1.a
    public synchronized void d(u<j> uVar) {
        this.f3880c = uVar;
        uVar.a(h());
    }
}
