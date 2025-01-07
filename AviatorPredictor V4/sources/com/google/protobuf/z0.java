package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.h0;
import com.google.protobuf.w;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class z0<T> implements n1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f3166a;

    /* renamed from: b, reason: collision with root package name */
    private final v1<?, ?> f3167b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3168c;

    /* renamed from: d, reason: collision with root package name */
    private final s<?> f3169d;

    private z0(v1<?, ?> v1Var, s<?> sVar, v0 v0Var) {
        this.f3167b = v1Var;
        this.f3168c = sVar.e(v0Var);
        this.f3169d = sVar;
        this.f3166a = v0Var;
    }

    private <UT, UB> int k(v1<UT, UB> v1Var, T t4) {
        return v1Var.i(v1Var.g(t4));
    }

    private <UT, UB, ET extends w.b<ET>> void l(v1<UT, UB> v1Var, s<ET> sVar, T t4, l1 l1Var, r rVar) {
        UB f5 = v1Var.f(t4);
        w<ET> d5 = sVar.d(t4);
        do {
            try {
                if (l1Var.O() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                v1Var.o(t4, f5);
            }
        } while (n(l1Var, rVar, sVar, d5, v1Var, f5));
    }

    static <T> z0<T> m(v1<?, ?> v1Var, s<?> sVar, v0 v0Var) {
        return new z0<>(v1Var, sVar, v0Var);
    }

    private <UT, UB, ET extends w.b<ET>> boolean n(l1 l1Var, r rVar, s<ET> sVar, w<ET> wVar, v1<UT, UB> v1Var, UB ub) {
        int k4 = l1Var.k();
        if (k4 != b2.f2798a) {
            if (b2.b(k4) != 2) {
                return l1Var.q();
            }
            Object b5 = sVar.b(rVar, this.f3166a, b2.a(k4));
            if (b5 == null) {
                return v1Var.m(ub, l1Var);
            }
            sVar.h(l1Var, b5, rVar, wVar);
            return true;
        }
        int r02 = 0;
        Object obj = null;
        j jVar = null;
        while (l1Var.O() != Integer.MAX_VALUE) {
            int k5 = l1Var.k();
            if (k5 == b2.f2800c) {
                r02 = l1Var.i();
                obj = sVar.b(rVar, this.f3166a, r02);
            } else if (k5 == b2.f2801d) {
                if (obj != null) {
                    sVar.h(l1Var, obj, rVar, wVar);
                } else {
                    jVar = l1Var.e();
                }
            } else if (!l1Var.q()) {
                break;
            }
        }
        if (l1Var.k() != b2.f2799b) {
            throw e0.b();
        }
        if (jVar != null) {
            if (obj != null) {
                sVar.i(jVar, obj, rVar, wVar);
            } else {
                v1Var.d(ub, r02, jVar);
            }
        }
        return true;
    }

    private <UT, UB> void o(v1<UT, UB> v1Var, T t4, c2 c2Var) {
        v1Var.s(v1Var.g(t4), c2Var);
    }

    @Override // com.google.protobuf.n1
    public void a(T t4, T t5) {
        p1.G(this.f3167b, t4, t5);
        if (this.f3168c) {
            p1.E(this.f3169d, t4, t5);
        }
    }

    @Override // com.google.protobuf.n1
    public final boolean b(T t4) {
        return this.f3169d.c(t4).p();
    }

    @Override // com.google.protobuf.n1
    public void c(T t4, l1 l1Var, r rVar) {
        l(this.f3167b, this.f3169d, t4, l1Var, rVar);
    }

    @Override // com.google.protobuf.n1
    public boolean d(T t4, T t5) {
        if (!this.f3167b.g(t4).equals(this.f3167b.g(t5))) {
            return false;
        }
        if (this.f3168c) {
            return this.f3169d.c(t4).equals(this.f3169d.c(t5));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[EDGE_INSN: B:24:0x00cb->B:25:0x00cb BREAK  A[LOOP:1: B:10:0x006d->B:18:0x006d], SYNTHETIC] */
    @Override // com.google.protobuf.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(T r11, byte[] r12, int r13, int r14, com.google.protobuf.f.b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.a0 r0 = (com.google.protobuf.a0) r0
            com.google.protobuf.w1 r1 = r0.unknownFields
            com.google.protobuf.w1 r2 = com.google.protobuf.w1.c()
            if (r1 != r2) goto L11
            com.google.protobuf.w1 r1 = com.google.protobuf.w1.j()
            r0.unknownFields = r1
        L11:
            com.google.protobuf.a0$c r11 = (com.google.protobuf.a0.c) r11
            com.google.protobuf.w r11 = r11.T()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.protobuf.f.I(r12, r13, r15)
            int r13 = r15.f2862a
            int r3 = com.google.protobuf.b2.f2798a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.protobuf.b2.b(r13)
            if (r3 != r5) goto L66
            com.google.protobuf.s<?> r2 = r10.f3169d
            com.google.protobuf.r r3 = r15.f2865d
            com.google.protobuf.v0 r5 = r10.f3166a
            int r6 = com.google.protobuf.b2.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.a0$e r8 = (com.google.protobuf.a0.e) r8
            if (r8 == 0) goto L5b
            com.google.protobuf.i1 r13 = com.google.protobuf.i1.a()
            com.google.protobuf.v0 r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.n1 r13 = r13.d(r2)
            int r13 = com.google.protobuf.f.p(r13, r12, r4, r14, r15)
            com.google.protobuf.a0$d r2 = r8.f2786b
            java.lang.Object r3 = r15.f2864c
            r11.x(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.f.G(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.protobuf.f.N(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.protobuf.f.I(r12, r4, r15)
            int r6 = r15.f2862a
            int r7 = com.google.protobuf.b2.a(r6)
            int r8 = com.google.protobuf.b2.b(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.protobuf.i1 r6 = com.google.protobuf.i1.a()
            com.google.protobuf.v0 r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.n1 r6 = r6.d(r7)
            int r4 = com.google.protobuf.f.p(r6, r12, r4, r14, r15)
            com.google.protobuf.a0$d r6 = r2.f2786b
            java.lang.Object r7 = r15.f2864c
            r11.x(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.protobuf.f.b(r12, r4, r15)
            java.lang.Object r3 = r15.f2864c
            com.google.protobuf.j r3 = (com.google.protobuf.j) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.protobuf.f.I(r12, r4, r15)
            int r13 = r15.f2862a
            com.google.protobuf.s<?> r2 = r10.f3169d
            com.google.protobuf.r r6 = r15.f2865d
            com.google.protobuf.v0 r7 = r10.f3166a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.protobuf.a0$e r2 = (com.google.protobuf.a0.e) r2
            goto L6d
        Lc1:
            int r7 = com.google.protobuf.b2.f2799b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.protobuf.f.N(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.protobuf.b2.c(r13, r5)
            r1.m(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.protobuf.e0 r11 = com.google.protobuf.e0.h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z0.e(java.lang.Object, byte[], int, int, com.google.protobuf.f$b):void");
    }

    @Override // com.google.protobuf.n1
    public int f(T t4) {
        int k4 = k(this.f3167b, t4) + 0;
        return this.f3168c ? k4 + this.f3169d.c(t4).j() : k4;
    }

    @Override // com.google.protobuf.n1
    public T g() {
        return (T) this.f3166a.c().K();
    }

    @Override // com.google.protobuf.n1
    public void h(T t4, c2 c2Var) {
        Iterator<Map.Entry<?, Object>> s4 = this.f3169d.c(t4).s();
        while (s4.hasNext()) {
            Map.Entry<?, Object> next = s4.next();
            w.b bVar = (w.b) next.getKey();
            if (bVar.l() != b2.c.MESSAGE || bVar.f() || bVar.m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            c2Var.m(bVar.e(), next instanceof h0.b ? ((h0.b) next).a().e() : next.getValue());
        }
        o(this.f3167b, t4, c2Var);
    }

    @Override // com.google.protobuf.n1
    public void i(T t4) {
        this.f3167b.j(t4);
        this.f3169d.f(t4);
    }

    @Override // com.google.protobuf.n1
    public int j(T t4) {
        int hashCode = this.f3167b.g(t4).hashCode();
        return this.f3168c ? (hashCode * 53) + this.f3169d.c(t4).hashCode() : hashCode;
    }
}
