package com.google.protobuf;

import com.google.protobuf.b2;
import java.util.List;

/* loaded from: classes.dex */
final class l implements l1 {

    /* renamed from: a, reason: collision with root package name */
    private final k f2985a;

    /* renamed from: b, reason: collision with root package name */
    private int f2986b;

    /* renamed from: c, reason: collision with root package name */
    private int f2987c;

    /* renamed from: d, reason: collision with root package name */
    private int f2988d = 0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2989a;

        static {
            int[] r02 = new int[b2.b.values().length];
            f2989a = r02;
            try {
                r02[b2.b.f2809n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2989a[b2.b.f2813r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2989a[b2.b.f2802g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2989a[b2.b.f2815t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2989a[b2.b.f2808m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2989a[b2.b.f2807l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2989a[b2.b.f2803h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2989a[b2.b.f2806k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2989a[b2.b.f2804i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2989a[b2.b.f2812q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2989a[b2.b.f2816u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2989a[b2.b.f2817v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2989a[b2.b.f2818w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2989a[b2.b.f2819x.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2989a[b2.b.f2810o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2989a[b2.b.f2814s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2989a[b2.b.f2805j.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private l(k kVar) {
        k kVar2 = (k) d0.b(kVar, "input");
        this.f2985a = kVar2;
        kVar2.f2936d = this;
    }

    public static l S(k kVar) {
        l lVar = kVar.f2936d;
        return lVar != null ? lVar : new l(kVar);
    }

    private Object T(b2.b bVar, Class<?> cls, r rVar) {
        switch (a.f2989a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(L());
            case 2:
                return e();
            case 3:
                return Double.valueOf(o());
            case 4:
                return Integer.valueOf(g());
            case 5:
                return Integer.valueOf(H());
            case 6:
                return Long.valueOf(n());
            case 7:
                return Float.valueOf(u());
            case 8:
                return Integer.valueOf(j());
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return Long.valueOf(F());
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return A(cls, rVar);
            case 11:
                return Integer.valueOf(w());
            case 12:
                return Long.valueOf(Q());
            case 13:
                return Integer.valueOf(r());
            case 14:
                return Long.valueOf(v());
            case 15:
                return G();
            case 16:
                return Integer.valueOf(i());
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return Long.valueOf(l());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T U(n1<T> n1Var, r rVar) {
        int r02 = this.f2987c;
        this.f2987c = b2.c(b2.a(this.f2986b), 4);
        try {
            T g5 = n1Var.g();
            n1Var.c(g5, this, rVar);
            n1Var.i(g5);
            if (this.f2986b == this.f2987c) {
                return g5;
            }
            throw e0.h();
        } finally {
            this.f2987c = r02;
        }
    }

    private <T> T V(n1<T> n1Var, r rVar) {
        int E = this.f2985a.E();
        k kVar = this.f2985a;
        if (kVar.f2933a >= kVar.f2934b) {
            throw e0.i();
        }
        int n4 = kVar.n(E);
        T g5 = n1Var.g();
        this.f2985a.f2933a++;
        n1Var.c(g5, this, rVar);
        n1Var.i(g5);
        this.f2985a.a(0);
        r5.f2933a--;
        this.f2985a.m(n4);
        return g5;
    }

    private void X(int r22) {
        if (this.f2985a.d() != r22) {
            throw e0.m();
        }
    }

    private void Y(int r22) {
        if (b2.b(this.f2986b) != r22) {
            throw e0.e();
        }
    }

    private void Z(int r12) {
        if ((r12 & 3) != 0) {
            throw e0.h();
        }
    }

    private void a0(int r12) {
        if ((r12 & 7) != 0) {
            throw e0.h();
        }
    }

    @Override // com.google.protobuf.l1
    public <T> T A(Class<T> cls, r rVar) {
        Y(2);
        return (T) V(i1.a().d(cls), rVar);
    }

    @Override // com.google.protobuf.l1
    public void B(List<Long> list) {
        int D;
        int d5;
        int D2;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            int b5 = b2.b(this.f2986b);
            if (b5 == 0) {
                do {
                    m0Var.s(this.f2985a.w());
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D2 = this.f2985a.D();
                    }
                } while (D2 == this.f2986b);
                this.f2988d = D2;
                return;
            }
            if (b5 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                m0Var.s(this.f2985a.w());
            } while (this.f2985a.d() < d5);
        } else {
            int b6 = b2.b(this.f2986b);
            if (b6 == 0) {
                do {
                    list.add(Long.valueOf(this.f2985a.w()));
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D = this.f2985a.D();
                    }
                } while (D == this.f2986b);
                this.f2988d = D;
                return;
            }
            if (b6 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                list.add(Long.valueOf(this.f2985a.w()));
            } while (this.f2985a.d() < d5);
        }
        X(d5);
    }

    @Override // com.google.protobuf.l1
    public void C(List<Boolean> list) {
        int D;
        int d5;
        int D2;
        if (list instanceof h) {
            h hVar = (h) list;
            int b5 = b2.b(this.f2986b);
            if (b5 == 0) {
                do {
                    hVar.s(this.f2985a.o());
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D2 = this.f2985a.D();
                    }
                } while (D2 == this.f2986b);
                this.f2988d = D2;
                return;
            }
            if (b5 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                hVar.s(this.f2985a.o());
            } while (this.f2985a.d() < d5);
        } else {
            int b6 = b2.b(this.f2986b);
            if (b6 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f2985a.o()));
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D = this.f2985a.D();
                    }
                } while (D == this.f2986b);
                this.f2988d = D;
                return;
            }
            if (b6 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                list.add(Boolean.valueOf(this.f2985a.o()));
            } while (this.f2985a.d() < d5);
        }
        X(d5);
    }

    @Override // com.google.protobuf.l1
    public void D(List<Long> list) {
        int D;
        int D2;
        if (!(list instanceof m0)) {
            int b5 = b2.b(this.f2986b);
            if (b5 == 1) {
                do {
                    list.add(Long.valueOf(this.f2985a.y()));
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D = this.f2985a.D();
                    }
                } while (D == this.f2986b);
                this.f2988d = D;
                return;
            }
            if (b5 != 2) {
                throw e0.e();
            }
            int E = this.f2985a.E();
            a0(E);
            int d5 = this.f2985a.d() + E;
            do {
                list.add(Long.valueOf(this.f2985a.y()));
            } while (this.f2985a.d() < d5);
            return;
        }
        m0 m0Var = (m0) list;
        int b6 = b2.b(this.f2986b);
        if (b6 == 1) {
            do {
                m0Var.s(this.f2985a.y());
                if (this.f2985a.e()) {
                    return;
                } else {
                    D2 = this.f2985a.D();
                }
            } while (D2 == this.f2986b);
            this.f2988d = D2;
            return;
        }
        if (b6 != 2) {
            throw e0.e();
        }
        int E2 = this.f2985a.E();
        a0(E2);
        int d6 = this.f2985a.d() + E2;
        do {
            m0Var.s(this.f2985a.y());
        } while (this.f2985a.d() < d6);
    }

    @Override // com.google.protobuf.l1
    public String E() {
        Y(2);
        return this.f2985a.B();
    }

    @Override // com.google.protobuf.l1
    public long F() {
        Y(0);
        return this.f2985a.w();
    }

    @Override // com.google.protobuf.l1
    public String G() {
        Y(2);
        return this.f2985a.C();
    }

    @Override // com.google.protobuf.l1
    public int H() {
        Y(5);
        return this.f2985a.s();
    }

    @Override // com.google.protobuf.l1
    public void I(List<Long> list) {
        int D;
        int D2;
        if (!(list instanceof m0)) {
            int b5 = b2.b(this.f2986b);
            if (b5 == 1) {
                do {
                    list.add(Long.valueOf(this.f2985a.t()));
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D = this.f2985a.D();
                    }
                } while (D == this.f2986b);
                this.f2988d = D;
                return;
            }
            if (b5 != 2) {
                throw e0.e();
            }
            int E = this.f2985a.E();
            a0(E);
            int d5 = this.f2985a.d() + E;
            do {
                list.add(Long.valueOf(this.f2985a.t()));
            } while (this.f2985a.d() < d5);
            return;
        }
        m0 m0Var = (m0) list;
        int b6 = b2.b(this.f2986b);
        if (b6 == 1) {
            do {
                m0Var.s(this.f2985a.t());
                if (this.f2985a.e()) {
                    return;
                } else {
                    D2 = this.f2985a.D();
                }
            } while (D2 == this.f2986b);
            this.f2988d = D2;
            return;
        }
        if (b6 != 2) {
            throw e0.e();
        }
        int E2 = this.f2985a.E();
        a0(E2);
        int d6 = this.f2985a.d() + E2;
        do {
            m0Var.s(this.f2985a.t());
        } while (this.f2985a.d() < d6);
    }

    @Override // com.google.protobuf.l1
    public void J(List<Integer> list) {
        int D;
        int d5;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b5 = b2.b(this.f2986b);
            if (b5 == 0) {
                do {
                    c0Var.r(this.f2985a.v());
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D2 = this.f2985a.D();
                    }
                } while (D2 == this.f2986b);
                this.f2988d = D2;
                return;
            }
            if (b5 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                c0Var.r(this.f2985a.v());
            } while (this.f2985a.d() < d5);
        } else {
            int b6 = b2.b(this.f2986b);
            if (b6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2985a.v()));
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D = this.f2985a.D();
                    }
                } while (D == this.f2986b);
                this.f2988d = D;
                return;
            }
            if (b6 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                list.add(Integer.valueOf(this.f2985a.v()));
            } while (this.f2985a.d() < d5);
        }
        X(d5);
    }

    @Override // com.google.protobuf.l1
    public <T> T K(Class<T> cls, r rVar) {
        Y(3);
        return (T) U(i1.a().d(cls), rVar);
    }

    @Override // com.google.protobuf.l1
    public boolean L() {
        Y(0);
        return this.f2985a.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.l1
    public <T> void M(List<T> list, n1<T> n1Var, r rVar) {
        int D;
        if (b2.b(this.f2986b) != 2) {
            throw e0.e();
        }
        int r02 = this.f2986b;
        do {
            list.add(V(n1Var, rVar));
            if (this.f2985a.e() || this.f2988d != 0) {
                return;
            } else {
                D = this.f2985a.D();
            }
        } while (D == r02);
        this.f2988d = D;
    }

    @Override // com.google.protobuf.l1
    public void N(List<Integer> list) {
        int D;
        int d5;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b5 = b2.b(this.f2986b);
            if (b5 == 0) {
                do {
                    c0Var.r(this.f2985a.r());
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D2 = this.f2985a.D();
                    }
                } while (D2 == this.f2986b);
                this.f2988d = D2;
                return;
            }
            if (b5 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                c0Var.r(this.f2985a.r());
            } while (this.f2985a.d() < d5);
        } else {
            int b6 = b2.b(this.f2986b);
            if (b6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2985a.r()));
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D = this.f2985a.D();
                    }
                } while (D == this.f2986b);
                this.f2988d = D;
                return;
            }
            if (b6 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                list.add(Integer.valueOf(this.f2985a.r()));
            } while (this.f2985a.d() < d5);
        }
        X(d5);
    }

    @Override // com.google.protobuf.l1
    public int O() {
        int r02 = this.f2988d;
        if (r02 != 0) {
            this.f2986b = r02;
            this.f2988d = 0;
        } else {
            this.f2986b = this.f2985a.D();
        }
        int r03 = this.f2986b;
        if (r03 == 0 || r03 == this.f2987c) {
            return Integer.MAX_VALUE;
        }
        return b2.a(r03);
    }

    @Override // com.google.protobuf.l1
    public void P(List<String> list) {
        W(list, false);
    }

    @Override // com.google.protobuf.l1
    public long Q() {
        Y(1);
        return this.f2985a.y();
    }

    @Override // com.google.protobuf.l1
    public <T> T R(n1<T> n1Var, r rVar) {
        Y(2);
        return (T) V(n1Var, rVar);
    }

    public void W(List<String> list, boolean z4) {
        int D;
        int D2;
        if (b2.b(this.f2986b) != 2) {
            throw e0.e();
        }
        if (!(list instanceof k0) || z4) {
            do {
                list.add(z4 ? G() : E());
                if (this.f2985a.e()) {
                    return;
                } else {
                    D = this.f2985a.D();
                }
            } while (D == this.f2986b);
            this.f2988d = D;
            return;
        }
        k0 k0Var = (k0) list;
        do {
            k0Var.l(e());
            if (this.f2985a.e()) {
                return;
            } else {
                D2 = this.f2985a.D();
            }
        } while (D2 == this.f2986b);
        this.f2988d = D2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void a(java.util.Map<K, V> r8, com.google.protobuf.o0.a<K, V> r9, com.google.protobuf.r r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.protobuf.k r1 = r7.f2985a
            int r1 = r1.E()
            com.google.protobuf.k r2 = r7.f2985a
            int r1 = r2.n(r1)
            K r2 = r9.f3033b
            V r3 = r9.f3035d
        L14:
            int r4 = r7.O()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.k r5 = r7.f2985a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.q()     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.e0 r4 = new com.google.protobuf.e0     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.b2$b r4 = r9.f3034c     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            V r5 = r9.f3035d     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.b2$b r4 = r9.f3032a     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.q()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.e0 r8 = new com.google.protobuf.e0     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.k r8 = r7.f2985a
            r8.m(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.k r9 = r7.f2985a
            r9.m(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l.a(java.util.Map, com.google.protobuf.o0$a, com.google.protobuf.r):void");
    }

    @Override // com.google.protobuf.l1
    public void b(List<Long> list) {
        int D;
        int d5;
        int D2;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            int b5 = b2.b(this.f2986b);
            if (b5 == 0) {
                do {
                    m0Var.s(this.f2985a.F());
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D2 = this.f2985a.D();
                    }
                } while (D2 == this.f2986b);
                this.f2988d = D2;
                return;
            }
            if (b5 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                m0Var.s(this.f2985a.F());
            } while (this.f2985a.d() < d5);
        } else {
            int b6 = b2.b(this.f2986b);
            if (b6 == 0) {
                do {
                    list.add(Long.valueOf(this.f2985a.F()));
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D = this.f2985a.D();
                    }
                } while (D == this.f2986b);
                this.f2988d = D;
                return;
            }
            if (b6 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                list.add(Long.valueOf(this.f2985a.F()));
            } while (this.f2985a.d() < d5);
        }
        X(d5);
    }

    @Override // com.google.protobuf.l1
    public void c(List<String> list) {
        W(list, true);
    }

    @Override // com.google.protobuf.l1
    public <T> T d(n1<T> n1Var, r rVar) {
        Y(3);
        return (T) U(n1Var, rVar);
    }

    @Override // com.google.protobuf.l1
    public j e() {
        Y(2);
        return this.f2985a.p();
    }

    @Override // com.google.protobuf.l1
    public void f(List<Integer> list) {
        int D;
        int d5;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b5 = b2.b(this.f2986b);
            if (b5 == 0) {
                do {
                    c0Var.r(this.f2985a.z());
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D2 = this.f2985a.D();
                    }
                } while (D2 == this.f2986b);
                this.f2988d = D2;
                return;
            }
            if (b5 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                c0Var.r(this.f2985a.z());
            } while (this.f2985a.d() < d5);
        } else {
            int b6 = b2.b(this.f2986b);
            if (b6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2985a.z()));
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D = this.f2985a.D();
                    }
                } while (D == this.f2986b);
                this.f2988d = D;
                return;
            }
            if (b6 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                list.add(Integer.valueOf(this.f2985a.z()));
            } while (this.f2985a.d() < d5);
        }
        X(d5);
    }

    @Override // com.google.protobuf.l1
    public int g() {
        Y(0);
        return this.f2985a.r();
    }

    @Override // com.google.protobuf.l1
    public void h(List<Float> list) {
        int D;
        int D2;
        if (!(list instanceof y)) {
            int b5 = b2.b(this.f2986b);
            if (b5 == 2) {
                int E = this.f2985a.E();
                Z(E);
                int d5 = this.f2985a.d() + E;
                do {
                    list.add(Float.valueOf(this.f2985a.u()));
                } while (this.f2985a.d() < d5);
                return;
            }
            if (b5 != 5) {
                throw e0.e();
            }
            do {
                list.add(Float.valueOf(this.f2985a.u()));
                if (this.f2985a.e()) {
                    return;
                } else {
                    D = this.f2985a.D();
                }
            } while (D == this.f2986b);
            this.f2988d = D;
            return;
        }
        y yVar = (y) list;
        int b6 = b2.b(this.f2986b);
        if (b6 == 2) {
            int E2 = this.f2985a.E();
            Z(E2);
            int d6 = this.f2985a.d() + E2;
            do {
                yVar.r(this.f2985a.u());
            } while (this.f2985a.d() < d6);
            return;
        }
        if (b6 != 5) {
            throw e0.e();
        }
        do {
            yVar.r(this.f2985a.u());
            if (this.f2985a.e()) {
                return;
            } else {
                D2 = this.f2985a.D();
            }
        } while (D2 == this.f2986b);
        this.f2988d = D2;
    }

    @Override // com.google.protobuf.l1
    public int i() {
        Y(0);
        return this.f2985a.E();
    }

    @Override // com.google.protobuf.l1
    public int j() {
        Y(0);
        return this.f2985a.v();
    }

    @Override // com.google.protobuf.l1
    public int k() {
        return this.f2986b;
    }

    @Override // com.google.protobuf.l1
    public long l() {
        Y(0);
        return this.f2985a.F();
    }

    @Override // com.google.protobuf.l1
    public void m(List<Integer> list) {
        int D;
        int D2;
        if (!(list instanceof c0)) {
            int b5 = b2.b(this.f2986b);
            if (b5 == 2) {
                int E = this.f2985a.E();
                Z(E);
                int d5 = this.f2985a.d() + E;
                do {
                    list.add(Integer.valueOf(this.f2985a.s()));
                } while (this.f2985a.d() < d5);
                return;
            }
            if (b5 != 5) {
                throw e0.e();
            }
            do {
                list.add(Integer.valueOf(this.f2985a.s()));
                if (this.f2985a.e()) {
                    return;
                } else {
                    D = this.f2985a.D();
                }
            } while (D == this.f2986b);
            this.f2988d = D;
            return;
        }
        c0 c0Var = (c0) list;
        int b6 = b2.b(this.f2986b);
        if (b6 == 2) {
            int E2 = this.f2985a.E();
            Z(E2);
            int d6 = this.f2985a.d() + E2;
            do {
                c0Var.r(this.f2985a.s());
            } while (this.f2985a.d() < d6);
            return;
        }
        if (b6 != 5) {
            throw e0.e();
        }
        do {
            c0Var.r(this.f2985a.s());
            if (this.f2985a.e()) {
                return;
            } else {
                D2 = this.f2985a.D();
            }
        } while (D2 == this.f2986b);
        this.f2988d = D2;
    }

    @Override // com.google.protobuf.l1
    public long n() {
        Y(1);
        return this.f2985a.t();
    }

    @Override // com.google.protobuf.l1
    public double o() {
        Y(1);
        return this.f2985a.q();
    }

    @Override // com.google.protobuf.l1
    public void p(List<Integer> list) {
        int D;
        int D2;
        if (!(list instanceof c0)) {
            int b5 = b2.b(this.f2986b);
            if (b5 == 2) {
                int E = this.f2985a.E();
                Z(E);
                int d5 = this.f2985a.d() + E;
                do {
                    list.add(Integer.valueOf(this.f2985a.x()));
                } while (this.f2985a.d() < d5);
                return;
            }
            if (b5 != 5) {
                throw e0.e();
            }
            do {
                list.add(Integer.valueOf(this.f2985a.x()));
                if (this.f2985a.e()) {
                    return;
                } else {
                    D = this.f2985a.D();
                }
            } while (D == this.f2986b);
            this.f2988d = D;
            return;
        }
        c0 c0Var = (c0) list;
        int b6 = b2.b(this.f2986b);
        if (b6 == 2) {
            int E2 = this.f2985a.E();
            Z(E2);
            int d6 = this.f2985a.d() + E2;
            do {
                c0Var.r(this.f2985a.x());
            } while (this.f2985a.d() < d6);
            return;
        }
        if (b6 != 5) {
            throw e0.e();
        }
        do {
            c0Var.r(this.f2985a.x());
            if (this.f2985a.e()) {
                return;
            } else {
                D2 = this.f2985a.D();
            }
        } while (D2 == this.f2986b);
        this.f2988d = D2;
    }

    @Override // com.google.protobuf.l1
    public boolean q() {
        int r02;
        if (this.f2985a.e() || (r02 = this.f2986b) == this.f2987c) {
            return false;
        }
        return this.f2985a.H(r02);
    }

    @Override // com.google.protobuf.l1
    public int r() {
        Y(0);
        return this.f2985a.z();
    }

    @Override // com.google.protobuf.l1
    public void s(List<Long> list) {
        int D;
        int d5;
        int D2;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            int b5 = b2.b(this.f2986b);
            if (b5 == 0) {
                do {
                    m0Var.s(this.f2985a.A());
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D2 = this.f2985a.D();
                    }
                } while (D2 == this.f2986b);
                this.f2988d = D2;
                return;
            }
            if (b5 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                m0Var.s(this.f2985a.A());
            } while (this.f2985a.d() < d5);
        } else {
            int b6 = b2.b(this.f2986b);
            if (b6 == 0) {
                do {
                    list.add(Long.valueOf(this.f2985a.A()));
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D = this.f2985a.D();
                    }
                } while (D == this.f2986b);
                this.f2988d = D;
                return;
            }
            if (b6 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                list.add(Long.valueOf(this.f2985a.A()));
            } while (this.f2985a.d() < d5);
        }
        X(d5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.l1
    public <T> void t(List<T> list, n1<T> n1Var, r rVar) {
        int D;
        if (b2.b(this.f2986b) != 3) {
            throw e0.e();
        }
        int r02 = this.f2986b;
        do {
            list.add(U(n1Var, rVar));
            if (this.f2985a.e() || this.f2988d != 0) {
                return;
            } else {
                D = this.f2985a.D();
            }
        } while (D == r02);
        this.f2988d = D;
    }

    @Override // com.google.protobuf.l1
    public float u() {
        Y(5);
        return this.f2985a.u();
    }

    @Override // com.google.protobuf.l1
    public long v() {
        Y(0);
        return this.f2985a.A();
    }

    @Override // com.google.protobuf.l1
    public int w() {
        Y(5);
        return this.f2985a.x();
    }

    @Override // com.google.protobuf.l1
    public void x(List<j> list) {
        int D;
        if (b2.b(this.f2986b) != 2) {
            throw e0.e();
        }
        do {
            list.add(e());
            if (this.f2985a.e()) {
                return;
            } else {
                D = this.f2985a.D();
            }
        } while (D == this.f2986b);
        this.f2988d = D;
    }

    @Override // com.google.protobuf.l1
    public void y(List<Integer> list) {
        int D;
        int d5;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b5 = b2.b(this.f2986b);
            if (b5 == 0) {
                do {
                    c0Var.r(this.f2985a.E());
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D2 = this.f2985a.D();
                    }
                } while (D2 == this.f2986b);
                this.f2988d = D2;
                return;
            }
            if (b5 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                c0Var.r(this.f2985a.E());
            } while (this.f2985a.d() < d5);
        } else {
            int b6 = b2.b(this.f2986b);
            if (b6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2985a.E()));
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D = this.f2985a.D();
                    }
                } while (D == this.f2986b);
                this.f2988d = D;
                return;
            }
            if (b6 != 2) {
                throw e0.e();
            }
            d5 = this.f2985a.d() + this.f2985a.E();
            do {
                list.add(Integer.valueOf(this.f2985a.E()));
            } while (this.f2985a.d() < d5);
        }
        X(d5);
    }

    @Override // com.google.protobuf.l1
    public void z(List<Double> list) {
        int D;
        int D2;
        if (!(list instanceof o)) {
            int b5 = b2.b(this.f2986b);
            if (b5 == 1) {
                do {
                    list.add(Double.valueOf(this.f2985a.q()));
                    if (this.f2985a.e()) {
                        return;
                    } else {
                        D = this.f2985a.D();
                    }
                } while (D == this.f2986b);
                this.f2988d = D;
                return;
            }
            if (b5 != 2) {
                throw e0.e();
            }
            int E = this.f2985a.E();
            a0(E);
            int d5 = this.f2985a.d() + E;
            do {
                list.add(Double.valueOf(this.f2985a.q()));
            } while (this.f2985a.d() < d5);
            return;
        }
        o oVar = (o) list;
        int b6 = b2.b(this.f2986b);
        if (b6 == 1) {
            do {
                oVar.r(this.f2985a.q());
                if (this.f2985a.e()) {
                    return;
                } else {
                    D2 = this.f2985a.D();
                }
            } while (D2 == this.f2986b);
            this.f2988d = D2;
            return;
        }
        if (b6 != 2) {
            throw e0.e();
        }
        int E2 = this.f2985a.E();
        a0(E2);
        int d6 = this.f2985a.d() + E2;
        do {
            oVar.r(this.f2985a.q());
        } while (this.f2985a.d() < d6);
    }
}
