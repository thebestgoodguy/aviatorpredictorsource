package k1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l1.q;

/* loaded from: classes.dex */
final class u0 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    private c1.c<l1.l, l1.i> f6260a = l1.j.a();

    /* renamed from: b, reason: collision with root package name */
    private l f6261b;

    u0() {
    }

    @Override // k1.f1
    public void a(l lVar) {
        this.f6261b = lVar;
    }

    @Override // k1.f1
    public Map<l1.l, l1.s> b(String str, q.a aVar, int r32) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    @Override // k1.f1
    public l1.s c(l1.l lVar) {
        l1.i p4 = this.f6260a.p(lVar);
        return p4 != null ? p4.a() : l1.s.q(lVar);
    }

    @Override // k1.f1
    public void d(l1.s sVar, l1.w wVar) {
        p1.b.d(this.f6261b != null, "setIndexManager() not called", new Object[0]);
        p1.b.d(!wVar.equals(l1.w.f6583f), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.f6260a = this.f6260a.t(sVar.getKey(), sVar.a().v(wVar));
        this.f6261b.j(sVar.getKey().r());
    }

    @Override // k1.f1
    public Map<l1.l, l1.s> e(l1.u uVar, q.a aVar) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<l1.l, l1.i>> u4 = this.f6260a.u(l1.l.n(uVar.d("")));
        while (u4.hasNext()) {
            Map.Entry<l1.l, l1.i> next = u4.next();
            l1.i value = next.getValue();
            l1.l key = next.getKey();
            if (!uVar.r(key.t())) {
                break;
            }
            if (key.t().s() <= uVar.s() + 1 && q.a.k(value).compareTo(aVar) > 0) {
                hashMap.put(value.getKey(), value.a());
            }
        }
        return hashMap;
    }

    @Override // k1.f1
    public Map<l1.l, l1.s> f(Iterable<l1.l> iterable) {
        HashMap hashMap = new HashMap();
        for (l1.l lVar : iterable) {
            hashMap.put(lVar, c(lVar));
        }
        return hashMap;
    }

    @Override // k1.f1
    public void removeAll(Collection<l1.l> collection) {
        p1.b.d(this.f6261b != null, "setIndexManager() not called", new Object[0]);
        c1.c<l1.l, l1.i> a5 = l1.j.a();
        for (l1.l lVar : collection) {
            this.f6260a = this.f6260a.v(lVar);
            a5 = a5.t(lVar, l1.s.r(lVar, l1.w.f6583f));
        }
        this.f6261b.f(a5);
    }
}
