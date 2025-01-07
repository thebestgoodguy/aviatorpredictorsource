package com.google.firebase.firestore;

import com.google.firebase.firestore.m;
import com.google.protobuf.e1;
import com.google.protobuf.t1;
import i1.m1;
import i1.n1;
import i1.o1;
import i1.p1;
import i1.q1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m1.a;
import x1.a;
import x1.r;
import x1.x;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    private final l1.f f2760a;

    public v0(l1.f fVar) {
        this.f2760a = fVar;
    }

    private l1.t a(Object obj, n1 n1Var) {
        if (obj.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        x1.x d5 = d(p1.o.c(obj), n1Var);
        if (d5.q0() == x.c.MAP_VALUE) {
            return new l1.t(d5);
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: " + p1.g0.z(obj));
    }

    private List<x1.x> c(List<Object> list) {
        m1 m1Var = new m1(q1.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int r22 = 0; r22 < list.size(); r22++) {
            arrayList.add(b(list.get(r22), m1Var.f().c(r22)));
        }
        return arrayList;
    }

    private x1.x d(Object obj, n1 n1Var) {
        if (obj instanceof Map) {
            return f((Map) obj, n1Var);
        }
        if (obj instanceof m) {
            k((m) obj, n1Var);
            return null;
        }
        if (n1Var.h() != null) {
            n1Var.a(n1Var.h());
        }
        if (!(obj instanceof List)) {
            return j(obj, n1Var);
        }
        if (!n1Var.i() || n1Var.g() == q1.ArrayArgument) {
            return e((List) obj, n1Var);
        }
        throw n1Var.f("Nested arrays are not supported");
    }

    private <T> x1.x e(List<T> list, n1 n1Var) {
        a.b d02 = x1.a.d0();
        Iterator<T> it = list.iterator();
        int r12 = 0;
        while (it.hasNext()) {
            x1.x d5 = d(it.next(), n1Var.c(r12));
            if (d5 == null) {
                d5 = x1.x.r0().O(e1.NULL_VALUE).t();
            }
            d02.D(d5);
            r12++;
        }
        return x1.x.r0().D(d02).t();
    }

    private <K, V> x1.x f(Map<K, V> map, n1 n1Var) {
        x.b L;
        if (map.isEmpty()) {
            if (n1Var.h() != null && !n1Var.h().q()) {
                n1Var.a(n1Var.h());
            }
            L = x1.x.r0().N(x1.r.V());
        } else {
            r.b d02 = x1.r.d0();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (!(entry.getKey() instanceof String)) {
                    throw n1Var.f(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
                }
                String str = (String) entry.getKey();
                x1.x d5 = d(entry.getValue(), n1Var.d(str));
                if (d5 != null) {
                    d02.E(str, d5);
                }
            }
            L = x1.x.r0().L(d02);
        }
        return L.t();
    }

    private x1.x j(Object obj, n1 n1Var) {
        if (obj == null) {
            return x1.x.r0().O(e1.NULL_VALUE).t();
        }
        if (obj instanceof Integer) {
            return x1.x.r0().J(((Integer) obj).intValue()).t();
        }
        if (obj instanceof Long) {
            return x1.x.r0().J(((Long) obj).longValue()).t();
        }
        if (obj instanceof Float) {
            return x1.x.r0().H(((Float) obj).doubleValue()).t();
        }
        if (obj instanceof Double) {
            return x1.x.r0().H(((Double) obj).doubleValue()).t();
        }
        if (obj instanceof Boolean) {
            return x1.x.r0().F(((Boolean) obj).booleanValue()).t();
        }
        if (obj instanceof String) {
            return x1.x.r0().Q((String) obj).t();
        }
        if (obj instanceof Date) {
            return m(new x0.o((Date) obj));
        }
        if (obj instanceof x0.o) {
            return m((x0.o) obj);
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return x1.x.r0().I(b2.a.Z().B(yVar.g()).D(yVar.h())).t();
        }
        if (obj instanceof a) {
            return x1.x.r0().G(((a) obj).i()).t();
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.k() != null) {
                l1.f t4 = hVar.k().t();
                if (!t4.equals(this.f2760a)) {
                    throw n1Var.f(String.format("Document reference is for database %s/%s but should be for database %s/%s", t4.k(), t4.i(), this.f2760a.k(), this.f2760a.i()));
                }
            }
            return x1.x.r0().P(String.format("projects/%s/databases/%s/documents/%s", this.f2760a.k(), this.f2760a.i(), hVar.m())).t();
        }
        if (obj.getClass().isArray()) {
            throw n1Var.f("Arrays are not supported; use a List instead");
        }
        throw n1Var.f("Unsupported type: " + p1.g0.z(obj));
    }

    private void k(m mVar, n1 n1Var) {
        m1.p jVar;
        l1.r h5;
        if (!n1Var.j()) {
            throw n1Var.f(String.format("%s() can only be used with set() and update()", mVar.d()));
        }
        if (n1Var.h() == null) {
            throw n1Var.f(String.format("%s() is not currently supported inside arrays", mVar.d()));
        }
        if (mVar instanceof m.c) {
            if (n1Var.g() == q1.MergeSet) {
                n1Var.a(n1Var.h());
                return;
            } else {
                if (n1Var.g() != q1.Update) {
                    throw n1Var.f("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                }
                p1.b.d(n1Var.h().s() > 0, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                throw n1Var.f("FieldValue.delete() can only appear at the top level of your update data");
            }
        }
        if (mVar instanceof m.e) {
            h5 = n1Var.h();
            jVar = m1.n.d();
        } else {
            if (mVar instanceof m.b) {
                jVar = new a.b(c(((m.b) mVar).h()));
            } else if (mVar instanceof m.a) {
                jVar = new a.C0067a(c(((m.a) mVar).h()));
            } else {
                if (!(mVar instanceof m.d)) {
                    throw p1.b.a("Unknown FieldValue type: %s", p1.g0.z(mVar));
                }
                jVar = new m1.j(h(((m.d) mVar).h()));
            }
            h5 = n1Var.h();
        }
        n1Var.b(h5, jVar);
    }

    private x1.x m(x0.o oVar) {
        return x1.x.r0().R(t1.Z().D(oVar.i()).B((oVar.g() / 1000) * 1000)).t();
    }

    public x1.x b(Object obj, n1 n1Var) {
        return d(p1.o.c(obj), n1Var);
    }

    public o1 g(Object obj, m1.d dVar) {
        m1 m1Var = new m1(q1.MergeSet);
        l1.t a5 = a(obj, m1Var.f());
        if (dVar == null) {
            return m1Var.g(a5);
        }
        for (l1.r rVar : dVar.c()) {
            if (!m1Var.d(rVar)) {
                throw new IllegalArgumentException("Field '" + rVar.toString() + "' is specified in your field mask but not in your input data.");
            }
        }
        return m1Var.h(a5, dVar);
    }

    public x1.x h(Object obj) {
        return i(obj, false);
    }

    public x1.x i(Object obj, boolean z4) {
        m1 m1Var = new m1(z4 ? q1.ArrayArgument : q1.Argument);
        x1.x b5 = b(obj, m1Var.f());
        p1.b.d(b5 != null, "Parsed data should not be null.", new Object[0]);
        p1.b.d(m1Var.e().isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return b5;
    }

    public o1 l(Object obj) {
        m1 m1Var = new m1(q1.Set);
        return m1Var.i(a(obj, m1Var.f()));
    }

    public p1 n(Map<String, Object> map) {
        p1.x.c(map, "Provided update data must not be null.");
        m1 m1Var = new m1(q1.Update);
        n1 f5 = m1Var.f();
        l1.t tVar = new l1.t();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            l1.r c5 = l.b(entry.getKey()).c();
            Object value = entry.getValue();
            if (value instanceof m.c) {
                f5.a(c5);
            } else {
                x1.x b5 = b(value, f5.e(c5));
                if (b5 != null) {
                    f5.a(c5);
                    tVar.l(c5, b5);
                }
            }
        }
        return m1Var.j(tVar);
    }
}
