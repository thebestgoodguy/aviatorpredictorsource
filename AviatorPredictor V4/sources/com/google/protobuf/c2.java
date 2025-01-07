package com.google.protobuf;

import com.google.protobuf.o0;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
interface c2 {

    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int r12, List<Long> list, boolean z4);

    void B(int r12, List<Integer> list, boolean z4);

    void C(int r12, int r22);

    void D(int r12, List<Long> list, boolean z4);

    void E(int r12, int r22);

    void F(int r12, List<Integer> list, boolean z4);

    void G(int r12, double d5);

    void H(int r12, List<Double> list, boolean z4);

    void I(int r12, long j4);

    void J(int r12, List<Long> list, boolean z4);

    void K(int r12, int r22);

    void L(int r12, List<j> list);

    void M(int r12, List<Integer> list, boolean z4);

    void N(int r12, List<Long> list, boolean z4);

    void O(int r12, List<Boolean> list, boolean z4);

    void a(int r12, List<?> list, n1 n1Var);

    void b(int r12, Object obj, n1 n1Var);

    @Deprecated
    void c(int r12, List<?> list, n1 n1Var);

    <K, V> void d(int r12, o0.a<K, V> aVar, Map<K, V> map);

    void e(int r12, List<Integer> list, boolean z4);

    void f(int r12, List<Float> list, boolean z4);

    void g(int r12, List<Integer> list, boolean z4);

    void h(int r12, long j4);

    void i(int r12, List<Long> list, boolean z4);

    void j(int r12, boolean z4);

    void k(int r12, long j4);

    void l(int r12, int r22);

    void m(int r12, Object obj);

    a n();

    @Deprecated
    void o(int r12, Object obj, n1 n1Var);

    void p(int r12, long j4);

    void q(int r12, float f5);

    void r(int r12, List<String> list);

    void s(int r12, int r22);

    @Deprecated
    void t(int r12);

    @Deprecated
    void u(int r12);

    void v(int r12, j jVar);

    void w(int r12, String str);

    void x(int r12, int r22);

    void y(int r12, List<Integer> list, boolean z4);

    void z(int r12, long j4);
}
