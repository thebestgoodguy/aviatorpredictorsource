package io.grpc.internal;

import io.grpc.internal.r;

/* loaded from: classes.dex */
public final class f0 extends n1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f5175b;

    /* renamed from: c, reason: collision with root package name */
    private final b3.f1 f5176c;

    /* renamed from: d, reason: collision with root package name */
    private final r.a f5177d;

    /* renamed from: e, reason: collision with root package name */
    private final b3.k[] f5178e;

    public f0(b3.f1 f1Var, r.a aVar, b3.k[] kVarArr) {
        q0.l.e(!f1Var.o(), "error must not be OK");
        this.f5176c = f1Var;
        this.f5177d = aVar;
        this.f5178e = kVarArr;
    }

    public f0(b3.f1 f1Var, b3.k[] kVarArr) {
        this(f1Var, r.a.PROCESSED, kVarArr);
    }

    @Override // io.grpc.internal.n1, io.grpc.internal.q
    public void i(r rVar) {
        q0.l.u(!this.f5175b, "already started");
        this.f5175b = true;
        for (b3.k kVar : this.f5178e) {
            kVar.i(this.f5176c);
        }
        rVar.d(this.f5176c, this.f5177d, new b3.u0());
    }

    @Override // io.grpc.internal.n1, io.grpc.internal.q
    public void l(w0 w0Var) {
        w0Var.b("error", this.f5176c).b("progress", this.f5177d);
    }
}
