package f3;

import h4.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final h4.f f3728a = h4.f.i(":");

    /* renamed from: b, reason: collision with root package name */
    private static final d[] f3729b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<h4.f, Integer> f3730c;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<d> f3731a;

        /* renamed from: b, reason: collision with root package name */
        private final h4.e f3732b;

        /* renamed from: c, reason: collision with root package name */
        private int f3733c;

        /* renamed from: d, reason: collision with root package name */
        private int f3734d;

        /* renamed from: e, reason: collision with root package name */
        d[] f3735e;

        /* renamed from: f, reason: collision with root package name */
        int f3736f;

        /* renamed from: g, reason: collision with root package name */
        int f3737g;

        /* renamed from: h, reason: collision with root package name */
        int f3738h;

        a(int r22, int r32, n nVar) {
            this.f3731a = new ArrayList();
            this.f3735e = new d[8];
            this.f3736f = r0.length - 1;
            this.f3737g = 0;
            this.f3738h = 0;
            this.f3733c = r22;
            this.f3734d = r32;
            this.f3732b = h4.g.b(nVar);
        }

        a(int r12, n nVar) {
            this(r12, r12, nVar);
        }

        private void a() {
            int r02 = this.f3734d;
            int r12 = this.f3738h;
            if (r02 < r12) {
                if (r02 == 0) {
                    b();
                } else {
                    d(r12 - r02);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f3735e, (Object) null);
            this.f3736f = this.f3735e.length - 1;
            this.f3737g = 0;
            this.f3738h = 0;
        }

        private int c(int r22) {
            return this.f3736f + 1 + r22;
        }

        private int d(int r5) {
            int r22;
            int r02 = 0;
            if (r5 > 0) {
                int length = this.f3735e.length;
                while (true) {
                    length--;
                    r22 = this.f3736f;
                    if (length < r22 || r5 <= 0) {
                        break;
                    }
                    d[] dVarArr = this.f3735e;
                    r5 -= dVarArr[length].f3722c;
                    this.f3738h -= dVarArr[length].f3722c;
                    this.f3737g--;
                    r02++;
                }
                d[] dVarArr2 = this.f3735e;
                System.arraycopy(dVarArr2, r22 + 1, dVarArr2, r22 + 1 + r02, this.f3737g);
                this.f3736f += r02;
            }
            return r02;
        }

        private h4.f f(int r4) {
            d dVar;
            if (!i(r4)) {
                int c5 = c(r4 - f.f3729b.length);
                if (c5 >= 0) {
                    d[] dVarArr = this.f3735e;
                    if (c5 < dVarArr.length) {
                        dVar = dVarArr[c5];
                    }
                }
                throw new IOException("Header index too large " + (r4 + 1));
            }
            dVar = f.f3729b[r4];
            return dVar.f3720a;
        }

        private void h(int r6, d dVar) {
            this.f3731a.add(dVar);
            int r02 = dVar.f3722c;
            if (r6 != -1) {
                r02 -= this.f3735e[c(r6)].f3722c;
            }
            int r22 = this.f3734d;
            if (r02 > r22) {
                b();
                return;
            }
            int d5 = d((this.f3738h + r02) - r22);
            if (r6 == -1) {
                int r62 = this.f3737g + 1;
                d[] dVarArr = this.f3735e;
                if (r62 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f3736f = this.f3735e.length - 1;
                    this.f3735e = dVarArr2;
                }
                int r63 = this.f3736f;
                this.f3736f = r63 - 1;
                this.f3735e[r63] = dVar;
                this.f3737g++;
            } else {
                this.f3735e[r6 + c(r6) + d5] = dVar;
            }
            this.f3738h += r02;
        }

        private boolean i(int r32) {
            return r32 >= 0 && r32 <= f.f3729b.length - 1;
        }

        private int j() {
            return this.f3732b.g0() & 255;
        }

        private void m(int r4) {
            if (i(r4)) {
                this.f3731a.add(f.f3729b[r4]);
                return;
            }
            int c5 = c(r4 - f.f3729b.length);
            if (c5 >= 0) {
                d[] dVarArr = this.f3735e;
                if (c5 <= dVarArr.length - 1) {
                    this.f3731a.add(dVarArr[c5]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (r4 + 1));
        }

        private void o(int r32) {
            h(-1, new d(f(r32), k()));
        }

        private void p() {
            h(-1, new d(f.e(k()), k()));
        }

        private void q(int r4) {
            this.f3731a.add(new d(f(r4), k()));
        }

        private void r() {
            this.f3731a.add(new d(f.e(k()), k()));
        }

        public List<d> e() {
            ArrayList arrayList = new ArrayList(this.f3731a);
            this.f3731a.clear();
            return arrayList;
        }

        void g(int r12) {
            this.f3733c = r12;
            this.f3734d = r12;
            a();
        }

        h4.f k() {
            int j4 = j();
            boolean z4 = (j4 & 128) == 128;
            int n4 = n(j4, 127);
            return z4 ? h4.f.p(h.f().c(this.f3732b.b0(n4))) : this.f3732b.x(n4);
        }

        void l() {
            while (!this.f3732b.Y()) {
                int g02 = this.f3732b.g0() & 255;
                if (g02 == 128) {
                    throw new IOException("index == 0");
                }
                if ((g02 & 128) == 128) {
                    m(n(g02, 127) - 1);
                } else if (g02 == 64) {
                    p();
                } else if ((g02 & 64) == 64) {
                    o(n(g02, 63) - 1);
                } else if ((g02 & 32) == 32) {
                    int n4 = n(g02, 31);
                    this.f3734d = n4;
                    if (n4 < 0 || n4 > this.f3733c) {
                        throw new IOException("Invalid dynamic table size update " + this.f3734d);
                    }
                    a();
                } else if (g02 == 16 || g02 == 0) {
                    r();
                } else {
                    q(n(g02, 15) - 1);
                }
            }
        }

        int n(int r32, int r4) {
            int r33 = r32 & r4;
            if (r33 < r4) {
                return r33;
            }
            int r34 = 0;
            while (true) {
                int j4 = j();
                if ((j4 & 128) == 0) {
                    return r4 + (j4 << r34);
                }
                r4 += (j4 & 127) << r34;
                r34 += 7;
            }
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final h4.c f3739a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f3740b;

        /* renamed from: c, reason: collision with root package name */
        int f3741c;

        /* renamed from: d, reason: collision with root package name */
        private int f3742d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3743e;

        /* renamed from: f, reason: collision with root package name */
        private int f3744f;

        /* renamed from: g, reason: collision with root package name */
        d[] f3745g;

        /* renamed from: h, reason: collision with root package name */
        int f3746h;

        /* renamed from: i, reason: collision with root package name */
        private int f3747i;

        /* renamed from: j, reason: collision with root package name */
        private int f3748j;

        b(int r22, boolean z4, h4.c cVar) {
            this.f3742d = Integer.MAX_VALUE;
            this.f3745g = new d[8];
            this.f3747i = r0.length - 1;
            this.f3741c = r22;
            this.f3744f = r22;
            this.f3740b = z4;
            this.f3739a = cVar;
        }

        b(h4.c cVar) {
            this(4096, false, cVar);
        }

        private void a() {
            Arrays.fill(this.f3745g, (Object) null);
            this.f3747i = this.f3745g.length - 1;
            this.f3746h = 0;
            this.f3748j = 0;
        }

        private int b(int r5) {
            int r22;
            int r02 = 0;
            if (r5 > 0) {
                int length = this.f3745g.length;
                while (true) {
                    length--;
                    r22 = this.f3747i;
                    if (length < r22 || r5 <= 0) {
                        break;
                    }
                    d[] dVarArr = this.f3745g;
                    r5 -= dVarArr[length].f3722c;
                    this.f3748j -= dVarArr[length].f3722c;
                    this.f3746h--;
                    r02++;
                }
                d[] dVarArr2 = this.f3745g;
                System.arraycopy(dVarArr2, r22 + 1, dVarArr2, r22 + 1 + r02, this.f3746h);
                this.f3747i += r02;
            }
            return r02;
        }

        private void c(d dVar) {
            int r02 = dVar.f3722c;
            int r12 = this.f3744f;
            if (r02 > r12) {
                a();
                return;
            }
            b((this.f3748j + r02) - r12);
            int r13 = this.f3746h + 1;
            d[] dVarArr = this.f3745g;
            if (r13 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f3747i = this.f3745g.length - 1;
                this.f3745g = dVarArr2;
            }
            int r14 = this.f3747i;
            this.f3747i = r14 - 1;
            this.f3745g[r14] = dVar;
            this.f3746h++;
            this.f3748j += r02;
        }

        void d(h4.f fVar) {
            int s4;
            int r22;
            if (!this.f3740b || h.f().e(fVar.w()) >= fVar.s()) {
                s4 = fVar.s();
                r22 = 0;
            } else {
                h4.c cVar = new h4.c();
                h.f().d(fVar.w(), cVar.r());
                fVar = cVar.y();
                s4 = fVar.s();
                r22 = 128;
            }
            f(s4, 127, r22);
            this.f3739a.m0(fVar);
        }

        void e(List<d> list) {
            int r6;
            int r8;
            if (this.f3743e) {
                int r02 = this.f3742d;
                if (r02 < this.f3744f) {
                    f(r02, 31, 32);
                }
                this.f3743e = false;
                this.f3742d = Integer.MAX_VALUE;
                f(this.f3744f, 31, 32);
            }
            int size = list.size();
            for (int r22 = 0; r22 < size; r22++) {
                d dVar = list.get(r22);
                h4.f v4 = dVar.f3720a.v();
                h4.f fVar = dVar.f3721b;
                Integer num = (Integer) f.f3730c.get(v4);
                if (num != null) {
                    r6 = num.intValue() + 1;
                    if (r6 >= 2 && r6 <= 7) {
                        if (f.f3729b[r6 - 1].f3721b.equals(fVar)) {
                            r8 = r6;
                        } else if (f.f3729b[r6].f3721b.equals(fVar)) {
                            r8 = r6;
                            r6++;
                        }
                    }
                    r8 = r6;
                    r6 = -1;
                } else {
                    r6 = -1;
                    r8 = -1;
                }
                if (r6 == -1) {
                    int r9 = this.f3747i;
                    while (true) {
                        r9++;
                        d[] dVarArr = this.f3745g;
                        if (r9 >= dVarArr.length) {
                            break;
                        }
                        if (dVarArr[r9].f3720a.equals(v4)) {
                            if (this.f3745g[r9].f3721b.equals(fVar)) {
                                r6 = f.f3729b.length + (r9 - this.f3747i);
                                break;
                            } else if (r8 == -1) {
                                r8 = (r9 - this.f3747i) + f.f3729b.length;
                            }
                        }
                    }
                }
                if (r6 != -1) {
                    f(r6, 127, 128);
                } else {
                    if (r8 == -1) {
                        this.f3739a.Z(64);
                        d(v4);
                    } else if (!v4.t(f.f3728a) || d.f3717h.equals(v4)) {
                        f(r8, 63, 64);
                    } else {
                        f(r8, 15, 0);
                        d(fVar);
                    }
                    d(fVar);
                    c(dVar);
                }
            }
        }

        void f(int r22, int r32, int r4) {
            int r23;
            h4.c cVar;
            if (r22 < r32) {
                cVar = this.f3739a;
                r23 = r22 | r4;
            } else {
                this.f3739a.Z(r4 | r32);
                r23 = r22 - r32;
                while (r23 >= 128) {
                    this.f3739a.Z(128 | (r23 & 127));
                    r23 >>>= 7;
                }
                cVar = this.f3739a;
            }
            cVar.Z(r23);
        }
    }

    static {
        h4.f fVar = d.f3714e;
        h4.f fVar2 = d.f3715f;
        h4.f fVar3 = d.f3716g;
        h4.f fVar4 = d.f3713d;
        f3729b = new d[]{new d(d.f3717h, ""), new d(fVar, "GET"), new d(fVar, "POST"), new d(fVar2, "/"), new d(fVar2, "/index.html"), new d(fVar3, "http"), new d(fVar3, "https"), new d(fVar4, "200"), new d(fVar4, "204"), new d(fVar4, "206"), new d(fVar4, "304"), new d(fVar4, "400"), new d(fVar4, "404"), new d(fVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f3730c = f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h4.f e(h4.f fVar) {
        int s4 = fVar.s();
        for (int r12 = 0; r12 < s4; r12++) {
            byte k4 = fVar.k(r12);
            if (k4 >= 65 && k4 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.x());
            }
        }
        return fVar;
    }

    private static Map<h4.f, Integer> f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f3729b.length);
        int r12 = 0;
        while (true) {
            d[] dVarArr = f3729b;
            if (r12 >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[r12].f3720a)) {
                linkedHashMap.put(dVarArr[r12].f3720a, Integer.valueOf(r12));
            }
            r12++;
        }
    }
}
