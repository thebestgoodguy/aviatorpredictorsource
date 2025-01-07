package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.d0;
import com.google.protobuf.h0;
import com.google.protobuf.v0;
import com.google.protobuf.w.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class w<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final w f3083d = new w(true);

    /* renamed from: a, reason: collision with root package name */
    private final q1<T, Object> f3084a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3085b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3086c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3087a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3088b;

        static {
            int[] r02 = new int[b2.b.values().length];
            f3088b = r02;
            try {
                r02[b2.b.f2802g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3088b[b2.b.f2803h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3088b[b2.b.f2804i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3088b[b2.b.f2805j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3088b[b2.b.f2806k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3088b[b2.b.f2807l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3088b[b2.b.f2808m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3088b[b2.b.f2809n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3088b[b2.b.f2811p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3088b[b2.b.f2812q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3088b[b2.b.f2810o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3088b[b2.b.f2813r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3088b[b2.b.f2814s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3088b[b2.b.f2816u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3088b[b2.b.f2817v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3088b[b2.b.f2818w.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3088b[b2.b.f2819x.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3088b[b2.b.f2815t.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] r9 = new int[b2.c.values().length];
            f3087a = r9;
            try {
                r9[b2.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f3087a[b2.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f3087a[b2.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f3087a[b2.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f3087a[b2.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f3087a[b2.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f3087a[b2.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f3087a[b2.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f3087a[b2.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        int e();

        boolean f();

        b2.b j();

        b2.c l();

        boolean m();

        v0.a o(v0.a aVar, v0 v0Var);
    }

    private w() {
        this.f3084a = q1.q(16);
    }

    private w(q1<T, Object> q1Var) {
        this.f3084a = q1Var;
        t();
    }

    private w(boolean z4) {
        this(q1.q(0));
        t();
    }

    static void A(m mVar, b2.b bVar, Object obj) {
        switch (a.f3088b[bVar.ordinal()]) {
            case 1:
                mVar.s0(((Double) obj).doubleValue());
                return;
            case 2:
                mVar.A0(((Float) obj).floatValue());
                return;
            case 3:
                mVar.I0(((Long) obj).longValue());
                return;
            case 4:
                mVar.b1(((Long) obj).longValue());
                return;
            case 5:
                mVar.G0(((Integer) obj).intValue());
                return;
            case 6:
                mVar.y0(((Long) obj).longValue());
                return;
            case 7:
                mVar.w0(((Integer) obj).intValue());
                return;
            case 8:
                mVar.m0(((Boolean) obj).booleanValue());
                return;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                mVar.D0((v0) obj);
                return;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                mVar.K0((v0) obj);
                return;
            case 11:
                if (!(obj instanceof j)) {
                    mVar.W0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof j)) {
                    mVar.n0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                mVar.Z0(((Integer) obj).intValue());
                return;
            case 14:
                mVar.O0(((Integer) obj).intValue());
                return;
            case 15:
                mVar.Q0(((Long) obj).longValue());
                return;
            case 16:
                mVar.S0(((Integer) obj).intValue());
                return;
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                mVar.U0(((Long) obj).longValue());
                return;
            case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                mVar.u0(obj instanceof d0.c ? ((d0.c) obj).e() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        mVar.q0((j) obj);
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(b2.b bVar, int r22, Object obj) {
        int W = m.W(r22);
        if (bVar == b2.b.f2811p) {
            W *= 2;
        }
        return W + e(bVar, obj);
    }

    static int e(b2.b bVar, Object obj) {
        switch (a.f3088b[bVar.ordinal()]) {
            case 1:
                return m.k(((Double) obj).doubleValue());
            case 2:
                return m.s(((Float) obj).floatValue());
            case 3:
                return m.z(((Long) obj).longValue());
            case 4:
                return m.a0(((Long) obj).longValue());
            case 5:
                return m.x(((Integer) obj).intValue());
            case 6:
                return m.q(((Long) obj).longValue());
            case 7:
                return m.o(((Integer) obj).intValue());
            case 8:
                return m.f(((Boolean) obj).booleanValue());
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return m.u((v0) obj);
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return obj instanceof h0 ? m.C((h0) obj) : m.H((v0) obj);
            case 11:
                return obj instanceof j ? m.i((j) obj) : m.V((String) obj);
            case 12:
                return obj instanceof j ? m.i((j) obj) : m.g((byte[]) obj);
            case 13:
                return m.Y(((Integer) obj).intValue());
            case 14:
                return m.N(((Integer) obj).intValue());
            case 15:
                return m.P(((Long) obj).longValue());
            case 16:
                return m.R(((Integer) obj).intValue());
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return m.T(((Long) obj).longValue());
            case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return obj instanceof d0.c ? m.m(((d0.c) obj).e()) : m.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        b2.b j4 = bVar.j();
        int e5 = bVar.e();
        if (!bVar.f()) {
            return d(j4, e5, obj);
        }
        int r22 = 0;
        List list = (List) obj;
        if (bVar.m()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r22 += e(j4, it.next());
            }
            return m.W(e5) + r22 + m.L(r22);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            r22 += d(j4, e5, it2.next());
        }
        return r22;
    }

    public static <T extends b<T>> w<T> h() {
        return f3083d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.l() != b2.c.MESSAGE || key.f() || key.m()) {
            return f(key, value);
        }
        boolean z4 = value instanceof h0;
        int e5 = entry.getKey().e();
        return z4 ? m.A(e5, (h0) value) : m.E(e5, (v0) value);
    }

    static int m(b2.b bVar, boolean z4) {
        if (z4) {
            return 2;
        }
        return bVar.g();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.l() == b2.c.MESSAGE) {
            boolean f5 = key.f();
            Object value = entry.getValue();
            if (f5) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((v0) it.next()).j()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof v0)) {
                    if (value instanceof h0) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((v0) value).j()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean r(b2.b bVar, Object obj) {
        d0.a(obj);
        switch (a.f3087a[bVar.d().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof j) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof d0.c);
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return (obj instanceof v0) || (obj instanceof h0);
            default:
                return false;
        }
    }

    private void v(Map.Entry<T, Object> entry) {
        q1<T, Object> q1Var;
        Object c5;
        Object i4;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof h0) {
            value = ((h0) value).f();
        }
        if (key.f()) {
            Object i5 = i(key);
            if (i5 == null) {
                i5 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) i5).add(c(it.next()));
            }
            this.f3084a.put(key, i5);
            return;
        }
        if (key.l() != b2.c.MESSAGE || (i4 = i(key)) == null) {
            q1Var = this.f3084a;
            c5 = c(value);
        } else {
            c5 = key.o(((v0) i4).e(), (v0) value).t();
            q1Var = this.f3084a;
        }
        q1Var.put(key, c5);
    }

    public static <T extends b<T>> w<T> w() {
        return new w<>();
    }

    private void y(T t4, Object obj) {
        if (!r(t4.j(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t4.e()), t4.j().d(), obj.getClass().getName()));
        }
    }

    static void z(m mVar, b2.b bVar, int r32, Object obj) {
        if (bVar == b2.b.f2811p) {
            mVar.B0(r32, (v0) obj);
        } else {
            mVar.X0(r32, m(bVar, false));
            A(mVar, bVar, obj);
        }
    }

    public void a(T t4, Object obj) {
        List list;
        if (!t4.f()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(t4, obj);
        Object i4 = i(t4);
        if (i4 == null) {
            list = new ArrayList();
            this.f3084a.put(t4, list);
        } else {
            list = (List) i4;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w<T> clone() {
        w<T> w4 = w();
        for (int r12 = 0; r12 < this.f3084a.k(); r12++) {
            Map.Entry<T, Object> j4 = this.f3084a.j(r12);
            w4.x(j4.getKey(), j4.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f3084a.m()) {
            w4.x(entry.getKey(), entry.getValue());
        }
        w4.f3086c = this.f3086c;
        return w4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f3084a.equals(((w) obj).f3084a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        return this.f3086c ? new h0.c(this.f3084a.h().iterator()) : this.f3084a.h().iterator();
    }

    public int hashCode() {
        return this.f3084a.hashCode();
    }

    public Object i(T t4) {
        Object obj = this.f3084a.get(t4);
        return obj instanceof h0 ? ((h0) obj).f() : obj;
    }

    public int j() {
        int r12 = 0;
        for (int r02 = 0; r02 < this.f3084a.k(); r02++) {
            r12 += k(this.f3084a.j(r02));
        }
        Iterator<Map.Entry<T, Object>> it = this.f3084a.m().iterator();
        while (it.hasNext()) {
            r12 += k(it.next());
        }
        return r12;
    }

    public int l() {
        int r12 = 0;
        for (int r02 = 0; r02 < this.f3084a.k(); r02++) {
            Map.Entry<T, Object> j4 = this.f3084a.j(r02);
            r12 += f(j4.getKey(), j4.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f3084a.m()) {
            r12 += f(entry.getKey(), entry.getValue());
        }
        return r12;
    }

    boolean n() {
        return this.f3084a.isEmpty();
    }

    public boolean o() {
        return this.f3085b;
    }

    public boolean p() {
        for (int r12 = 0; r12 < this.f3084a.k(); r12++) {
            if (!q(this.f3084a.j(r12))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f3084a.m().iterator();
        while (it.hasNext()) {
            if (!q(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.f3086c ? new h0.c(this.f3084a.entrySet().iterator()) : this.f3084a.entrySet().iterator();
    }

    public void t() {
        if (this.f3085b) {
            return;
        }
        this.f3084a.p();
        this.f3085b = true;
    }

    public void u(w<T> wVar) {
        for (int r02 = 0; r02 < wVar.f3084a.k(); r02++) {
            v(wVar.f3084a.j(r02));
        }
        Iterator<Map.Entry<T, Object>> it = wVar.f3084a.m().iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public void x(T t4, Object obj) {
        if (!t4.f()) {
            y(t4, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y(t4, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof h0) {
            this.f3086c = true;
        }
        this.f3084a.put(t4, obj);
    }
}
