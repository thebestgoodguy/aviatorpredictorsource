package b4;

import k3.m;

/* loaded from: classes.dex */
public final class d0 {
    public static final <T> Object a(Object obj, n3.d<? super T> dVar) {
        if (obj instanceof z) {
            m.a aVar = k3.m.f6368e;
            Throwable th = ((z) obj).f1086a;
            if (q0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) {
                th = kotlinx.coroutines.internal.x.j(th, (kotlin.coroutines.jvm.internal.e) dVar);
            }
            obj = k3.n.a(th);
        } else {
            m.a aVar2 = k3.m.f6368e;
        }
        return k3.m.a(obj);
    }

    public static final <T> Object b(Object obj, k<?> kVar) {
        Throwable b5 = k3.m.b(obj);
        if (b5 != null) {
            if (q0.d() && (kVar instanceof kotlin.coroutines.jvm.internal.e)) {
                b5 = kotlinx.coroutines.internal.x.j(b5, (kotlin.coroutines.jvm.internal.e) kVar);
            }
            obj = new z(b5, false, 2, null);
        }
        return obj;
    }

    public static final <T> Object c(Object obj, u3.l<? super Throwable, k3.s> lVar) {
        Throwable b5 = k3.m.b(obj);
        return b5 == null ? lVar != null ? new a0(obj, lVar) : obj : new z(b5, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, u3.l lVar, int r22, Object obj2) {
        if ((r22 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
