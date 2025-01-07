package q0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: q0.a$a, reason: collision with other inner class name */
    static abstract class AbstractC0076a extends a {
        AbstractC0076a() {
        }
    }

    private static final class b extends AbstractC0076a {

        /* renamed from: a, reason: collision with root package name */
        private final char f7131a;

        b(char c5) {
            this.f7131a = c5;
        }

        public String toString() {
            String d5 = a.d(this.f7131a);
            StringBuilder sb = new StringBuilder(String.valueOf(d5).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(d5);
            sb.append("')");
            return sb.toString();
        }
    }

    static abstract class c extends AbstractC0076a {

        /* renamed from: a, reason: collision with root package name */
        private final String f7132a;

        c(String str) {
            this.f7132a = (String) l.n(str);
        }

        public final String toString() {
            return this.f7132a;
        }
    }

    private static final class d extends c {

        /* renamed from: b, reason: collision with root package name */
        static final d f7133b = new d();

        private d() {
            super("CharMatcher.none()");
        }
    }

    static final class e extends c {

        /* renamed from: b, reason: collision with root package name */
        static final int f7134b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c, reason: collision with root package name */
        static final e f7135c = new e();

        e() {
            super("CharMatcher.whitespace()");
        }
    }

    protected a() {
    }

    public static a b(char c5) {
        return new b(c5);
    }

    public static a c() {
        return d.f7133b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(char c5) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int r12 = 0; r12 < 4; r12++) {
            cArr[5 - r12] = "0123456789ABCDEF".charAt(c5 & 15);
            c5 = (char) (c5 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static a e() {
        return e.f7135c;
    }
}
