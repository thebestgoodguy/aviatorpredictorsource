package z1;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import x1.x;

/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private final Reader f8331e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8332f = false;

    /* renamed from: g, reason: collision with root package name */
    private final char[] f8333g = new char[1024];

    /* renamed from: h, reason: collision with root package name */
    private int f8334h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f8335i = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f8336j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f8337k = 0;

    /* renamed from: l, reason: collision with root package name */
    int f8338l = 0;

    /* renamed from: m, reason: collision with root package name */
    private long f8339m;

    /* renamed from: n, reason: collision with root package name */
    private int f8340n;

    /* renamed from: o, reason: collision with root package name */
    private String f8341o;

    /* renamed from: p, reason: collision with root package name */
    private int[] f8342p;

    /* renamed from: q, reason: collision with root package name */
    private int f8343q;

    /* renamed from: r, reason: collision with root package name */
    private String[] f8344r;

    /* renamed from: s, reason: collision with root package name */
    private int[] f8345s;

    /* renamed from: z1.a$a, reason: collision with other inner class name */
    class C0107a extends y1.a {
        C0107a() {
        }
    }

    static {
        y1.a.f8311a = new C0107a();
    }

    public a(Reader reader) {
        int[] r22 = new int[32];
        this.f8342p = r22;
        this.f8343q = 0;
        this.f8343q = 0 + 1;
        r22[0] = 6;
        this.f8344r = new String[32];
        this.f8345s = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f8331e = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r1 != '/') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        r7.f8334h = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r7.f8334h = r4 - 1;
        r2 = n(2);
        r7.f8334h++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        e();
        r2 = r7.f8334h;
        r3 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        if (r3 == '*') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r7.f8334h = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        if (k0("*\/") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        throw m0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
    
        if (r3 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0078, code lost:
    
        r7.f8334h = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        r7.f8334h = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if (r1 != '#') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a2, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int H(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f8333g
        L2:
            int r1 = r7.f8334h
        L4:
            int r2 = r7.f8335i
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r7.f8334h = r1
            boolean r1 = r7.n(r3)
            if (r1 != 0) goto L30
            if (r8 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.v()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L30:
            int r1 = r7.f8334h
            int r2 = r7.f8335i
        L34:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L44
            int r1 = r7.f8336j
            int r1 = r1 + r3
            r7.f8336j = r1
            r7.f8337k = r4
            goto La3
        L44:
            r5 = 32
            if (r1 == r5) goto La3
            r5 = 13
            if (r1 == r5) goto La3
            r5 = 9
            if (r1 != r5) goto L51
            goto La3
        L51:
            r5 = 47
            if (r1 != r5) goto L98
            r7.f8334h = r4
            r6 = 2
            if (r4 != r2) goto L6a
            int r4 = r4 + (-1)
            r7.f8334h = r4
            boolean r2 = r7.n(r6)
            int r4 = r7.f8334h
            int r4 = r4 + r3
            r7.f8334h = r4
            if (r2 != 0) goto L6a
            return r1
        L6a:
            r7.e()
            int r2 = r7.f8334h
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L80
            if (r3 == r5) goto L78
            return r1
        L78:
            int r2 = r2 + 1
            r7.f8334h = r2
        L7c:
            r7.l0()
            goto L2
        L80:
            int r2 = r2 + 1
            r7.f8334h = r2
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r7.k0(r1)
            if (r1 == 0) goto L91
            int r1 = r7.f8334h
            int r1 = r1 + r6
            goto L4
        L91:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.m0(r8)
            throw r8
        L98:
            r2 = 35
            r7.f8334h = r4
            if (r1 != r2) goto La2
            r7.e()
            goto L7c
        La2:
            return r1
        La3:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a.H(boolean):int");
    }

    private String M(char c5) {
        char[] cArr = this.f8333g;
        StringBuilder sb = null;
        while (true) {
            int r22 = this.f8334h;
            int r32 = this.f8335i;
            while (true) {
                if (r22 < r32) {
                    int r7 = r22 + 1;
                    char c6 = cArr[r22];
                    if (c6 == c5) {
                        this.f8334h = r7;
                        int r72 = (r7 - r22) - 1;
                        if (sb == null) {
                            return new String(cArr, r22, r72);
                        }
                        sb.append(cArr, r22, r72);
                        return sb.toString();
                    }
                    if (c6 == '\\') {
                        this.f8334h = r7;
                        int r73 = (r7 - r22) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((r73 + 1) * 2, 16));
                        }
                        sb.append(cArr, r22, r73);
                        sb.append(j0());
                    } else {
                        if (c6 == '\n') {
                            this.f8336j++;
                            this.f8337k = r7;
                        }
                        r22 = r7;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((r22 - r22) * 2, 16));
                    }
                    sb.append(cArr, r22, r22 - r22);
                    this.f8334h = r22;
                    if (!n(1)) {
                        throw m0("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String S() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f8334h
            int r4 = r3 + r2
            int r5 = r6.f8335i
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f8333g
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.e()
            goto L5c
        L4e:
            char[] r3 = r6.f8333g
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.n(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f8333g
            int r4 = r6.f8334h
            r1.append(r3, r4, r2)
            int r3 = r6.f8334h
            int r3 = r3 + r2
            r6.f8334h = r3
            r2 = 1
            boolean r2 = r6.n(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f8333g
            int r3 = r6.f8334h
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f8333g
            int r3 = r6.f8334h
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f8334h
            int r2 = r2 + r0
            r6.f8334h = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a.S():java.lang.String");
    }

    private int c0() {
        int r02;
        String str;
        String str2;
        char c5 = this.f8333g[this.f8334h];
        if (c5 == 't' || c5 == 'T') {
            r02 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c5 == 'f' || c5 == 'F') {
            r02 = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (c5 != 'n' && c5 != 'N') {
                return 0;
            }
            r02 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int r5 = 1; r5 < length; r5++) {
            if (this.f8334h + r5 >= this.f8335i && !n(r5 + 1)) {
                return 0;
            }
            char c6 = this.f8333g[this.f8334h + r5];
            if (c6 != str.charAt(r5) && c6 != str2.charAt(r5)) {
                return 0;
            }
        }
        if ((this.f8334h + length < this.f8335i || n(length + 1)) && t(this.f8333g[this.f8334h + length])) {
            return 0;
        }
        this.f8334h += length;
        this.f8338l = r02;
        return r02;
    }

    private void e() {
        if (!this.f8332f) {
            throw m0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0097, code lost:
    
        if (r9 != 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0099, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009f, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a1, code lost:
    
        if (r13 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
    
        if (r11 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        if (r13 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        r18.f8339m = r11;
        r18.f8334h += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
    
        r18.f8338l = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ba, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        if (r9 == 2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r9 == 4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        if (r9 != 7) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        r18.f8340n = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0095, code lost:
    
        if (t(r14) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cb, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int f0() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a.f0():int");
    }

    private void h() {
        H(true);
        int r12 = this.f8334h - 1;
        this.f8334h = r12;
        if (r12 + 5 <= this.f8335i || n(5)) {
            char[] cArr = this.f8333g;
            if (cArr[r12] == ')' && cArr[r12 + 1] == ']' && cArr[r12 + 2] == '}' && cArr[r12 + 3] == '\'' && cArr[r12 + 4] == '\n') {
                this.f8334h += 5;
            }
        }
    }

    private void i0(int r4) {
        int r02 = this.f8343q;
        int[] r12 = this.f8342p;
        if (r02 == r12.length) {
            int r03 = r02 * 2;
            this.f8342p = Arrays.copyOf(r12, r03);
            this.f8345s = Arrays.copyOf(this.f8345s, r03);
            this.f8344r = (String[]) Arrays.copyOf(this.f8344r, r03);
        }
        int[] r04 = this.f8342p;
        int r13 = this.f8343q;
        this.f8343q = r13 + 1;
        r04[r13] = r4;
    }

    private char j0() {
        int r6;
        int r62;
        if (this.f8334h == this.f8335i && !n(1)) {
            throw m0("Unterminated escape sequence");
        }
        char[] cArr = this.f8333g;
        int r12 = this.f8334h;
        int r4 = r12 + 1;
        this.f8334h = r4;
        char c5 = cArr[r12];
        if (c5 == '\n') {
            this.f8336j++;
            this.f8337k = r4;
        } else if (c5 != '\"' && c5 != '\'' && c5 != '/' && c5 != '\\') {
            if (c5 == 'b') {
                return '\b';
            }
            if (c5 == 'f') {
                return '\f';
            }
            if (c5 == 'n') {
                return '\n';
            }
            if (c5 == 'r') {
                return '\r';
            }
            if (c5 == 't') {
                return '\t';
            }
            if (c5 != 'u') {
                throw m0("Invalid escape sequence");
            }
            if (r4 + 4 > this.f8335i && !n(4)) {
                throw m0("Unterminated escape sequence");
            }
            char c6 = 0;
            int r42 = this.f8334h;
            int r5 = r42 + 4;
            while (r42 < r5) {
                char c7 = this.f8333g[r42];
                char c8 = (char) (c6 << 4);
                if (c7 < '0' || c7 > '9') {
                    if (c7 >= 'a' && c7 <= 'f') {
                        r6 = c7 - 'a';
                    } else {
                        if (c7 < 'A' || c7 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f8333g, this.f8334h, 4));
                        }
                        r6 = c7 - 'A';
                    }
                    r62 = r6 + 10;
                } else {
                    r62 = c7 - '0';
                }
                c6 = (char) (c8 + r62);
                r42++;
            }
            this.f8334h += 4;
            return c6;
        }
        return c5;
    }

    private boolean k0(String str) {
        int length = str.length();
        while (true) {
            if (this.f8334h + length > this.f8335i && !n(length)) {
                return false;
            }
            char[] cArr = this.f8333g;
            int r22 = this.f8334h;
            if (cArr[r22] != '\n') {
                for (int r32 = 0; r32 < length; r32++) {
                    if (this.f8333g[this.f8334h + r32] != str.charAt(r32)) {
                        break;
                    }
                }
                return true;
            }
            this.f8336j++;
            this.f8337k = r22 + 1;
            this.f8334h++;
        }
    }

    private void l0() {
        char c5;
        do {
            if (this.f8334h >= this.f8335i && !n(1)) {
                return;
            }
            char[] cArr = this.f8333g;
            int r12 = this.f8334h;
            int r32 = r12 + 1;
            this.f8334h = r32;
            c5 = cArr[r12];
            if (c5 == '\n') {
                this.f8336j++;
                this.f8337k = r32;
                return;
            }
        } while (c5 != '\r');
    }

    private IOException m0(String str) {
        throw new c(str + v());
    }

    private boolean n(int r8) {
        int r22;
        int r12;
        char[] cArr = this.f8333g;
        int r13 = this.f8337k;
        int r23 = this.f8334h;
        this.f8337k = r13 - r23;
        int r14 = this.f8335i;
        if (r14 != r23) {
            int r15 = r14 - r23;
            this.f8335i = r15;
            System.arraycopy(cArr, r23, cArr, 0, r15);
        } else {
            this.f8335i = 0;
        }
        this.f8334h = 0;
        do {
            Reader reader = this.f8331e;
            int r24 = this.f8335i;
            int read = reader.read(cArr, r24, cArr.length - r24);
            if (read == -1) {
                return false;
            }
            r22 = this.f8335i + read;
            this.f8335i = r22;
            if (this.f8336j == 0 && (r12 = this.f8337k) == 0 && r22 > 0 && cArr[0] == 65279) {
                this.f8334h++;
                this.f8337k = r12 + 1;
                r8++;
            }
        } while (r22 < r8);
        return true;
    }

    private boolean t(char c5) {
        if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
            return false;
        }
        if (c5 != '#') {
            if (c5 == ',') {
                return false;
            }
            if (c5 != '/' && c5 != '=') {
                if (c5 == '{' || c5 == '}' || c5 == ':') {
                    return false;
                }
                if (c5 != ';') {
                    switch (c5) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    public double C() {
        String M;
        int r02 = this.f8338l;
        if (r02 == 0) {
            r02 = i();
        }
        if (r02 == 15) {
            this.f8338l = 0;
            int[] r03 = this.f8345s;
            int r12 = this.f8343q - 1;
            r03[r12] = r03[r12] + 1;
            return this.f8339m;
        }
        if (r02 == 16) {
            this.f8341o = new String(this.f8333g, this.f8334h, this.f8340n);
            this.f8334h += this.f8340n;
        } else {
            if (r02 == 8 || r02 == 9) {
                M = M(r02 == 8 ? '\'' : '\"');
            } else if (r02 == 10) {
                M = S();
            } else if (r02 != 11) {
                throw new IllegalStateException("Expected a double but was " + X() + v());
            }
            this.f8341o = M;
        }
        this.f8338l = 11;
        double parseDouble = Double.parseDouble(this.f8341o);
        if (!this.f8332f && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new c("JSON forbids NaN and infinities: " + parseDouble + v());
        }
        this.f8341o = null;
        this.f8338l = 0;
        int[] r22 = this.f8345s;
        int r32 = this.f8343q - 1;
        r22[r32] = r22[r32] + 1;
        return parseDouble;
    }

    public String F() {
        char c5;
        String M;
        int r02 = this.f8338l;
        if (r02 == 0) {
            r02 = i();
        }
        if (r02 == 14) {
            M = S();
        } else {
            if (r02 == 12) {
                c5 = '\'';
            } else {
                if (r02 != 13) {
                    throw new IllegalStateException("Expected a name but was " + X() + v());
                }
                c5 = '\"';
            }
            M = M(c5);
        }
        this.f8338l = 0;
        this.f8344r[this.f8343q - 1] = M;
        return M;
    }

    public void K() {
        int r02 = this.f8338l;
        if (r02 == 0) {
            r02 = i();
        }
        if (r02 == 7) {
            this.f8338l = 0;
            int[] r03 = this.f8345s;
            int r12 = this.f8343q - 1;
            r03[r12] = r03[r12] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + X() + v());
    }

    public String R() {
        String str;
        char c5;
        int r02 = this.f8338l;
        if (r02 == 0) {
            r02 = i();
        }
        if (r02 == 10) {
            str = S();
        } else {
            if (r02 == 8) {
                c5 = '\'';
            } else if (r02 == 9) {
                c5 = '\"';
            } else if (r02 == 11) {
                str = this.f8341o;
                this.f8341o = null;
            } else if (r02 == 15) {
                str = Long.toString(this.f8339m);
            } else {
                if (r02 != 16) {
                    throw new IllegalStateException("Expected a string but was " + X() + v());
                }
                str = new String(this.f8333g, this.f8334h, this.f8340n);
                this.f8334h += this.f8340n;
            }
            str = M(c5);
        }
        this.f8338l = 0;
        int[] r12 = this.f8345s;
        int r22 = this.f8343q - 1;
        r12[r22] = r12[r22] + 1;
        return str;
    }

    public b X() {
        int r02 = this.f8338l;
        if (r02 == 0) {
            r02 = i();
        }
        switch (r02) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void a() {
        int r02 = this.f8338l;
        if (r02 == 0) {
            r02 = i();
        }
        if (r02 == 3) {
            i0(1);
            this.f8345s[this.f8343q - 1] = 0;
            this.f8338l = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + X() + v());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8338l = 0;
        this.f8342p[0] = 8;
        this.f8343q = 1;
        this.f8331e.close();
    }

    public void d() {
        int r02 = this.f8338l;
        if (r02 == 0) {
            r02 = i();
        }
        if (r02 == 1) {
            i0(3);
            this.f8338l = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + X() + v());
        }
    }

    int i() {
        int r02;
        int H;
        int[] r03 = this.f8342p;
        int r12 = this.f8343q;
        int r22 = r03[r12 - 1];
        if (r22 == 1) {
            r03[r12 - 1] = 2;
        } else {
            if (r22 != 2) {
                if (r22 == 3 || r22 == 5) {
                    r03[r12 - 1] = 4;
                    if (r22 == 5 && (H = H(true)) != 44) {
                        if (H != 59) {
                            if (H != 125) {
                                throw m0("Unterminated object");
                            }
                            this.f8338l = 2;
                            return 2;
                        }
                        e();
                    }
                    int H2 = H(true);
                    if (H2 == 34) {
                        r02 = 13;
                    } else if (H2 == 39) {
                        e();
                        r02 = 12;
                    } else {
                        if (H2 == 125) {
                            if (r22 == 5) {
                                throw m0("Expected name");
                            }
                            this.f8338l = 2;
                            return 2;
                        }
                        e();
                        this.f8334h--;
                        if (!t((char) H2)) {
                            throw m0("Expected name");
                        }
                        r02 = 14;
                    }
                } else if (r22 == 4) {
                    r03[r12 - 1] = 5;
                    int H3 = H(true);
                    if (H3 != 58) {
                        if (H3 != 61) {
                            throw m0("Expected ':'");
                        }
                        e();
                        if (this.f8334h < this.f8335i || n(1)) {
                            char[] cArr = this.f8333g;
                            int r13 = this.f8334h;
                            if (cArr[r13] == '>') {
                                this.f8334h = r13 + 1;
                            }
                        }
                    }
                } else if (r22 == 6) {
                    if (this.f8332f) {
                        h();
                    }
                    this.f8342p[this.f8343q - 1] = 7;
                } else if (r22 == 7) {
                    if (H(false) == -1) {
                        r02 = 17;
                    } else {
                        e();
                        this.f8334h--;
                    }
                } else if (r22 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f8338l = r02;
                return r02;
            }
            int H4 = H(true);
            if (H4 != 44) {
                if (H4 != 59) {
                    if (H4 != 93) {
                        throw m0("Unterminated array");
                    }
                    this.f8338l = 4;
                    return 4;
                }
                e();
            }
        }
        int H5 = H(true);
        if (H5 != 34) {
            if (H5 == 39) {
                e();
                this.f8338l = 8;
                return 8;
            }
            if (H5 != 44 && H5 != 59) {
                if (H5 == 91) {
                    this.f8338l = 3;
                    return 3;
                }
                if (H5 != 93) {
                    if (H5 == 123) {
                        this.f8338l = 1;
                        return 1;
                    }
                    this.f8334h--;
                    int c02 = c0();
                    if (c02 != 0) {
                        return c02;
                    }
                    int f02 = f0();
                    if (f02 != 0) {
                        return f02;
                    }
                    if (!t(this.f8333g[this.f8334h])) {
                        throw m0("Expected value");
                    }
                    e();
                    r02 = 10;
                } else if (r22 == 1) {
                    this.f8338l = 4;
                    return 4;
                }
            }
            if (r22 != 1 && r22 != 2) {
                throw m0("Unexpected value");
            }
            e();
            this.f8334h--;
            this.f8338l = 7;
            return 7;
        }
        r02 = 9;
        this.f8338l = r02;
        return r02;
    }

    public void k() {
        int r02 = this.f8338l;
        if (r02 == 0) {
            r02 = i();
        }
        if (r02 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + X() + v());
        }
        int r03 = this.f8343q - 1;
        this.f8343q = r03;
        int[] r12 = this.f8345s;
        int r04 = r03 - 1;
        r12[r04] = r12[r04] + 1;
        this.f8338l = 0;
    }

    public void l() {
        int r02 = this.f8338l;
        if (r02 == 0) {
            r02 = i();
        }
        if (r02 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + X() + v());
        }
        int r03 = this.f8343q - 1;
        this.f8343q = r03;
        this.f8344r[r03] = null;
        int[] r12 = this.f8345s;
        int r04 = r03 - 1;
        r12[r04] = r12[r04] + 1;
        this.f8338l = 0;
    }

    public String r() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int r12 = this.f8343q;
        for (int r22 = 0; r22 < r12; r22++) {
            int r32 = this.f8342p[r22];
            if (r32 == 1 || r32 == 2) {
                sb.append('[');
                sb.append(this.f8345s[r22]);
                sb.append(']');
            } else if (r32 == 3 || r32 == 4 || r32 == 5) {
                sb.append('.');
                String[] strArr = this.f8344r;
                if (strArr[r22] != null) {
                    sb.append(strArr[r22]);
                }
            }
        }
        return sb.toString();
    }

    public boolean s() {
        int r02 = this.f8338l;
        if (r02 == 0) {
            r02 = i();
        }
        return (r02 == 2 || r02 == 4) ? false : true;
    }

    public String toString() {
        return getClass().getSimpleName() + v();
    }

    String v() {
        return " at line " + (this.f8336j + 1) + " column " + ((this.f8334h - this.f8337k) + 1) + " path " + r();
    }

    public boolean y() {
        int r02 = this.f8338l;
        if (r02 == 0) {
            r02 = i();
        }
        if (r02 == 5) {
            this.f8338l = 0;
            int[] r03 = this.f8345s;
            int r12 = this.f8343q - 1;
            r03[r12] = r03[r12] + 1;
            return true;
        }
        if (r02 == 6) {
            this.f8338l = 0;
            int[] r04 = this.f8345s;
            int r13 = this.f8343q - 1;
            r04[r13] = r04[r13] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + X() + v());
    }
}
