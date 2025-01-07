package k1;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k1.u2;

/* loaded from: classes.dex */
final class n2 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f6192a;

    /* renamed from: b, reason: collision with root package name */
    private final o f6193b;

    /* renamed from: c, reason: collision with root package name */
    private final l f6194c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6195d;

    /* renamed from: e, reason: collision with root package name */
    private int f6196e;

    /* renamed from: f, reason: collision with root package name */
    private com.google.protobuf.j f6197f;

    private static class a implements p1.n<Cursor> {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<com.google.protobuf.j> f6198a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private boolean f6199b = true;

        a(byte[] bArr) {
            c(bArr);
        }

        private void c(byte[] bArr) {
            this.f6198a.add(com.google.protobuf.j.w(bArr));
        }

        @Override // p1.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            c(blob);
            if (blob.length < 1000000) {
                this.f6199b = false;
            }
        }

        int d() {
            return this.f6198a.size();
        }

        com.google.protobuf.j e() {
            return com.google.protobuf.j.v(this.f6198a);
        }
    }

    n2(u2 u2Var, o oVar, g1.j jVar, l lVar) {
        this.f6192a = u2Var;
        this.f6193b = oVar;
        this.f6195d = jVar.b() ? jVar.a() : "";
        this.f6197f = o1.v0.f6954v;
        this.f6194c = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int A(m1.g gVar, m1.g gVar2) {
        return p1.g0.k(gVar.e(), gVar2.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer B(Cursor cursor) {
        return Integer.valueOf(cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ m1.g C(Cursor cursor) {
        return w(cursor.getInt(0), cursor.getBlob(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(List list, Cursor cursor) {
        list.add(cursor.getString(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Cursor cursor) {
        this.f6196e = Math.max(this.f6196e, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ m1.g F(int r22, Cursor cursor) {
        return w(r22, cursor.getBlob(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(List list, Cursor cursor) {
        list.add(f.b(cursor.getString(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Cursor cursor) {
        this.f6197f = com.google.protobuf.j.w(cursor.getBlob(0));
    }

    private void I() {
        final ArrayList arrayList = new ArrayList();
        this.f6192a.E("SELECT uid FROM mutation_queues").e(new p1.n() { // from class: k1.f2
            @Override // p1.n
            public final void accept(Object obj) {
                n2.D(arrayList, (Cursor) obj);
            }
        });
        this.f6196e = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f6192a.E("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").b((String) it.next()).e(new p1.n() { // from class: k1.g2
                @Override // p1.n
                public final void accept(Object obj) {
                    n2.this.E((Cursor) obj);
                }
            });
        }
        this.f6196e++;
    }

    private void J() {
        this.f6192a.v("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f6195d, -1, this.f6197f.N());
    }

    private m1.g w(int r8, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.f6193b.f(n1.e.k0(bArr));
            }
            a aVar = new a(bArr);
            while (aVar.f6199b) {
                this.f6192a.E("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(Integer.valueOf((aVar.d() * 1000000) + 1), 1000000, this.f6195d, Integer.valueOf(r8)).c(aVar);
            }
            return this.f6193b.f(n1.e.j0(aVar.e()));
        } catch (com.google.protobuf.e0 e5) {
            throw p1.b.a("MutationBatch failed to parse: %s", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(List list, Cursor cursor) {
        list.add(w(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Set set, List list, Cursor cursor) {
        int r02 = cursor.getInt(0);
        if (set.contains(Integer.valueOf(r02))) {
            return;
        }
        set.add(Integer.valueOf(r02));
        list.add(w(r02, cursor.getBlob(1)));
    }

    @Override // k1.w0
    public void a() {
        I();
        if (this.f6192a.E("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").b(this.f6195d).c(new p1.n() { // from class: k1.h2
            @Override // p1.n
            public final void accept(Object obj) {
                n2.this.H((Cursor) obj);
            }
        }) == 0) {
            J();
        }
    }

    @Override // k1.w0
    public com.google.protobuf.j b() {
        return this.f6197f;
    }

    @Override // k1.w0
    public void c() {
        if (x()) {
            final ArrayList arrayList = new ArrayList();
            this.f6192a.E("SELECT path FROM document_mutations WHERE uid = ?").b(this.f6195d).e(new p1.n() { // from class: k1.e2
                @Override // p1.n
                public final void accept(Object obj) {
                    n2.G(arrayList, (Cursor) obj);
                }
            });
            p1.b.d(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    @Override // k1.w0
    public m1.g d(x0.o oVar, List<m1.f> list, List<m1.f> list2) {
        int r02 = this.f6196e;
        this.f6196e = r02 + 1;
        m1.g gVar = new m1.g(r02, oVar, list, list2);
        this.f6192a.v("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.f6195d, Integer.valueOf(r02), this.f6193b.n(gVar).a());
        HashSet hashSet = new HashSet();
        SQLiteStatement D = this.f6192a.D("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator<m1.f> it = list2.iterator();
        while (it.hasNext()) {
            l1.l g5 = it.next().g();
            if (hashSet.add(g5)) {
                this.f6192a.u(D, this.f6195d, f.c(g5.t()), Integer.valueOf(r02));
                this.f6194c.j(g5.r());
            }
        }
        return gVar;
    }

    @Override // k1.w0
    public void e(m1.g gVar) {
        SQLiteStatement D = this.f6192a.D("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement D2 = this.f6192a.D("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int e5 = gVar.e();
        p1.b.d(this.f6192a.u(D, this.f6195d, Integer.valueOf(e5)) != 0, "Mutation batch (%s, %d) did not exist", this.f6195d, Integer.valueOf(gVar.e()));
        Iterator<m1.f> it = gVar.h().iterator();
        while (it.hasNext()) {
            l1.l g5 = it.next().g();
            this.f6192a.u(D2, this.f6195d, f.c(g5.t()), Integer.valueOf(e5));
            this.f6192a.f().k(g5);
        }
    }

    @Override // k1.w0
    public m1.g f(int r6) {
        return (m1.g) this.f6192a.E("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").b(1000000, this.f6195d, Integer.valueOf(r6 + 1)).d(new p1.t() { // from class: k1.k2
            @Override // p1.t
            public final Object d(Object obj) {
                m1.g C;
                C = n2.this.C((Cursor) obj);
                return C;
            }
        });
    }

    @Override // k1.w0
    public int g() {
        return ((Integer) this.f6192a.E("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?").b(-1, this.f6195d).d(new p1.t() { // from class: k1.m2
            @Override // p1.t
            public final Object d(Object obj) {
                Integer B;
                B = n2.B((Cursor) obj);
                return B;
            }
        })).intValue();
    }

    @Override // k1.w0
    public List<m1.g> h(Iterable<l1.l> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<l1.l> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(f.c(it.next().t()));
        }
        u2.b bVar = new u2.b(this.f6192a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, this.f6195d), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        final ArrayList arrayList2 = new ArrayList();
        final HashSet hashSet = new HashSet();
        while (bVar.d()) {
            bVar.e().e(new p1.n() { // from class: k1.j2
                @Override // p1.n
                public final void accept(Object obj) {
                    n2.this.z(hashSet, arrayList2, (Cursor) obj);
                }
            });
        }
        if (bVar.c() > 1) {
            Collections.sort(arrayList2, new Comparator() { // from class: k1.d2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int A;
                    A = n2.A((m1.g) obj, (m1.g) obj2);
                    return A;
                }
            });
        }
        return arrayList2;
    }

    @Override // k1.w0
    public void i(com.google.protobuf.j jVar) {
        this.f6197f = (com.google.protobuf.j) p1.x.b(jVar);
        J();
    }

    @Override // k1.w0
    public List<m1.g> j() {
        final ArrayList arrayList = new ArrayList();
        this.f6192a.E("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").b(1000000, this.f6195d).e(new p1.n() { // from class: k1.i2
            @Override // p1.n
            public final void accept(Object obj) {
                n2.this.y(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // k1.w0
    public m1.g k(final int r5) {
        return (m1.g) this.f6192a.E("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(1000000, this.f6195d, Integer.valueOf(r5)).d(new p1.t() { // from class: k1.l2
            @Override // p1.t
            public final Object d(Object obj) {
                m1.g F;
                F = n2.this.F(r5, (Cursor) obj);
                return F;
            }
        });
    }

    @Override // k1.w0
    public void l(m1.g gVar, com.google.protobuf.j jVar) {
        this.f6197f = (com.google.protobuf.j) p1.x.b(jVar);
        J();
    }

    public boolean x() {
        return this.f6192a.E("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").b(this.f6195d).f();
    }
}
