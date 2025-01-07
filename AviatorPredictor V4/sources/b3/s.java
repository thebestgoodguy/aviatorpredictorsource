package b3;

import b3.f1;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class s {
    public static f1 a(r rVar) {
        q0.l.o(rVar, "context must not be null");
        if (!rVar.h()) {
            return null;
        }
        Throwable c5 = rVar.c();
        if (c5 == null) {
            return f1.f757g.q("io.grpc.Context was cancelled without error");
        }
        if (c5 instanceof TimeoutException) {
            return f1.f760j.q(c5.getMessage()).p(c5);
        }
        f1 k4 = f1.k(c5);
        return (f1.b.UNKNOWN.equals(k4.m()) && k4.l() == c5) ? f1.f757g.q("Context cancelled").p(c5) : k4.p(c5);
    }
}
