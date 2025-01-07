package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j<R> implements f<R>, Serializable {
    private final int arity;

    public j(int r12) {
        this.arity = r12;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String e5 = l.e(this);
        i.c(e5, "renderLambdaToString(this)");
        return e5;
    }
}
