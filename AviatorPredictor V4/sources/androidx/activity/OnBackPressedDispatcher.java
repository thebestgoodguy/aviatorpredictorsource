package androidx.activity;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f188a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f189b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements e, androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final d f190a;

        /* renamed from: b, reason: collision with root package name */
        private final b f191b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.a f192c;

        LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.f190a = dVar;
            this.f191b = bVar;
            dVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f190a.c(this);
            this.f191b.e(this);
            androidx.activity.a aVar = this.f192c;
            if (aVar != null) {
                aVar.cancel();
                this.f192c = null;
            }
        }

        @Override // androidx.lifecycle.e
        public void d(g gVar, d.a aVar) {
            if (aVar == d.a.ON_START) {
                this.f192c = OnBackPressedDispatcher.this.b(this.f191b);
                return;
            }
            if (aVar != d.a.ON_STOP) {
                if (aVar == d.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar2 = this.f192c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            }
        }
    }

    private class a implements androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f194a;

        a(b bVar) {
            this.f194a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f189b.remove(this.f194a);
            this.f194a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f188a = runnable;
    }

    public void a(g gVar, b bVar) {
        d b5 = gVar.b();
        if (b5.b() == d.b.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(b5, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f189b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.f189b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f188a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
