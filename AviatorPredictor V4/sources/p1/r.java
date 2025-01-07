package p1;

import java.util.Date;
import p1.g;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final g f7055a;

    /* renamed from: b, reason: collision with root package name */
    private final g.d f7056b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7057c;

    /* renamed from: d, reason: collision with root package name */
    private final double f7058d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7059e;

    /* renamed from: f, reason: collision with root package name */
    private long f7060f;

    /* renamed from: g, reason: collision with root package name */
    private long f7061g;

    /* renamed from: h, reason: collision with root package name */
    private long f7062h;

    /* renamed from: i, reason: collision with root package name */
    private g.b f7063i;

    public r(g gVar, g.d dVar) {
        this(gVar, dVar, 1000L, 1.5d, 60000L);
    }

    public r(g gVar, g.d dVar, long j4, double d5, long j5) {
        this.f7055a = gVar;
        this.f7056b = dVar;
        this.f7057c = j4;
        this.f7058d = d5;
        this.f7059e = j5;
        this.f7060f = j5;
        this.f7062h = new Date().getTime();
        f();
    }

    private long d() {
        return (long) ((Math.random() - 0.5d) * this.f7061g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Runnable runnable) {
        this.f7062h = new Date().getTime();
        runnable.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
    
        if (r0 > r2) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(final java.lang.Runnable r12) {
        /*
            r11 = this;
            r11.c()
            long r0 = r11.f7061g
            long r2 = r11.d()
            long r0 = r0 + r2
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r2 = r2.getTime()
            long r4 = r11.f7062h
            long r2 = r2 - r4
            r4 = 0
            long r2 = java.lang.Math.max(r4, r2)
            long r6 = r0 - r2
            long r6 = java.lang.Math.max(r4, r6)
            long r8 = r11.f7061g
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L56
            java.lang.Class r4 = r11.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r8 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            r5[r8] = r9
            r8 = 1
            long r9 = r11.f7061g
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r5[r8] = r9
            r8 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5[r8] = r0
            r0 = 3
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r5[r0] = r1
            java.lang.String r0 = "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)"
            p1.v.a(r4, r0, r5)
        L56:
            p1.g r0 = r11.f7055a
            p1.g$d r1 = r11.f7056b
            p1.q r2 = new p1.q
            r2.<init>()
            p1.g$b r12 = r0.k(r1, r6, r2)
            r11.f7063i = r12
            long r0 = r11.f7061g
            double r0 = (double) r0
            double r2 = r11.f7058d
            double r0 = r0 * r2
            long r0 = (long) r0
            r11.f7061g = r0
            long r2 = r11.f7057c
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 >= 0) goto L78
        L75:
            r11.f7061g = r2
            goto L7f
        L78:
            long r2 = r11.f7060f
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 <= 0) goto L7f
            goto L75
        L7f:
            long r0 = r11.f7059e
            r11.f7060f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.r.b(java.lang.Runnable):void");
    }

    public void c() {
        g.b bVar = this.f7063i;
        if (bVar != null) {
            bVar.c();
            this.f7063i = null;
        }
    }

    public void f() {
        this.f7061g = 0L;
    }

    public void g() {
        this.f7061g = this.f7060f;
    }

    public void h(long j4) {
        this.f7060f = j4;
    }
}
