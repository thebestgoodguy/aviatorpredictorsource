package o1;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p1.g;
import x1.o;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: h, reason: collision with root package name */
    private static p1.y<b3.r0<?>> f6779h;

    /* renamed from: a, reason: collision with root package name */
    private o0.h<b3.q0> f6780a;

    /* renamed from: b, reason: collision with root package name */
    private final p1.g f6781b;

    /* renamed from: c, reason: collision with root package name */
    private b3.c f6782c;

    /* renamed from: d, reason: collision with root package name */
    private g.b f6783d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f6784e;

    /* renamed from: f, reason: collision with root package name */
    private final i1.m f6785f;

    /* renamed from: g, reason: collision with root package name */
    private final b3.b f6786g;

    d0(p1.g gVar, Context context, i1.m mVar, b3.b bVar) {
        this.f6781b = gVar;
        this.f6784e = context;
        this.f6785f = mVar;
        this.f6786g = bVar;
        k();
    }

    private void h() {
        if (this.f6783d != null) {
            p1.v.a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f6783d.c();
            this.f6783d = null;
        }
    }

    private b3.q0 j(Context context, i1.m mVar) {
        b3.r0<?> r0Var;
        try {
            l0.a.a(context);
        } catch (IllegalStateException | s.f | s.g e5) {
            p1.v.d("GrpcCallProvider", "Failed to update ssl context: %s", e5);
        }
        p1.y<b3.r0<?>> yVar = f6779h;
        if (yVar != null) {
            r0Var = yVar.get();
        } else {
            b3.r0<?> b5 = b3.r0.b(mVar.b());
            if (!mVar.d()) {
                b5.d();
            }
            r0Var = b5;
        }
        r0Var.c(30L, TimeUnit.SECONDS);
        return c3.a.k(r0Var).i(context).a();
    }

    private void k() {
        this.f6780a = o0.k.b(p1.p.f7052c, new Callable() { // from class: o1.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b3.q0 n4;
                n4 = d0.this.n();
                return n4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o0.h l(b3.v0 v0Var, o0.h hVar) {
        return o0.k.d(((b3.q0) hVar.m()).h(v0Var, this.f6782c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b3.q0 n() {
        final b3.q0 j4 = j(this.f6784e, this.f6785f);
        this.f6781b.l(new Runnable() { // from class: o1.z
            @Override // java.lang.Runnable
            public final void run() {
                d0.this.m(j4);
            }
        });
        this.f6782c = ((o.b) ((o.b) x1.o.e(j4).c(this.f6786g)).d(this.f6781b.o())).b();
        p1.v.a("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(b3.q0 q0Var) {
        p1.v.a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        h();
        t(q0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(final b3.q0 q0Var) {
        this.f6781b.l(new Runnable() { // from class: o1.w
            @Override // java.lang.Runnable
            public final void run() {
                d0.this.p(q0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(b3.q0 q0Var) {
        q0Var.n();
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void p(final b3.q0 q0Var) {
        b3.p k4 = q0Var.k(true);
        p1.v.a("GrpcCallProvider", "Current gRPC connectivity state: " + k4, new Object[0]);
        h();
        if (k4 == b3.p.CONNECTING) {
            p1.v.a("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f6783d = this.f6781b.k(g.d.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new Runnable() { // from class: o1.y
                @Override // java.lang.Runnable
                public final void run() {
                    d0.this.o(q0Var);
                }
            });
        }
        q0Var.l(k4, new Runnable() { // from class: o1.x
            @Override // java.lang.Runnable
            public final void run() {
                d0.this.q(q0Var);
            }
        });
    }

    private void t(final b3.q0 q0Var) {
        this.f6781b.l(new Runnable() { // from class: o1.a0
            @Override // java.lang.Runnable
            public final void run() {
                d0.this.r(q0Var);
            }
        });
    }

    <ReqT, RespT> o0.h<b3.g<ReqT, RespT>> i(final b3.v0<ReqT, RespT> v0Var) {
        return (o0.h<b3.g<ReqT, RespT>>) this.f6780a.j(this.f6781b.o(), new o0.a() { // from class: o1.c0
            @Override // o0.a
            public final Object a(o0.h hVar) {
                o0.h l4;
                l4 = d0.this.l(v0Var, hVar);
                return l4;
            }
        });
    }

    void u() {
        try {
            b3.q0 q0Var = (b3.q0) o0.k.a(this.f6780a);
            q0Var.m();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (q0Var.i(1L, timeUnit)) {
                    return;
                }
                p1.v.a(u.class.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                q0Var.n();
                if (q0Var.i(60L, timeUnit)) {
                    return;
                }
                p1.v.d(u.class.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
            } catch (InterruptedException unused) {
                q0Var.n();
                p1.v.d(u.class.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException unused2) {
            p1.v.d(u.class.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e5) {
            p1.v.d(u.class.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e5);
        }
    }
}
