package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class v0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Set<T> f5690a = Collections.newSetFromMap(new IdentityHashMap());

    public final boolean a(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f5690a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    protected abstract void b();

    protected abstract void c();

    public final boolean d() {
        return !this.f5690a.isEmpty();
    }

    public final void e(T t4, boolean z4) {
        int size = this.f5690a.size();
        if (z4) {
            this.f5690a.add(t4);
            if (size == 0) {
                b();
                return;
            }
            return;
        }
        if (this.f5690a.remove(t4) && size == 1) {
            c();
        }
    }
}
