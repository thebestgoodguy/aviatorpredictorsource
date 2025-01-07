package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f196a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f197b = new CopyOnWriteArrayList<>();

    public b(boolean z4) {
        this.f196a = z4;
    }

    void a(a aVar) {
        this.f197b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f196a;
    }

    public final void d() {
        Iterator<a> it = this.f197b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    void e(a aVar) {
        this.f197b.remove(aVar);
    }

    public final void f(boolean z4) {
        this.f196a = z4;
    }
}
