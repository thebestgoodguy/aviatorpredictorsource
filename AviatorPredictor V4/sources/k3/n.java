package k3;

import k3.m;

/* loaded from: classes.dex */
public final class n {
    public static final Object a(Throwable th) {
        kotlin.jvm.internal.i.d(th, "exception");
        return new m.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof m.b) {
            throw ((m.b) obj).f6369e;
        }
    }
}
