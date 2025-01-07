package com.google.firebase.firestore;

import android.app.Activity;
import com.google.firebase.firestore.n;
import com.google.firebase.firestore.u;
import i1.p;
import i1.q;
import i1.u1;
import i1.w0;
import i1.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import x1.a;

/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    final i1.x0 f2676a;

    /* renamed from: b, reason: collision with root package name */
    final FirebaseFirestore f2677b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2678a;

        static {
            int[] r02 = new int[q.b.values().length];
            f2678a = r02;
            try {
                r02[q.b.NOT_EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2678a[q.b.ARRAY_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2678a[q.b.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2678a[q.b.ARRAY_CONTAINS_ANY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2678a[q.b.NOT_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        ASCENDING,
        DESCENDING
    }

    k0(i1.x0 x0Var, FirebaseFirestore firebaseFirestore) {
        this.f2676a = (i1.x0) p1.x.b(x0Var);
        this.f2677b = (FirebaseFirestore) p1.x.b(firebaseFirestore);
    }

    private void C(Object obj, q.b bVar) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() != 0) {
                if (list.size() <= 10) {
                    return;
                }
                throw new IllegalArgumentException("Invalid Query. '" + bVar.toString() + "' filters support a maximum of 10 elements in the value array.");
            }
        }
        throw new IllegalArgumentException("Invalid Query. A non-empty array is required for '" + bVar.toString() + "' filters.");
    }

    private void D() {
        if (this.f2676a.l().equals(x0.a.LIMIT_TO_LAST) && this.f2676a.h().isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    private void E(i1.x0 x0Var, i1.q qVar) {
        q.b h5 = qVar.h();
        if (qVar.j()) {
            l1.r q4 = x0Var.q();
            l1.r g5 = qVar.g();
            if (q4 != null && !q4.equals(g5)) {
                throw new IllegalArgumentException(String.format("All where filters with an inequality (notEqualTo, notIn, lessThan, lessThanOrEqualTo, greaterThan, or greaterThanOrEqualTo) must be on the same field. But you have filters on '%s' and '%s'", q4.h(), g5.h()));
            }
            l1.r j4 = x0Var.j();
            if (j4 != null) {
                H(j4, g5);
            }
        }
        q.b k4 = k(x0Var.i(), h(h5));
        if (k4 != null) {
            if (k4 == h5) {
                throw new IllegalArgumentException("Invalid Query. You cannot use more than one '" + h5.toString() + "' filter.");
            }
            throw new IllegalArgumentException("Invalid Query. You cannot use '" + h5.toString() + "' filters with '" + k4.toString() + "' filters.");
        }
    }

    private void F(i1.r rVar) {
        i1.x0 x0Var = this.f2676a;
        for (i1.q qVar : rVar.d()) {
            E(x0Var, qVar);
            x0Var = x0Var.e(qVar);
        }
    }

    private void G(l1.r rVar) {
        l1.r q4 = this.f2676a.q();
        if (this.f2676a.j() != null || q4 == null) {
            return;
        }
        H(rVar, q4);
    }

    private void H(l1.r rVar, l1.r rVar2) {
        if (rVar.equals(rVar2)) {
            return;
        }
        String h5 = rVar2.h();
        throw new IllegalArgumentException(String.format("Invalid query. You have an inequality where filter (whereLessThan(), whereGreaterThan(), etc.) on field '%s' and so you must also have '%s' as your first orderBy() field, but your first orderBy() is currently on field '%s' instead.", h5, h5, rVar.h()));
    }

    private a0 f(Executor executor, p.a aVar, Activity activity, final j<m0> jVar) {
        D();
        i1.h hVar = new i1.h(executor, new j() { // from class: com.google.firebase.firestore.h0
            @Override // com.google.firebase.firestore.j
            public final void a(Object obj, u uVar) {
                k0.this.p(jVar, (u1) obj, uVar);
            }
        });
        return i1.d.c(activity, new i1.s0(this.f2677b.s(), this.f2677b.s().U(this.f2676a, aVar, hVar), hVar));
    }

    private i1.i g(String str, Object[] objArr, boolean z4) {
        x1.x h5;
        List<i1.w0> h6 = this.f2676a.h();
        if (objArr.length > h6.size()) {
            throw new IllegalArgumentException("Too many arguments provided to " + str + "(). The number of arguments must be less than or equal to the number of orderBy() clauses.");
        }
        ArrayList arrayList = new ArrayList();
        for (int r22 = 0; r22 < objArr.length; r22++) {
            Object obj = objArr[r22];
            if (!h6.get(r22).c().equals(l1.r.f6563f)) {
                h5 = this.f2677b.x().h(obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + obj + ".");
                }
                String str2 = (String) obj;
                if (!this.f2676a.r() && str2.contains("/")) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to " + str + "() must be a plain document ID, but '" + str2 + "' contains a slash.");
                }
                l1.u g5 = this.f2676a.n().g(l1.u.x(str2));
                if (!l1.l.v(g5)) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + g5 + "' is not because it contains an odd number of segments.");
                }
                h5 = l1.y.F(this.f2677b.t(), l1.l.n(g5));
            }
            arrayList.add(h5);
        }
        return new i1.i(arrayList, z4);
    }

    private List<q.b> h(q.b bVar) {
        int r7 = a.f2678a[bVar.ordinal()];
        return r7 != 1 ? r7 != 2 ? r7 != 3 ? r7 != 4 ? r7 != 5 ? new ArrayList() : Arrays.asList(q.b.ARRAY_CONTAINS, q.b.ARRAY_CONTAINS_ANY, q.b.IN, q.b.NOT_IN, q.b.NOT_EQUAL) : Arrays.asList(q.b.ARRAY_CONTAINS, q.b.ARRAY_CONTAINS_ANY, q.b.IN, q.b.NOT_IN) : Arrays.asList(q.b.ARRAY_CONTAINS_ANY, q.b.IN, q.b.NOT_IN) : Arrays.asList(q.b.ARRAY_CONTAINS, q.b.ARRAY_CONTAINS_ANY, q.b.NOT_IN) : Arrays.asList(q.b.NOT_EQUAL, q.b.NOT_IN);
    }

    private q.b k(List<i1.r> list, List<q.b> list2) {
        Iterator<i1.r> it = list.iterator();
        while (it.hasNext()) {
            for (i1.q qVar : it.next().d()) {
                if (list2.contains(qVar.h())) {
                    return qVar.h();
                }
            }
        }
        return null;
    }

    private o0.h<m0> n(final q0 q0Var) {
        final o0.i iVar = new o0.i();
        final o0.i iVar2 = new o0.i();
        p.a aVar = new p.a();
        aVar.f4183a = true;
        aVar.f4184b = true;
        aVar.f4185c = true;
        iVar2.c(f(p1.p.f7051b, aVar, null, new j() { // from class: com.google.firebase.firestore.i0
            @Override // com.google.firebase.firestore.j
            public final void a(Object obj, u uVar) {
                k0.r(o0.i.this, iVar2, q0Var, (m0) obj, uVar);
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
        } else {
            p1.b.d(u1Var != null, "Got event without value or error set", new Object[0]);
            jVar.a(new m0(this, u1Var, this.f2677b), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ m0 q(o0.h hVar) {
        return new m0(new k0(this.f2676a, this.f2677b), (u1) hVar.m(), this.f2677b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(o0.i iVar, o0.i iVar2, q0 q0Var, m0 m0Var, u uVar) {
        if (uVar != null) {
            iVar.b(uVar);
            return;
        }
        try {
            ((a0) o0.k.a(iVar2.a())).remove();
            if (m0Var.t().b() && q0Var == q0.SERVER) {
                iVar.b(new u("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", u.a.UNAVAILABLE));
            } else {
                iVar.c(m0Var);
            }
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            throw p1.b.b(e5, "Failed to register a listener for a query result", new Object[0]);
        } catch (ExecutionException e6) {
            throw p1.b.b(e6, "Failed to register a listener for a query result", new Object[0]);
        }
    }

    private k0 v(l1.r rVar, b bVar) {
        p1.x.c(bVar, "Provided direction must not be null.");
        if (this.f2676a.o() != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
        }
        if (this.f2676a.g() != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
        }
        G(rVar);
        return new k0(this.f2676a.B(i1.w0.d(bVar == b.ASCENDING ? w0.a.ASCENDING : w0.a.DESCENDING, rVar)), this.f2677b);
    }

    private i1.r w(n.a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<n> it = aVar.k().iterator();
        while (it.hasNext()) {
            i1.r z4 = z(it.next());
            if (!z4.b().isEmpty()) {
                arrayList.add(z4);
            }
        }
        return arrayList.size() == 1 ? (i1.r) arrayList.get(0) : new i1.l(arrayList, aVar.l());
    }

    private x1.x x(Object obj) {
        l1.f t4;
        l1.l l4;
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
            }
            if (!this.f2676a.r() && str.contains("/")) {
                throw new IllegalArgumentException("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '" + str + "' contains a '/' character.");
            }
            l1.u g5 = this.f2676a.n().g(l1.u.x(str));
            if (!l1.l.v(g5)) {
                throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + g5 + "' is not because it has an odd number of segments (" + g5.s() + ").");
            }
            t4 = m().t();
            l4 = l1.l.n(g5);
        } else {
            if (!(obj instanceof h)) {
                throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: " + p1.g0.z(obj));
            }
            t4 = m().t();
            l4 = ((h) obj).l();
        }
        return l1.y.F(t4, l4);
    }

    private i1.q y(n.b bVar) {
        x1.x i4;
        l k4 = bVar.k();
        q.b l4 = bVar.l();
        Object m4 = bVar.m();
        p1.x.c(k4, "Provided field path must not be null.");
        p1.x.c(l4, "Provided op must not be null.");
        if (!k4.c().z()) {
            q.b bVar2 = q.b.IN;
            if (l4 == bVar2 || l4 == q.b.NOT_IN || l4 == q.b.ARRAY_CONTAINS_ANY) {
                C(m4, l4);
            }
            i4 = this.f2677b.x().i(m4, l4 == bVar2 || l4 == q.b.NOT_IN);
        } else {
            if (l4 == q.b.ARRAY_CONTAINS || l4 == q.b.ARRAY_CONTAINS_ANY) {
                throw new IllegalArgumentException("Invalid query. You can't perform '" + l4.toString() + "' queries on FieldPath.documentId().");
            }
            if (l4 == q.b.IN || l4 == q.b.NOT_IN) {
                C(m4, l4);
                a.b d02 = x1.a.d0();
                Iterator it = ((List) m4).iterator();
                while (it.hasNext()) {
                    d02.D(x(it.next()));
                }
                i4 = x1.x.r0().D(d02).t();
            } else {
                i4 = x(m4);
            }
        }
        return i1.q.f(k4.c(), l4, i4);
    }

    private i1.r z(n nVar) {
        boolean z4 = nVar instanceof n.b;
        p1.b.d(z4 || (nVar instanceof n.a), "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", new Object[0]);
        return z4 ? y((n.b) nVar) : w((n.a) nVar);
    }

    public k0 A(Object... objArr) {
        return new k0(this.f2676a.C(g("startAfter", objArr, false)), this.f2677b);
    }

    public k0 B(Object... objArr) {
        return new k0(this.f2676a.C(g("startAt", objArr, true)), this.f2677b);
    }

    k0 I(n nVar) {
        i1.r z4 = z(nVar);
        if (z4.b().isEmpty()) {
            return this;
        }
        F(z4);
        return new k0(this.f2676a.e(z4), this.f2677b);
    }

    public k0 J(l lVar, Object obj) {
        return I(n.a(lVar, obj));
    }

    public k0 K(l lVar, List<? extends Object> list) {
        return I(n.b(lVar, list));
    }

    public k0 L(l lVar, Object obj) {
        return I(n.c(lVar, obj));
    }

    public k0 M(l lVar, Object obj) {
        return I(n.d(lVar, obj));
    }

    public k0 N(l lVar, Object obj) {
        return I(n.e(lVar, obj));
    }

    public k0 O(l lVar, List<? extends Object> list) {
        return I(n.f(lVar, list));
    }

    public k0 P(l lVar, Object obj) {
        return I(n.g(lVar, obj));
    }

    public k0 Q(l lVar, Object obj) {
        return I(n.h(lVar, obj));
    }

    public k0 R(l lVar, Object obj) {
        return I(n.i(lVar, obj));
    }

    public k0 S(l lVar, List<? extends Object> list) {
        return I(n.j(lVar, list));
    }

    public a0 d(e0 e0Var, j<m0> jVar) {
        return e(p1.p.f7050a, e0Var, jVar);
    }

    public a0 e(Executor executor, e0 e0Var, j<m0> jVar) {
        p1.x.c(executor, "Provided executor must not be null.");
        p1.x.c(e0Var, "Provided MetadataChanges value must not be null.");
        p1.x.c(jVar, "Provided EventListener must not be null.");
        return f(executor, o(e0Var), null, jVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f2676a.equals(k0Var.f2676a) && this.f2677b.equals(k0Var.f2677b);
    }

    public int hashCode() {
        return (this.f2676a.hashCode() * 31) + this.f2677b.hashCode();
    }

    public k0 i(Object... objArr) {
        return new k0(this.f2676a.d(g("endAt", objArr, true)), this.f2677b);
    }

    public k0 j(Object... objArr) {
        return new k0(this.f2676a.d(g("endBefore", objArr, false)), this.f2677b);
    }

    public o0.h<m0> l(q0 q0Var) {
        D();
        return q0Var == q0.CACHE ? this.f2677b.s().x(this.f2676a).h(p1.p.f7051b, new o0.a() { // from class: com.google.firebase.firestore.j0
            @Override // o0.a
            public final Object a(o0.h hVar) {
                m0 q4;
                q4 = k0.this.q(hVar);
                return q4;
            }
        }) : n(q0Var);
    }

    public FirebaseFirestore m() {
        return this.f2677b;
    }

    public k0 s(long j4) {
        if (j4 > 0) {
            return new k0(this.f2676a.t(j4), this.f2677b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j4 + ") is invalid. Limit must be positive.");
    }

    public k0 t(long j4) {
        if (j4 > 0) {
            return new k0(this.f2676a.u(j4), this.f2677b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limitToLast (" + j4 + ") is invalid. Limit must be positive.");
    }

    public k0 u(l lVar, b bVar) {
        p1.x.c(lVar, "Provided field path must not be null.");
        return v(lVar.c(), bVar);
    }
}
