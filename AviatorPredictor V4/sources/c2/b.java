package c2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f1130a;

    /* renamed from: c2.b$b, reason: collision with other inner class name */
    public static final class C0017b {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f1131a = new ArrayList(20);

        private void d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int r22 = 0; r22 < length; r22++) {
                char charAt = str.charAt(r22);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(r22), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int r02 = 0; r02 < length2; r02++) {
                char charAt2 = str2.charAt(r02);
                if (charAt2 <= 31 || charAt2 >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(r02), str2));
                }
            }
        }

        C0017b b(String str, String str2) {
            this.f1131a.add(str);
            this.f1131a.add(str2.trim());
            return this;
        }

        public b c() {
            return new b(this);
        }

        public C0017b e(String str) {
            int r02 = 0;
            while (r02 < this.f1131a.size()) {
                if (str.equalsIgnoreCase(this.f1131a.get(r02))) {
                    this.f1131a.remove(r02);
                    this.f1131a.remove(r02);
                    r02 -= 2;
                }
                r02 += 2;
            }
            return this;
        }

        public C0017b f(String str, String str2) {
            d(str, str2);
            e(str);
            b(str, str2);
            return this;
        }
    }

    private b(C0017b c0017b) {
        this.f1130a = (String[]) c0017b.f1131a.toArray(new String[c0017b.f1131a.size()]);
    }

    public String a(int r32) {
        int r33 = r32 * 2;
        if (r33 < 0) {
            return null;
        }
        String[] strArr = this.f1130a;
        if (r33 >= strArr.length) {
            return null;
        }
        return strArr[r33];
    }

    public int b() {
        return this.f1130a.length / 2;
    }

    public String c(int r32) {
        int r33 = (r32 * 2) + 1;
        if (r33 < 0) {
            return null;
        }
        String[] strArr = this.f1130a;
        if (r33 >= strArr.length) {
            return null;
        }
        return strArr[r33];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int b5 = b();
        for (int r22 = 0; r22 < b5; r22++) {
            sb.append(a(r22));
            sb.append(": ");
            sb.append(c(r22));
            sb.append("\n");
        }
        return sb.toString();
    }
}
