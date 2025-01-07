package io.grpc.internal;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface s extends b3.g0<Object> {

    public interface a {
        void a(long j4);

        void b(Throwable th);
    }

    q c(b3.v0<?, ?> v0Var, b3.u0 u0Var, b3.c cVar, b3.k[] kVarArr);

    void g(a aVar, Executor executor);
}
