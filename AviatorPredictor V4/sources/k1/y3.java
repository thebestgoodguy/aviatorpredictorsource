package k1;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import java.util.Iterator;
import k1.y3;

/* loaded from: classes.dex */
final class y3 implements a4 {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f6341a;

    /* renamed from: b, reason: collision with root package name */
    private final o f6342b;

    /* renamed from: c, reason: collision with root package name */
    private int f6343c;

    /* renamed from: d, reason: collision with root package name */
    private long f6344d;

    /* renamed from: e, reason: collision with root package name */
    private l1.w f6345e = l1.w.f6583f;

    /* renamed from: f, reason: collision with root package name */
    private long f6346f;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        c1.e<l1.l> f6347a;

        private b() {
            this.f6347a = l1.l.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        b4 f6348a;

        private c() {
        }
    }

    y3(u2 u2Var, o oVar) {
        this.f6341a = u2Var;
        this.f6342b = oVar;
    }

    private void A(b4 b4Var) {
        int g5 = b4Var.g();
        String c5 = b4Var.f().c();
        x0.o g6 = b4Var.e().g();
        this.f6341a.v("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(g5), c5, Long.valueOf(g6.i()), Integer.valueOf(g6.g()), b4Var.c().N(), Long.valueOf(b4Var.d()), this.f6342b.p(b4Var).a());
    }

    private boolean C(b4 b4Var) {
        boolean z4;
        if (b4Var.g() > this.f6343c) {
            this.f6343c = b4Var.g();
            z4 = true;
        } else {
            z4 = false;
        }
        if (b4Var.d() <= this.f6344d) {
            return z4;
        }
        this.f6344d = b4Var.d();
        return true;
    }

    private void D() {
        this.f6341a.v("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f6343c), Long.valueOf(this.f6344d), Long.valueOf(this.f6345e.g().i()), Integer.valueOf(this.f6345e.g().g()), Long.valueOf(this.f6346f));
    }

    private b4 p(byte[] bArr) {
        try {
            return this.f6342b.h(n1.c.m0(bArr));
        } catch (com.google.protobuf.e0 e5) {
            throw p1.b.a("TargetData failed to parse: %s", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(p1.n nVar, Cursor cursor) {
        nVar.accept(p(cursor.getBlob(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(b bVar, Cursor cursor) {
        bVar.f6347a = bVar.f6347a.q(l1.l.n(f.b(cursor.getString(0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(i1.c1 c1Var, c cVar, Cursor cursor) {
        b4 p4 = p(cursor.getBlob(0));
        if (c1Var.equals(p4.f())) {
            cVar.f6348a = p4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(SparseArray sparseArray, int[] r32, Cursor cursor) {
        int r4 = cursor.getInt(0);
        if (sparseArray.get(r4) == null) {
            z(r4);
            r32[0] = r32[0] + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Cursor cursor) {
        this.f6343c = cursor.getInt(0);
        this.f6344d = cursor.getInt(1);
        this.f6345e = new l1.w(new x0.o(cursor.getLong(2), cursor.getInt(3)));
        this.f6346f = cursor.getLong(4);
    }

    private void z(int r5) {
        f(r5);
        this.f6341a.v("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(r5));
        this.f6346f--;
    }

    void B() {
        p1.b.d(this.f6341a.E("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").c(new p1.n() { // from class: k1.u3
            @Override // p1.n
            public final void accept(Object obj) {
                y3.this.x((Cursor) obj);
            }
        }) == 1, "Missing target_globals entry", new Object[0]);
    }

    @Override // k1.a4
    public void a(b4 b4Var) {
        A(b4Var);
        if (C(b4Var)) {
            D();
        }
    }

    @Override // k1.a4
    public c1.e<l1.l> b(int r5) {
        final b bVar = new b();
        this.f6341a.E("SELECT path FROM target_documents WHERE target_id = ?").b(Integer.valueOf(r5)).e(new p1.n() { // from class: k1.t3
            @Override // p1.n
            public final void accept(Object obj) {
                y3.u(y3.b.this, (Cursor) obj);
            }
        });
        return bVar.f6347a;
    }

    @Override // k1.a4
    public l1.w c() {
        return this.f6345e;
    }

    @Override // k1.a4
    public void d(c1.e<l1.l> eVar, int r10) {
        SQLiteStatement D = this.f6341a.D("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        c2 f5 = this.f6341a.f();
        Iterator<l1.l> it = eVar.iterator();
        while (it.hasNext()) {
            l1.l next = it.next();
            this.f6341a.u(D, Integer.valueOf(r10), f.c(next.t()));
            f5.a(next);
        }
    }

    @Override // k1.a4
    public void e(l1.w wVar) {
        this.f6345e = wVar;
        D();
    }

    @Override // k1.a4
    public void f(int r4) {
        this.f6341a.v("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(r4));
    }

    @Override // k1.a4
    public void g(c1.e<l1.l> eVar, int r10) {
        SQLiteStatement D = this.f6341a.D("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        c2 f5 = this.f6341a.f();
        Iterator<l1.l> it = eVar.iterator();
        while (it.hasNext()) {
            l1.l next = it.next();
            this.f6341a.u(D, Integer.valueOf(r10), f.c(next.t()));
            f5.f(next);
        }
    }

    @Override // k1.a4
    public b4 h(final i1.c1 c1Var) {
        String c5 = c1Var.c();
        final c cVar = new c();
        this.f6341a.E("SELECT target_proto FROM targets WHERE canonical_id = ?").b(c5).e(new p1.n() { // from class: k1.w3
            @Override // p1.n
            public final void accept(Object obj) {
                y3.this.v(c1Var, cVar, (Cursor) obj);
            }
        });
        return cVar.f6348a;
    }

    @Override // k1.a4
    public void i(b4 b4Var) {
        A(b4Var);
        C(b4Var);
        this.f6346f++;
        D();
    }

    @Override // k1.a4
    public int j() {
        return this.f6343c;
    }

    public void q(final p1.n<b4> nVar) {
        this.f6341a.E("SELECT target_proto FROM targets").e(new p1.n() { // from class: k1.x3
            @Override // p1.n
            public final void accept(Object obj) {
                y3.this.t(nVar, (Cursor) obj);
            }
        });
    }

    public long r() {
        return this.f6344d;
    }

    public long s() {
        return this.f6346f;
    }

    int y(long j4, final SparseArray<?> sparseArray) {
        final int[] r12 = new int[1];
        this.f6341a.E("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").b(Long.valueOf(j4)).e(new p1.n() { // from class: k1.v3
            @Override // p1.n
            public final void accept(Object obj) {
                y3.this.w(sparseArray, r12, (Cursor) obj);
            }
        });
        D();
        return r12[0];
    }
}
