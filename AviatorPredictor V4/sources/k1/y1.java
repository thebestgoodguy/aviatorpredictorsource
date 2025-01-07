package k1;

import android.database.Cursor;
import android.text.TextUtils;
import i1.l;
import i1.q;
import i1.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;
import k1.l;
import k1.q0;
import k1.u2;
import l1.q;

/* loaded from: classes.dex */
final class y1 implements l {

    /* renamed from: k, reason: collision with root package name */
    private static final String f6326k = "y1";

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f6327l = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final u2 f6328a;

    /* renamed from: b, reason: collision with root package name */
    private final o f6329b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6330c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<i1.c1, List<i1.c1>> f6331d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final q0.a f6332e = new q0.a();

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, Map<Integer, l1.q>> f6333f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Queue<l1.q> f6334g = new PriorityQueue(10, new Comparator() { // from class: k1.q1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int M;
            M = y1.M((l1.q) obj, (l1.q) obj2);
            return M;
        }
    });

    /* renamed from: h, reason: collision with root package name */
    private boolean f6335h = false;

    /* renamed from: i, reason: collision with root package name */
    private int f6336i = -1;

    /* renamed from: j, reason: collision with root package name */
    private long f6337j = -1;

    y1(u2 u2Var, o oVar, g1.j jVar) {
        this.f6328a = u2Var;
        this.f6329b = oVar;
        this.f6330c = jVar.b() ? jVar.a() : "";
    }

    private Object[] A(int r9, int r10, List<x1.x> list, Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = r9 / (list != null ? list.size() : 1);
        int r22 = 0;
        Object[] objArr4 = new Object[(r9 * 5) + (objArr3 != null ? objArr3.length : 0)];
        int r32 = 0;
        int r4 = 0;
        while (r32 < r9) {
            int r5 = r4 + 1;
            objArr4[r4] = Integer.valueOf(r10);
            int r42 = r5 + 1;
            objArr4[r5] = this.f6330c;
            int r52 = r42 + 1;
            objArr4[r42] = list != null ? x(list.get(r32 / size)) : f6327l;
            int r43 = r52 + 1;
            int r6 = r32 % size;
            objArr4[r52] = objArr[r6];
            objArr4[r43] = objArr2[r6];
            r32++;
            r4 = r43 + 1;
        }
        if (objArr3 != null) {
            int length = objArr3.length;
            while (r22 < length) {
                objArr4[r4] = objArr3[r22];
                r22++;
                r4++;
            }
        }
        return objArr4;
    }

    private Object[] B(i1.c1 c1Var, int r10, List<x1.x> list, Object[] objArr, String str, Object[] objArr2, String str2, Object[] objArr3) {
        StringBuilder sb;
        int max = Math.max(objArr.length, objArr2.length) * (list != null ? list.size() : 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT document_key, directional_value FROM index_entries ");
        sb2.append("WHERE index_id = ? AND uid = ? ");
        sb2.append("AND array_value = ? ");
        sb2.append("AND directional_value ");
        sb2.append(str);
        sb2.append(" ? ");
        sb2.append("AND directional_value ");
        sb2.append(str2);
        sb2.append(" ? ");
        CharSequence x4 = p1.g0.x(sb2, max, " UNION ");
        if (objArr3 != null) {
            StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
            sb3.append(x4);
            sb3.append(") WHERE directional_value NOT IN (");
            sb3.append((CharSequence) p1.g0.x("?", objArr3.length, ", "));
            sb3.append(")");
            sb = sb3;
        } else {
            sb = x4;
        }
        Object[] A = A(max, r10, list, objArr, objArr2, objArr3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb.toString());
        arrayList.addAll(Arrays.asList(A));
        return arrayList.toArray();
    }

    private Object[] C(List<j1.d> list) {
        Object[] objArr = new Object[list.size()];
        for (int r12 = 0; r12 < list.size(); r12++) {
            objArr[r12] = list.get(r12).c();
        }
        return objArr;
    }

    private SortedSet<j1.e> D(final l1.l lVar, final l1.q qVar) {
        final TreeSet treeSet = new TreeSet();
        this.f6328a.E("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?").b(Integer.valueOf(qVar.f()), lVar.toString(), this.f6330c).e(new p1.n() { // from class: k1.u1
            @Override // p1.n
            public final void accept(Object obj) {
                y1.L(treeSet, qVar, lVar, (Cursor) obj);
            }
        });
        return treeSet;
    }

    private l1.q E(i1.c1 c1Var) {
        p1.b.d(this.f6335h, "IndexManager not started", new Object[0]);
        l1.x xVar = new l1.x(c1Var);
        Collection<l1.q> F = F(c1Var.d() != null ? c1Var.d() : c1Var.n().n());
        l1.q qVar = null;
        if (F.isEmpty()) {
            return null;
        }
        for (l1.q qVar2 : F) {
            if (xVar.d(qVar2) && (qVar == null || qVar2.h().size() > qVar.h().size())) {
                qVar = qVar2;
            }
        }
        return qVar;
    }

    private q.a G(Collection<l1.q> collection) {
        p1.b.d(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator<l1.q> it = collection.iterator();
        q.a c5 = it.next().g().c();
        int p4 = c5.p();
        while (it.hasNext()) {
            q.a c6 = it.next().g().c();
            if (c6.compareTo(c5) < 0) {
                c5 = c6;
            }
            p4 = Math.max(c6.p(), p4);
        }
        return q.a.h(c5.q(), c5.n(), p4);
    }

    private List<i1.c1> H(i1.c1 c1Var) {
        if (this.f6331d.containsKey(c1Var)) {
            return this.f6331d.get(c1Var);
        }
        ArrayList arrayList = new ArrayList();
        if (c1Var.h().isEmpty()) {
            arrayList.add(c1Var);
        } else {
            Iterator<i1.r> it = p1.w.h(new i1.l(c1Var.h(), l.a.AND)).iterator();
            while (it.hasNext()) {
                arrayList.add(new i1.c1(c1Var.n(), c1Var.d(), it.next().b(), c1Var.m(), c1Var.j(), c1Var.p(), c1Var.f()));
            }
        }
        this.f6331d.put(c1Var, arrayList);
        return arrayList;
    }

    private boolean I(i1.c1 c1Var, l1.r rVar) {
        for (i1.r rVar2 : c1Var.h()) {
            if (rVar2 instanceof i1.q) {
                i1.q qVar = (i1.q) rVar2;
                if (qVar.g().equals(rVar)) {
                    q.b h5 = qVar.h();
                    if (h5.equals(q.b.IN) || h5.equals(q.b.NOT_IN)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(ArrayList arrayList, Cursor cursor) {
        arrayList.add(f.b(cursor.getString(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(List list, Cursor cursor) {
        list.add(l1.l.n(l1.u.x(cursor.getString(0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(SortedSet sortedSet, l1.q qVar, l1.l lVar, Cursor cursor) {
        sortedSet.add(j1.e.g(qVar.f(), lVar, cursor.getBlob(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int M(l1.q qVar, l1.q qVar2) {
        int compare = Long.compare(qVar.g().d(), qVar2.g().d());
        return compare == 0 ? qVar.d().compareTo(qVar2.d()) : compare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(Map map, Cursor cursor) {
        map.put(Integer.valueOf(cursor.getInt(0)), q.b.b(cursor.getLong(1), new l1.w(new x0.o(cursor.getLong(2), cursor.getInt(3))), l1.l.n(f.b(cursor.getString(4))), cursor.getInt(5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(Map map, Cursor cursor) {
        try {
            int r12 = cursor.getInt(0);
            R(l1.q.b(r12, cursor.getString(1), this.f6329b.c(v1.a.V(cursor.getBlob(2))), map.containsKey(Integer.valueOf(r12)) ? (q.b) map.get(Integer.valueOf(r12)) : l1.q.f6555a));
        } catch (com.google.protobuf.e0 e5) {
            throw p1.b.a("Failed to decode index: " + e5, new Object[0]);
        }
    }

    private void R(l1.q qVar) {
        Map<Integer, l1.q> map = this.f6333f.get(qVar.d());
        if (map == null) {
            map = new HashMap<>();
            this.f6333f.put(qVar.d(), map);
        }
        l1.q qVar2 = map.get(Integer.valueOf(qVar.f()));
        if (qVar2 != null) {
            this.f6334g.remove(qVar2);
        }
        map.put(Integer.valueOf(qVar.f()), qVar);
        this.f6334g.add(qVar);
        this.f6336i = Math.max(this.f6336i, qVar.f());
        this.f6337j = Math.max(this.f6337j, qVar.g().d());
    }

    private void S(final l1.i iVar, SortedSet<j1.e> sortedSet, SortedSet<j1.e> sortedSet2) {
        p1.v.a(f6326k, "Updating index entries for document '%s'", iVar.getKey());
        p1.g0.q(sortedSet, sortedSet2, new p1.n() { // from class: k1.x1
            @Override // p1.n
            public final void accept(Object obj) {
                y1.this.P(iVar, (j1.e) obj);
            }
        }, new p1.n() { // from class: k1.w1
            @Override // p1.n
            public final void accept(Object obj) {
                y1.this.Q(iVar, (j1.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void P(l1.i iVar, j1.e eVar) {
        this.f6328a.v("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(eVar.n()), this.f6330c, eVar.h(), eVar.i(), iVar.getKey().toString());
    }

    private SortedSet<j1.e> t(l1.i iVar, l1.q qVar) {
        TreeSet treeSet = new TreeSet();
        byte[] w4 = w(qVar, iVar);
        if (w4 == null) {
            return treeSet;
        }
        q.c c5 = qVar.c();
        if (c5 != null) {
            x1.x f5 = iVar.f(c5.h());
            if (l1.y.t(f5)) {
                Iterator<x1.x> it = f5.f0().k().iterator();
                while (it.hasNext()) {
                    treeSet.add(j1.e.g(qVar.f(), iVar.getKey(), x(it.next()), w4));
                }
            }
        } else {
            treeSet.add(j1.e.g(qVar.f(), iVar.getKey(), new byte[0], w4));
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void Q(l1.i iVar, j1.e eVar) {
        this.f6328a.v("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(eVar.n()), this.f6330c, eVar.h(), eVar.i(), iVar.getKey().toString());
    }

    private Object[] v(l1.q qVar, i1.c1 c1Var, i1.i iVar) {
        return y(qVar, c1Var, iVar.b());
    }

    private byte[] w(l1.q qVar, l1.i iVar) {
        j1.d dVar = new j1.d();
        for (q.c cVar : qVar.e()) {
            x1.x f5 = iVar.f(cVar.h());
            if (f5 == null) {
                return null;
            }
            j1.c.f5941a.e(f5, dVar.b(cVar.i()));
        }
        return dVar.c();
    }

    private byte[] x(x1.x xVar) {
        j1.d dVar = new j1.d();
        j1.c.f5941a.e(xVar, dVar.b(q.c.a.ASCENDING));
        return dVar.c();
    }

    private Object[] y(l1.q qVar, i1.c1 c1Var, Collection<x1.x> collection) {
        if (collection == null) {
            return null;
        }
        List<j1.d> arrayList = new ArrayList<>();
        arrayList.add(new j1.d());
        Iterator<x1.x> it = collection.iterator();
        for (q.c cVar : qVar.e()) {
            x1.x next = it.next();
            for (j1.d dVar : arrayList) {
                if (I(c1Var, cVar.h()) && l1.y.t(next)) {
                    arrayList = z(arrayList, cVar, next);
                } else {
                    j1.c.f5941a.e(next, dVar.b(cVar.i()));
                }
            }
        }
        return C(arrayList);
    }

    private List<j1.d> z(List<j1.d> list, q.c cVar, x1.x xVar) {
        ArrayList<j1.d> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (x1.x xVar2 : xVar.f0().k()) {
            for (j1.d dVar : arrayList) {
                j1.d dVar2 = new j1.d();
                dVar2.d(dVar.c());
                j1.c.f5941a.e(xVar2, dVar2.b(cVar.i()));
                arrayList2.add(dVar2);
            }
        }
        return arrayList2;
    }

    public Collection<l1.q> F(String str) {
        p1.b.d(this.f6335h, "IndexManager not started", new Object[0]);
        Map<Integer, l1.q> map = this.f6333f.get(str);
        return map == null ? Collections.emptyList() : map.values();
    }

    @Override // k1.l
    public void a() {
        final HashMap hashMap = new HashMap();
        this.f6328a.E("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?").b(this.f6330c).e(new p1.n() { // from class: k1.t1
            @Override // p1.n
            public final void accept(Object obj) {
                y1.N(hashMap, (Cursor) obj);
            }
        });
        this.f6328a.E("SELECT index_id, collection_group, index_proto FROM index_configuration").e(new p1.n() { // from class: k1.v1
            @Override // p1.n
            public final void accept(Object obj) {
                y1.this.O(hashMap, (Cursor) obj);
            }
        });
        this.f6335h = true;
    }

    @Override // k1.l
    public List<l1.u> b(String str) {
        p1.b.d(this.f6335h, "IndexManager not started", new Object[0]);
        final ArrayList arrayList = new ArrayList();
        this.f6328a.E("SELECT parent FROM collection_parents WHERE collection_id = ?").b(str).e(new p1.n() { // from class: k1.r1
            @Override // p1.n
            public final void accept(Object obj) {
                y1.J(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // k1.l
    public q.a c(String str) {
        Collection<l1.q> F = F(str);
        p1.b.d(!F.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return G(F);
    }

    @Override // k1.l
    public q.a d(i1.c1 c1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<i1.c1> it = H(c1Var).iterator();
        while (it.hasNext()) {
            l1.q E = E(it.next());
            if (E != null) {
                arrayList.add(E);
            }
        }
        return G(arrayList);
    }

    @Override // k1.l
    public l.a e(i1.c1 c1Var) {
        l.a aVar = l.a.FULL;
        List<i1.c1> H = H(c1Var);
        Iterator<i1.c1> it = H.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i1.c1 next = it.next();
            l1.q E = E(next);
            if (E == null) {
                aVar = l.a.NONE;
                break;
            }
            if (E.h().size() < next.o()) {
                aVar = l.a.PARTIAL;
            }
        }
        return (c1Var.r() && H.size() > 1 && aVar == l.a.FULL) ? l.a.PARTIAL : aVar;
    }

    @Override // k1.l
    public void f(c1.c<l1.l, l1.i> cVar) {
        p1.b.d(this.f6335h, "IndexManager not started", new Object[0]);
        Iterator<Map.Entry<l1.l, l1.i>> it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry<l1.l, l1.i> next = it.next();
            for (l1.q qVar : F(next.getKey().q())) {
                SortedSet<j1.e> D = D(next.getKey(), qVar);
                SortedSet<j1.e> t4 = t(next.getValue(), qVar);
                if (!D.equals(t4)) {
                    S(next.getValue(), D, t4);
                }
            }
        }
    }

    @Override // k1.l
    public List<l1.l> g(i1.c1 c1Var) {
        p1.b.d(this.f6335h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (i1.c1 c1Var2 : H(c1Var)) {
            l1.q E = E(c1Var2);
            if (E == null) {
                return null;
            }
            List<x1.x> a5 = c1Var2.a(E);
            Collection<x1.x> l4 = c1Var2.l(E);
            i1.i k4 = c1Var2.k(E);
            i1.i q4 = c1Var2.q(E);
            if (p1.v.c()) {
                p1.v.a(f6326k, "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", E, c1Var2, a5, k4, q4);
            }
            Object[] B = B(c1Var2, E.f(), a5, v(E, c1Var2, k4), k4.c() ? ">=" : ">", v(E, c1Var2, q4), q4.c() ? "<=" : "<", y(E, c1Var2, l4));
            arrayList.add(String.valueOf(B[0]));
            arrayList2.addAll(Arrays.asList(B).subList(1, B.length));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.join(" UNION ", arrayList));
        sb.append("ORDER BY directional_value, document_key ");
        sb.append(c1Var.i().equals(w0.a.ASCENDING) ? "asc " : "desc ");
        String str = "SELECT DISTINCT document_key FROM (" + sb.toString() + ")";
        if (c1Var.r()) {
            str = str + " LIMIT " + c1Var.j();
        }
        p1.b.d(arrayList2.size() < 1000, "Cannot perform query with more than 999 bind elements", new Object[0]);
        u2.d b5 = this.f6328a.E(str).b(arrayList2.toArray());
        final ArrayList arrayList3 = new ArrayList();
        b5.e(new p1.n() { // from class: k1.s1
            @Override // p1.n
            public final void accept(Object obj) {
                y1.K(arrayList3, (Cursor) obj);
            }
        });
        p1.v.a(f6326k, "Index scan returned %s documents", Integer.valueOf(arrayList3.size()));
        return arrayList3;
    }

    @Override // k1.l
    public void h(String str, q.a aVar) {
        p1.b.d(this.f6335h, "IndexManager not started", new Object[0]);
        this.f6337j++;
        for (l1.q qVar : F(str)) {
            l1.q b5 = l1.q.b(qVar.f(), qVar.d(), qVar.h(), q.b.a(this.f6337j, aVar));
            this.f6328a.v("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(qVar.f()), this.f6330c, Long.valueOf(this.f6337j), Long.valueOf(aVar.q().g().i()), Integer.valueOf(aVar.q().g().g()), f.c(aVar.n().t()), Integer.valueOf(aVar.p()));
            R(b5);
        }
    }

    @Override // k1.l
    public String i() {
        p1.b.d(this.f6335h, "IndexManager not started", new Object[0]);
        l1.q peek = this.f6334g.peek();
        if (peek != null) {
            return peek.d();
        }
        return null;
    }

    @Override // k1.l
    public void j(l1.u uVar) {
        p1.b.d(this.f6335h, "IndexManager not started", new Object[0]);
        p1.b.d(uVar.s() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f6332e.a(uVar)) {
            this.f6328a.v("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", uVar.n(), f.c(uVar.u()));
        }
    }
}
