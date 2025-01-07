package k1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import k1.q0;
import k1.u2;

/* loaded from: classes.dex */
class s3 {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f6243a;

    /* renamed from: b, reason: collision with root package name */
    private final o f6244b;

    s3(SQLiteDatabase sQLiteDatabase, o oVar) {
        this.f6243a = sQLiteDatabase;
        this.f6244b = oVar;
    }

    private void A() {
        N(new String[]{"document_overlays"}, new Runnable() { // from class: k1.k3
            @Override // java.lang.Runnable
            public final void run() {
                s3.this.R();
            }
        });
    }

    private void B() {
        N(new String[]{"mutation_queues", "mutations", "document_mutations"}, new Runnable() { // from class: k1.p3
            @Override // java.lang.Runnable
            public final void run() {
                s3.this.S();
            }
        });
    }

    private void C() {
        N(new String[]{"remote_documents"}, new Runnable() { // from class: k1.a3
            @Override // java.lang.Runnable
            public final void run() {
                s3.this.T();
            }
        });
    }

    private void D() {
        N(new String[]{"targets", "target_globals", "target_documents"}, new Runnable() { // from class: k1.j3
            @Override // java.lang.Runnable
            public final void run() {
                s3.this.U();
            }
        });
    }

    private void E() {
        N(new String[]{"collection_parents"}, new Runnable() { // from class: k1.l3
            @Override // java.lang.Runnable
            public final void run() {
                s3.this.Y();
            }
        });
        final q0.a aVar = new q0.a();
        final SQLiteStatement compileStatement = this.f6243a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)");
        final p1.n nVar = new p1.n() { // from class: k1.q3
            @Override // p1.n
            public final void accept(Object obj) {
                s3.V(q0.a.this, compileStatement, (l1.u) obj);
            }
        };
        new u2.d(this.f6243a, "SELECT path FROM remote_documents").e(new p1.n() { // from class: k1.e3
            @Override // p1.n
            public final void accept(Object obj) {
                s3.W(p1.n.this, (Cursor) obj);
            }
        });
        new u2.d(this.f6243a, "SELECT path FROM document_mutations").e(new p1.n() { // from class: k1.f3
            @Override // p1.n
            public final void accept(Object obj) {
                s3.X(p1.n.this, (Cursor) obj);
            }
        });
    }

    private void F() {
        new u2.d(this.f6243a, "SELECT target_id, target_proto FROM targets").e(new p1.n() { // from class: k1.r3
            @Override // p1.n
            public final void accept(Object obj) {
                s3.this.Z((Cursor) obj);
            }
        });
    }

    private void G() {
        if (m0("targets")) {
            this.f6243a.execSQL("DROP TABLE targets");
        }
        if (m0("target_globals")) {
            this.f6243a.execSQL("DROP TABLE target_globals");
        }
        if (m0("target_documents")) {
            this.f6243a.execSQL("DROP TABLE target_documents");
        }
    }

    private void H() {
        u2.d b5 = new u2.d(this.f6243a, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").b(100);
        final SQLiteStatement compileStatement = this.f6243a.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        final boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            b5.e(new p1.n() { // from class: k1.g3
                @Override // p1.n
                public final void accept(Object obj) {
                    s3.a0(zArr, compileStatement, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void I() {
        this.f6243a.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    private void J() {
        Long l4 = (Long) new u2.d(this.f6243a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").d(new p1.t() { // from class: k1.i3
            @Override // p1.t
            public final Object d(Object obj) {
                Long b02;
                b02 = s3.b0((Cursor) obj);
                return b02;
            }
        });
        p1.b.d(l4 != null, "Missing highest sequence number", new Object[0]);
        final long longValue = l4.longValue();
        final SQLiteStatement compileStatement = this.f6243a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        u2.d b5 = new u2.d(this.f6243a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").b(100);
        final boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            b5.e(new p1.n() { // from class: k1.h3
                @Override // p1.n
                public final void accept(Object obj) {
                    s3.c0(zArr, compileStatement, longValue, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void K() {
        if (DatabaseUtils.queryNumEntries(this.f6243a, "target_globals") == 1) {
            return;
        }
        this.f6243a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
    }

    private boolean M() {
        boolean l02 = l0("remote_documents", "read_time_seconds");
        boolean l03 = l0("remote_documents", "read_time_nanos");
        p1.b.d(l02 == l03, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return l02 && l03;
    }

    private void N(String[] strArr, Runnable runnable) {
        StringBuilder sb;
        String str;
        String str2 = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z4 = false;
        for (int r22 = 0; r22 < strArr.length; r22++) {
            String str3 = strArr[r22];
            boolean m02 = m0(str3);
            if (r22 == 0) {
                z4 = m02;
            } else if (m02 != z4) {
                String str4 = "Expected all of " + str2 + " to either exist or not, but ";
                if (z4) {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(strArr[0]);
                    sb.append(" exists and ");
                    sb.append(str3);
                    str = " does not";
                } else {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(strArr[0]);
                    sb.append(" does not exist and ");
                    sb.append(str3);
                    str = " does";
                }
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (!z4) {
            runnable.run();
            return;
        }
        p1.v.a("SQLiteSchema", "Skipping migration because all of " + str2 + " already exist", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        this.f6243a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        this.f6243a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P() {
        this.f6243a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        this.f6243a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        this.f6243a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        this.f6243a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        this.f6243a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        this.f6243a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        this.f6243a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        this.f6243a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.f6243a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        this.f6243a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        this.f6243a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        this.f6243a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f6243a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        this.f6243a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        this.f6243a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        this.f6243a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        this.f6243a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V(q0.a aVar, SQLiteStatement sQLiteStatement, l1.u uVar) {
        if (aVar.a(uVar)) {
            String n4 = uVar.n();
            l1.u u4 = uVar.u();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, n4);
            sQLiteStatement.bindString(2, f.c(u4));
            sQLiteStatement.execute();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W(p1.n nVar, Cursor cursor) {
        nVar.accept(f.b(cursor.getString(0)).u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X(p1.n nVar, Cursor cursor) {
        nVar.accept(f.b(cursor.getString(0)).u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y() {
        this.f6243a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(Cursor cursor) {
        int r12 = cursor.getInt(0);
        try {
            this.f6243a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{n1.c.m0(cursor.getBlob(1)).e().B().t().a(), Integer.valueOf(r12)});
        } catch (com.google.protobuf.e0 unused) {
            throw p1.b.a("Failed to decode Query data for target %s", Integer.valueOf(r12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        zArr[0] = true;
        String string = cursor.getString(0);
        l1.u b5 = f.b(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, b5.s());
        sQLiteStatement.bindString(2, string);
        p1.b.d(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long b0(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c0(boolean[] zArr, SQLiteStatement sQLiteStatement, long j4, Cursor cursor) {
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j4);
        p1.b.d(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(String str, Cursor cursor) {
        h0(str, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(Cursor cursor) {
        final String string = cursor.getString(0);
        new u2.d(this.f6243a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").b(string, Long.valueOf(cursor.getLong(1))).e(new p1.n() { // from class: k1.d3
            @Override // p1.n
            public final void accept(Object obj) {
                s3.this.d0(string, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(Cursor cursor) {
        int r12 = cursor.getInt(0);
        try {
            this.f6243a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{this.f6244b.h(n1.c.m0(cursor.getBlob(1))).f().c(), Integer.valueOf(r12)});
        } catch (com.google.protobuf.e0 unused) {
            throw p1.b.a("Failed to decode Query data for target %s", Integer.valueOf(r12));
        }
    }

    private void g0() {
        new u2.d(this.f6243a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").e(new p1.n() { // from class: k1.c3
            @Override // p1.n
            public final void accept(Object obj) {
                s3.this.e0((Cursor) obj);
            }
        });
    }

    private void h0(String str, int r8) {
        SQLiteStatement compileStatement = this.f6243a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        compileStatement.bindString(1, str);
        compileStatement.bindLong(2, r8);
        p1.b.d(compileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(r8));
        this.f6243a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(r8)});
    }

    private void i0() {
        new u2.d(this.f6243a, "SELECT target_id, target_proto FROM targets").e(new p1.n() { // from class: k1.b3
            @Override // p1.n
            public final void accept(Object obj) {
                s3.this.f0((Cursor) obj);
            }
        });
    }

    private boolean l0(String str, String str2) {
        return L(str).indexOf(str2) != -1;
    }

    private boolean m0(String str) {
        return !new u2.d(this.f6243a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").b(str).f();
    }

    private void s() {
        if (l0("remote_documents", "path_length")) {
            return;
        }
        this.f6243a.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
    }

    private void t(String str) {
        this.f6243a.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    private void u() {
        this.f6243a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f6243a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    private void v() {
        if (l0("target_documents", "sequence_number")) {
            return;
        }
        this.f6243a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
    }

    private void w() {
        if (!l0("target_globals", "target_count")) {
            this.f6243a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long queryNumEntries = DatabaseUtils.queryNumEntries(this.f6243a, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(queryNumEntries));
        this.f6243a.update("target_globals", contentValues, null, null);
    }

    private void x() {
        N(new String[]{"bundles", "named_queries"}, new Runnable() { // from class: k1.n3
            @Override // java.lang.Runnable
            public final void run() {
                s3.this.O();
            }
        });
    }

    private void y() {
        N(new String[]{"data_migrations"}, new Runnable() { // from class: k1.m3
            @Override // java.lang.Runnable
            public final void run() {
                s3.this.P();
            }
        });
    }

    private void z() {
        N(new String[]{"index_configuration", "index_state", "index_entries"}, new Runnable() { // from class: k1.o3
            @Override // java.lang.Runnable
            public final void run() {
                s3.this.Q();
            }
        });
    }

    List<String> L(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.f6243a.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursor.getColumnIndex("name");
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(columnIndex));
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    void j0(int r22) {
        k0(r22, 16);
    }

    void k0(int r7, int r8) {
        long currentTimeMillis = System.currentTimeMillis();
        if (r7 < 1 && r8 >= 1) {
            B();
            D();
            C();
        }
        if (r7 < 3 && r8 >= 3 && r7 != 0) {
            G();
            D();
        }
        if (r7 < 4 && r8 >= 4) {
            K();
            w();
        }
        if (r7 < 5 && r8 >= 5) {
            v();
        }
        if (r7 < 6 && r8 >= 6) {
            g0();
        }
        if (r7 < 7 && r8 >= 7) {
            J();
        }
        if (r7 < 8 && r8 >= 8) {
            E();
        }
        if (r7 < 9 && r8 >= 9) {
            if (M()) {
                F();
            } else {
                u();
            }
        }
        if (r7 == 9 && r8 >= 10) {
            F();
        }
        if (r7 < 11 && r8 >= 11) {
            i0();
        }
        if (r7 < 12 && r8 >= 12) {
            x();
        }
        if (r7 < 13 && r8 >= 13) {
            s();
            H();
        }
        if (r7 < 14 && r8 >= 14) {
            A();
            y();
            t(z0.f6352b);
        }
        if (r7 < 15 && r8 >= 15) {
            I();
        }
        if (r7 < 16 && r8 >= 16) {
            z();
        }
        p1.v.a("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(r7), Integer.valueOf(r8), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
