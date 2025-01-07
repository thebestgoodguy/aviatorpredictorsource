package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a0;
import com.google.protobuf.a0.a;
import com.google.protobuf.b2;
import com.google.protobuf.d0;
import com.google.protobuf.f;
import com.google.protobuf.v0;
import com.google.protobuf.w;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class a0<MessageType extends a0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, a0<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected w1 unknownFields = w1.c();
    protected int memoizedSerializedSize = -1;

    public static abstract class a<MessageType extends a0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0023a<MessageType, BuilderType> {

        /* renamed from: e, reason: collision with root package name */
        private final MessageType f2776e;

        /* renamed from: f, reason: collision with root package name */
        protected MessageType f2777f;

        /* renamed from: g, reason: collision with root package name */
        protected boolean f2778g = false;

        protected a(MessageType messagetype) {
            this.f2776e = messagetype;
            this.f2777f = (MessageType) messagetype.w(f.NEW_MUTABLE_INSTANCE);
        }

        private void A(MessageType messagetype, MessageType messagetype2) {
            i1.a().e(messagetype).a(messagetype, messagetype2);
        }

        @Override // com.google.protobuf.v0.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final MessageType t() {
            MessageType K = K();
            if (K.j()) {
                return K;
            }
            throw a.AbstractC0023a.q(K);
        }

        @Override // com.google.protobuf.v0.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public MessageType K() {
            if (this.f2778g) {
                return this.f2777f;
            }
            this.f2777f.G();
            this.f2778g = true;
            return this.f2777f;
        }

        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) d().c();
            buildertype.z(K());
            return buildertype;
        }

        protected final void v() {
            if (this.f2778g) {
                w();
                this.f2778g = false;
            }
        }

        protected void w() {
            MessageType messagetype = (MessageType) this.f2777f.w(f.NEW_MUTABLE_INSTANCE);
            A(messagetype, this.f2777f);
            this.f2777f = messagetype;
        }

        @Override // com.google.protobuf.w0
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public MessageType d() {
            return this.f2776e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.a.AbstractC0023a
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public BuilderType o(MessageType messagetype) {
            return z(messagetype);
        }

        public BuilderType z(MessageType messagetype) {
            v();
            A(this.f2777f, messagetype);
            return this;
        }
    }

    protected static class b<T extends a0<T, ?>> extends com.google.protobuf.b<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f2779b;

        public b(T t4) {
            this.f2779b = t4;
        }

        @Override // com.google.protobuf.f1
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public T c(k kVar, r rVar) {
            return (T) a0.P(this.f2779b, kVar, rVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends a0<MessageType, BuilderType> implements w0 {
        protected w<d> extensions = w.h();

        w<d> T() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.a0, com.google.protobuf.v0
        public /* bridge */ /* synthetic */ v0.a c() {
            return super.c();
        }

        @Override // com.google.protobuf.a0, com.google.protobuf.w0
        public /* bridge */ /* synthetic */ v0 d() {
            return super.d();
        }

        @Override // com.google.protobuf.a0, com.google.protobuf.v0
        public /* bridge */ /* synthetic */ v0.a e() {
            return super.e();
        }
    }

    static final class d implements w.b<d> {

        /* renamed from: e, reason: collision with root package name */
        final d0.d<?> f2780e;

        /* renamed from: f, reason: collision with root package name */
        final int f2781f;

        /* renamed from: g, reason: collision with root package name */
        final b2.b f2782g;

        /* renamed from: h, reason: collision with root package name */
        final boolean f2783h;

        /* renamed from: i, reason: collision with root package name */
        final boolean f2784i;

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f2781f - dVar.f2781f;
        }

        @Override // com.google.protobuf.w.b
        public int e() {
            return this.f2781f;
        }

        @Override // com.google.protobuf.w.b
        public boolean f() {
            return this.f2783h;
        }

        public d0.d<?> g() {
            return this.f2780e;
        }

        @Override // com.google.protobuf.w.b
        public b2.b j() {
            return this.f2782g;
        }

        @Override // com.google.protobuf.w.b
        public b2.c l() {
            return this.f2782g.d();
        }

        @Override // com.google.protobuf.w.b
        public boolean m() {
            return this.f2784i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.w.b
        public v0.a o(v0.a aVar, v0 v0Var) {
            return ((a) aVar).z((a0) v0Var);
        }
    }

    public static class e<ContainingType extends v0, Type> extends p<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        final v0 f2785a;

        /* renamed from: b, reason: collision with root package name */
        final d f2786b;

        public b2.b a() {
            return this.f2786b.j();
        }

        public v0 b() {
            return this.f2785a;
        }

        public int c() {
            return this.f2786b.e();
        }

        public boolean d() {
            return this.f2786b.f2783h;
        }
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static <E> d0.i<E> A() {
        return j1.q();
    }

    static <T extends a0<?, ?>> T B(Class<T> cls) {
        a0<?, ?> a0Var = defaultInstanceMap.get(cls);
        if (a0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                a0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (a0Var == null) {
            a0Var = (T) ((a0) z1.l(cls)).d();
            if (a0Var == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, a0Var);
        }
        return (T) a0Var;
    }

    static Object E(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends a0<T, ?>> boolean F(T t4, boolean z4) {
        byte byteValue = ((Byte) t4.w(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b5 = i1.a().e(t4).b(t4);
        if (z4) {
            t4.x(f.SET_MEMOIZED_IS_INITIALIZED, b5 ? t4 : null);
        }
        return b5;
    }

    protected static <E> d0.i<E> H(d0.i<E> iVar) {
        int size = iVar.size();
        return iVar.k(size == 0 ? 10 : size * 2);
    }

    protected static Object J(v0 v0Var, String str, Object[] objArr) {
        return new k1(v0Var, str, objArr);
    }

    protected static <T extends a0<T, ?>> T L(T t4, j jVar) {
        return (T) s(M(t4, jVar, r.b()));
    }

    protected static <T extends a0<T, ?>> T M(T t4, j jVar, r rVar) {
        return (T) s(O(t4, jVar, rVar));
    }

    protected static <T extends a0<T, ?>> T N(T t4, byte[] bArr) {
        return (T) s(Q(t4, bArr, 0, bArr.length, r.b()));
    }

    private static <T extends a0<T, ?>> T O(T t4, j jVar, r rVar) {
        try {
            k H = jVar.H();
            T t5 = (T) P(t4, H, rVar);
            try {
                H.a(0);
                return t5;
            } catch (e0 e5) {
                throw e5.k(t5);
            }
        } catch (e0 e6) {
            throw e6;
        }
    }

    static <T extends a0<T, ?>> T P(T t4, k kVar, r rVar) {
        T t5 = (T) t4.w(f.NEW_MUTABLE_INSTANCE);
        try {
            n1 e5 = i1.a().e(t5);
            e5.c(t5, l.S(kVar), rVar);
            e5.i(t5);
            return t5;
        } catch (e0 e6) {
            e = e6;
            if (e.a()) {
                e = new e0(e);
            }
            throw e.k(t5);
        } catch (IOException e7) {
            if (e7.getCause() instanceof e0) {
                throw ((e0) e7.getCause());
            }
            throw new e0(e7).k(t5);
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof e0) {
                throw ((e0) e8.getCause());
            }
            throw e8;
        }
    }

    static <T extends a0<T, ?>> T Q(T t4, byte[] bArr, int r9, int r10, r rVar) {
        T t5 = (T) t4.w(f.NEW_MUTABLE_INSTANCE);
        try {
            n1 e5 = i1.a().e(t5);
            e5.e(t5, bArr, r9, r9 + r10, new f.b(rVar));
            e5.i(t5);
            if (t5.memoizedHashCode == 0) {
                return t5;
            }
            throw new RuntimeException();
        } catch (e0 e6) {
            e = e6;
            if (e.a()) {
                e = new e0(e);
            }
            throw e.k(t5);
        } catch (IOException e7) {
            if (e7.getCause() instanceof e0) {
                throw ((e0) e7.getCause());
            }
            throw new e0(e7).k(t5);
        } catch (IndexOutOfBoundsException unused) {
            throw e0.m().k(t5);
        }
    }

    protected static <T extends a0<?, ?>> void R(Class<T> cls, T t4) {
        defaultInstanceMap.put(cls, t4);
    }

    private static <T extends a0<T, ?>> T s(T t4) {
        if (t4 == null || t4.j()) {
            return t4;
        }
        throw t4.p().a().k(t4);
    }

    protected static d0.g z() {
        return c0.t();
    }

    @Override // com.google.protobuf.w0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final MessageType d() {
        return (MessageType) w(f.GET_DEFAULT_INSTANCE);
    }

    protected void G() {
        i1.a().e(this).i(this);
    }

    @Override // com.google.protobuf.v0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final BuilderType c() {
        return (BuilderType) w(f.NEW_BUILDER);
    }

    @Override // com.google.protobuf.v0
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final BuilderType e() {
        BuilderType buildertype = (BuilderType) w(f.NEW_BUILDER);
        buildertype.z(this);
        return buildertype;
    }

    @Override // com.google.protobuf.v0
    public int b() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = i1.a().e(this).f(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return i1.a().e(this).d(this, (a0) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.v0
    public final f1<MessageType> h() {
        return (f1) w(f.GET_PARSER);
    }

    public int hashCode() {
        int r02 = this.memoizedHashCode;
        if (r02 != 0) {
            return r02;
        }
        int j4 = i1.a().e(this).j(this);
        this.memoizedHashCode = j4;
        return j4;
    }

    @Override // com.google.protobuf.w0
    public final boolean j() {
        return F(this, true);
    }

    @Override // com.google.protobuf.v0
    public void l(m mVar) {
        i1.a().e(this).h(this, n.P(mVar));
    }

    @Override // com.google.protobuf.a
    int m() {
        return this.memoizedSerializedSize;
    }

    @Override // com.google.protobuf.a
    void q(int r12) {
        this.memoizedSerializedSize = r12;
    }

    Object r() {
        return w(f.BUILD_MESSAGE_INFO);
    }

    public String toString() {
        return x0.e(this, super.toString());
    }

    protected final <MessageType extends a0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType u() {
        return (BuilderType) w(f.NEW_BUILDER);
    }

    protected final <MessageType extends a0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType v(MessageType messagetype) {
        return (BuilderType) u().z(messagetype);
    }

    protected Object w(f fVar) {
        return y(fVar, null, null);
    }

    protected Object x(f fVar, Object obj) {
        return y(fVar, obj, null);
    }

    protected abstract Object y(f fVar, Object obj, Object obj2);
}
