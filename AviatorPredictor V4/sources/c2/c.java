package c2;

import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: j, reason: collision with root package name */
    private static final char[] f1132j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    private final String f1133a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1134b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1135c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1136d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1137e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f1138f;

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f1139g;

    /* renamed from: h, reason: collision with root package name */
    private final String f1140h;

    /* renamed from: i, reason: collision with root package name */
    private final String f1141i;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        String f1142a;

        /* renamed from: d, reason: collision with root package name */
        String f1145d;

        /* renamed from: f, reason: collision with root package name */
        final List<String> f1147f;

        /* renamed from: g, reason: collision with root package name */
        List<String> f1148g;

        /* renamed from: h, reason: collision with root package name */
        String f1149h;

        /* renamed from: b, reason: collision with root package name */
        String f1143b = "";

        /* renamed from: c, reason: collision with root package name */
        String f1144c = "";

        /* renamed from: e, reason: collision with root package name */
        int f1146e = -1;

        public b() {
            ArrayList arrayList = new ArrayList();
            this.f1147f = arrayList;
            arrayList.add("");
        }

        private static String b(String str, int r22, int r32) {
            String f5 = c.f(str, r22, r32, false);
            if (!f5.startsWith("[") || !f5.endsWith("]")) {
                return f(f5);
            }
            InetAddress e5 = e(f5, 1, f5.length() - 1);
            if (e5 == null) {
                return null;
            }
            byte[] address = e5.getAddress();
            if (address.length == 16) {
                return i(address);
            }
            throw new AssertionError();
        }

        private static boolean c(String str) {
            for (int r12 = 0; r12 < str.length(); r12++) {
                char charAt = str.charAt(r12);
                if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        private static boolean d(String str, int r8, int r9, byte[] bArr, int r11) {
            int r02 = r11;
            while (r8 < r9) {
                if (r02 == bArr.length) {
                    return false;
                }
                if (r02 != r11) {
                    if (str.charAt(r8) != '.') {
                        return false;
                    }
                    r8++;
                }
                int r22 = r8;
                int r32 = 0;
                while (r22 < r9) {
                    char charAt = str.charAt(r22);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    if ((r32 == 0 && r8 != r22) || (r32 = ((r32 * 10) + charAt) - 48) > 255) {
                        return false;
                    }
                    r22++;
                }
                if (r22 - r8 == 0) {
                    return false;
                }
                bArr[r02] = (byte) r32;
                r02++;
                r8 = r22;
            }
            return r02 == r11 + 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.net.InetAddress e(java.lang.String r11, int r12, int r13) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = -1
                r3 = 0
                r4 = 0
                r5 = -1
                r6 = -1
            L9:
                r7 = 0
                if (r12 >= r13) goto L7a
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r12 + 2
                if (r8 > r13) goto L27
                java.lang.String r9 = "::"
                r10 = 2
                boolean r9 = r11.regionMatches(r12, r9, r3, r10)
                if (r9 == 0) goto L27
                if (r5 == r2) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r13) goto L25
                goto L7a
            L25:
                r6 = r8
                goto L4b
            L27:
                if (r4 == 0) goto L4a
                java.lang.String r8 = ":"
                r9 = 1
                boolean r8 = r11.regionMatches(r12, r8, r3, r9)
                if (r8 == 0) goto L35
                int r12 = r12 + 1
                goto L4a
            L35:
                java.lang.String r8 = "."
                boolean r12 = r11.regionMatches(r12, r8, r3, r9)
                if (r12 == 0) goto L49
                int r12 = r4 + (-2)
                boolean r11 = d(r11, r6, r13, r1, r12)
                if (r11 != 0) goto L46
                return r7
            L46:
                int r4 = r4 + 2
                goto L7a
            L49:
                return r7
            L4a:
                r6 = r12
            L4b:
                r12 = r6
                r8 = 0
            L4d:
                if (r12 >= r13) goto L60
                char r9 = r11.charAt(r12)
                int r9 = c2.c.a(r9)
                if (r9 != r2) goto L5a
                goto L60
            L5a:
                int r8 = r8 << 4
                int r8 = r8 + r9
                int r12 = r12 + 1
                goto L4d
            L60:
                int r9 = r12 - r6
                if (r9 == 0) goto L79
                r10 = 4
                if (r9 <= r10) goto L68
                goto L79
            L68:
                int r7 = r4 + 1
                int r9 = r8 >>> 8
                r9 = r9 & 255(0xff, float:3.57E-43)
                byte r9 = (byte) r9
                r1[r4] = r9
                int r4 = r7 + 1
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L79:
                return r7
            L7a:
                if (r4 == r0) goto L8b
                if (r5 != r2) goto L7f
                return r7
            L7f:
                int r11 = r4 - r5
                int r12 = 16 - r11
                java.lang.System.arraycopy(r1, r5, r1, r12, r11)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r3)
            L8b:
                java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
                return r11
            L90:
                java.lang.AssertionError r11 = new java.lang.AssertionError
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.c.b.e(java.lang.String, int, int):java.net.InetAddress");
        }

        private static String f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (c(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private static String i(byte[] bArr) {
            int r02 = 0;
            int r12 = -1;
            int r22 = 0;
            int r32 = 0;
            while (r22 < bArr.length) {
                int r4 = r22;
                while (r4 < 16 && bArr[r4] == 0 && bArr[r4 + 1] == 0) {
                    r4 += 2;
                }
                int r5 = r4 - r22;
                if (r5 > r32) {
                    r12 = r22;
                    r32 = r5;
                }
                r22 = r4 + 2;
            }
            h4.c cVar = new h4.c();
            while (r02 < bArr.length) {
                if (r02 == r12) {
                    cVar.Z(58);
                    r02 += r32;
                    if (r02 == 16) {
                        cVar.Z(58);
                    }
                } else {
                    if (r02 > 0) {
                        cVar.Z(58);
                    }
                    cVar.q0(((bArr[r02] & 255) << 8) | (bArr[r02 + 1] & 255));
                    r02 += 2;
                }
            }
            return cVar.R();
        }

        public c a() {
            if (this.f1142a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f1145d != null) {
                return new c(this);
            }
            throw new IllegalStateException("host == null");
        }

        int g() {
            int r02 = this.f1146e;
            return r02 != -1 ? r02 : c.b(this.f1142a);
        }

        public b h(String str) {
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String b5 = b(str, 0, str.length());
            if (b5 != null) {
                this.f1145d = b5;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public b j(int r4) {
            if (r4 > 0 && r4 <= 65535) {
                this.f1146e = r4;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + r4);
        }

        public b k(String str) {
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            String str2 = "http";
            if (!str.equalsIgnoreCase("http")) {
                str2 = "https";
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.f1142a = str2;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1142a);
            sb.append("://");
            if (!this.f1143b.isEmpty() || !this.f1144c.isEmpty()) {
                sb.append(this.f1143b);
                if (!this.f1144c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f1144c);
                }
                sb.append('@');
            }
            if (this.f1145d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f1145d);
                sb.append(']');
            } else {
                sb.append(this.f1145d);
            }
            int g5 = g();
            if (g5 != c.b(this.f1142a)) {
                sb.append(':');
                sb.append(g5);
            }
            c.e(sb, this.f1147f);
            if (this.f1148g != null) {
                sb.append('?');
                c.d(sb, this.f1148g);
            }
            if (this.f1149h != null) {
                sb.append('#');
                sb.append(this.f1149h);
            }
            return sb.toString();
        }
    }

    private c(b bVar) {
        this.f1133a = bVar.f1142a;
        this.f1134b = g(bVar.f1143b, false);
        this.f1135c = g(bVar.f1144c, false);
        this.f1136d = bVar.f1145d;
        this.f1137e = bVar.g();
        this.f1138f = h(bVar.f1147f, false);
        List<String> list = bVar.f1148g;
        this.f1139g = list != null ? h(list, true) : null;
        String str = bVar.f1149h;
        this.f1140h = str != null ? g(str, false) : null;
        this.f1141i = bVar.toString();
    }

    static int a(char c5) {
        if (c5 >= '0' && c5 <= '9') {
            return c5 - '0';
        }
        char c6 = 'a';
        if (c5 < 'a' || c5 > 'f') {
            c6 = 'A';
            if (c5 < 'A' || c5 > 'F') {
                return -1;
            }
        }
        return (c5 - c6) + 10;
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static void d(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int r12 = 0; r12 < size; r12 += 2) {
            String str = list.get(r12);
            String str2 = list.get(r12 + 1);
            if (r12 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static void e(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int r12 = 0; r12 < size; r12++) {
            sb.append('/');
            sb.append(list.get(r12));
        }
    }

    static String f(String str, int r4, int r5, boolean z4) {
        for (int r02 = r4; r02 < r5; r02++) {
            char charAt = str.charAt(r02);
            if (charAt == '%' || (charAt == '+' && z4)) {
                h4.c cVar = new h4.c();
                cVar.v0(str, r4, r02);
                i(cVar, str, r02, r5, z4);
                return cVar.R();
            }
        }
        return str.substring(r4, r5);
    }

    static String g(String str, boolean z4) {
        return f(str, 0, str.length(), z4);
    }

    private List<String> h(List<String> list, boolean z4) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? g(next, z4) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void i(h4.c cVar, String str, int r7, int r8, boolean z4) {
        int r12;
        while (r7 < r8) {
            int codePointAt = str.codePointAt(r7);
            if (codePointAt != 37 || (r12 = r7 + 2) >= r8) {
                if (codePointAt == 43 && z4) {
                    cVar.Z(32);
                }
                cVar.w0(codePointAt);
            } else {
                int a5 = a(str.charAt(r7 + 1));
                int a6 = a(str.charAt(r12));
                if (a5 != -1 && a6 != -1) {
                    cVar.Z((a5 << 4) + a6);
                    r7 = r12;
                }
                cVar.w0(codePointAt);
            }
            r7 += Character.charCount(codePointAt);
        }
    }

    public String c() {
        return this.f1136d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f1141i.equals(this.f1141i);
    }

    public int hashCode() {
        return this.f1141i.hashCode();
    }

    public int j() {
        return this.f1137e;
    }

    public String toString() {
        return this.f1141i;
    }
}
