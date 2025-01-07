package k1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import k1.u2;

/* loaded from: classes.dex */
public class p1 implements b {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f6213a;

    /* renamed from: b, reason: collision with root package name */
    private final o f6214b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6215c;

    public p1(u2 u2Var, o oVar, g1.j jVar) {
        this.f6213a = u2Var;
        this.f6214b = oVar;
        this.f6215c = jVar.b() ? jVar.a() : "";
    }

    private m1.k m(byte[] bArr, int r32) {
        try {
            return m1.k.a(r32, this.f6214b.e(x1.y.q0(bArr)));
        } catch (com.google.protobuf.e0 e5) {
            throw p1.b.a("Overlay failed to parse: %s", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ m1.k n(Cursor cursor) {
        return m(cursor.getBlob(0), cursor.getInt(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(int[] r32, String[] strArr, String[] strArr2, p1.m mVar, Map map, Cursor cursor) {
        r32[0] = cursor.getInt(1);
        strArr[0] = cursor.getString(2);
        strArr2[0] = cursor.getString(3);
        s(mVar, map, cursor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(byte[] bArr, int r22, Map map) {
        m1.k m4 = m(bArr, r22);
        synchronized (map) {
            map.put(m4.b(), m4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor] */
    /* renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void s(p1.m mVar, final Map<l1.l, m1.k> map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int r12 = cursor.getInt(1);
        p1.m mVar2 = mVar;
        if (cursor.isLast()) {
            mVar2 = p1.p.f7051b;
        }
        mVar2.execute(new Runnable() { // from class: k1.j1
            @Override // java.lang.Runnable
            public final void run() {
                p1.this.r(blob, r12, map);
            }
        });
    }

    private void u(final Map<l1.l, m1.k> map, final p1.m mVar, l1.u uVar, List<Object> list) {
        if (list.isEmpty()) {
            return;
        }
        u2.b bVar = new u2.b(this.f6213a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.f6215c, f.c(uVar)), list, ")");
        while (bVar.d()) {
            bVar.e().e(new p1.n() { // from class: k1.m1
                @Override // p1.n
                public final void accept(Object obj) {
                    p1.this.s(mVar, map, (Cursor) obj);
                }
            });
        }
    }

    private void v(int r7, l1.l lVar, m1.f fVar) {
        this.f6213a.v("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.f6215c, lVar.q(), f.c(lVar.t().u()), lVar.t().n(), Integer.valueOf(r7), this.f6214b.m(fVar).a());
    }

    @Override // k1.b
    public m1.k a(l1.l lVar) {
        return (m1.k) this.f6213a.E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?").b(this.f6215c, f.c(lVar.t().u()), lVar.t().n()).d(new p1.t() { // from class: k1.o1
            @Override // p1.t
            public final Object d(Object obj) {
                m1.k n4;
                n4 = p1.this.n((Cursor) obj);
                return n4;
            }
        });
    }

    @Override // k1.b
    public Map<l1.l, m1.k> b(SortedSet<l1.l> sortedSet) {
        p1.b.d(sortedSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap hashMap = new HashMap();
        p1.m mVar = new p1.m();
        l1.u uVar = l1.u.f6582f;
        ArrayList arrayList = new ArrayList();
        for (l1.l lVar : sortedSet) {
            if (!uVar.equals(lVar.r())) {
                u(hashMap, mVar, uVar, arrayList);
                uVar = lVar.r();
                arrayList.clear();
            }
            arrayList.add(lVar.s());
        }
        u(hashMap, mVar, uVar, arrayList);
        mVar.b();
        return hashMap;
    }

    @Override // k1.b
    public void c(int r5) {
        this.f6213a.v("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.f6215c, Integer.valueOf(r5));
    }

    @Override // k1.b
    public Map<l1.l, m1.k> d(l1.u uVar, int r8) {
        final HashMap hashMap = new HashMap();
        final p1.m mVar = new p1.m();
        this.f6213a.E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?").b(this.f6215c, f.c(uVar), Integer.valueOf(r8)).e(new p1.n() { // from class: k1.k1
            @Override // p1.n
            public final void accept(Object obj) {
                p1.this.o(mVar, hashMap, (Cursor) obj);
            }
        });
        mVar.b();
        return hashMap;
    }

    @Override // k1.b
    public void e(int r5, Map<l1.l, m1.f> map) {
        for (Map.Entry<l1.l, m1.f> entry : map.entrySet()) {
            l1.l key = entry.getKey();
            v(r5, key, (m1.f) p1.x.d(entry.getValue(), "null value for key: %s", key));
        }
    }

    @Override // k1.b
    public Map<l1.l, m1.k> f(String str, int r20, int r21) {
        final HashMap hashMap = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] r12 = new int[1];
        final p1.m mVar = new p1.m();
        this.f6213a.E("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?").b(this.f6215c, str, Integer.valueOf(r20), Integer.valueOf(r21)).e(new p1.n() { // from class: k1.n1
            @Override // p1.n
            public final void accept(Object obj) {
                p1.this.p(r12, strArr, strArr2, mVar, hashMap, (Cursor) obj);
            }
        });
        if (strArr[0] == null) {
            return hashMap;
        }
        this.f6213a.E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?").b(this.f6215c, str, strArr[0], strArr[0], strArr2[0], Integer.valueOf(r12[0])).e(new p1.n() { // from class: k1.l1
            @Override // p1.n
            public final void accept(Object obj) {
                p1.this.q(mVar, hashMap, (Cursor) obj);
            }
        });
        mVar.b();
        return hashMap;
    }
}
