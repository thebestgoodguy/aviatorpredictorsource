package k1;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import k1.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c2 implements d1, h0 {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f6050a;

    /* renamed from: b, reason: collision with root package name */
    private i1.r0 f6051b;

    /* renamed from: c, reason: collision with root package name */
    private long f6052c = -1;

    /* renamed from: d, reason: collision with root package name */
    private final l0 f6053d;

    /* renamed from: e, reason: collision with root package name */
    private e1 f6054e;

    c2(u2 u2Var, l0.b bVar) {
        this.f6050a = u2Var;
        this.f6053d = new l0(this, bVar);
    }

    private void A(l1.l lVar) {
        this.f6050a.v("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", f.c(lVar.t()), Long.valueOf(h()));
    }

    private boolean t(l1.l lVar) {
        if (this.f6054e.c(lVar)) {
            return true;
        }
        return x(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(p1.n nVar, Cursor cursor) {
        nVar.accept(Long.valueOf(cursor.getLong(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long v(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(int[] r32, List list, Cursor cursor) {
        l1.l n4 = l1.l.n(f.b(cursor.getString(0)));
        if (t(n4)) {
            return;
        }
        r32[0] = r32[0] + 1;
        list.add(n4);
        y(n4);
    }

    private boolean x(l1.l lVar) {
        return !this.f6050a.E("SELECT 1 FROM document_mutations WHERE path = ?").b(f.c(lVar.t())).f();
    }

    private void y(l1.l lVar) {
        this.f6050a.v("DELETE FROM target_documents WHERE path = ? AND target_id = 0", f.c(lVar.t()));
    }

    @Override // k1.d1
    public void a(l1.l lVar) {
        A(lVar);
    }

    @Override // k1.h0
    public long b() {
        return this.f6050a.w();
    }

    @Override // k1.h0
    public long c() {
        return this.f6050a.h().s() + ((Long) this.f6050a.E("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").d(new p1.t() { // from class: k1.b2
            @Override // p1.t
            public final Object d(Object obj) {
                Long v4;
                v4 = c2.v((Cursor) obj);
                return v4;
            }
        })).longValue();
    }

    @Override // k1.d1
    public void d(b4 b4Var) {
        this.f6050a.h().a(b4Var.j(h()));
    }

    @Override // k1.h0
    public int e(long j4, SparseArray<?> sparseArray) {
        return this.f6050a.h().y(j4, sparseArray);
    }

    @Override // k1.d1
    public void f(l1.l lVar) {
        A(lVar);
    }

    @Override // k1.h0
    public int g(long j4) {
        final int[] r12 = new int[1];
        final ArrayList arrayList = new ArrayList();
        while (true) {
            for (boolean z4 = true; z4; z4 = false) {
                if (this.f6050a.E("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? LIMIT ?").b(Long.valueOf(j4), 100).e(new p1.n() { // from class: k1.z1
                    @Override // p1.n
                    public final void accept(Object obj) {
                        c2.this.w(r12, arrayList, (Cursor) obj);
                    }
                }) == 100) {
                    break;
                }
            }
            this.f6050a.g().removeAll(arrayList);
            return r12[0];
        }
    }

    @Override // k1.d1
    public long h() {
        p1.b.d(this.f6052c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f6052c;
    }

    @Override // k1.d1
    public void i() {
        p1.b.d(this.f6052c != -1, "Committing a transaction without having started one", new Object[0]);
        this.f6052c = -1L;
    }

    @Override // k1.d1
    public void j(e1 e1Var) {
        this.f6054e = e1Var;
    }

    @Override // k1.d1
    public void k(l1.l lVar) {
        A(lVar);
    }

    @Override // k1.h0
    public l0 l() {
        return this.f6053d;
    }

    @Override // k1.h0
    public void m(final p1.n<Long> nVar) {
        this.f6050a.E("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").e(new p1.n() { // from class: k1.a2
            @Override // p1.n
            public final void accept(Object obj) {
                c2.u(p1.n.this, (Cursor) obj);
            }
        });
    }

    @Override // k1.d1
    public void n() {
        p1.b.d(this.f6052c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f6052c = this.f6051b.a();
    }

    @Override // k1.h0
    public void o(p1.n<b4> nVar) {
        this.f6050a.h().q(nVar);
    }

    @Override // k1.d1
    public void p(l1.l lVar) {
        A(lVar);
    }

    void z(long j4) {
        this.f6051b = new i1.r0(j4);
    }
}
