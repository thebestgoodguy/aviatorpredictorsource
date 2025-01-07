package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class o<E> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6443a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public o(boolean z4) {
        this._cur = new p(8, z4);
    }

    public final boolean a(E e5) {
        while (true) {
            p pVar = (p) this._cur;
            int a5 = pVar.a(e5);
            if (a5 == 0) {
                return true;
            }
            if (a5 == 1) {
                b4.l.a(f6443a, this, pVar, pVar.i());
            } else if (a5 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            p pVar = (p) this._cur;
            if (pVar.d()) {
                return;
            } else {
                b4.l.a(f6443a, this, pVar, pVar.i());
            }
        }
    }

    public final int c() {
        return ((p) this._cur).f();
    }

    public final E d() {
        while (true) {
            p pVar = (p) this._cur;
            E e5 = (E) pVar.j();
            if (e5 != p.f6447h) {
                return e5;
            }
            b4.l.a(f6443a, this, pVar, pVar.i());
        }
    }
}
