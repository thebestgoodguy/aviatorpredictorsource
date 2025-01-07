package b4;

import java.util.concurrent.CancellationException;
import n3.g;

/* loaded from: classes.dex */
public interface p1 extends g.b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1038a = b.f1039e;

    public static final class a {
        public static /* synthetic */ void a(p1 p1Var, CancellationException cancellationException, int r22, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((r22 & 1) != 0) {
                cancellationException = null;
            }
            p1Var.r(cancellationException);
        }

        public static <R> R b(p1 p1Var, R r4, u3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(p1Var, r4, pVar);
        }

        public static <E extends g.b> E c(p1 p1Var, g.c<E> cVar) {
            return (E) g.b.a.b(p1Var, cVar);
        }

        public static /* synthetic */ y0 d(p1 p1Var, boolean z4, boolean z5, u3.l lVar, int r4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((r4 & 1) != 0) {
                z4 = false;
            }
            if ((r4 & 2) != 0) {
                z5 = true;
            }
            return p1Var.h(z4, z5, lVar);
        }

        public static n3.g e(p1 p1Var, g.c<?> cVar) {
            return g.b.a.c(p1Var, cVar);
        }

        public static n3.g f(p1 p1Var, n3.g gVar) {
            return g.b.a.d(p1Var, gVar);
        }
    }

    public static final class b implements g.c<p1> {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ b f1039e = new b();

        private b() {
        }
    }

    boolean a();

    boolean e();

    y0 h(boolean z4, boolean z5, u3.l<? super Throwable, k3.s> lVar);

    CancellationException l();

    void r(CancellationException cancellationException);

    r v(t tVar);
}
