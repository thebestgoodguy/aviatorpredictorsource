package kotlinx.coroutines.internal;

import b4.z1;
import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f6456a = true;

    private static final s a(Throwable th, String str) {
        if (f6456a) {
            return new s(th, str);
        }
        if (th != null) {
            throw th;
        }
        c();
        throw new k3.d();
    }

    static /* synthetic */ s b(Throwable th, String str, int r32, Object obj) {
        if ((r32 & 1) != 0) {
            th = null;
        }
        if ((r32 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final Void c() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final z1 d(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return a(th, mainDispatcherFactory.hintOnError());
        }
    }
}
