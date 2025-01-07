package l1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import x1.r;
import x1.x;

/* loaded from: classes.dex */
public final class t implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private x1.x f6580e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, Object> f6581f;

    public t() {
        this(x1.x.r0().N(x1.r.V()).t());
    }

    public t(x1.x xVar) {
        this.f6581f = new HashMap();
        p1.b.d(xVar.q0() == x.c.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        p1.b.d(!v.c(xVar), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f6580e = xVar;
    }

    private x1.r a(r rVar, Map<String, Object> map) {
        x1.x f5 = f(this.f6580e, rVar);
        r.b e5 = y.w(f5) ? f5.m0().e() : x1.r.d0();
        boolean z4 = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                x1.r a5 = a(rVar.d(key), (Map) value);
                if (a5 != null) {
                    e5.E(key, x1.x.r0().N(a5).t());
                    z4 = true;
                }
            } else {
                if (value instanceof x1.x) {
                    e5.E(key, (x1.x) value);
                } else if (e5.B(key)) {
                    p1.b.d(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                    e5.F(key);
                }
                z4 = true;
            }
        }
        if (z4) {
            return e5.t();
        }
        return null;
    }

    private x1.x b() {
        synchronized (this.f6581f) {
            x1.r a5 = a(r.f6564g, this.f6581f);
            if (a5 != null) {
                this.f6580e = x1.x.r0().N(a5).t();
                this.f6581f.clear();
            }
        }
        return this.f6580e;
    }

    private m1.d e(x1.r rVar) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, x1.x> entry : rVar.X().entrySet()) {
            r y4 = r.y(entry.getKey());
            if (y.w(entry.getValue())) {
                Set<r> c5 = e(entry.getValue().m0()).c();
                if (!c5.isEmpty()) {
                    Iterator<r> it = c5.iterator();
                    while (it.hasNext()) {
                        hashSet.add(y4.g(it.next()));
                    }
                }
            }
            hashSet.add(y4);
        }
        return m1.d.b(hashSet);
    }

    private x1.x f(x1.x xVar, r rVar) {
        if (rVar.q()) {
            return xVar;
        }
        int r02 = 0;
        while (true) {
            int s4 = rVar.s() - 1;
            x1.r m02 = xVar.m0();
            if (r02 >= s4) {
                return m02.Y(rVar.n(), null);
            }
            xVar = m02.Y(rVar.p(r02), null);
            if (!y.w(xVar)) {
                return null;
            }
            r02++;
        }
    }

    public static t g(Map<String, x1.x> map) {
        return new t(x1.x.r0().L(x1.r.d0().D(map)).t());
    }

    private void n(r rVar, x1.x xVar) {
        Map<String, Object> hashMap;
        Map<String, Object> map = this.f6581f;
        for (int r12 = 0; r12 < rVar.s() - 1; r12++) {
            String p4 = rVar.p(r12);
            Object obj = map.get(p4);
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            } else {
                if (obj instanceof x1.x) {
                    x1.x xVar2 = (x1.x) obj;
                    if (xVar2.q0() == x.c.MAP_VALUE) {
                        HashMap hashMap2 = new HashMap(xVar2.m0().X());
                        map.put(p4, hashMap2);
                        map = hashMap2;
                    }
                }
                hashMap = new HashMap<>();
                map.put(p4, hashMap);
            }
            map = hashMap;
        }
        map.put(rVar.n(), xVar);
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t clone() {
        return new t(b());
    }

    public void d(r rVar) {
        p1.b.d(!rVar.q(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        n(rVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return y.q(b(), ((t) obj).b());
        }
        return false;
    }

    public x1.x h(r rVar) {
        return f(b(), rVar);
    }

    public int hashCode() {
        return b().hashCode();
    }

    public m1.d j() {
        return e(b().m0());
    }

    public Map<String, x1.x> k() {
        return b().m0().X();
    }

    public void l(r rVar, x1.x xVar) {
        p1.b.d(!rVar.q(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        n(rVar, xVar);
    }

    public void m(Map<r, x1.x> map) {
        for (Map.Entry<r, x1.x> entry : map.entrySet()) {
            r key = entry.getKey();
            if (entry.getValue() == null) {
                d(key);
            } else {
                l(key, entry.getValue());
            }
        }
    }

    public String toString() {
        return "ObjectValue{internalValue=" + y.b(b()) + '}';
    }
}
