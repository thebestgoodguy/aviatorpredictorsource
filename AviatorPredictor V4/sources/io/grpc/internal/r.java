package io.grpc.internal;

/* loaded from: classes.dex */
public interface r extends j2 {

    public enum a {
        PROCESSED,
        REFUSED,
        DROPPED
    }

    void c(b3.u0 u0Var);

    void d(b3.f1 f1Var, a aVar, b3.u0 u0Var);
}
