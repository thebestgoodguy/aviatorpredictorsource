package com.google.protobuf;

/* loaded from: classes.dex */
class x1 extends v1<w1, w1> {
    x1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public w1 g(Object obj) {
        return ((a0) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(w1 w1Var) {
        return w1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(w1 w1Var) {
        return w1Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public w1 k(w1 w1Var, w1 w1Var2) {
        return w1Var2.equals(w1.c()) ? w1Var : w1.i(w1Var, w1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public w1 n() {
        return w1.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, w1 w1Var) {
        p(obj, w1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, w1 w1Var) {
        ((a0) obj).unknownFields = w1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public w1 r(w1 w1Var) {
        w1Var.h();
        return w1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(w1 w1Var, c2 c2Var) {
        w1Var.o(c2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(w1 w1Var, c2 c2Var) {
        w1Var.q(c2Var);
    }

    @Override // com.google.protobuf.v1
    void j(Object obj) {
        g(obj).h();
    }

    @Override // com.google.protobuf.v1
    boolean q(l1 l1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(w1 w1Var, int r32, int r4) {
        w1Var.m(b2.c(r32, 5), Integer.valueOf(r4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(w1 w1Var, int r32, long j4) {
        w1Var.m(b2.c(r32, 1), Long.valueOf(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(w1 w1Var, int r32, w1 w1Var2) {
        w1Var.m(b2.c(r32, 3), w1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(w1 w1Var, int r32, j jVar) {
        w1Var.m(b2.c(r32, 2), jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(w1 w1Var, int r32, long j4) {
        w1Var.m(b2.c(r32, 0), Long.valueOf(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public w1 f(Object obj) {
        w1 g5 = g(obj);
        if (g5 != w1.c()) {
            return g5;
        }
        w1 j4 = w1.j();
        p(obj, j4);
        return j4;
    }
}
