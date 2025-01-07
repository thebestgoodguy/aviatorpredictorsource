package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final l0 f2990a;

    /* renamed from: b, reason: collision with root package name */
    private static final l0 f2991b;

    private static final class b extends l0 {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?> f2992c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j4) {
            return (List) z1.G(obj, j4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j4, int r6) {
            List<L> k4;
            j0 j0Var;
            List<L> f5 = f(obj, j4);
            if (!f5.isEmpty()) {
                if (f2992c.isAssignableFrom(f5.getClass())) {
                    ArrayList arrayList = new ArrayList(f5.size() + r6);
                    arrayList.addAll(f5);
                    j0Var = arrayList;
                } else if (f5 instanceof y1) {
                    j0 j0Var2 = new j0(f5.size() + r6);
                    j0Var2.addAll((y1) f5);
                    j0Var = j0Var2;
                } else {
                    if (!(f5 instanceof g1) || !(f5 instanceof d0.i)) {
                        return f5;
                    }
                    d0.i iVar = (d0.i) f5;
                    if (iVar.n()) {
                        return f5;
                    }
                    k4 = iVar.k(f5.size() + r6);
                }
                z1.V(obj, j4, j0Var);
                return j0Var;
            }
            k4 = f5 instanceof k0 ? new j0(r6) : ((f5 instanceof g1) && (f5 instanceof d0.i)) ? ((d0.i) f5).k(r6) : new ArrayList<>(r6);
            z1.V(obj, j4, k4);
            return k4;
        }

        @Override // com.google.protobuf.l0
        void c(Object obj, long j4) {
            Object unmodifiableList;
            List list = (List) z1.G(obj, j4);
            if (list instanceof k0) {
                unmodifiableList = ((k0) list).a();
            } else {
                if (f2992c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof g1) && (list instanceof d0.i)) {
                    d0.i iVar = (d0.i) list;
                    if (iVar.n()) {
                        iVar.h();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            z1.V(obj, j4, unmodifiableList);
        }

        @Override // com.google.protobuf.l0
        <E> void d(Object obj, Object obj2, long j4) {
            List f5 = f(obj2, j4);
            List g5 = g(obj, j4, f5.size());
            int size = g5.size();
            int size2 = f5.size();
            if (size > 0 && size2 > 0) {
                g5.addAll(f5);
            }
            if (size > 0) {
                f5 = g5;
            }
            z1.V(obj, j4, f5);
        }

        @Override // com.google.protobuf.l0
        <L> List<L> e(Object obj, long j4) {
            return g(obj, j4, 10);
        }
    }

    private static final class c extends l0 {
        private c() {
            super();
        }

        static <E> d0.i<E> f(Object obj, long j4) {
            return (d0.i) z1.G(obj, j4);
        }

        @Override // com.google.protobuf.l0
        void c(Object obj, long j4) {
            f(obj, j4).h();
        }

        @Override // com.google.protobuf.l0
        <E> void d(Object obj, Object obj2, long j4) {
            d0.i f5 = f(obj, j4);
            d0.i f6 = f(obj2, j4);
            int size = f5.size();
            int size2 = f6.size();
            if (size > 0 && size2 > 0) {
                if (!f5.n()) {
                    f5 = f5.k(size2 + size);
                }
                f5.addAll(f6);
            }
            if (size > 0) {
                f6 = f5;
            }
            z1.V(obj, j4, f6);
        }

        @Override // com.google.protobuf.l0
        <L> List<L> e(Object obj, long j4) {
            d0.i f5 = f(obj, j4);
            if (f5.n()) {
                return f5;
            }
            int size = f5.size();
            d0.i k4 = f5.k(size == 0 ? 10 : size * 2);
            z1.V(obj, j4, k4);
            return k4;
        }
    }

    static {
        f2990a = new b();
        f2991b = new c();
    }

    private l0() {
    }

    static l0 a() {
        return f2990a;
    }

    static l0 b() {
        return f2991b;
    }

    abstract void c(Object obj, long j4);

    abstract <L> void d(Object obj, Object obj2, long j4);

    abstract <L> List<L> e(Object obj, long j4);
}
