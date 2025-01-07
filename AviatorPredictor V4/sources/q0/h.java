package q0;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f7144a;

        /* renamed from: b, reason: collision with root package name */
        private final a f7145b;

        /* renamed from: c, reason: collision with root package name */
        private a f7146c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f7147d;

        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            String f7148a;

            /* renamed from: b, reason: collision with root package name */
            Object f7149b;

            /* renamed from: c, reason: collision with root package name */
            a f7150c;

            private a() {
            }
        }

        private b(String str) {
            a aVar = new a();
            this.f7145b = aVar;
            this.f7146c = aVar;
            this.f7147d = false;
            this.f7144a = (String) l.n(str);
        }

        private a f() {
            a aVar = new a();
            this.f7146c.f7150c = aVar;
            this.f7146c = aVar;
            return aVar;
        }

        private b g(String str, Object obj) {
            a f5 = f();
            f5.f7149b = obj;
            f5.f7148a = (String) l.n(str);
            return this;
        }

        public b a(String str, double d5) {
            return g(str, String.valueOf(d5));
        }

        public b b(String str, int r22) {
            return g(str, String.valueOf(r22));
        }

        public b c(String str, long j4) {
            return g(str, String.valueOf(j4));
        }

        public b d(String str, Object obj) {
            return g(str, obj);
        }

        public b e(String str, boolean z4) {
            return g(str, String.valueOf(z4));
        }

        public b h() {
            this.f7147d = true;
            return this;
        }

        public String toString() {
            boolean z4 = this.f7147d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f7144a);
            sb.append('{');
            String str = "";
            for (a aVar = this.f7145b.f7150c; aVar != null; aVar = aVar.f7150c) {
                Object obj = aVar.f7149b;
                if (!z4 || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f7148a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static <T> T a(T t4, T t5) {
        if (t4 != null) {
            return t4;
        }
        Objects.requireNonNull(t5, "Both parameters are null");
        return t5;
    }

    public static b b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
