package o3;

import k3.n;
import k3.s;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.i;
import n3.g;
import u3.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    public static final class a extends j {

        /* renamed from: e, reason: collision with root package name */
        private int f6970e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n3.d f6971f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f6972g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f6973h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n3.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f6971f = dVar;
            this.f6972g = pVar;
            this.f6973h = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int r02 = this.f6970e;
            if (r02 == 0) {
                this.f6970e = 1;
                n.b(obj);
                return ((p) kotlin.jvm.internal.n.a(this.f6972g, 2)).invoke(this.f6973h, this);
            }
            if (r02 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f6970e = 2;
            n.b(obj);
            return obj;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e, reason: collision with root package name */
        private int f6974e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n3.d f6975f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ g f6976g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ p f6977h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f6978i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n3.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f6975f = dVar;
            this.f6976g = gVar;
            this.f6977h = pVar;
            this.f6978i = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int r02 = this.f6974e;
            if (r02 == 0) {
                this.f6974e = 1;
                n.b(obj);
                return ((p) kotlin.jvm.internal.n.a(this.f6977h, 2)).invoke(this.f6978i, this);
            }
            if (r02 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f6974e = 2;
            n.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> n3.d<s> a(p<? super R, ? super n3.d<? super T>, ? extends Object> pVar, R r4, n3.d<? super T> dVar) {
        i.d(pVar, "<this>");
        i.d(dVar, "completion");
        n3.d<?> a5 = h.a(dVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r4, a5);
        }
        g context = a5.getContext();
        return context == n3.h.f6694e ? new a(a5, pVar, r4) : new b(a5, context, pVar, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> n3.d<T> b(n3.d<? super T> dVar) {
        i.d(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar2 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return dVar2 == null ? dVar : (n3.d<T>) dVar2.intercepted();
    }
}
