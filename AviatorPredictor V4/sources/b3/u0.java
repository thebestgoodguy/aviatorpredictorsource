package b3;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f901c = Logger.getLogger(u0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final e<byte[]> f902d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final d<String> f903e = new b();

    /* renamed from: f, reason: collision with root package name */
    static final s0.a f904f = s0.a.a().k();

    /* renamed from: a, reason: collision with root package name */
    private Object[] f905a;

    /* renamed from: b, reason: collision with root package name */
    private int f906b;

    class a implements e<byte[]> {
        a() {
        }
    }

    class b implements d<String> {
        b() {
        }

        @Override // b3.u0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b(String str) {
            return str;
        }

        @Override // b3.u0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            return str;
        }
    }

    private static class c<T> extends g<T> {

        /* renamed from: f, reason: collision with root package name */
        private final d<T> f907f;

        private c(String str, boolean z4, d<T> dVar) {
            super(str, z4, dVar, null);
            q0.l.k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f907f = (d) q0.l.o(dVar, "marshaller");
        }

        /* synthetic */ c(String str, boolean z4, d dVar, a aVar) {
            this(str, z4, dVar);
        }

        @Override // b3.u0.g
        T h(byte[] bArr) {
            return this.f907f.b(new String(bArr, q0.b.f7136a));
        }

        @Override // b3.u0.g
        byte[] j(T t4) {
            return this.f907f.a(t4).getBytes(q0.b.f7136a);
        }
    }

    public interface d<T> {
        String a(T t4);

        T b(String str);
    }

    public interface e<T> {
    }

    public interface f<T> {
        InputStream a(T t4);

        T b(InputStream inputStream);
    }

    public static abstract class g<T> {

        /* renamed from: e, reason: collision with root package name */
        private static final BitSet f908e = b();

        /* renamed from: a, reason: collision with root package name */
        private final String f909a;

        /* renamed from: b, reason: collision with root package name */
        private final String f910b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f911c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f912d;

        private g(String str, boolean z4, Object obj) {
            String str2 = (String) q0.l.o(str, "name");
            this.f909a = str2;
            String k4 = k(str2.toLowerCase(Locale.ROOT), z4);
            this.f910b = k4;
            this.f911c = k4.getBytes(q0.b.f7136a);
            this.f912d = obj;
        }

        /* synthetic */ g(String str, boolean z4, Object obj, a aVar) {
            this(str, z4, obj);
        }

        private static BitSet b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c5 = '0'; c5 <= '9'; c5 = (char) (c5 + 1)) {
                bitSet.set(c5);
            }
            for (char c6 = 'a'; c6 <= 'z'; c6 = (char) (c6 + 1)) {
                bitSet.set(c6);
            }
            return bitSet;
        }

        public static <T> g<T> e(String str, d<T> dVar) {
            return f(str, false, dVar);
        }

        static <T> g<T> f(String str, boolean z4, d<T> dVar) {
            return new c(str, z4, dVar, null);
        }

        static <T> g<T> g(String str, boolean z4, j<T> jVar) {
            return new i(str, z4, jVar, null);
        }

        private static String k(String str, boolean z4) {
            q0.l.o(str, "name");
            q0.l.e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                u0.f901c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int r02 = 0; r02 < str.length(); r02++) {
                char charAt = str.charAt(r02);
                if (!z4 || charAt != ':' || r02 != 0) {
                    q0.l.g(f908e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        byte[] a() {
            return this.f911c;
        }

        final <M> M c(Class<M> cls) {
            if (cls.isInstance(this.f912d)) {
                return cls.cast(this.f912d);
            }
            return null;
        }

        public final String d() {
            return this.f910b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f910b.equals(((g) obj).f910b);
        }

        abstract T h(byte[] bArr);

        public final int hashCode() {
            return this.f910b.hashCode();
        }

        boolean i() {
            return false;
        }

        abstract byte[] j(T t4);

        public String toString() {
            return "Key{name='" + this.f910b + "'}";
        }
    }

    static final class h<T> {

        /* renamed from: a, reason: collision with root package name */
        private final f<T> f913a;

        /* renamed from: b, reason: collision with root package name */
        private final T f914b;

        /* renamed from: c, reason: collision with root package name */
        private volatile byte[] f915c;

        h(f<T> fVar, T t4) {
            this.f913a = fVar;
            this.f914b = t4;
        }

        static <T> h<T> a(g<T> gVar, T t4) {
            return new h<>((f) q0.l.n(b(gVar)), t4);
        }

        private static <T> f<T> b(g<T> gVar) {
            return (f) gVar.c(f.class);
        }

        byte[] c() {
            if (this.f915c == null) {
                synchronized (this) {
                    if (this.f915c == null) {
                        this.f915c = u0.r(e());
                    }
                }
            }
            return this.f915c;
        }

        <T2> T2 d(g<T2> gVar) {
            f b5;
            return (!gVar.i() || (b5 = b(gVar)) == null) ? gVar.h(c()) : (T2) b5.b(e());
        }

        InputStream e() {
            return this.f913a.a(this.f914b);
        }
    }

    private static final class i<T> extends g<T> {

        /* renamed from: f, reason: collision with root package name */
        private final j<T> f916f;

        private i(String str, boolean z4, j<T> jVar) {
            super(str, z4, jVar, null);
            q0.l.k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f916f = (j) q0.l.o(jVar, "marshaller");
        }

        /* synthetic */ i(String str, boolean z4, j jVar, a aVar) {
            this(str, z4, jVar);
        }

        @Override // b3.u0.g
        T h(byte[] bArr) {
            return this.f916f.b(bArr);
        }

        @Override // b3.u0.g
        byte[] j(T t4) {
            return this.f916f.a(t4);
        }
    }

    interface j<T> {
        byte[] a(T t4);

        T b(byte[] bArr);
    }

    public u0() {
    }

    u0(int r12, Object[] objArr) {
        this.f906b = r12;
        this.f905a = objArr;
    }

    u0(int r12, byte[]... bArr) {
        this(r12, (Object[]) bArr);
    }

    u0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    private boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private int d() {
        Object[] objArr = this.f905a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private void f(int r4) {
        Object[] objArr = new Object[r4];
        if (!i()) {
            System.arraycopy(this.f905a, 0, objArr, 0, k());
        }
        this.f905a = objArr;
    }

    private boolean i() {
        return this.f906b == 0;
    }

    private int k() {
        return this.f906b * 2;
    }

    private void l() {
        if (k() == 0 || k() == d()) {
            f(Math.max(k() * 2, 8));
        }
    }

    private void n(int r22, byte[] bArr) {
        this.f905a[r22 * 2] = bArr;
    }

    private byte[] o(int r22) {
        return (byte[]) this.f905a[r22 * 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] r(InputStream inputStream) {
        try {
            return s0.b.d(inputStream);
        } catch (IOException e5) {
            throw new RuntimeException("failure reading serialized stream", e5);
        }
    }

    private Object s(int r22) {
        return this.f905a[(r22 * 2) + 1];
    }

    private void t(int r22, Object obj) {
        if (this.f905a instanceof byte[][]) {
            f(d());
        }
        this.f905a[(r22 * 2) + 1] = obj;
    }

    private void u(int r22, byte[] bArr) {
        this.f905a[(r22 * 2) + 1] = bArr;
    }

    private byte[] v(int r22) {
        Object s4 = s(r22);
        return s4 instanceof byte[] ? (byte[]) s4 : ((h) s4).c();
    }

    private <T> T w(int r22, g<T> gVar) {
        Object s4 = s(r22);
        return s4 instanceof byte[] ? gVar.h((byte[]) s4) : (T) ((h) s4).d(gVar);
    }

    public <T> void e(g<T> gVar) {
        if (i()) {
            return;
        }
        int r12 = 0;
        for (int r02 = 0; r02 < this.f906b; r02++) {
            if (!c(gVar.a(), o(r02))) {
                n(r12, o(r02));
                t(r12, s(r02));
                r12++;
            }
        }
        Arrays.fill(this.f905a, r12 * 2, k(), (Object) null);
        this.f906b = r12;
    }

    public <T> T g(g<T> gVar) {
        for (int r02 = this.f906b - 1; r02 >= 0; r02--) {
            if (c(gVar.a(), o(r02))) {
                return (T) w(r02, gVar);
            }
        }
        return null;
    }

    int h() {
        return this.f906b;
    }

    public Set<String> j() {
        if (i()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f906b);
        for (int r22 = 0; r22 < this.f906b; r22++) {
            hashSet.add(new String(o(r22), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void m(u0 u0Var) {
        if (u0Var.i()) {
            return;
        }
        int d5 = d() - k();
        if (i() || d5 < u0Var.k()) {
            f(k() + u0Var.k());
        }
        System.arraycopy(u0Var.f905a, 0, this.f905a, k(), u0Var.k());
        this.f906b += u0Var.f906b;
    }

    public <T> void p(g<T> gVar, T t4) {
        q0.l.o(gVar, "key");
        q0.l.o(t4, "value");
        l();
        n(this.f906b, gVar.a());
        if (gVar.i()) {
            t(this.f906b, h.a(gVar, t4));
        } else {
            u(this.f906b, gVar.j(t4));
        }
        this.f906b++;
    }

    byte[][] q() {
        byte[][] bArr = new byte[k()][];
        Object[] objArr = this.f905a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, k());
        } else {
            for (int r32 = 0; r32 < this.f906b; r32++) {
                int r12 = r32 * 2;
                bArr[r12] = o(r32);
                bArr[r12 + 1] = v(r32);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int r12 = 0; r12 < this.f906b; r12++) {
            if (r12 != 0) {
                sb.append(',');
            }
            byte[] o4 = o(r12);
            Charset charset = q0.b.f7136a;
            String str = new String(o4, charset);
            sb.append(str);
            sb.append('=');
            sb.append(str.endsWith("-bin") ? f904f.e(v(r12)) : new String(v(r12), charset));
        }
        sb.append(')');
        return sb.toString();
    }
}
