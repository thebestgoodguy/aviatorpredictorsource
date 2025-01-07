package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f505a;

    /* renamed from: b, reason: collision with root package name */
    private final a.C0005a f506b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f505a = obj;
        this.f506b = a.f508c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.a aVar) {
        this.f506b.a(gVar, aVar, this.f505a);
    }
}
