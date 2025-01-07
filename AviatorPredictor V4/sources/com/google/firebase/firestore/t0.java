package com.google.firebase.firestore;

import i1.g1;
import i1.p1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    private final g1 f2726a;

    /* renamed from: b, reason: collision with root package name */
    private final FirebaseFirestore f2727b;

    public interface a<TResult> {
        TResult a(t0 t0Var);
    }

    t0(g1 g1Var, FirebaseFirestore firebaseFirestore) {
        this.f2726a = (g1) p1.x.b(g1Var);
        this.f2727b = (FirebaseFirestore) p1.x.b(firebaseFirestore);
    }

    private o0.h<i> d(h hVar) {
        return this.f2726a.j(Collections.singletonList(hVar.l())).h(p1.p.f7051b, new o0.a() { // from class: com.google.firebase.firestore.s0
            @Override // o0.a
            public final Object a(o0.h hVar2) {
                i e5;
                e5 = t0.this.e(hVar2);
                return e5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ i e(o0.h hVar) {
        if (!hVar.p()) {
            throw hVar.l();
        }
        List list = (List) hVar.m();
        if (list.size() != 1) {
            throw p1.b.a("Mismatch in docs returned from document lookup.", new Object[0]);
        }
        l1.s sVar = (l1.s) list.get(0);
        if (sVar.b()) {
            return i.b(this.f2727b, sVar, false, false);
        }
        if (sVar.e()) {
            return i.c(this.f2727b, sVar.getKey(), false);
        }
        throw p1.b.a("BatchGetDocumentsRequest returned unexpected document type: " + l1.s.class.getCanonicalName(), new Object[0]);
    }

    private t0 h(h hVar, p1 p1Var) {
        this.f2727b.M(hVar);
        this.f2726a.o(hVar.l(), p1Var);
        return this;
    }

    public t0 b(h hVar) {
        this.f2727b.M(hVar);
        this.f2726a.e(hVar.l());
        return this;
    }

    public i c(h hVar) {
        this.f2727b.M(hVar);
        try {
            return (i) o0.k.a(d(hVar));
        } catch (InterruptedException e5) {
            throw new RuntimeException(e5);
        } catch (ExecutionException e6) {
            if (e6.getCause() instanceof u) {
                throw ((u) e6.getCause());
            }
            throw new RuntimeException(e6.getCause());
        }
    }

    public t0 f(h hVar, Object obj) {
        return g(hVar, obj, o0.f2704c);
    }

    public t0 g(h hVar, Object obj, o0 o0Var) {
        this.f2727b.M(hVar);
        p1.x.c(obj, "Provided data must not be null.");
        p1.x.c(o0Var, "Provided options must not be null.");
        this.f2726a.n(hVar.l(), o0Var.b() ? this.f2727b.x().g(obj, o0Var.a()) : this.f2727b.x().l(obj));
        return this;
    }

    public t0 i(h hVar, Map<String, Object> map) {
        return h(hVar, this.f2727b.x().n(map));
    }
}
