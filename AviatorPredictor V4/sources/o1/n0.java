package o1;

import b3.f1;
import i1.g1;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k1.b1;
import k1.b4;
import o1.h0;
import o1.k;
import o1.n0;
import o1.s0;
import o1.t0;
import o1.u0;
import o1.v0;

/* loaded from: classes.dex */
public final class n0 implements t0.b {

    /* renamed from: a, reason: collision with root package name */
    private final c f6855a;

    /* renamed from: b, reason: collision with root package name */
    private final k1.f0 f6856b;

    /* renamed from: c, reason: collision with root package name */
    private final m f6857c;

    /* renamed from: d, reason: collision with root package name */
    private final k f6858d;

    /* renamed from: f, reason: collision with root package name */
    private final h0 f6860f;

    /* renamed from: h, reason: collision with root package name */
    private final u0 f6862h;

    /* renamed from: i, reason: collision with root package name */
    private final v0 f6863i;

    /* renamed from: j, reason: collision with root package name */
    private t0 f6864j;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6861g = false;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Integer, b4> f6859e = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final Deque<m1.g> f6865k = new ArrayDeque();

    class a implements u0.a {
        a() {
        }

        @Override // o1.p0
        public void a() {
            n0.this.x();
        }

        @Override // o1.p0
        public void b(f1 f1Var) {
            n0.this.w(f1Var);
        }

        @Override // o1.u0.a
        public void e(l1.w wVar, s0 s0Var) {
            n0.this.v(wVar, s0Var);
        }
    }

    class b implements v0.a {
        b() {
        }

        @Override // o1.p0
        public void a() {
            n0.this.f6863i.C();
        }

        @Override // o1.p0
        public void b(f1 f1Var) {
            n0.this.A(f1Var);
        }

        @Override // o1.v0.a
        public void c() {
            n0.this.B();
        }

        @Override // o1.v0.a
        public void d(l1.w wVar, List<m1.i> list) {
            n0.this.C(wVar, list);
        }
    }

    public interface c {
        void a(i1.v0 v0Var);

        c1.e<l1.l> b(int r12);

        void c(int r12, f1 f1Var);

        void d(i0 i0Var);

        void e(int r12, f1 f1Var);

        void f(m1.h hVar);
    }

    public n0(final c cVar, k1.f0 f0Var, m mVar, final p1.g gVar, k kVar) {
        this.f6855a = cVar;
        this.f6856b = f0Var;
        this.f6857c = mVar;
        this.f6858d = kVar;
        Objects.requireNonNull(cVar);
        this.f6860f = new h0(gVar, new h0.a() { // from class: o1.l0
            @Override // o1.h0.a
            public final void a(i1.v0 v0Var) {
                n0.c.this.a(v0Var);
            }
        });
        this.f6862h = mVar.e(new a());
        this.f6863i = mVar.f(new b());
        kVar.a(new p1.n() { // from class: o1.m0
            @Override // p1.n
            public final void accept(Object obj) {
                n0.this.E(gVar, (k.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(f1 f1Var) {
        if (f1Var.o()) {
            p1.b.d(!M(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!f1Var.o() && !this.f6865k.isEmpty()) {
            if (this.f6863i.z()) {
                y(f1Var);
            } else {
                z(f1Var);
            }
        }
        if (M()) {
            Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        this.f6856b.h0(this.f6863i.y());
        Iterator<m1.g> it = this.f6865k.iterator();
        while (it.hasNext()) {
            this.f6863i.D(it.next().h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(l1.w wVar, List<m1.i> list) {
        this.f6855a.f(m1.h.a(this.f6865k.poll(), wVar, list, this.f6863i.y()));
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(k.a aVar) {
        if (aVar.equals(k.a.REACHABLE) && this.f6860f.c().equals(i1.v0.ONLINE)) {
            return;
        }
        if (!(aVar.equals(k.a.UNREACHABLE) && this.f6860f.c().equals(i1.v0.OFFLINE)) && n()) {
            p1.v.a("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(p1.g gVar, final k.a aVar) {
        gVar.l(new Runnable() { // from class: o1.k0
            @Override // java.lang.Runnable
            public final void run() {
                n0.this.D(aVar);
            }
        });
    }

    private void G(s0.d dVar) {
        p1.b.d(dVar.a() != null, "Processing target error without a cause", new Object[0]);
        for (Integer num : dVar.d()) {
            if (this.f6859e.containsKey(num)) {
                this.f6859e.remove(num);
                this.f6864j.n(num.intValue());
                this.f6855a.e(num.intValue(), dVar.a());
            }
        }
    }

    private void H(l1.w wVar) {
        p1.b.d(!wVar.equals(l1.w.f6583f), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        i0 b5 = this.f6864j.b(wVar);
        for (Map.Entry<Integer, q0> entry : b5.d().entrySet()) {
            q0 value = entry.getValue();
            if (!value.e().isEmpty()) {
                int intValue = entry.getKey().intValue();
                b4 b4Var = this.f6859e.get(Integer.valueOf(intValue));
                if (b4Var != null) {
                    this.f6859e.put(Integer.valueOf(intValue), b4Var.i(value.e(), wVar));
                }
            }
        }
        Iterator<Integer> it = b5.e().iterator();
        while (it.hasNext()) {
            int intValue2 = it.next().intValue();
            b4 b4Var2 = this.f6859e.get(Integer.valueOf(intValue2));
            if (b4Var2 != null) {
                this.f6859e.put(Integer.valueOf(intValue2), b4Var2.i(com.google.protobuf.j.f2914f, b4Var2.e()));
                J(intValue2);
                K(new b4(b4Var2.f(), intValue2, b4Var2.d(), b1.EXISTENCE_FILTER_MISMATCH));
            }
        }
        this.f6855a.d(b5);
    }

    private void I() {
        this.f6861g = false;
        r();
        this.f6860f.i(i1.v0.UNKNOWN);
        this.f6863i.l();
        this.f6862h.l();
        s();
    }

    private void J(int r22) {
        this.f6864j.l(r22);
        this.f6862h.z(r22);
    }

    private void K(b4 b4Var) {
        this.f6864j.l(b4Var.g());
        this.f6862h.A(b4Var);
    }

    private boolean L() {
        return (!n() || this.f6862h.n() || this.f6859e.isEmpty()) ? false : true;
    }

    private boolean M() {
        return (!n() || this.f6863i.n() || this.f6865k.isEmpty()) ? false : true;
    }

    private void P() {
        p1.b.d(L(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f6864j = new t0(this);
        this.f6862h.u();
        this.f6860f.e();
    }

    private void Q() {
        p1.b.d(M(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.f6863i.u();
    }

    private void l(m1.g gVar) {
        p1.b.d(m(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.f6865k.add(gVar);
        if (this.f6863i.m() && this.f6863i.z()) {
            this.f6863i.D(gVar.h());
        }
    }

    private boolean m() {
        return n() && this.f6865k.size() < 10;
    }

    private void o() {
        this.f6864j = null;
    }

    private void r() {
        this.f6862h.v();
        this.f6863i.v();
        if (!this.f6865k.isEmpty()) {
            p1.v.a("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(this.f6865k.size()));
            this.f6865k.clear();
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(l1.w wVar, s0 s0Var) {
        this.f6860f.i(i1.v0.ONLINE);
        p1.b.d((this.f6862h == null || this.f6864j == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z4 = s0Var instanceof s0.d;
        s0.d dVar = z4 ? (s0.d) s0Var : null;
        if (dVar != null && dVar.b().equals(s0.e.Removed) && dVar.a() != null) {
            G(dVar);
            return;
        }
        if (s0Var instanceof s0.b) {
            this.f6864j.g((s0.b) s0Var);
        } else if (s0Var instanceof s0.c) {
            this.f6864j.h((s0.c) s0Var);
        } else {
            p1.b.d(z4, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
            this.f6864j.i((s0.d) s0Var);
        }
        if (wVar.equals(l1.w.f6583f) || wVar.compareTo(this.f6856b.C()) < 0) {
            return;
        }
        H(wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(f1 f1Var) {
        if (f1Var.o()) {
            p1.b.d(!L(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        o();
        if (!L()) {
            this.f6860f.i(i1.v0.UNKNOWN);
        } else {
            this.f6860f.d(f1Var);
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        Iterator<b4> it = this.f6859e.values().iterator();
        while (it.hasNext()) {
            K(it.next());
        }
    }

    private void y(f1 f1Var) {
        p1.b.d(!f1Var.o(), "Handling write error with status OK.", new Object[0]);
        if (m.k(f1Var)) {
            m1.g poll = this.f6865k.poll();
            this.f6863i.l();
            this.f6855a.c(poll.e(), f1Var);
            t();
        }
    }

    private void z(f1 f1Var) {
        p1.b.d(!f1Var.o(), "Handling write error with status OK.", new Object[0]);
        if (m.i(f1Var)) {
            p1.v.a("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", p1.g0.y(this.f6863i.y()), f1Var);
            v0 v0Var = this.f6863i;
            com.google.protobuf.j jVar = v0.f6954v;
            v0Var.B(jVar);
            this.f6856b.h0(jVar);
        }
    }

    public void F(b4 b4Var) {
        Integer valueOf = Integer.valueOf(b4Var.g());
        if (this.f6859e.containsKey(valueOf)) {
            return;
        }
        this.f6859e.put(valueOf, b4Var);
        if (L()) {
            P();
        } else if (this.f6862h.m()) {
            K(b4Var);
        }
    }

    public void N() {
        p1.v.a("RemoteStore", "Shutting down", new Object[0]);
        this.f6858d.shutdown();
        this.f6861g = false;
        r();
        this.f6857c.n();
        this.f6860f.i(i1.v0.UNKNOWN);
    }

    public void O() {
        s();
    }

    public void R(int r5) {
        p1.b.d(this.f6859e.remove(Integer.valueOf(r5)) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(r5));
        if (this.f6862h.m()) {
            J(r5);
        }
        if (this.f6859e.isEmpty()) {
            if (this.f6862h.m()) {
                this.f6862h.q();
            } else if (n()) {
                this.f6860f.i(i1.v0.UNKNOWN);
            }
        }
    }

    @Override // o1.t0.b
    public b4 a(int r22) {
        return this.f6859e.get(Integer.valueOf(r22));
    }

    @Override // o1.t0.b
    public c1.e<l1.l> b(int r22) {
        return this.f6855a.b(r22);
    }

    public boolean n() {
        return this.f6861g;
    }

    public g1 p() {
        return new g1(this.f6857c);
    }

    public void q() {
        this.f6861g = false;
        r();
        this.f6860f.i(i1.v0.OFFLINE);
    }

    public void s() {
        this.f6861g = true;
        if (n()) {
            this.f6863i.B(this.f6856b.D());
            if (L()) {
                P();
            } else {
                this.f6860f.i(i1.v0.UNKNOWN);
            }
            t();
        }
    }

    public void t() {
        int e5 = this.f6865k.isEmpty() ? -1 : this.f6865k.getLast().e();
        while (true) {
            if (!m()) {
                break;
            }
            m1.g G = this.f6856b.G(e5);
            if (G != null) {
                l(G);
                e5 = G.e();
            } else if (this.f6865k.size() == 0) {
                this.f6863i.q();
            }
        }
        if (M()) {
            Q();
        }
    }

    public void u() {
        if (n()) {
            p1.v.a("RemoteStore", "Restarting streams for new credential.", new Object[0]);
            I();
        }
    }
}
