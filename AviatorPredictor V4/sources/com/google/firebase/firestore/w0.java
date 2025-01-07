package com.google.firebase.firestore;

import com.google.firebase.firestore.i;
import com.google.protobuf.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x1.x;

/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final FirebaseFirestore f2767a;

    /* renamed from: b, reason: collision with root package name */
    private final i.a f2768b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2769a;

        static {
            int[] r02 = new int[i.a.values().length];
            f2769a = r02;
            try {
                r02[i.a.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2769a[i.a.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public w0(FirebaseFirestore firebaseFirestore, i.a aVar) {
        this.f2767a = firebaseFirestore;
        this.f2768b = aVar;
    }

    private List<Object> a(x1.a aVar) {
        ArrayList arrayList = new ArrayList(aVar.c0());
        Iterator<x1.x> it = aVar.k().iterator();
        while (it.hasNext()) {
            arrayList.add(f(it.next()));
        }
        return arrayList;
    }

    private Object c(x1.x xVar) {
        l1.f h5 = l1.f.h(xVar.n0());
        l1.l k4 = l1.l.k(xVar.n0());
        l1.f t4 = this.f2767a.t();
        if (!h5.equals(t4)) {
            p1.v.d("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", k4.t(), h5.k(), h5.i(), t4.k(), t4.i());
        }
        return new h(k4, this.f2767a);
    }

    private Object d(x1.x xVar) {
        int r02 = a.f2769a[this.f2768b.ordinal()];
        if (r02 != 1) {
            if (r02 != 2) {
                return null;
            }
            return e(l1.v.a(xVar));
        }
        x1.x b5 = l1.v.b(xVar);
        if (b5 == null) {
            return null;
        }
        return f(b5);
    }

    private Object e(t1 t1Var) {
        return new x0.o(t1Var.Y(), t1Var.X());
    }

    Map<String, Object> b(Map<String, x1.x> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, x1.x> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), f(entry.getValue()));
        }
        return hashMap;
    }

    public Object f(x1.x xVar) {
        switch (l1.y.G(xVar)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(xVar.g0());
            case 2:
                return xVar.q0().equals(x.c.INTEGER_VALUE) ? Long.valueOf(xVar.l0()) : Double.valueOf(xVar.j0());
            case 3:
                return e(xVar.p0());
            case 4:
                return d(xVar);
            case 5:
                return xVar.o0();
            case 6:
                return com.google.firebase.firestore.a.g(xVar.h0());
            case 7:
                return c(xVar);
            case 8:
                return new y(xVar.k0().X(), xVar.k0().Y());
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return a(xVar.f0());
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return b(xVar.m0().X());
            default:
                throw p1.b.a("Unknown value type: " + xVar.q0(), new Object[0]);
        }
    }
}
