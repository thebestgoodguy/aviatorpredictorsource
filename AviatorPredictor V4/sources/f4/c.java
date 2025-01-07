package f4;

import a4.f;
import b4.t1;
import k3.m;
import k3.s;
import kotlin.jvm.internal.j;
import n3.g;
import n3.h;
import u3.p;
import u3.q;

/* loaded from: classes.dex */
public final class c<T> extends kotlin.coroutines.jvm.internal.d implements e4.c<T> {

    /* renamed from: e, reason: collision with root package name */
    public final e4.c<T> f3786e;

    /* renamed from: f, reason: collision with root package name */
    public final g f3787f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3788g;

    /* renamed from: h, reason: collision with root package name */
    private g f3789h;

    /* renamed from: i, reason: collision with root package name */
    private n3.d<? super s> f3790i;

    static final class a extends j implements p<Integer, g.b, Integer> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f3791e = new a();

        a() {
            super(2);
        }

        public final Integer a(int r12, g.b bVar) {
            return Integer.valueOf(r12 + 1);
        }

        @Override // u3.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(e4.c<? super T> cVar, g gVar) {
        super(b.f3784e, h.f6694e);
        this.f3786e = cVar;
        this.f3787f = gVar;
        this.f3788g = ((Number) gVar.fold(0, a.f3791e)).intValue();
    }

    private final void a(g gVar, g gVar2, T t4) {
        if (gVar2 instanceof f4.a) {
            d((f4.a) gVar2, t4);
        }
        e.a(this, gVar);
        this.f3789h = gVar;
    }

    private final Object c(n3.d<? super s> dVar, T t4) {
        q qVar;
        g context = dVar.getContext();
        t1.e(context);
        g gVar = this.f3789h;
        if (gVar != context) {
            a(context, gVar, t4);
        }
        this.f3790i = dVar;
        qVar = d.f3792a;
        return qVar.g(this.f3786e, t4, this);
    }

    private final void d(f4.a aVar, Object obj) {
        String e5;
        e5 = f.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f3782e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(e5.toString());
    }

    @Override // e4.c
    public Object emit(T t4, n3.d<? super s> dVar) {
        Object c5;
        Object c6;
        try {
            Object c7 = c(dVar, t4);
            c5 = o3.d.c();
            if (c7 == c5) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            c6 = o3.d.c();
            return c7 == c6 ? c7 : s.f6374a;
        } catch (Throwable th) {
            this.f3789h = new f4.a(th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        n3.d<? super s> dVar = this.f3790i;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, n3.d
    public g getContext() {
        n3.d<? super s> dVar = this.f3790i;
        g context = dVar == null ? null : dVar.getContext();
        return context == null ? h.f6694e : context;
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Object c5;
        Throwable b5 = m.b(obj);
        if (b5 != null) {
            this.f3789h = new f4.a(b5);
        }
        n3.d<? super s> dVar = this.f3790i;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        c5 = o3.d.c();
        return c5;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
