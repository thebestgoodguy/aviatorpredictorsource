package io.grpc.internal;

import b3.f1;
import b3.g;
import b3.l;
import b3.r;
import b3.u0;
import b3.v0;
import io.grpc.internal.i1;
import io.grpc.internal.j2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class p<ReqT, RespT> extends b3.g<ReqT, RespT> {

    /* renamed from: t, reason: collision with root package name */
    private static final Logger f5506t = Logger.getLogger(p.class.getName());

    /* renamed from: u, reason: collision with root package name */
    private static final byte[] f5507u = "gzip".getBytes(StandardCharsets.US_ASCII);

    /* renamed from: a, reason: collision with root package name */
    private final b3.v0<ReqT, RespT> f5508a;

    /* renamed from: b, reason: collision with root package name */
    private final j3.d f5509b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f5510c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5511d;

    /* renamed from: e, reason: collision with root package name */
    private final m f5512e;

    /* renamed from: f, reason: collision with root package name */
    private final b3.r f5513f;

    /* renamed from: g, reason: collision with root package name */
    private volatile ScheduledFuture<?> f5514g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5515h;

    /* renamed from: i, reason: collision with root package name */
    private b3.c f5516i;

    /* renamed from: j, reason: collision with root package name */
    private q f5517j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f5518k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5519l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5520m;

    /* renamed from: n, reason: collision with root package name */
    private final e f5521n;

    /* renamed from: p, reason: collision with root package name */
    private final ScheduledExecutorService f5523p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f5524q;

    /* renamed from: o, reason: collision with root package name */
    private final p<ReqT, RespT>.f f5522o = new f();

    /* renamed from: r, reason: collision with root package name */
    private b3.v f5525r = b3.v.c();

    /* renamed from: s, reason: collision with root package name */
    private b3.o f5526s = b3.o.a();

    class b extends x {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g.a f5527f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g.a aVar) {
            super(p.this.f5513f);
            this.f5527f = aVar;
        }

        @Override // io.grpc.internal.x
        public void a() {
            p pVar = p.this;
            pVar.r(this.f5527f, b3.s.a(pVar.f5513f), new b3.u0());
        }
    }

    class c extends x {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g.a f5529f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f5530g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g.a aVar, String str) {
            super(p.this.f5513f);
            this.f5529f = aVar;
            this.f5530g = str;
        }

        @Override // io.grpc.internal.x
        public void a() {
            p.this.r(this.f5529f, b3.f1.f770t.q(String.format("Unable to find compressor by name %s", this.f5530g)), new b3.u0());
        }
    }

    private class d implements r {

        /* renamed from: a, reason: collision with root package name */
        private final g.a<RespT> f5532a;

        /* renamed from: b, reason: collision with root package name */
        private b3.f1 f5533b;

        final class a extends x {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ j3.b f5535f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b3.u0 f5536g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j3.b bVar, b3.u0 u0Var) {
                super(p.this.f5513f);
                this.f5535f = bVar;
                this.f5536g = u0Var;
            }

            private void b() {
                if (d.this.f5533b != null) {
                    return;
                }
                try {
                    d.this.f5532a.b(this.f5536g);
                } catch (Throwable th) {
                    d.this.i(b3.f1.f757g.p(th).q("Failed to read headers"));
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                j3.c.g("ClientCall$Listener.headersRead", p.this.f5509b);
                j3.c.d(this.f5535f);
                try {
                    b();
                } finally {
                    j3.c.i("ClientCall$Listener.headersRead", p.this.f5509b);
                }
            }
        }

        final class b extends x {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ j3.b f5538f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ j2.a f5539g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j3.b bVar, j2.a aVar) {
                super(p.this.f5513f);
                this.f5538f = bVar;
                this.f5539g = aVar;
            }

            private void b() {
                if (d.this.f5533b != null) {
                    q0.d(this.f5539g);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f5539g.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            d.this.f5532a.c(p.this.f5508a.i(next));
                            next.close();
                        } catch (Throwable th) {
                            q0.e(next);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        q0.d(this.f5539g);
                        d.this.i(b3.f1.f757g.p(th2).q("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                j3.c.g("ClientCall$Listener.messagesAvailable", p.this.f5509b);
                j3.c.d(this.f5538f);
                try {
                    b();
                } finally {
                    j3.c.i("ClientCall$Listener.messagesAvailable", p.this.f5509b);
                }
            }
        }

        final class c extends x {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ j3.b f5541f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b3.f1 f5542g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ b3.u0 f5543h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(j3.b bVar, b3.f1 f1Var, b3.u0 u0Var) {
                super(p.this.f5513f);
                this.f5541f = bVar;
                this.f5542g = f1Var;
                this.f5543h = u0Var;
            }

            private void b() {
                b3.f1 f1Var = this.f5542g;
                b3.u0 u0Var = this.f5543h;
                if (d.this.f5533b != null) {
                    f1Var = d.this.f5533b;
                    u0Var = new b3.u0();
                }
                p.this.f5518k = true;
                try {
                    d dVar = d.this;
                    p.this.r(dVar.f5532a, f1Var, u0Var);
                } finally {
                    p.this.x();
                    p.this.f5512e.a(f1Var.o());
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                j3.c.g("ClientCall$Listener.onClose", p.this.f5509b);
                j3.c.d(this.f5541f);
                try {
                    b();
                } finally {
                    j3.c.i("ClientCall$Listener.onClose", p.this.f5509b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$d, reason: collision with other inner class name */
        final class C0059d extends x {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ j3.b f5545f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0059d(j3.b bVar) {
                super(p.this.f5513f);
                this.f5545f = bVar;
            }

            private void b() {
                if (d.this.f5533b != null) {
                    return;
                }
                try {
                    d.this.f5532a.d();
                } catch (Throwable th) {
                    d.this.i(b3.f1.f757g.p(th).q("Failed to call onReady."));
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                j3.c.g("ClientCall$Listener.onReady", p.this.f5509b);
                j3.c.d(this.f5545f);
                try {
                    b();
                } finally {
                    j3.c.i("ClientCall$Listener.onReady", p.this.f5509b);
                }
            }
        }

        public d(g.a<RespT> aVar) {
            this.f5532a = (g.a) q0.l.o(aVar, "observer");
        }

        private void h(b3.f1 f1Var, r.a aVar, b3.u0 u0Var) {
            b3.t s4 = p.this.s();
            if (f1Var.m() == f1.b.CANCELLED && s4 != null && s4.p()) {
                w0 w0Var = new w0();
                p.this.f5517j.l(w0Var);
                f1Var = b3.f1.f760j.e("ClientCall was cancelled at or after deadline. " + w0Var);
                u0Var = new b3.u0();
            }
            p.this.f5510c.execute(new c(j3.c.e(), f1Var, u0Var));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(b3.f1 f1Var) {
            this.f5533b = f1Var;
            p.this.f5517j.c(f1Var);
        }

        @Override // io.grpc.internal.j2
        public void a(j2.a aVar) {
            j3.c.g("ClientStreamListener.messagesAvailable", p.this.f5509b);
            try {
                p.this.f5510c.execute(new b(j3.c.e(), aVar));
            } finally {
                j3.c.i("ClientStreamListener.messagesAvailable", p.this.f5509b);
            }
        }

        @Override // io.grpc.internal.j2
        public void b() {
            if (p.this.f5508a.e().d()) {
                return;
            }
            j3.c.g("ClientStreamListener.onReady", p.this.f5509b);
            try {
                p.this.f5510c.execute(new C0059d(j3.c.e()));
            } finally {
                j3.c.i("ClientStreamListener.onReady", p.this.f5509b);
            }
        }

        @Override // io.grpc.internal.r
        public void c(b3.u0 u0Var) {
            j3.c.g("ClientStreamListener.headersRead", p.this.f5509b);
            try {
                p.this.f5510c.execute(new a(j3.c.e(), u0Var));
            } finally {
                j3.c.i("ClientStreamListener.headersRead", p.this.f5509b);
            }
        }

        @Override // io.grpc.internal.r
        public void d(b3.f1 f1Var, r.a aVar, b3.u0 u0Var) {
            j3.c.g("ClientStreamListener.closed", p.this.f5509b);
            try {
                h(f1Var, aVar, u0Var);
            } finally {
                j3.c.i("ClientStreamListener.closed", p.this.f5509b);
            }
        }
    }

    interface e {
        q a(b3.v0<?, ?> v0Var, b3.c cVar, b3.u0 u0Var, b3.r rVar);
    }

    private final class f implements r.a {
        private f() {
        }
    }

    private class g implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final long f5548e;

        g(long j4) {
            this.f5548e = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            w0 w0Var = new w0();
            p.this.f5517j.l(w0Var);
            long abs = Math.abs(this.f5548e);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1L);
            long abs2 = Math.abs(this.f5548e) % timeUnit.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.f5548e < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb.append("s. ");
            sb.append(w0Var);
            p.this.f5517j.c(b3.f1.f760j.e(sb.toString()));
        }
    }

    p(b3.v0<ReqT, RespT> v0Var, Executor executor, b3.c cVar, e eVar, ScheduledExecutorService scheduledExecutorService, m mVar, b3.e0 e0Var) {
        this.f5508a = v0Var;
        j3.d b5 = j3.c.b(v0Var.c(), System.identityHashCode(this));
        this.f5509b = b5;
        boolean z4 = true;
        if (executor == v0.c.a()) {
            this.f5510c = new b2();
            this.f5511d = true;
        } else {
            this.f5510c = new c2(executor);
            this.f5511d = false;
        }
        this.f5512e = mVar;
        this.f5513f = b3.r.e();
        if (v0Var.e() != v0.d.UNARY && v0Var.e() != v0.d.SERVER_STREAMING) {
            z4 = false;
        }
        this.f5515h = z4;
        this.f5516i = cVar;
        this.f5521n = eVar;
        this.f5523p = scheduledExecutorService;
        j3.c.c("ClientCall.<init>", b5);
    }

    private ScheduledFuture<?> C(b3.t tVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long r4 = tVar.r(timeUnit);
        return this.f5523p.schedule(new c1(new g(r4)), r4, timeUnit);
    }

    private void D(g.a<RespT> aVar, b3.u0 u0Var) {
        b3.n nVar;
        q0.l.u(this.f5517j == null, "Already started");
        q0.l.u(!this.f5519l, "call was cancelled");
        q0.l.o(aVar, "observer");
        q0.l.o(u0Var, "headers");
        if (this.f5513f.h()) {
            this.f5517j = n1.f5483a;
            this.f5510c.execute(new b(aVar));
            return;
        }
        p();
        String b5 = this.f5516i.b();
        if (b5 != null) {
            nVar = this.f5526s.b(b5);
            if (nVar == null) {
                this.f5517j = n1.f5483a;
                this.f5510c.execute(new c(aVar, b5));
                return;
            }
        } else {
            nVar = l.b.f836a;
        }
        w(u0Var, this.f5525r, nVar, this.f5524q);
        b3.t s4 = s();
        if (s4 != null && s4.p()) {
            this.f5517j = new f0(b3.f1.f760j.q("ClientCall started after deadline exceeded: " + s4), q0.f(this.f5516i, u0Var, 0, false));
        } else {
            u(s4, this.f5513f.g(), this.f5516i.d());
            this.f5517j = this.f5521n.a(this.f5508a, this.f5516i, u0Var, this.f5513f);
        }
        if (this.f5511d) {
            this.f5517j.m();
        }
        if (this.f5516i.a() != null) {
            this.f5517j.j(this.f5516i.a());
        }
        if (this.f5516i.f() != null) {
            this.f5517j.e(this.f5516i.f().intValue());
        }
        if (this.f5516i.g() != null) {
            this.f5517j.a(this.f5516i.g().intValue());
        }
        if (s4 != null) {
            this.f5517j.g(s4);
        }
        this.f5517j.b(nVar);
        boolean z4 = this.f5524q;
        if (z4) {
            this.f5517j.q(z4);
        }
        this.f5517j.k(this.f5525r);
        this.f5512e.b();
        this.f5517j.i(new d(aVar));
        this.f5513f.a(this.f5522o, v0.c.a());
        if (s4 != null && !s4.equals(this.f5513f.g()) && this.f5523p != null) {
            this.f5514g = C(s4);
        }
        if (this.f5518k) {
            x();
        }
    }

    private void p() {
        i1.b bVar = (i1.b) this.f5516i.h(i1.b.f5381g);
        if (bVar == null) {
            return;
        }
        Long l4 = bVar.f5382a;
        if (l4 != null) {
            b3.t d5 = b3.t.d(l4.longValue(), TimeUnit.NANOSECONDS);
            b3.t d6 = this.f5516i.d();
            if (d6 == null || d5.compareTo(d6) < 0) {
                this.f5516i = this.f5516i.l(d5);
            }
        }
        Boolean bool = bVar.f5383b;
        if (bool != null) {
            this.f5516i = bool.booleanValue() ? this.f5516i.r() : this.f5516i.s();
        }
        if (bVar.f5384c != null) {
            Integer f5 = this.f5516i.f();
            this.f5516i = f5 != null ? this.f5516i.n(Math.min(f5.intValue(), bVar.f5384c.intValue())) : this.f5516i.n(bVar.f5384c.intValue());
        }
        if (bVar.f5385d != null) {
            Integer g5 = this.f5516i.g();
            this.f5516i = g5 != null ? this.f5516i.o(Math.min(g5.intValue(), bVar.f5385d.intValue())) : this.f5516i.o(bVar.f5385d.intValue());
        }
    }

    private void q(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f5506t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f5519l) {
            return;
        }
        this.f5519l = true;
        try {
            if (this.f5517j != null) {
                b3.f1 f1Var = b3.f1.f757g;
                if (str == null) {
                    str = "Call cancelled without message";
                }
                b3.f1 q4 = f1Var.q(str);
                if (th != null) {
                    q4 = q4.p(th);
                }
                this.f5517j.c(q4);
            }
        } finally {
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(g.a<RespT> aVar, b3.f1 f1Var, b3.u0 u0Var) {
        aVar.a(f1Var, u0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b3.t s() {
        return v(this.f5516i.d(), this.f5513f.g());
    }

    private void t() {
        q0.l.u(this.f5517j != null, "Not started");
        q0.l.u(!this.f5519l, "call was cancelled");
        q0.l.u(!this.f5520m, "call already half-closed");
        this.f5520m = true;
        this.f5517j.n();
    }

    private static void u(b3.t tVar, b3.t tVar2, b3.t tVar3) {
        Logger logger = f5506t;
        if (logger.isLoggable(Level.FINE) && tVar != null && tVar.equals(tVar2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(Math.max(0L, tVar.r(timeUnit)))));
            sb.append(tVar3 == null ? " Explicit call timeout was not set." : String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(tVar3.r(timeUnit))));
            logger.fine(sb.toString());
        }
    }

    private static b3.t v(b3.t tVar, b3.t tVar2) {
        return tVar == null ? tVar2 : tVar2 == null ? tVar : tVar.q(tVar2);
    }

    static void w(b3.u0 u0Var, b3.v vVar, b3.n nVar, boolean z4) {
        u0Var.e(q0.f5570h);
        u0.g<String> gVar = q0.f5566d;
        u0Var.e(gVar);
        if (nVar != l.b.f836a) {
            u0Var.p(gVar, nVar.a());
        }
        u0.g<byte[]> gVar2 = q0.f5567e;
        u0Var.e(gVar2);
        byte[] a5 = b3.f0.a(vVar);
        if (a5.length != 0) {
            u0Var.p(gVar2, a5);
        }
        u0Var.e(q0.f5568f);
        u0.g<byte[]> gVar3 = q0.f5569g;
        u0Var.e(gVar3);
        if (z4) {
            u0Var.p(gVar3, f5507u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f5513f.i(this.f5522o);
        ScheduledFuture<?> scheduledFuture = this.f5514g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void y(ReqT reqt) {
        q0.l.u(this.f5517j != null, "Not started");
        q0.l.u(!this.f5519l, "call was cancelled");
        q0.l.u(!this.f5520m, "call was half-closed");
        try {
            q qVar = this.f5517j;
            if (qVar instanceof y1) {
                ((y1) qVar).j0(reqt);
            } else {
                qVar.h(this.f5508a.j(reqt));
            }
            if (this.f5515h) {
                return;
            }
            this.f5517j.flush();
        } catch (Error e5) {
            this.f5517j.c(b3.f1.f757g.q("Client sendMessage() failed with Error"));
            throw e5;
        } catch (RuntimeException e6) {
            this.f5517j.c(b3.f1.f757g.p(e6).q("Failed to stream message"));
        }
    }

    p<ReqT, RespT> A(b3.v vVar) {
        this.f5525r = vVar;
        return this;
    }

    p<ReqT, RespT> B(boolean z4) {
        this.f5524q = z4;
        return this;
    }

    @Override // b3.g
    public void a(String str, Throwable th) {
        j3.c.g("ClientCall.cancel", this.f5509b);
        try {
            q(str, th);
        } finally {
            j3.c.i("ClientCall.cancel", this.f5509b);
        }
    }

    @Override // b3.g
    public void b() {
        j3.c.g("ClientCall.halfClose", this.f5509b);
        try {
            t();
        } finally {
            j3.c.i("ClientCall.halfClose", this.f5509b);
        }
    }

    @Override // b3.g
    public void c(int r6) {
        j3.c.g("ClientCall.request", this.f5509b);
        try {
            boolean z4 = true;
            q0.l.u(this.f5517j != null, "Not started");
            if (r6 < 0) {
                z4 = false;
            }
            q0.l.e(z4, "Number requested must be non-negative");
            this.f5517j.d(r6);
        } finally {
            j3.c.i("ClientCall.request", this.f5509b);
        }
    }

    @Override // b3.g
    public void d(ReqT reqt) {
        j3.c.g("ClientCall.sendMessage", this.f5509b);
        try {
            y(reqt);
        } finally {
            j3.c.i("ClientCall.sendMessage", this.f5509b);
        }
    }

    @Override // b3.g
    public void e(g.a<RespT> aVar, b3.u0 u0Var) {
        j3.c.g("ClientCall.start", this.f5509b);
        try {
            D(aVar, u0Var);
        } finally {
            j3.c.i("ClientCall.start", this.f5509b);
        }
    }

    public String toString() {
        return q0.h.c(this).d("method", this.f5508a).toString();
    }

    p<ReqT, RespT> z(b3.o oVar) {
        this.f5526s = oVar;
        return this;
    }
}
