package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import k3.m;
import k3.n;
import k3.s;

/* loaded from: classes.dex */
public abstract class a implements n3.d<Object>, e, Serializable {
    private final n3.d<Object> completion;

    public a(n3.d<Object> dVar) {
        this.completion = dVar;
    }

    public n3.d<s> create(Object obj, n3.d<?> dVar) {
        kotlin.jvm.internal.i.d(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public n3.d<s> create(n3.d<?> dVar) {
        kotlin.jvm.internal.i.d(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        n3.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final n3.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n3.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object c5;
        n3.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            n3.d completion = aVar.getCompletion();
            kotlin.jvm.internal.i.b(completion);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
                c5 = o3.d.c();
            } catch (Throwable th) {
                m.a aVar2 = m.f6368e;
                obj = m.a(n.a(th));
            }
            if (invokeSuspend == c5) {
                return;
            }
            m.a aVar3 = m.f6368e;
            obj = m.a(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(completion instanceof a)) {
                completion.resumeWith(obj);
                return;
            }
            dVar = completion;
        }
    }

    public String toString() {
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        return kotlin.jvm.internal.i.i("Continuation at ", stackTraceElement);
    }
}
