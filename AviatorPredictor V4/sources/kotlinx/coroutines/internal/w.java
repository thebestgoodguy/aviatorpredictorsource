package kotlinx.coroutines.internal;

import b4.p1;

/* loaded from: classes.dex */
public class w<T> extends b4.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: g, reason: collision with root package name */
    public final n3.d<T> f6463g;

    @Override // b4.w1
    protected final boolean U() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        n3.d<T> dVar = this.f6463g;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // b4.a
    protected void t0(Object obj) {
        n3.d<T> dVar = this.f6463g;
        dVar.resumeWith(b4.d0.a(obj, dVar));
    }

    @Override // b4.w1
    protected void x(Object obj) {
        n3.d b5;
        b5 = o3.c.b(this.f6463g);
        g.c(b5, b4.d0.a(obj, this.f6463g), null, 2, null);
    }

    public final p1 x0() {
        b4.r O = O();
        if (O == null) {
            return null;
        }
        return O.getParent();
    }
}
