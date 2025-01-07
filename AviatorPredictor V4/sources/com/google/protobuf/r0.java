package com.google.protobuf;

import com.google.protobuf.o0;
import java.util.Map;

/* loaded from: classes.dex */
class r0 implements q0 {
    r0() {
    }

    private static <K, V> int i(int r32, Object obj, Object obj2) {
        p0 p0Var = (p0) obj;
        o0 o0Var = (o0) obj2;
        int r12 = 0;
        if (p0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : p0Var.entrySet()) {
            r12 += o0Var.a(r32, entry.getKey(), entry.getValue());
        }
        return r12;
    }

    private static <K, V> p0<K, V> j(Object obj, Object obj2) {
        p0<K, V> p0Var = (p0) obj;
        p0<K, V> p0Var2 = (p0) obj2;
        if (!p0Var2.isEmpty()) {
            if (!p0Var.h()) {
                p0Var = p0Var.l();
            }
            p0Var.k(p0Var2);
        }
        return p0Var;
    }

    @Override // com.google.protobuf.q0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.q0
    public Map<?, ?> b(Object obj) {
        return (p0) obj;
    }

    @Override // com.google.protobuf.q0
    public Object c(Object obj) {
        return p0.d().l();
    }

    @Override // com.google.protobuf.q0
    public int d(int r12, Object obj, Object obj2) {
        return i(r12, obj, obj2);
    }

    @Override // com.google.protobuf.q0
    public Map<?, ?> e(Object obj) {
        return (p0) obj;
    }

    @Override // com.google.protobuf.q0
    public boolean f(Object obj) {
        return !((p0) obj).h();
    }

    @Override // com.google.protobuf.q0
    public Object g(Object obj) {
        ((p0) obj).j();
        return obj;
    }

    @Override // com.google.protobuf.q0
    public o0.a<?, ?> h(Object obj) {
        return ((o0) obj).c();
    }
}
