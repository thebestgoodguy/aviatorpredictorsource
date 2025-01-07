package b3;

import b3.y;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class y<T extends y<T>> extends r0<T> {
    protected y() {
    }

    protected abstract r0<?> e();

    @Override // b3.r0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public T c(long j4, TimeUnit timeUnit) {
        e().c(j4, timeUnit);
        return g();
    }

    protected final T g() {
        return this;
    }

    @Override // b3.r0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public T d() {
        e().d();
        return g();
    }

    public String toString() {
        return q0.h.c(this).d("delegate", e()).toString();
    }
}
