package b1;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class u implements f1.d, f1.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<f1.b<Object>, Executor>> f672a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue<f1.a<?>> f673b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f674c;

    u(Executor executor) {
        this.f674c = executor;
    }

    private synchronized Set<Map.Entry<f1.b<Object>, Executor>> d(f1.a<?> aVar) {
        ConcurrentHashMap<f1.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f672a.get(aVar.a());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Map.Entry entry, f1.a aVar) {
        ((f1.b) entry.getKey()).a(aVar);
    }

    @Override // f1.c
    public void a(final f1.a<?> aVar) {
        d0.b(aVar);
        synchronized (this) {
            Queue<f1.a<?>> queue = this.f673b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<f1.b<Object>, Executor> entry : d(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: b1.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.e(entry, aVar);
                    }
                });
            }
        }
    }

    void c() {
        Queue<f1.a<?>> queue;
        synchronized (this) {
            queue = this.f673b;
            if (queue != null) {
                this.f673b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<f1.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }
}
