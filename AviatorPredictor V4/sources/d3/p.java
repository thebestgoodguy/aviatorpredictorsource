package d3;

import java.io.IOException;

/* loaded from: classes.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    private final h f3383a;

    /* renamed from: b, reason: collision with root package name */
    private final f3.c f3384b;

    /* renamed from: c, reason: collision with root package name */
    private int f3385c = 65535;

    /* renamed from: d, reason: collision with root package name */
    private final b f3386d = new b(0, 65535);

    private final class b {

        /* renamed from: a, reason: collision with root package name */
        final h4.c f3387a;

        /* renamed from: b, reason: collision with root package name */
        final int f3388b;

        /* renamed from: c, reason: collision with root package name */
        int f3389c;

        /* renamed from: d, reason: collision with root package name */
        int f3390d;

        /* renamed from: e, reason: collision with root package name */
        g f3391e;

        /* renamed from: f, reason: collision with root package name */
        boolean f3392f;

        b(int r22, int r32) {
            this.f3392f = false;
            this.f3388b = r22;
            this.f3389c = r32;
            this.f3387a = new h4.c();
        }

        b(p pVar, g gVar, int r4) {
            this(gVar.Q(), r4);
            this.f3391e = gVar;
        }

        void a(int r22) {
            this.f3390d += r22;
        }

        int b() {
            return this.f3390d;
        }

        void c() {
            this.f3390d = 0;
        }

        void d(h4.c cVar, int r5, boolean z4) {
            this.f3387a.w(cVar, r5);
            this.f3392f |= z4;
        }

        boolean e() {
            return this.f3387a.i0() > 0;
        }

        int f(int r32) {
            if (r32 <= 0 || Integer.MAX_VALUE - r32 >= this.f3389c) {
                int r02 = this.f3389c + r32;
                this.f3389c = r02;
                return r02;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f3388b);
        }

        int g() {
            return Math.max(0, Math.min(this.f3389c, (int) this.f3387a.i0()));
        }

        int h() {
            return g() - this.f3390d;
        }

        int i() {
            return this.f3389c;
        }

        int j() {
            return Math.min(this.f3389c, p.this.f3386d.i());
        }

        void k(h4.c cVar, int r8, boolean z4) {
            do {
                int min = Math.min(r8, p.this.f3384b.L());
                int r22 = -min;
                p.this.f3386d.f(r22);
                f(r22);
                try {
                    p.this.f3384b.h0(cVar.i0() == ((long) min) && z4, this.f3388b, cVar, min);
                    this.f3391e.u().q(min);
                    r8 -= min;
                } catch (IOException e5) {
                    throw new RuntimeException(e5);
                }
            } while (r8 > 0);
        }

        int l(int r9, c cVar) {
            int min = Math.min(r9, j());
            int r22 = 0;
            while (e() && min > 0) {
                if (min >= this.f3387a.i0()) {
                    r22 += (int) this.f3387a.i0();
                    h4.c cVar2 = this.f3387a;
                    k(cVar2, (int) cVar2.i0(), this.f3392f);
                } else {
                    r22 += min;
                    k(this.f3387a, min, false);
                }
                cVar.b();
                min = Math.min(r9 - r22, j());
            }
            return r22;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        int f3394a;

        private c() {
        }

        boolean a() {
            return this.f3394a > 0;
        }

        void b() {
            this.f3394a++;
        }
    }

    p(h hVar, f3.c cVar) {
        this.f3383a = (h) q0.l.o(hVar, "transport");
        this.f3384b = (f3.c) q0.l.o(cVar, "frameWriter");
    }

    private b f(g gVar) {
        b bVar = (b) gVar.O();
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, gVar, this.f3385c);
        gVar.R(bVar2);
        return bVar2;
    }

    void c(boolean z4, int r6, h4.c cVar, boolean z5) {
        q0.l.o(cVar, "source");
        g a02 = this.f3383a.a0(r6);
        if (a02 == null) {
            return;
        }
        b f5 = f(a02);
        int j4 = f5.j();
        boolean e5 = f5.e();
        int i02 = (int) cVar.i0();
        if (e5 || j4 < i02) {
            if (!e5 && j4 > 0) {
                f5.k(cVar, j4, false);
            }
            f5.d(cVar, (int) cVar.i0(), z4);
        } else {
            f5.k(cVar, i02, z4);
        }
        if (z5) {
            d();
        }
    }

    void d() {
        try {
            this.f3384b.flush();
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    boolean e(int r8) {
        if (r8 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + r8);
        }
        int r02 = r8 - this.f3385c;
        this.f3385c = r8;
        for (g gVar : this.f3383a.V()) {
            b bVar = (b) gVar.O();
            if (bVar == null) {
                gVar.R(new b(this, gVar, this.f3385c));
            } else {
                bVar.f(r02);
            }
        }
        return r02 > 0;
    }

    int g(g gVar, int r4) {
        if (gVar == null) {
            int f5 = this.f3386d.f(r4);
            h();
            return f5;
        }
        b f6 = f(gVar);
        int f7 = f6.f(r4);
        c cVar = new c();
        f6.l(f6.j(), cVar);
        if (cVar.a()) {
            d();
        }
        return f7;
    }

    void h() {
        int r32;
        g[] V = this.f3383a.V();
        int i4 = this.f3386d.i();
        int length = V.length;
        while (true) {
            r32 = 0;
            if (length <= 0 || i4 <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i4 / length);
            for (int r5 = 0; r5 < length && i4 > 0; r5++) {
                g gVar = V[r5];
                b f5 = f(gVar);
                int min = Math.min(i4, Math.min(f5.h(), ceil));
                if (min > 0) {
                    f5.a(min);
                    i4 -= min;
                }
                if (f5.h() > 0) {
                    V[r32] = gVar;
                    r32++;
                }
            }
            length = r32;
        }
        c cVar = new c();
        g[] V2 = this.f3383a.V();
        int length2 = V2.length;
        while (r32 < length2) {
            b f6 = f(V2[r32]);
            f6.l(f6.b(), cVar);
            f6.c();
            r32++;
        }
        if (cVar.a()) {
            d();
        }
    }
}
