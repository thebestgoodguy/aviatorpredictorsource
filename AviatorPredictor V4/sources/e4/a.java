package e4;

import k3.s;

/* loaded from: classes.dex */
public abstract class a<T> implements b<T> {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {212}, m = "collect")
    /* renamed from: e4.a$a, reason: collision with other inner class name */
    static final class C0037a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e, reason: collision with root package name */
        Object f3610e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3611f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a<T> f3612g;

        /* renamed from: h, reason: collision with root package name */
        int f3613h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0037a(a<T> aVar, n3.d<? super C0037a> dVar) {
            super(dVar);
            this.f3612g = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3611f = obj;
            this.f3613h |= Integer.MIN_VALUE;
            return this.f3612g.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(e4.c<? super T> r6, n3.d<? super k3.s> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e4.a.C0037a
            if (r0 == 0) goto L13
            r0 = r7
            e4.a$a r0 = (e4.a.C0037a) r0
            int r1 = r0.f3613h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3613h = r1
            goto L18
        L13:
            e4.a$a r0 = new e4.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f3611f
            java.lang.Object r1 = o3.b.c()
            int r2 = r0.f3613h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f3610e
            f4.c r6 = (f4.c) r6
            k3.n.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            k3.n.b(r7)
            f4.c r7 = new f4.c
            n3.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f3610e = r7     // Catch: java.lang.Throwable -> L55
            r0.f3613h = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            k3.s r6 = k3.s.f6374a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.a.a(e4.c, n3.d):java.lang.Object");
    }

    public abstract Object b(c<? super T> cVar, n3.d<? super s> dVar);
}
