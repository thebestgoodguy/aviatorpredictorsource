package kotlinx.coroutines.internal;

import k3.m;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f6435a;

    static {
        Object a5;
        try {
            m.a aVar = k3.m.f6368e;
            a5 = k3.m.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            m.a aVar2 = k3.m.f6368e;
            a5 = k3.m.a(k3.n.a(th));
        }
        f6435a = k3.m.d(a5);
    }

    public static final boolean a() {
        return f6435a;
    }
}
