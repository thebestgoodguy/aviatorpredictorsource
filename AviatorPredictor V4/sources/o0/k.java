package o0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k {
    public static <TResult> TResult a(h<TResult> hVar) {
        w.r.g();
        w.r.j(hVar, "Task must not be null");
        if (hVar.o()) {
            return (TResult) g(hVar);
        }
        m mVar = new m(null);
        h(hVar, mVar);
        mVar.a();
        return (TResult) g(hVar);
    }

    @Deprecated
    public static <TResult> h<TResult> b(Executor executor, Callable<TResult> callable) {
        w.r.j(executor, "Executor must not be null");
        w.r.j(callable, "Callback must not be null");
        f0 f0Var = new f0();
        executor.execute(new g0(f0Var, callable));
        return f0Var;
    }

    public static <TResult> h<TResult> c(Exception exc) {
        f0 f0Var = new f0();
        f0Var.q(exc);
        return f0Var;
    }

    public static <TResult> h<TResult> d(TResult tresult) {
        f0 f0Var = new f0();
        f0Var.r(tresult);
        return f0Var;
    }

    public static h<Void> e(Collection<? extends h<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return d(null);
        }
        Iterator<? extends h<?>> it = collection.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next(), "null tasks are not accepted");
        }
        f0 f0Var = new f0();
        o oVar = new o(collection.size(), f0Var);
        Iterator<? extends h<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            h(it2.next(), oVar);
        }
        return f0Var;
    }

    public static h<Void> f(h<?>... hVarArr) {
        return (hVarArr == null || hVarArr.length == 0) ? d(null) : e(Arrays.asList(hVarArr));
    }

    private static <TResult> TResult g(h<TResult> hVar) {
        if (hVar.p()) {
            return hVar.m();
        }
        if (hVar.n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.l());
    }

    private static <T> void h(h<T> hVar, n<? super T> nVar) {
        Executor executor = j.f6712b;
        hVar.f(executor, nVar);
        hVar.d(executor, nVar);
        hVar.a(executor, nVar);
    }
}
