package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0023a;
import com.google.protobuf.j;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0023a<MessageType, BuilderType>> implements v0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0023a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0023a<MessageType, BuilderType>> implements v0.a {
        protected static <T> void m(Iterable<T> iterable, List<? super T> list) {
            d0.a(iterable);
            if (!(iterable instanceof k0)) {
                if (iterable instanceof g1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    n(iterable, list);
                    return;
                }
            }
            List<?> m4 = ((k0) iterable).m();
            k0 k0Var = (k0) list;
            int size = list.size();
            for (Object obj : m4) {
                if (obj == null) {
                    String str = "Element at index " + (k0Var.size() - size) + " is null.";
                    for (int size2 = k0Var.size() - 1; size2 >= size; size2--) {
                        k0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof j) {
                    k0Var.l((j) obj);
                } else {
                    k0Var.add((String) obj);
                }
            }
        }

        private static <T> void n(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t4 : iterable) {
                if (t4 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t4);
            }
        }

        protected static u1 q(v0 v0Var) {
            return new u1(v0Var);
        }

        protected abstract BuilderType o(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.v0.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public BuilderType C(v0 v0Var) {
            if (d().getClass().isInstance(v0Var)) {
                return (BuilderType) o((a) v0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void i(Iterable<T> iterable, List<? super T> list) {
        AbstractC0023a.m(iterable, list);
    }

    private String o(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.v0
    public byte[] a() {
        try {
            byte[] bArr = new byte[b()];
            m h02 = m.h0(bArr);
            l(h02);
            h02.d();
            return bArr;
        } catch (IOException e5) {
            throw new RuntimeException(o("byte array"), e5);
        }
    }

    @Override // com.google.protobuf.v0
    public j f() {
        try {
            j.h G = j.G(b());
            l(G.b());
            return G.a();
        } catch (IOException e5) {
            throw new RuntimeException(o("ByteString"), e5);
        }
    }

    @Override // com.google.protobuf.v0
    public void g(OutputStream outputStream) {
        m g02 = m.g0(outputStream, m.J(b()));
        l(g02);
        g02.d0();
    }

    int m() {
        throw new UnsupportedOperationException();
    }

    int n(n1 n1Var) {
        int m4 = m();
        if (m4 != -1) {
            return m4;
        }
        int f5 = n1Var.f(this);
        q(f5);
        return f5;
    }

    u1 p() {
        return new u1(this);
    }

    void q(int r12) {
        throw new UnsupportedOperationException();
    }
}
