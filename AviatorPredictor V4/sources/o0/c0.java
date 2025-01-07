package o0;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
final class c0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6698a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue<b0<TResult>> f6699b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6700c;

    c0() {
    }

    public final void a(b0<TResult> b0Var) {
        synchronized (this.f6698a) {
            if (this.f6699b == null) {
                this.f6699b = new ArrayDeque();
            }
            this.f6699b.add(b0Var);
        }
    }

    public final void b(h<TResult> hVar) {
        b0<TResult> poll;
        synchronized (this.f6698a) {
            if (this.f6699b != null && !this.f6700c) {
                this.f6700c = true;
                while (true) {
                    synchronized (this.f6698a) {
                        poll = this.f6699b.poll();
                        if (poll == null) {
                            this.f6700c = false;
                            return;
                        }
                    }
                    poll.a(hVar);
                }
            }
        }
    }
}
