package b4;

import b4.b1;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class c1 extends a1 {
    protected abstract Thread k0();

    protected final void l0(long j4, b1.a aVar) {
        if (q0.a()) {
            if (!(this != s0.f1047k)) {
                throw new AssertionError();
            }
        }
        s0.f1047k.x0(j4, aVar);
    }

    protected final void m0() {
        Thread k02 = k0();
        if (Thread.currentThread() != k02) {
            c.a();
            LockSupport.unpark(k02);
        }
    }
}
