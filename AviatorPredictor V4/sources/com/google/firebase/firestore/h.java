package com.google.firebase.firestore;

import android.app.Activity;
import com.google.firebase.firestore.u;
import i1.p;
import i1.p1;
import i1.u1;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final l1.l f2659a;

    /* renamed from: b, reason: collision with root package name */
    private final FirebaseFirestore f2660b;

    h(l1.l lVar, FirebaseFirestore firebaseFirestore) {
        this.f2659a = (l1.l) p1.x.b(lVar);
        this.f2660b = firebaseFirestore;
    }

    private a0 f(Executor executor, p.a aVar, Activity activity, final j<i> jVar) {
        i1.h hVar = new i1.h(executor, new j() { // from class: com.google.firebase.firestore.e
            @Override // com.google.firebase.firestore.j
            public final void a(Object obj, u uVar) {
                h.this.p(jVar, (u1) obj, uVar);
            }
        });
        return i1.d.c(activity, new i1.s0(this.f2660b.s(), this.f2660b.s().U(g(), aVar, hVar), hVar));
    }

    private i1.x0 g() {
        return i1.x0.b(this.f2659a.t());
    }

    static h i(l1.u uVar, FirebaseFirestore firebaseFirestore) {
        if (uVar.s() % 2 == 0) {
            return new h(l1.l.n(uVar), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + uVar.h() + " has " + uVar.s());
    }

    private o0.h<i> n(final q0 q0Var) {
        final o0.i iVar = new o0.i();
        final o0.i iVar2 = new o0.i();
        p.a aVar = new p.a();
        aVar.f4183a = true;
        aVar.f4184b = true;
        aVar.f4185c = true;
        iVar2.c(f(p1.p.f7051b, aVar, null, new j() { // from class: com.google.firebase.firestore.f
            @Override // com.google.firebase.firestore.j
            public final void a(Object obj, u uVar) {
                h.r(o0.i.this, iVar2, q0Var, (i) obj, uVar);
            }
        }));
        return iVar.a();
    }

    private static p.a o(e0 e0Var) {
        p.a aVar = new p.a();
        e0 e0Var2 = e0.INCLUDE;
        aVar.f4183a = e0Var == e0Var2;
        aVar.f4184b = e0Var == e0Var2;
        aVar.f4185c = false;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(j jVar, u1 u1Var, u uVar) {
        if (uVar != null) {
            jVar.a(null, uVar);
            return;
        }
        p1.b.d(u1Var != null, "Got event without value or error set", new Object[0]);
        p1.b.d(u1Var.e().size() <= 1, "Too many documents returned on a document query", new Object[0]);
        l1.i r4 = u1Var.e().r(this.f2659a);
        jVar.a(r4 != null ? i.b(this.f2660b, r4, u1Var.j(), u1Var.f().contains(r4.getKey())) : i.c(this.f2660b, this.f2659a, u1Var.j()), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ i q(o0.h hVar) {
        l1.i iVar = (l1.i) hVar.m();
        return new i(this.f2660b, this.f2659a, iVar, true, iVar != null && iVar.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(o0.i iVar, o0.i iVar2, q0 q0Var, i iVar3, u uVar) {
        u uVar2;
        if (uVar != null) {
            iVar.b(uVar);
            return;
        }
        try {
            ((a0) o0.k.a(iVar2.a())).remove();
            if (!iVar3.a() && iVar3.f().b()) {
                uVar2 = new u("Failed to get document because the client is offline.", u.a.UNAVAILABLE);
            } else {
                if (!iVar3.a() || !iVar3.f().b() || q0Var != q0.SERVER) {
                    iVar.c(iVar3);
                    return;
                }
                uVar2 = new u("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", u.a.UNAVAILABLE);
            }
            iVar.b(uVar2);
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            throw p1.b.b(e5, "Failed to register a listener for a single document", new Object[0]);
        } catch (ExecutionException e6) {
            throw p1.b.b(e6, "Failed to register a listener for a single document", new Object[0]);
        }
    }

    private o0.h<Void> u(p1 p1Var) {
        return this.f2660b.s().c0(Collections.singletonList(p1Var.a(this.f2659a, m1.m.a(true)))).h(p1.p.f7051b, p1.g0.A());
    }

    public a0 d(e0 e0Var, j<i> jVar) {
        return e(p1.p.f7050a, e0Var, jVar);
    }

    public a0 e(Executor executor, e0 e0Var, j<i> jVar) {
        p1.x.c(executor, "Provided executor must not be null.");
        p1.x.c(e0Var, "Provided MetadataChanges value must not be null.");
        p1.x.c(jVar, "Provided EventListener must not be null.");
        return f(executor, o(e0Var), null, jVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2659a.equals(hVar.f2659a) && this.f2660b.equals(hVar.f2660b);
    }

    public o0.h<Void> h() {
        return this.f2660b.s().c0(Collections.singletonList(new m1.c(this.f2659a, m1.m.f6655c))).h(p1.p.f7051b, p1.g0.A());
    }

    public int hashCode() {
        return (this.f2659a.hashCode() * 31) + this.f2660b.hashCode();
    }

    public o0.h<i> j(q0 q0Var) {
        return q0Var == q0.CACHE ? this.f2660b.s().w(this.f2659a).h(p1.p.f7051b, new o0.a() { // from class: com.google.firebase.firestore.g
            @Override // o0.a
            public final Object a(o0.h hVar) {
                i q4;
                q4 = h.this.q(hVar);
                return q4;
            }
        }) : n(q0Var);
    }

    public FirebaseFirestore k() {
        return this.f2660b;
    }

    l1.l l() {
        return this.f2659a;
    }

    public String m() {
        return this.f2659a.t().h();
    }

    public o0.h<Void> s(Object obj) {
        return t(obj, o0.f2704c);
    }

    public o0.h<Void> t(Object obj, o0 o0Var) {
        p1.x.c(obj, "Provided data must not be null.");
        p1.x.c(o0Var, "Provided options must not be null.");
        return this.f2660b.s().c0(Collections.singletonList((o0Var.b() ? this.f2660b.x().g(obj, o0Var.a()) : this.f2660b.x().l(obj)).a(this.f2659a, m1.m.f6655c))).h(p1.p.f7051b, p1.g0.A());
    }

    public o0.h<Void> v(Map<String, Object> map) {
        return u(this.f2660b.x().n(map));
    }
}
