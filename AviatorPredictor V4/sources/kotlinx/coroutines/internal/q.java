package kotlinx.coroutines.internal;

import b4.z1;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f6453a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f6454b;

    /* renamed from: c, reason: collision with root package name */
    public static final z1 f6455c;

    static {
        q qVar = new q();
        f6453a = qVar;
        f6454b = z.e("kotlinx.coroutines.fast.service.loader", true);
        f6455c = qVar.a();
    }

    private q() {
    }

    private final z1 a() {
        z3.b a5;
        List<MainDispatcherFactory> e5;
        Object next;
        try {
            if (f6454b) {
                e5 = i.f6434a.c();
            } else {
                a5 = z3.f.a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator());
                e5 = z3.h.e(a5);
            }
            Iterator<T> it = e5.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return mainDispatcherFactory == null ? r.b(null, null, 3, null) : r.d(mainDispatcherFactory, e5);
        } catch (Throwable th) {
            return r.b(th, null, 2, null);
        }
    }
}
