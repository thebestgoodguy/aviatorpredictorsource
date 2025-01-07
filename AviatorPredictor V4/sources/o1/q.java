package o1;

import b3.b;
import b3.f1;
import b3.u0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class q extends b3.b {

    /* renamed from: c, reason: collision with root package name */
    private static final u0.g<String> f6884c;

    /* renamed from: d, reason: collision with root package name */
    private static final u0.g<String> f6885d;

    /* renamed from: a, reason: collision with root package name */
    private final g1.a<g1.j> f6886a;

    /* renamed from: b, reason: collision with root package name */
    private final g1.a<String> f6887b;

    static {
        u0.d<String> dVar = b3.u0.f903e;
        f6884c = u0.g.e("Authorization", dVar);
        f6885d = u0.g.e("x-firebase-appcheck", dVar);
    }

    q(g1.a<g1.j> aVar, g1.a<String> aVar2) {
        this.f6886a = aVar;
        this.f6887b = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(o0.h hVar, b.a aVar, o0.h hVar2, o0.h hVar3) {
        Exception l4;
        b3.u0 u0Var = new b3.u0();
        if (hVar.p()) {
            String str = (String) hVar.m();
            p1.v.a("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                u0Var.p(f6884c, "Bearer " + str);
            }
        } else {
            l4 = hVar.l();
            if (l4 instanceof x0.b) {
                p1.v.a("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else {
                if (!(l4 instanceof t1.a)) {
                    p1.v.d("FirestoreCallCredentials", "Failed to get auth token: %s.", l4);
                    aVar.b(f1.f764n.p(l4));
                    return;
                }
                p1.v.a("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
            }
        }
        if (hVar2.p()) {
            String str2 = (String) hVar2.m();
            if (str2 != null && !str2.isEmpty()) {
                p1.v.a("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                u0Var.p(f6885d, str2);
            }
        } else {
            l4 = hVar2.l();
            if (!(l4 instanceof x0.b)) {
                p1.v.d("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", l4);
                aVar.b(f1.f764n.p(l4));
                return;
            }
            p1.v.a("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
        }
        aVar.a(u0Var);
    }

    @Override // b3.b
    public void a(b.AbstractC0010b abstractC0010b, Executor executor, final b.a aVar) {
        final o0.h<String> a5 = this.f6886a.a();
        final o0.h<String> a6 = this.f6887b.a();
        o0.k.f(a5, a6).b(p1.p.f7051b, new o0.d() { // from class: o1.p
            @Override // o0.d
            public final void a(o0.h hVar) {
                q.c(o0.h.this, aVar, a6, hVar);
            }
        });
    }
}
