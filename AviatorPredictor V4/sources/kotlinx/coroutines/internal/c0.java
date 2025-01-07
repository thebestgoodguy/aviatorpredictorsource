package kotlinx.coroutines.internal;

import b4.f2;
import java.util.Objects;
import n3.g;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f6404a = new y("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final u3.p<Object, g.b, Object> f6405b = a.f6408e;

    /* renamed from: c, reason: collision with root package name */
    private static final u3.p<f2<?>, g.b, f2<?>> f6406c = b.f6409e;

    /* renamed from: d, reason: collision with root package name */
    private static final u3.p<f0, g.b, f0> f6407d = c.f6410e;

    static final class a extends kotlin.jvm.internal.j implements u3.p<Object, g.b, Object> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f6408e = new a();

        a() {
            super(2);
        }

        @Override // u3.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof f2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends kotlin.jvm.internal.j implements u3.p<f2<?>, g.b, f2<?>> {

        /* renamed from: e, reason: collision with root package name */
        public static final b f6409e = new b();

        b() {
            super(2);
        }

        @Override // u3.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f2<?> invoke(f2<?> f2Var, g.b bVar) {
            if (f2Var != null) {
                return f2Var;
            }
            if (bVar instanceof f2) {
                return (f2) bVar;
            }
            return null;
        }
    }

    static final class c extends kotlin.jvm.internal.j implements u3.p<f0, g.b, f0> {

        /* renamed from: e, reason: collision with root package name */
        public static final c f6410e = new c();

        c() {
            super(2);
        }

        @Override // u3.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke(f0 f0Var, g.b bVar) {
            if (bVar instanceof f2) {
                f2<?> f2Var = (f2) bVar;
                f0Var.a(f2Var, f2Var.d(f0Var.f6419a));
            }
            return f0Var;
        }
    }

    public static final void a(n3.g gVar, Object obj) {
        if (obj == f6404a) {
            return;
        }
        if (obj instanceof f0) {
            ((f0) obj).b(gVar);
            return;
        }
        Object fold = gVar.fold(null, f6406c);
        Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((f2) fold).s(gVar, obj);
    }

    public static final Object b(n3.g gVar) {
        Object fold = gVar.fold(0, f6405b);
        kotlin.jvm.internal.i.b(fold);
        return fold;
    }

    public static final Object c(n3.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? f6404a : obj instanceof Integer ? gVar.fold(new f0(gVar, ((Number) obj).intValue()), f6407d) : ((f2) obj).d(gVar);
    }
}
