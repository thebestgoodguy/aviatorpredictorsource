package e3;

import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f3557a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3558b;

    /* renamed from: c, reason: collision with root package name */
    private int f3559c;

    /* renamed from: d, reason: collision with root package name */
    private int f3560d;

    /* renamed from: e, reason: collision with root package name */
    private int f3561e;

    /* renamed from: f, reason: collision with root package name */
    private int f3562f;

    /* renamed from: g, reason: collision with root package name */
    private char[] f3563g;

    public c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f3557a = name;
        this.f3558b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        return new java.lang.String(r1, r2, r8.f3562f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a() {
        /*
            r8 = this;
            int r0 = r8.f3559c
            r8.f3560d = r0
            r8.f3561e = r0
        L6:
            int r0 = r8.f3559c
            int r1 = r8.f3558b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f3563g
            int r2 = r8.f3560d
            int r3 = r8.f3561e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f3563g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5a
            if (r2 == r5) goto L4f
            r5 = 92
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L4f
            if (r2 == r3) goto L4f
            int r2 = r8.f3561e
            int r3 = r2 + 1
            r8.f3561e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            goto L4a
        L3c:
            int r0 = r8.f3561e
            int r2 = r0 + 1
            r8.f3561e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.f3559c
        L4a:
            int r0 = r0 + 1
            r8.f3559c = r0
            goto L6
        L4f:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f3560d
            int r3 = r8.f3561e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5a:
            int r2 = r8.f3561e
            r8.f3562f = r2
            int r0 = r0 + 1
            r8.f3559c = r0
            int r0 = r2 + 1
            r8.f3561e = r0
            r1[r2] = r6
        L68:
            int r0 = r8.f3559c
            int r1 = r8.f3558b
            if (r0 >= r1) goto L81
            char[] r2 = r8.f3563g
            char r7 = r2[r0]
            if (r7 != r6) goto L81
            int r1 = r8.f3561e
            int r7 = r1 + 1
            r8.f3561e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f3559c = r0
            goto L68
        L81:
            if (r0 == r1) goto L91
            char[] r1 = r8.f3563g
            char r2 = r1[r0]
            if (r2 == r3) goto L91
            char r2 = r1[r0]
            if (r2 == r4) goto L91
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L91:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f3563g
            int r2 = r8.f3560d
            int r3 = r8.f3562f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.c.a():java.lang.String");
    }

    private int c(int r10) {
        int r102;
        int r02;
        int r03 = r10 + 1;
        if (r03 >= this.f3558b) {
            throw new IllegalStateException("Malformed DN: " + this.f3557a);
        }
        char[] cArr = this.f3563g;
        char c5 = cArr[r10];
        if (c5 >= '0' && c5 <= '9') {
            r102 = c5 - '0';
        } else if (c5 >= 'a' && c5 <= 'f') {
            r102 = c5 - 'W';
        } else {
            if (c5 < 'A' || c5 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f3557a);
            }
            r102 = c5 - '7';
        }
        char c6 = cArr[r03];
        if (c6 >= '0' && c6 <= '9') {
            r02 = c6 - '0';
        } else if (c6 >= 'a' && c6 <= 'f') {
            r02 = c6 - 'W';
        } else {
            if (c6 < 'A' || c6 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f3557a);
            }
            r02 = c6 - '7';
        }
        return (r102 << 4) + r02;
    }

    private char d() {
        int r02 = this.f3559c + 1;
        this.f3559c = r02;
        if (r02 == this.f3558b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f3557a);
        }
        char[] cArr = this.f3563g;
        char c5 = cArr[r02];
        if (c5 != ' ' && c5 != '%' && c5 != '\\' && c5 != '_' && c5 != '\"' && c5 != '#') {
            switch (c5) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c5) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            return e();
                    }
            }
        }
        return cArr[r02];
    }

    private char e() {
        int r32;
        int r02;
        int c5 = c(this.f3559c);
        this.f3559c++;
        if (c5 < 128) {
            return (char) c5;
        }
        if (c5 < 192 || c5 > 247) {
            return '?';
        }
        if (c5 <= 223) {
            r02 = c5 & 31;
            r32 = 1;
        } else if (c5 <= 239) {
            r32 = 2;
            r02 = c5 & 15;
        } else {
            r32 = 3;
            r02 = c5 & 7;
        }
        for (int r5 = 0; r5 < r32; r5++) {
            int r6 = this.f3559c + 1;
            this.f3559c = r6;
            if (r6 == this.f3558b || this.f3563g[r6] != '\\') {
                return '?';
            }
            int r62 = r6 + 1;
            this.f3559c = r62;
            int c6 = c(r62);
            this.f3559c++;
            if ((c6 & 192) != 128) {
                return '?';
            }
            r02 = (r02 << 6) + (c6 & 63);
        }
        return (char) r02;
    }

    private String f() {
        int r02 = this.f3559c;
        if (r02 + 4 >= this.f3558b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f3557a);
        }
        this.f3560d = r02;
        while (true) {
            this.f3559c = r02 + 1;
            r02 = this.f3559c;
            if (r02 == this.f3558b) {
                break;
            }
            char[] cArr = this.f3563g;
            if (cArr[r02] == '+' || cArr[r02] == ',' || cArr[r02] == ';') {
                break;
            }
            if (cArr[r02] == ' ') {
                this.f3561e = r02;
                do {
                    this.f3559c = r02 + 1;
                    r02 = this.f3559c;
                    if (r02 >= this.f3558b) {
                        break;
                    }
                } while (this.f3563g[r02] == ' ');
            } else if (cArr[r02] >= 'A' && cArr[r02] <= 'F') {
                cArr[r02] = (char) (cArr[r02] + ' ');
            }
        }
        this.f3561e = r02;
        int r03 = this.f3561e;
        int r12 = this.f3560d;
        int r04 = r03 - r12;
        if (r04 < 5 || (r04 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f3557a);
        }
        int r22 = r04 / 2;
        byte[] bArr = new byte[r22];
        int r13 = r12 + 1;
        for (int r4 = 0; r4 < r22; r4++) {
            bArr[r4] = (byte) c(r13);
            r13 += 2;
        }
        return new String(this.f3563g, this.f3560d, r04);
    }

    private String g() {
        int r02;
        int r12;
        int r13;
        int r03;
        int r14;
        char[] cArr;
        while (true) {
            r02 = this.f3559c;
            r12 = this.f3558b;
            if (r02 >= r12 || this.f3563g[r02] != ' ') {
                break;
            }
            this.f3559c = r02 + 1;
        }
        if (r02 == r12) {
            return null;
        }
        this.f3560d = r02;
        do {
            this.f3559c = r02 + 1;
            r02 = this.f3559c;
            r13 = this.f3558b;
            if (r02 >= r13) {
                break;
            }
            cArr = this.f3563g;
            if (cArr[r02] == '=') {
                break;
            }
        } while (cArr[r02] != ' ');
        if (r02 >= r13) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f3557a);
        }
        this.f3561e = r02;
        if (this.f3563g[r02] == ' ') {
            while (true) {
                r03 = this.f3559c;
                r14 = this.f3558b;
                if (r03 >= r14) {
                    break;
                }
                char[] cArr2 = this.f3563g;
                if (cArr2[r03] == '=' || cArr2[r03] != ' ') {
                    break;
                }
                this.f3559c = r03 + 1;
            }
            if (this.f3563g[r03] != '=' || r03 == r14) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f3557a);
            }
        }
        int r04 = this.f3559c;
        do {
            this.f3559c = r04 + 1;
            r04 = this.f3559c;
            if (r04 >= this.f3558b) {
                break;
            }
        } while (this.f3563g[r04] == ' ');
        int r05 = this.f3561e;
        int r15 = this.f3560d;
        if (r05 - r15 > 4) {
            char[] cArr3 = this.f3563g;
            if (cArr3[r15 + 3] == '.' && ((cArr3[r15] == 'O' || cArr3[r15] == 'o') && ((cArr3[r15 + 1] == 'I' || cArr3[r15 + 1] == 'i') && (cArr3[r15 + 2] == 'D' || cArr3[r15 + 2] == 'd')))) {
                this.f3560d = r15 + 4;
            }
        }
        char[] cArr4 = this.f3563g;
        int r32 = this.f3560d;
        return new String(cArr4, r32, r05 - r32);
    }

    private String h() {
        int r02 = this.f3559c + 1;
        this.f3559c = r02;
        this.f3560d = r02;
        while (true) {
            this.f3561e = r02;
            int r03 = this.f3559c;
            if (r03 == this.f3558b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f3557a);
            }
            char[] cArr = this.f3563g;
            if (cArr[r03] == '\"') {
                do {
                    this.f3559c = r03 + 1;
                    r03 = this.f3559c;
                    if (r03 >= this.f3558b) {
                        break;
                    }
                } while (this.f3563g[r03] == ' ');
                char[] cArr2 = this.f3563g;
                int r22 = this.f3560d;
                return new String(cArr2, r22, this.f3561e - r22);
            }
            if (cArr[r03] == '\\') {
                cArr[this.f3561e] = d();
            } else {
                cArr[this.f3561e] = cArr[r03];
            }
            this.f3559c++;
            r02 = this.f3561e + 1;
        }
    }

    public String b(String str) {
        this.f3559c = 0;
        this.f3560d = 0;
        this.f3561e = 0;
        this.f3562f = 0;
        this.f3563g = this.f3557a.toCharArray();
        String g5 = g();
        if (g5 == null) {
            return null;
        }
        do {
            int r22 = this.f3559c;
            if (r22 == this.f3558b) {
                return null;
            }
            char c5 = this.f3563g[r22];
            String a5 = c5 != '\"' ? c5 != '#' ? (c5 == '+' || c5 == ',' || c5 == ';') ? "" : a() : f() : h();
            if (str.equalsIgnoreCase(g5)) {
                return a5;
            }
            int r02 = this.f3559c;
            if (r02 >= this.f3558b) {
                return null;
            }
            char[] cArr = this.f3563g;
            if (cArr[r02] != ',' && cArr[r02] != ';' && cArr[r02] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f3557a);
            }
            this.f3559c = r02 + 1;
            g5 = g();
        } while (g5 != null);
        throw new IllegalStateException("Malformed DN: " + this.f3557a);
    }
}
