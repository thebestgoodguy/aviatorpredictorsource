package k1;

import android.util.SparseArray;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import k1.l0;
import p1.g;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: c, reason: collision with root package name */
    private static final long f6147c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f6148d;

    /* renamed from: a, reason: collision with root package name */
    private final h0 f6149a;

    /* renamed from: b, reason: collision with root package name */
    private final b f6150b;

    public class a implements z3 {

        /* renamed from: a, reason: collision with root package name */
        private final p1.g f6151a;

        /* renamed from: b, reason: collision with root package name */
        private final f0 f6152b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6153c = false;

        /* renamed from: d, reason: collision with root package name */
        private g.b f6154d;

        public a(p1.g gVar, f0 f0Var) {
            this.f6151a = gVar;
            this.f6152b = f0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            this.f6152b.x(l0.this);
            this.f6153c = true;
            e();
        }

        private void e() {
            this.f6154d = this.f6151a.k(g.d.GARBAGE_COLLECTION, this.f6153c ? l0.f6148d : l0.f6147c, new Runnable() { // from class: k1.k0
                @Override // java.lang.Runnable
                public final void run() {
                    l0.a.this.d();
                }
            });
        }

        @Override // k1.z3
        public void a() {
            if (l0.this.f6150b.f6156a != -1) {
                e();
            }
        }

        @Override // k1.z3
        public void b() {
            g.b bVar = this.f6154d;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final long f6156a;

        /* renamed from: b, reason: collision with root package name */
        final int f6157b;

        /* renamed from: c, reason: collision with root package name */
        final int f6158c;

        b(long j4, int r32, int r4) {
            this.f6156a = j4;
            this.f6157b = r32;
            this.f6158c = r4;
        }

        public static b a(long j4) {
            return new b(j4, 10, 1000);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f6159a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6160b;

        /* renamed from: c, reason: collision with root package name */
        private final int f6161c;

        /* renamed from: d, reason: collision with root package name */
        private final int f6162d;

        c(boolean z4, int r22, int r32, int r4) {
            this.f6159a = z4;
            this.f6160b = r22;
            this.f6161c = r32;
            this.f6162d = r4;
        }

        static c a() {
            return new c(false, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<Long> f6163c = new Comparator() { // from class: k1.m0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d5;
                d5 = l0.d.d((Long) obj, (Long) obj2);
                return d5;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final PriorityQueue<Long> f6164a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6165b;

        d(int r32) {
            this.f6165b = r32;
            this.f6164a = new PriorityQueue<>(r32, f6163c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int d(Long l4, Long l5) {
            return l5.compareTo(l4);
        }

        void b(Long l4) {
            if (this.f6164a.size() >= this.f6165b) {
                if (l4.longValue() >= this.f6164a.peek().longValue()) {
                    return;
                } else {
                    this.f6164a.poll();
                }
            }
            this.f6164a.add(l4);
        }

        long c() {
            return this.f6164a.peek().longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f6147c = timeUnit.toMillis(1L);
        f6148d = timeUnit.toMillis(5L);
    }

    l0(h0 h0Var, b bVar) {
        this.f6149a = h0Var;
        this.f6150b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(d dVar, b4 b4Var) {
        dVar.b(Long.valueOf(b4Var.d()));
    }

    private c m(SparseArray<?> sparseArray) {
        long currentTimeMillis = System.currentTimeMillis();
        int e5 = e(this.f6150b.f6157b);
        if (e5 > this.f6150b.f6158c) {
            p1.v.a("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.f6150b.f6158c + " from " + e5, new Object[0]);
            e5 = this.f6150b.f6158c;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        long h5 = h(e5);
        long currentTimeMillis3 = System.currentTimeMillis();
        int l4 = l(h5, sparseArray);
        long currentTimeMillis4 = System.currentTimeMillis();
        int k4 = k(h5);
        long currentTimeMillis5 = System.currentTimeMillis();
        if (p1.v.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("LRU Garbage Collection:\n\tCounted targets in " + (currentTimeMillis2 - currentTimeMillis) + "ms\n");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", Integer.valueOf(e5), Long.valueOf(currentTimeMillis3 - currentTimeMillis2)));
            p1.v.a("LruGarbageCollector", ((sb.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", Integer.valueOf(l4), Long.valueOf(currentTimeMillis4 - currentTimeMillis3))) + String.format(locale, "\tRemoved %d documents in %dms\n", Integer.valueOf(k4), Long.valueOf(currentTimeMillis5 - currentTimeMillis4))) + String.format(locale, "Total Duration: %dms", Long.valueOf(currentTimeMillis5 - currentTimeMillis)), new Object[0]);
        }
        return new c(true, e5, l4, k4);
    }

    int e(int r4) {
        return (int) ((r4 / 100.0f) * this.f6149a.c());
    }

    c f(SparseArray<?> sparseArray) {
        if (this.f6150b.f6156a == -1) {
            p1.v.a("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
        } else {
            long g5 = g();
            if (g5 >= this.f6150b.f6156a) {
                return m(sparseArray);
            }
            p1.v.a("LruGarbageCollector", "Garbage collection skipped; Cache size " + g5 + " is lower than threshold " + this.f6150b.f6156a, new Object[0]);
        }
        return c.a();
    }

    long g() {
        return this.f6149a.b();
    }

    long h(int r32) {
        if (r32 == 0) {
            return -1L;
        }
        final d dVar = new d(r32);
        this.f6149a.o(new p1.n() { // from class: k1.i0
            @Override // p1.n
            public final void accept(Object obj) {
                l0.i(l0.d.this, (b4) obj);
            }
        });
        this.f6149a.m(new p1.n() { // from class: k1.j0
            @Override // p1.n
            public final void accept(Object obj) {
                l0.d.this.b((Long) obj);
            }
        });
        return dVar.c();
    }

    public a j(p1.g gVar, f0 f0Var) {
        return new a(gVar, f0Var);
    }

    int k(long j4) {
        return this.f6149a.g(j4);
    }

    int l(long j4, SparseArray<?> sparseArray) {
        return this.f6149a.e(j4, sparseArray);
    }
}
