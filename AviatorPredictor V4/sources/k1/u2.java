package k1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import com.google.firebase.firestore.u;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k1.l0;
import k1.u2;

/* loaded from: classes.dex */
public final class u2 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    private final c f6265c;

    /* renamed from: d, reason: collision with root package name */
    private final o f6266d;

    /* renamed from: e, reason: collision with root package name */
    private final y3 f6267e;

    /* renamed from: f, reason: collision with root package name */
    private final i1 f6268f;

    /* renamed from: g, reason: collision with root package name */
    private final z2 f6269g;

    /* renamed from: h, reason: collision with root package name */
    private final c2 f6270h;

    /* renamed from: i, reason: collision with root package name */
    private final SQLiteTransactionListener f6271i;

    /* renamed from: j, reason: collision with root package name */
    private SQLiteDatabase f6272j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6273k;

    class a implements SQLiteTransactionListener {
        a() {
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onBegin() {
            u2.this.f6270h.n();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onCommit() {
            u2.this.f6270h.i();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onRollback() {
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final u2 f6275a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6276b;

        /* renamed from: c, reason: collision with root package name */
        private final String f6277c;

        /* renamed from: d, reason: collision with root package name */
        private final List<Object> f6278d;

        /* renamed from: e, reason: collision with root package name */
        private int f6279e;

        /* renamed from: f, reason: collision with root package name */
        private final Iterator<Object> f6280f;

        b(u2 u2Var, String str, List<Object> list, String str2) {
            this.f6279e = 0;
            this.f6275a = u2Var;
            this.f6276b = str;
            this.f6278d = Collections.emptyList();
            this.f6277c = str2;
            this.f6280f = list.iterator();
        }

        b(u2 u2Var, String str, List<Object> list, List<Object> list2, String str2) {
            this.f6279e = 0;
            this.f6275a = u2Var;
            this.f6276b = str;
            this.f6278d = list;
            this.f6277c = str2;
            this.f6280f = list2.iterator();
        }

        private Object[] b() {
            ArrayList arrayList = new ArrayList(this.f6278d);
            for (int r12 = 0; this.f6280f.hasNext() && r12 < 900 - this.f6278d.size(); r12++) {
                arrayList.add(this.f6280f.next());
            }
            return arrayList.toArray();
        }

        void a() {
            this.f6279e++;
            Object[] b5 = b();
            this.f6275a.v(this.f6276b + ((Object) p1.g0.x("?", b5.length, ", ")) + this.f6277c, b5);
        }

        int c() {
            return this.f6279e;
        }

        boolean d() {
            return this.f6280f.hasNext();
        }

        d e() {
            this.f6279e++;
            Object[] b5 = b();
            return this.f6275a.E(this.f6276b + ((Object) p1.g0.x("?", b5.length, ", ")) + this.f6277c).b(b5);
        }
    }

    static class c extends SQLiteOpenHelper {

        /* renamed from: e, reason: collision with root package name */
        private final o f6281e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f6282f;

        private c(Context context, o oVar, String str) {
            this(context, oVar, str, 16);
        }

        c(Context context, o oVar, String str, int r5) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, r5);
            this.f6281e = oVar;
        }

        /* synthetic */ c(Context context, o oVar, String str, a aVar) {
            this(context, oVar, str);
        }

        private void a(SQLiteDatabase sQLiteDatabase) {
            if (this.f6282f) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f6282f = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
            new s3(sQLiteDatabase, this.f6281e).j0(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int r22, int r32) {
            a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int r32, int r4) {
            a(sQLiteDatabase);
            new s3(sQLiteDatabase, this.f6281e).j0(r32);
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        private final SQLiteDatabase f6283a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6284b;

        /* renamed from: c, reason: collision with root package name */
        private SQLiteDatabase.CursorFactory f6285c;

        d(SQLiteDatabase sQLiteDatabase, String str) {
            this.f6283a = sQLiteDatabase;
            this.f6284b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Cursor g(Object[] objArr, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            u2.r(sQLiteQuery, objArr);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        private Cursor h() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f6285c;
            return cursorFactory != null ? this.f6283a.rawQueryWithFactory(cursorFactory, this.f6284b, null, null) : this.f6283a.rawQuery(this.f6284b, null);
        }

        d b(final Object... objArr) {
            this.f6285c = new SQLiteDatabase.CursorFactory() { // from class: k1.v2
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    Cursor g5;
                    g5 = u2.d.g(objArr, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    return g5;
                }
            };
            return this;
        }

        int c(p1.n<Cursor> nVar) {
            Cursor h5 = h();
            try {
                if (!h5.moveToFirst()) {
                    h5.close();
                    return 0;
                }
                nVar.accept(h5);
                h5.close();
                return 1;
            } catch (Throwable th) {
                if (h5 != null) {
                    try {
                        h5.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        <T> T d(p1.t<Cursor, T> tVar) {
            Cursor h5 = h();
            try {
                if (!h5.moveToFirst()) {
                    h5.close();
                    return null;
                }
                T d5 = tVar.d(h5);
                h5.close();
                return d5;
            } catch (Throwable th) {
                if (h5 != null) {
                    try {
                        h5.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        int e(p1.n<Cursor> nVar) {
            Cursor h5 = h();
            int r12 = 0;
            while (h5.moveToNext()) {
                try {
                    r12++;
                    nVar.accept(h5);
                } catch (Throwable th) {
                    if (h5 != null) {
                        try {
                            h5.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            h5.close();
            return r12;
        }

        boolean f() {
            Cursor h5 = h();
            try {
                boolean z4 = !h5.moveToFirst();
                h5.close();
                return z4;
            } catch (Throwable th) {
                if (h5 != null) {
                    try {
                        h5.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public u2(Context context, String str, l1.f fVar, o oVar, l0.b bVar) {
        this(oVar, bVar, new c(context, oVar, t(str, fVar), (a) null));
    }

    public u2(o oVar, l0.b bVar, c cVar) {
        this.f6271i = new a();
        this.f6265c = cVar;
        this.f6266d = oVar;
        this.f6267e = new y3(this, oVar);
        this.f6268f = new i1(this, oVar);
        this.f6269g = new z2(this, oVar);
        this.f6270h = new c2(this, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long B(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long C(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(SQLiteProgram sQLiteProgram, Object[] objArr) {
        int r32;
        long longValue;
        for (int r12 = 0; r12 < objArr.length; r12++) {
            Object obj = objArr[r12];
            if (obj == null) {
                sQLiteProgram.bindNull(r12 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(r12 + 1, (String) obj);
            } else {
                if (obj instanceof Integer) {
                    r32 = r12 + 1;
                    longValue = ((Integer) obj).intValue();
                } else if (obj instanceof Long) {
                    r32 = r12 + 1;
                    longValue = ((Long) obj).longValue();
                } else if (obj instanceof Double) {
                    sQLiteProgram.bindDouble(r12 + 1, ((Double) obj).doubleValue());
                } else {
                    if (!(obj instanceof byte[])) {
                        throw p1.b.a("Unknown argument %s of type %s", obj, obj.getClass());
                    }
                    sQLiteProgram.bindBlob(r12 + 1, (byte[]) obj);
                }
                sQLiteProgram.bindLong(r32, longValue);
            }
        }
    }

    public static void s(Context context, l1.f fVar, String str) {
        String path = context.getDatabasePath(t(str, fVar)).getPath();
        String str2 = path + "-wal";
        File file = new File(path);
        File file2 = new File(path + "-journal");
        File file3 = new File(str2);
        try {
            p1.s.a(file);
            p1.s.a(file2);
            p1.s.a(file3);
        } catch (IOException e5) {
            throw new com.google.firebase.firestore.u("Failed to clear persistence." + e5, u.a.UNKNOWN);
        }
    }

    public static String t(String str, l1.f fVar) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.k(), "utf-8") + "." + URLEncoder.encode(fVar.i(), "utf-8");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    private long x() {
        return ((Long) E("PRAGMA page_count").d(new p1.t() { // from class: k1.t2
            @Override // p1.t
            public final Object d(Object obj) {
                Long B;
                B = u2.B((Cursor) obj);
                return B;
            }
        })).longValue();
    }

    private long y() {
        return ((Long) E("PRAGMA page_size").d(new p1.t() { // from class: k1.s2
            @Override // p1.t
            public final Object d(Object obj) {
                Long C;
                C = u2.C((Cursor) obj);
                return C;
            }
        })).longValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k1.z0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public y3 h() {
        return this.f6267e;
    }

    SQLiteStatement D(String str) {
        return this.f6272j.compileStatement(str);
    }

    d E(String str) {
        return new d(this.f6272j, str);
    }

    @Override // k1.z0
    k1.a a() {
        return this.f6268f;
    }

    @Override // k1.z0
    k1.b b(g1.j jVar) {
        return new p1(this, this.f6266d, jVar);
    }

    @Override // k1.z0
    l c(g1.j jVar) {
        return new y1(this, this.f6266d, jVar);
    }

    @Override // k1.z0
    w0 d(g1.j jVar, l lVar) {
        return new n2(this, this.f6266d, jVar, lVar);
    }

    @Override // k1.z0
    x0 e() {
        return new r2(this);
    }

    @Override // k1.z0
    f1 g() {
        return this.f6269g;
    }

    @Override // k1.z0
    public boolean i() {
        return this.f6273k;
    }

    @Override // k1.z0
    <T> T j(String str, p1.y<T> yVar) {
        p1.v.a(z0.f6351a, "Starting transaction: %s", str);
        this.f6272j.beginTransactionWithListener(this.f6271i);
        try {
            T t4 = yVar.get();
            this.f6272j.setTransactionSuccessful();
            return t4;
        } finally {
            this.f6272j.endTransaction();
        }
    }

    @Override // k1.z0
    void k(String str, Runnable runnable) {
        p1.v.a(z0.f6351a, "Starting transaction: %s", str);
        this.f6272j.beginTransactionWithListener(this.f6271i);
        try {
            runnable.run();
            this.f6272j.setTransactionSuccessful();
        } finally {
            this.f6272j.endTransaction();
        }
    }

    @Override // k1.z0
    public void l() {
        p1.b.d(this.f6273k, "SQLitePersistence shutdown without start!", new Object[0]);
        this.f6273k = false;
        this.f6272j.close();
        this.f6272j = null;
    }

    @Override // k1.z0
    public void m() {
        p1.b.d(!this.f6273k, "SQLitePersistence double-started!", new Object[0]);
        this.f6273k = true;
        try {
            this.f6272j = this.f6265c.getWritableDatabase();
            this.f6267e.B();
            this.f6270h.z(this.f6267e.r());
        } catch (SQLiteDatabaseLockedException e5) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e5);
        }
    }

    int u(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        r(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    void v(String str, Object... objArr) {
        this.f6272j.execSQL(str, objArr);
    }

    long w() {
        return x() * y();
    }

    @Override // k1.z0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public c2 f() {
        return this.f6270h;
    }
}
