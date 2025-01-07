package j1;

import com.google.protobuf.t1;
import java.util.Iterator;
import java.util.Map;
import l1.u;
import l1.y;
import x1.r;
import x1.x;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5941a = new c();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5942a;

        static {
            int[] r02 = new int[x.c.values().length];
            f5942a = r02;
            try {
                r02[x.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5942a[x.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5942a[x.c.DOUBLE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5942a[x.c.INTEGER_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5942a[x.c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5942a[x.c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5942a[x.c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5942a[x.c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5942a[x.c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5942a[x.c.MAP_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5942a[x.c.ARRAY_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private c() {
    }

    private void a(x1.a aVar, b bVar) {
        i(bVar, 50);
        Iterator<x> it = aVar.k().iterator();
        while (it.hasNext()) {
            f(it.next(), bVar);
        }
    }

    private void b(String str, b bVar) {
        i(bVar, 37);
        u x4 = u.x(str);
        int s4 = x4.s();
        for (int r12 = 5; r12 < s4; r12++) {
            String p4 = x4.p(r12);
            i(bVar, 60);
            h(p4, bVar);
        }
    }

    private void c(r rVar, b bVar) {
        i(bVar, 55);
        for (Map.Entry<String, x> entry : rVar.X().entrySet()) {
            String key = entry.getKey();
            x value = entry.getValue();
            d(key, bVar);
            f(value, bVar);
        }
    }

    private void d(String str, b bVar) {
        i(bVar, 25);
        h(str, bVar);
    }

    private void f(x xVar, b bVar) {
        int r5;
        long j4;
        double d5;
        switch (a.f5942a[xVar.q0().ordinal()]) {
            case 1:
                r5 = 5;
                i(bVar, r5);
                return;
            case 2:
                i(bVar, 10);
                j4 = xVar.g0() ? 1L : 0L;
                bVar.d(j4);
                return;
            case 3:
                double j02 = xVar.j0();
                if (Double.isNaN(j02)) {
                    r5 = 13;
                    i(bVar, r5);
                    return;
                }
                i(bVar, 15);
                if (j02 != -0.0d) {
                    bVar.b(j02);
                    return;
                } else {
                    d5 = 0.0d;
                    bVar.b(d5);
                    return;
                }
            case 4:
                i(bVar, 15);
                d5 = xVar.l0();
                bVar.b(d5);
                return;
            case 5:
                t1 p02 = xVar.p0();
                i(bVar, 20);
                bVar.d(p02.Y());
                j4 = p02.X();
                bVar.d(j4);
                return;
            case 6:
                d(xVar.o0(), bVar);
                g(bVar);
                return;
            case 7:
                i(bVar, 30);
                bVar.a(xVar.h0());
                g(bVar);
                return;
            case 8:
                b(xVar.n0(), bVar);
                return;
            case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                b2.a k02 = xVar.k0();
                i(bVar, 45);
                bVar.b(k02.X());
                d5 = k02.Y();
                bVar.b(d5);
                return;
            case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                if (y.x(xVar)) {
                    r5 = Integer.MAX_VALUE;
                    i(bVar, r5);
                    return;
                } else {
                    c(xVar.m0(), bVar);
                    g(bVar);
                    return;
                }
            case 11:
                a(xVar.f0(), bVar);
                g(bVar);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + xVar.q0());
        }
    }

    private void g(b bVar) {
        bVar.d(2L);
    }

    private void h(String str, b bVar) {
        bVar.e(str);
    }

    private void i(b bVar, int r4) {
        bVar.d(r4);
    }

    public void e(x xVar, b bVar) {
        f(xVar, bVar);
        bVar.c();
    }
}
