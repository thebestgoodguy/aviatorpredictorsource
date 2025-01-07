package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class k extends d implements kotlin.jvm.internal.f<Object> {
    private final int arity;

    public k(int r22) {
        this(r22, null);
    }

    public k(int r12, n3.d<Object> dVar) {
        super(dVar);
        this.arity = r12;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String d5 = l.d(this);
        kotlin.jvm.internal.i.c(d5, "renderLambdaToString(this)");
        return d5;
    }
}
