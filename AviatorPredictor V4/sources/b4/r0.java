package b4;

import k3.m;

/* loaded from: classes.dex */
public final class r0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(n3.d<?> dVar) {
        Object a5;
        if (dVar instanceof kotlinx.coroutines.internal.f) {
            return dVar.toString();
        }
        try {
            m.a aVar = k3.m.f6368e;
            a5 = k3.m.a(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            m.a aVar2 = k3.m.f6368e;
            a5 = k3.m.a(k3.n.a(th));
        }
        if (k3.m.b(a5) != null) {
            a5 = ((Object) dVar.getClass().getName()) + '@' + b(dVar);
        }
        return (String) a5;
    }
}
