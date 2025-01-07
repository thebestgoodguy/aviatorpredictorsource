package com.google.protobuf;

import com.google.protobuf.w;
import com.google.protobuf.w.b;
import java.util.Map;

/* loaded from: classes.dex */
abstract class s<T extends w.b<T>> {
    s() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(r rVar, v0 v0Var, int r32);

    abstract w<T> c(Object obj);

    abstract w<T> d(Object obj);

    abstract boolean e(v0 v0Var);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(l1 l1Var, Object obj, r rVar, w<T> wVar, UB ub, v1<UT, UB> v1Var);

    abstract void h(l1 l1Var, Object obj, r rVar, w<T> wVar);

    abstract void i(j jVar, Object obj, r rVar, w<T> wVar);

    abstract void j(c2 c2Var, Map.Entry<?, ?> entry);
}
