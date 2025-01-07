package kotlinx.coroutines.internal;

import b4.i0;

/* loaded from: classes.dex */
public final class t {

    static final class a extends kotlin.jvm.internal.j implements u3.l<Throwable, k3.s> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u3.l<E, k3.s> f6459e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ E f6460f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n3.g f6461g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(u3.l<? super E, k3.s> lVar, E e5, n3.g gVar) {
            super(1);
            this.f6459e = lVar;
            this.f6460f = e5;
            this.f6461g = gVar;
        }

        public final void a(Throwable th) {
            t.b(this.f6459e, this.f6460f, this.f6461g);
        }

        @Override // u3.l
        public /* bridge */ /* synthetic */ k3.s invoke(Throwable th) {
            a(th);
            return k3.s.f6374a;
        }
    }

    public static final <E> u3.l<Throwable, k3.s> a(u3.l<? super E, k3.s> lVar, E e5, n3.g gVar) {
        return new a(lVar, e5, gVar);
    }

    public static final <E> void b(u3.l<? super E, k3.s> lVar, E e5, n3.g gVar) {
        g0 c5 = c(lVar, e5, null);
        if (c5 == null) {
            return;
        }
        i0.a(gVar, c5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> g0 c(u3.l<? super E, k3.s> lVar, E e5, g0 g0Var) {
        try {
            lVar.invoke(e5);
        } catch (Throwable th) {
            if (g0Var == null || g0Var.getCause() == th) {
                return new g0(kotlin.jvm.internal.i.i("Exception in undelivered element handler for ", e5), th);
            }
            k3.b.a(g0Var, th);
        }
        return g0Var;
    }

    public static /* synthetic */ g0 d(u3.l lVar, Object obj, g0 g0Var, int r32, Object obj2) {
        if ((r32 & 2) != 0) {
            g0Var = null;
        }
        return c(lVar, obj, g0Var);
    }
}
