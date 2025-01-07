package k1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k1.k;
import l1.q;
import p1.g;

/* loaded from: classes.dex */
public class k {

    /* renamed from: f, reason: collision with root package name */
    private static final long f6127f = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: g, reason: collision with root package name */
    private static final long f6128g = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    private final a f6129a;

    /* renamed from: b, reason: collision with root package name */
    private final z0 f6130b;

    /* renamed from: c, reason: collision with root package name */
    private final q0.p<l> f6131c;

    /* renamed from: d, reason: collision with root package name */
    private final q0.p<n> f6132d;

    /* renamed from: e, reason: collision with root package name */
    private int f6133e;

    public class a implements z3 {

        /* renamed from: a, reason: collision with root package name */
        private g.b f6134a;

        /* renamed from: b, reason: collision with root package name */
        private final p1.g f6135b;

        public a(p1.g gVar) {
            this.f6135b = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            p1.v.a("IndexBackfiller", "Documents written: %s", Integer.valueOf(k.this.d()));
            e(k.f6128g);
        }

        private void e(long j4) {
            this.f6134a = this.f6135b.k(g.d.INDEX_BACKFILL, j4, new Runnable() { // from class: k1.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.a.this.d();
                }
            });
        }

        @Override // k1.z3
        public void a() {
            e(k.f6127f);
        }

        @Override // k1.z3
        public void b() {
            g.b bVar = this.f6134a;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    /* JADX WARN: 'thıs' call moved to the top of the method (can break code semantics) */
    public k(z0 z0Var, p1.g gVar, final f0 f0Var) {
        this(z0Var, gVar, new q0.p() { // from class: k1.h
            @Override // q0.p
            public final Object get() {
                return f0.this.A();
            }
        }, new q0.p() { // from class: k1.i
            @Override // q0.p
            public final Object get() {
                return f0.this.E();
            }
        });
        Objects.requireNonNull(f0Var);
    }

    public k(z0 z0Var, p1.g gVar, q0.p<l> pVar, q0.p<n> pVar2) {
        this.f6133e = 50;
        this.f6130b = z0Var;
        this.f6129a = new a(gVar);
        this.f6131c = pVar;
        this.f6132d = pVar2;
    }

    private q.a e(q.a aVar, m mVar) {
        Iterator<Map.Entry<l1.l, l1.i>> it = mVar.c().iterator();
        q.a aVar2 = aVar;
        while (it.hasNext()) {
            q.a k4 = q.a.k(it.next().getValue());
            if (k4.compareTo(aVar2) > 0) {
                aVar2 = k4;
            }
        }
        return q.a.h(aVar2.q(), aVar2.n(), Math.max(mVar.b(), aVar.p()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer g() {
        return Integer.valueOf(i());
    }

    private int h(String str, int r7) {
        l lVar = this.f6131c.get();
        n nVar = this.f6132d.get();
        q.a c5 = lVar.c(str);
        m j4 = nVar.j(str, c5, r7);
        lVar.f(j4.c());
        q.a e5 = e(c5, j4);
        p1.v.a("IndexBackfiller", "Updating offset: %s", e5);
        lVar.h(str, e5);
        return j4.c().size();
    }

    private int i() {
        l lVar = this.f6131c.get();
        HashSet hashSet = new HashSet();
        int r22 = this.f6133e;
        while (r22 > 0) {
            String i4 = lVar.i();
            if (i4 == null || hashSet.contains(i4)) {
                break;
            }
            p1.v.a("IndexBackfiller", "Processing collection: %s", i4);
            r22 -= h(i4, r22);
            hashSet.add(i4);
        }
        return this.f6133e - r22;
    }

    public int d() {
        return ((Integer) this.f6130b.j("Backfill Indexes", new p1.y() { // from class: k1.g
            @Override // p1.y
            public final Object get() {
                Integer g5;
                g5 = k.this.g();
                return g5;
            }
        })).intValue();
    }

    public a f() {
        return this.f6129a;
    }
}
