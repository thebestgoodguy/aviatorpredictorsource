package k1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.u2;
import l1.q;

/* loaded from: classes.dex */
final class z2 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f6356a;

    /* renamed from: b, reason: collision with root package name */
    private final o f6357b;

    /* renamed from: c, reason: collision with root package name */
    private l f6358c;

    z2(u2 u2Var, o oVar) {
        this.f6356a = u2Var;
        this.f6357b = oVar;
    }

    private l1.s j(byte[] bArr, int r6, int r7) {
        try {
            return this.f6357b.d(n1.a.e0(bArr)).v(new l1.w(new x0.o(r6, r7)));
        } catch (com.google.protobuf.e0 e5) {
            throw p1.b.a("MaybeDocument failed to parse: %s", e5);
        }
    }

    private Map<l1.l, l1.s> k(List<l1.u> list, q.a aVar, int r11) {
        x0.o g5 = aVar.q().g();
        l1.l n4 = aVar.n();
        StringBuilder x4 = p1.g0.x("SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", list.size(), " UNION ");
        x4.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        Object[] objArr = new Object[(list.size() * 9) + 1];
        int r32 = 0;
        for (l1.u uVar : list) {
            String c5 = f.c(uVar);
            int r6 = r32 + 1;
            objArr[r32] = c5;
            int r33 = r6 + 1;
            objArr[r6] = f.f(c5);
            int r5 = r33 + 1;
            objArr[r33] = Integer.valueOf(uVar.s() + 1);
            int r34 = r5 + 1;
            objArr[r5] = Long.valueOf(g5.i());
            int r4 = r34 + 1;
            objArr[r34] = Long.valueOf(g5.i());
            int r35 = r4 + 1;
            objArr[r4] = Integer.valueOf(g5.g());
            int r42 = r35 + 1;
            objArr[r35] = Long.valueOf(g5.i());
            int r36 = r42 + 1;
            objArr[r42] = Integer.valueOf(g5.g());
            objArr[r36] = f.c(n4.t());
            r32 = r36 + 1;
        }
        objArr[r32] = Integer.valueOf(r11);
        final p1.m mVar = new p1.m();
        final HashMap hashMap = new HashMap();
        this.f6356a.E(x4.toString()).b(objArr).e(new p1.n() { // from class: k1.x2
            @Override // p1.n
            public final void accept(Object obj) {
                z2.this.m(mVar, hashMap, (Cursor) obj);
            }
        });
        mVar.b();
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(byte[] bArr, int r22, int r32, Map map) {
        l1.s j4 = j(bArr, r22, r32);
        synchronized (map) {
            map.put(j4.getKey(), j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.concurrent.Executor] */
    /* renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m(p1.m mVar, final Map<l1.l, l1.s> map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int r4 = cursor.getInt(1);
        final int r5 = cursor.getInt(2);
        p1.m mVar2 = mVar;
        if (cursor.isLast()) {
            mVar2 = p1.p.f7051b;
        }
        mVar2.execute(new Runnable() { // from class: k1.w2
            @Override // java.lang.Runnable
            public final void run() {
                z2.this.n(blob, r4, r5, map);
            }
        });
    }

    @Override // k1.f1
    public void a(l lVar) {
        this.f6358c = lVar;
    }

    @Override // k1.f1
    public Map<l1.l, l1.s> b(String str, q.a aVar, int r7) {
        List<l1.u> b5 = this.f6358c.b(str);
        ArrayList arrayList = new ArrayList(b5.size());
        Iterator<l1.u> it = b5.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return k(arrayList, aVar, r7);
        }
        HashMap hashMap = new HashMap();
        int r02 = 0;
        while (r02 < arrayList.size()) {
            int r32 = r02 + 100;
            hashMap.putAll(k(arrayList.subList(r02, Math.min(arrayList.size(), r32)), aVar, r7));
            r02 = r32;
        }
        return p1.g0.s(hashMap, r7, q.a.f6558f);
    }

    @Override // k1.f1
    public l1.s c(l1.l lVar) {
        return f(Collections.singletonList(lVar)).get(lVar);
    }

    @Override // k1.f1
    public void d(l1.s sVar, l1.w wVar) {
        p1.b.d(!wVar.equals(l1.w.f6583f), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        l1.l key = sVar.getKey();
        x0.o g5 = wVar.g();
        this.f6356a.v("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", f.c(key.t()), Integer.valueOf(key.t().s()), Long.valueOf(g5.i()), Integer.valueOf(g5.g()), this.f6357b.l(sVar).a());
        this.f6358c.j(sVar.getKey().r());
    }

    @Override // k1.f1
    public Map<l1.l, l1.s> e(l1.u uVar, q.a aVar) {
        return k(Collections.singletonList(uVar), aVar, Integer.MAX_VALUE);
    }

    @Override // k1.f1
    public Map<l1.l, l1.s> f(Iterable<l1.l> iterable) {
        final HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (l1.l lVar : iterable) {
            arrayList.add(f.c(lVar.t()));
            hashMap.put(lVar, l1.s.q(lVar));
        }
        u2.b bVar = new u2.b(this.f6356a, "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        final p1.m mVar = new p1.m();
        while (bVar.d()) {
            bVar.e().e(new p1.n() { // from class: k1.y2
                @Override // p1.n
                public final void accept(Object obj) {
                    z2.this.l(mVar, hashMap, (Cursor) obj);
                }
            });
        }
        mVar.b();
        return hashMap;
    }

    @Override // k1.f1
    public void removeAll(Collection<l1.l> collection) {
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        c1.c<l1.l, l1.i> a5 = l1.j.a();
        for (l1.l lVar : collection) {
            arrayList.add(f.c(lVar.t()));
            a5 = a5.t(lVar, l1.s.r(lVar, l1.w.f6583f));
        }
        u2.b bVar = new u2.b(this.f6356a, "DELETE FROM remote_documents WHERE path IN (", arrayList, ")");
        while (bVar.d()) {
            bVar.a();
        }
        this.f6358c.f(a5);
    }
}
