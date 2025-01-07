package com.google.protobuf;

import com.google.protobuf.a0;
import com.google.protobuf.b2;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class t extends s<a0.d> {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3078a;

        static {
            int[] r02 = new int[b2.b.values().length];
            f3078a = r02;
            try {
                r02[b2.b.f2802g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3078a[b2.b.f2803h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3078a[b2.b.f2804i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3078a[b2.b.f2805j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3078a[b2.b.f2806k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3078a[b2.b.f2807l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3078a[b2.b.f2808m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3078a[b2.b.f2809n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3078a[b2.b.f2814s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3078a[b2.b.f2816u.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3078a[b2.b.f2817v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3078a[b2.b.f2818w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3078a[b2.b.f2819x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3078a[b2.b.f2815t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3078a[b2.b.f2813r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3078a[b2.b.f2810o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3078a[b2.b.f2811p.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3078a[b2.b.f2812q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    t() {
    }

    @Override // com.google.protobuf.s
    int a(Map.Entry<?, ?> entry) {
        return ((a0.d) entry.getKey()).e();
    }

    @Override // com.google.protobuf.s
    Object b(r rVar, v0 v0Var, int r32) {
        return rVar.a(v0Var, r32);
    }

    @Override // com.google.protobuf.s
    w<a0.d> c(Object obj) {
        return ((a0.c) obj).extensions;
    }

    @Override // com.google.protobuf.s
    w<a0.d> d(Object obj) {
        return ((a0.c) obj).T();
    }

    @Override // com.google.protobuf.s
    boolean e(v0 v0Var) {
        return v0Var instanceof a0.c;
    }

    @Override // com.google.protobuf.s
    void f(Object obj) {
        c(obj).t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018f  */
    @Override // com.google.protobuf.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    <UT, UB> UB g(com.google.protobuf.l1 r5, java.lang.Object r6, com.google.protobuf.r r7, com.google.protobuf.w<com.google.protobuf.a0.d> r8, UB r9, com.google.protobuf.v1<UT, UB> r10) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t.g(com.google.protobuf.l1, java.lang.Object, com.google.protobuf.r, com.google.protobuf.w, java.lang.Object, com.google.protobuf.v1):java.lang.Object");
    }

    @Override // com.google.protobuf.s
    void h(l1 l1Var, Object obj, r rVar, w<a0.d> wVar) {
        a0.e eVar = (a0.e) obj;
        wVar.x(eVar.f2786b, l1Var.A(eVar.b().getClass(), rVar));
    }

    @Override // com.google.protobuf.s
    void i(j jVar, Object obj, r rVar, w<a0.d> wVar) {
        a0.e eVar = (a0.e) obj;
        v0 K = eVar.b().c().K();
        g S = g.S(ByteBuffer.wrap(jVar.N()), true);
        i1.a().b(K, S, rVar);
        wVar.x(eVar.f2786b, K);
        if (S.O() != Integer.MAX_VALUE) {
            throw e0.b();
        }
    }

    @Override // com.google.protobuf.s
    void j(c2 c2Var, Map.Entry<?, ?> entry) {
        a0.d dVar = (a0.d) entry.getKey();
        if (!dVar.f()) {
            switch (a.f3078a[dVar.j().ordinal()]) {
                case 1:
                    c2Var.G(dVar.e(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    c2Var.q(dVar.e(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    c2Var.h(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    c2Var.z(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                case 14:
                    c2Var.x(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    c2Var.k(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    c2Var.E(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    c2Var.j(dVar.e(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    c2Var.l(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    c2Var.s(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    c2Var.I(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    c2Var.K(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    c2Var.p(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 15:
                    c2Var.v(dVar.e(), (j) entry.getValue());
                    break;
                case 16:
                    c2Var.w(dVar.e(), (String) entry.getValue());
                    break;
                case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    c2Var.o(dVar.e(), entry.getValue(), i1.a().d(entry.getValue().getClass()));
                    break;
                case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    c2Var.b(dVar.e(), entry.getValue(), i1.a().d(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f3078a[dVar.j().ordinal()]) {
            case 1:
                p1.P(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case 2:
                p1.T(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case 3:
                p1.W(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case 4:
                p1.e0(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case 5:
            case 14:
                p1.V(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case 6:
                p1.S(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case 7:
                p1.R(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case 8:
                p1.N(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                p1.d0(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                p1.Y(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case 11:
                p1.Z(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case 12:
                p1.a0(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case 13:
                p1.b0(dVar.e(), (List) entry.getValue(), c2Var, dVar.m());
                break;
            case 15:
                p1.O(dVar.e(), (List) entry.getValue(), c2Var);
                break;
            case 16:
                p1.c0(dVar.e(), (List) entry.getValue(), c2Var);
                break;
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    p1.U(dVar.e(), (List) entry.getValue(), c2Var, i1.a().d(list.get(0).getClass()));
                    break;
                }
                break;
            case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    p1.X(dVar.e(), (List) entry.getValue(), c2Var, i1.a().d(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
