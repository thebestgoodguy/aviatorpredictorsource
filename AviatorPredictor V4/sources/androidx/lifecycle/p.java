package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f537a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f538b = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    final void a() {
        this.f538b = true;
        Map<String, Object> map = this.f537a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f537a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        c();
    }

    protected void c() {
    }
}
