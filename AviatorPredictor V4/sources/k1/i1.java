package k1;

import android.database.Cursor;

/* loaded from: classes.dex */
class i1 implements a {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f6112a;

    /* renamed from: b, reason: collision with root package name */
    private final o f6113b;

    i1(u2 u2Var, o oVar) {
        this.f6112a = u2Var;
        this.f6113b = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h1.e g(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new h1.e(str, cursor.getInt(0), new l1.w(new x0.o(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h1.j h(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            return new h1.j(str, this.f6113b.a(w1.a.b0(cursor.getBlob(2))), new l1.w(new x0.o(cursor.getLong(0), cursor.getInt(1))));
        } catch (com.google.protobuf.e0 e5) {
            throw p1.b.a("NamedQuery failed to parse: %s", e5);
        }
    }

    @Override // k1.a
    public h1.e a(final String str) {
        return (h1.e) this.f6112a.E("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?").b(str).d(new p1.t() { // from class: k1.g1
            @Override // p1.t
            public final Object d(Object obj) {
                h1.e g5;
                g5 = i1.g(str, (Cursor) obj);
                return g5;
            }
        });
    }

    @Override // k1.a
    public void b(h1.e eVar) {
        this.f6112a.v("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", eVar.a(), Integer.valueOf(eVar.c()), Long.valueOf(eVar.b().g().i()), Integer.valueOf(eVar.b().g().g()), Integer.valueOf(eVar.e()), Long.valueOf(eVar.d()));
    }

    @Override // k1.a
    public h1.j c(final String str) {
        return (h1.j) this.f6112a.E("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?").b(str).d(new p1.t() { // from class: k1.h1
            @Override // p1.t
            public final Object d(Object obj) {
                h1.j h5;
                h5 = i1.this.h(str, (Cursor) obj);
                return h5;
            }
        });
    }

    @Override // k1.a
    public void d(h1.j jVar) {
        this.f6112a.v("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", jVar.b(), Long.valueOf(jVar.c().g().i()), Integer.valueOf(jVar.c().g().g()), this.f6113b.j(jVar.a()).a());
    }
}
