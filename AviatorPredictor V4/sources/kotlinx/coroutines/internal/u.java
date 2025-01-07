package kotlinx.coroutines.internal;

import b4.r0;

/* loaded from: classes.dex */
public abstract class u {
    public abstract c<?> a();

    public final boolean b(u uVar) {
        c<?> a5;
        c<?> a6 = a();
        return (a6 == null || (a5 = uVar.a()) == null || a6.f() >= a5.f()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return r0.a(this) + '@' + r0.b(this);
    }
}
