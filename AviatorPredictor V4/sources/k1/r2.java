package k1;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class r2 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f6235a;

    public r2(u2 u2Var) {
        this.f6235a = u2Var;
    }

    private void d() {
        this.f6235a.k("build overlays", new Runnable() { // from class: k1.o2
            @Override // java.lang.Runnable
            public final void run() {
                r2.this.g();
            }
        });
    }

    private Set<String> e() {
        final HashSet hashSet = new HashSet();
        this.f6235a.E("SELECT DISTINCT uid FROM mutation_queues").e(new p1.n() { // from class: k1.p2
            @Override // p1.n
            public final void accept(Object obj) {
                r2.h(hashSet, (Cursor) obj);
            }
        });
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        if (f()) {
            Set<String> e5 = e();
            f1 g5 = this.f6235a.g();
            Iterator<String> it = e5.iterator();
            while (it.hasNext()) {
                g1.j jVar = new g1.j(it.next());
                u2 u2Var = this.f6235a;
                w0 d5 = u2Var.d(jVar, u2Var.c(jVar));
                HashSet hashSet = new HashSet();
                Iterator<m1.g> it2 = d5.j().iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(it2.next().f());
                }
                new n(g5, d5, this.f6235a.b(jVar), this.f6235a.c(jVar)).n(hashSet);
            }
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Set set, Cursor cursor) {
        set.add(cursor.getString(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Boolean[] boolArr, Cursor cursor) {
        try {
            if (z0.f6352b.equals(cursor.getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e5) {
            throw p1.b.a("SQLitePersistence.DataMigration failed to parse: %s", e5);
        }
    }

    private void j() {
        this.f6235a.v("DELETE FROM data_migrations WHERE migration_name = ?", z0.f6352b);
    }

    boolean f() {
        final Boolean[] boolArr = {Boolean.FALSE};
        this.f6235a.E("SELECT migration_name FROM data_migrations").e(new p1.n() { // from class: k1.q2
            @Override // p1.n
            public final void accept(Object obj) {
                r2.i(boolArr, (Cursor) obj);
            }
        });
        return boolArr[0].booleanValue();
    }

    @Override // k1.x0
    public void run() {
        d();
    }
}
