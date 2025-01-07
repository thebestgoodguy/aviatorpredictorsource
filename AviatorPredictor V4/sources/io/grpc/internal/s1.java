package io.grpc.internal;

import b3.n0;

/* loaded from: classes.dex */
public final class s1 extends n0.f {

    /* renamed from: a, reason: collision with root package name */
    private final b3.c f5651a;

    /* renamed from: b, reason: collision with root package name */
    private final b3.u0 f5652b;

    /* renamed from: c, reason: collision with root package name */
    private final b3.v0<?, ?> f5653c;

    public s1(b3.v0<?, ?> v0Var, b3.u0 u0Var, b3.c cVar) {
        this.f5653c = (b3.v0) q0.l.o(v0Var, "method");
        this.f5652b = (b3.u0) q0.l.o(u0Var, "headers");
        this.f5651a = (b3.c) q0.l.o(cVar, "callOptions");
    }

    @Override // b3.n0.f
    public b3.c a() {
        return this.f5651a;
    }

    @Override // b3.n0.f
    public b3.u0 b() {
        return this.f5652b;
    }

    @Override // b3.n0.f
    public b3.v0<?, ?> c() {
        return this.f5653c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1.class != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return q0.i.a(this.f5651a, s1Var.f5651a) && q0.i.a(this.f5652b, s1Var.f5652b) && q0.i.a(this.f5653c, s1Var.f5653c);
    }

    public int hashCode() {
        return q0.i.b(this.f5651a, this.f5652b, this.f5653c);
    }

    public final String toString() {
        return "[method=" + this.f5653c + " headers=" + this.f5652b + " callOptions=" + this.f5651a + "]";
    }
}
