package s0;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import q0.i;
import q0.l;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final a f7517a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b, reason: collision with root package name */
    private static final a f7518b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c, reason: collision with root package name */
    private static final a f7519c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d, reason: collision with root package name */
    private static final a f7520d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e, reason: collision with root package name */
    private static final a f7521e = new b("base16()", "0123456789ABCDEF");

    /* renamed from: s0.a$a, reason: collision with other inner class name */
    private static final class C0087a {

        /* renamed from: a, reason: collision with root package name */
        private final String f7522a;

        /* renamed from: b, reason: collision with root package name */
        private final char[] f7523b;

        /* renamed from: c, reason: collision with root package name */
        final int f7524c;

        /* renamed from: d, reason: collision with root package name */
        final int f7525d;

        /* renamed from: e, reason: collision with root package name */
        final int f7526e;

        /* renamed from: f, reason: collision with root package name */
        final int f7527f;

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f7528g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean[] f7529h;

        C0087a(String str, char[] cArr) {
            this.f7522a = (String) l.n(str);
            this.f7523b = (char[]) l.n(cArr);
            try {
                int d5 = t0.a.d(cArr.length, RoundingMode.UNNECESSARY);
                this.f7525d = d5;
                int min = Math.min(8, Integer.lowestOneBit(d5));
                try {
                    this.f7526e = 8 / min;
                    this.f7527f = d5 / min;
                    this.f7524c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int r4 = 0; r4 < cArr.length; r4++) {
                        char c5 = cArr[r4];
                        l.f(c5 < 128, "Non-ASCII character: %s", c5);
                        l.f(bArr[c5] == -1, "Duplicate character: %s", c5);
                        bArr[c5] = (byte) r4;
                    }
                    this.f7528g = bArr;
                    boolean[] zArr = new boolean[this.f7526e];
                    for (int r32 = 0; r32 < this.f7527f; r32++) {
                        zArr[t0.a.a(r32 * 8, this.f7525d, RoundingMode.CEILING)] = true;
                    }
                    this.f7529h = zArr;
                } catch (ArithmeticException e5) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e5);
                }
            } catch (ArithmeticException e6) {
                int length = cArr.length;
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal alphabet length ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString(), e6);
            }
        }

        int b(char c5) {
            if (c5 > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c5));
                throw new d(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b5 = this.f7528g[c5];
            if (b5 != -1) {
                return b5;
            }
            if (c5 <= ' ' || c5 == 127) {
                String valueOf2 = String.valueOf(Integer.toHexString(c5));
                throw new d(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c5);
            throw new d(sb.toString());
        }

        char c(int r22) {
            return this.f7523b[r22];
        }

        boolean d(int r32) {
            return this.f7529h[r32 % this.f7526e];
        }

        public boolean e(char c5) {
            byte[] bArr = this.f7528g;
            return c5 < bArr.length && bArr[c5] != -1;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0087a) {
                return Arrays.equals(this.f7523b, ((C0087a) obj).f7523b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f7523b);
        }

        public String toString() {
            return this.f7522a;
        }
    }

    static final class b extends e {

        /* renamed from: h, reason: collision with root package name */
        final char[] f7530h;

        b(String str, String str2) {
            this(new C0087a(str, str2.toCharArray()));
        }

        private b(C0087a c0087a) {
            super(c0087a, null);
            this.f7530h = new char[512];
            l.d(c0087a.f7523b.length == 16);
            for (int r12 = 0; r12 < 256; r12++) {
                this.f7530h[r12] = c0087a.c(r12 >>> 4);
                this.f7530h[r12 | 256] = c0087a.c(r12 & 15);
            }
        }

        @Override // s0.a.e, s0.a
        int d(byte[] bArr, CharSequence charSequence) {
            l.n(bArr);
            if (charSequence.length() % 2 == 1) {
                int length = charSequence.length();
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid input length ");
                sb.append(length);
                throw new d(sb.toString());
            }
            int r02 = 0;
            int r12 = 0;
            while (r02 < charSequence.length()) {
                bArr[r12] = (byte) ((this.f7531f.b(charSequence.charAt(r02)) << 4) | this.f7531f.b(charSequence.charAt(r02 + 1)));
                r02 += 2;
                r12++;
            }
            return r12;
        }

        @Override // s0.a.e, s0.a
        void g(Appendable appendable, byte[] bArr, int r6, int r7) {
            l.n(appendable);
            l.s(r6, r6 + r7, bArr.length);
            for (int r02 = 0; r02 < r7; r02++) {
                int r12 = bArr[r6 + r02] & 255;
                appendable.append(this.f7530h[r12]);
                appendable.append(this.f7530h[r12 | 256]);
            }
        }

        @Override // s0.a.e
        a n(C0087a c0087a, Character ch) {
            return new b(c0087a);
        }
    }

    static final class c extends e {
        c(String str, String str2, Character ch) {
            this(new C0087a(str, str2.toCharArray()), ch);
        }

        private c(C0087a c0087a, Character ch) {
            super(c0087a, ch);
            l.d(c0087a.f7523b.length == 64);
        }

        @Override // s0.a.e, s0.a
        int d(byte[] bArr, CharSequence charSequence) {
            l.n(bArr);
            CharSequence l4 = l(charSequence);
            if (!this.f7531f.d(l4.length())) {
                int length = l4.length();
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid input length ");
                sb.append(length);
                throw new d(sb.toString());
            }
            int r02 = 0;
            int r12 = 0;
            while (r02 < l4.length()) {
                int r32 = r02 + 1;
                int r4 = r32 + 1;
                int b5 = (this.f7531f.b(l4.charAt(r02)) << 18) | (this.f7531f.b(l4.charAt(r32)) << 12);
                int r22 = r12 + 1;
                bArr[r12] = (byte) (b5 >>> 16);
                if (r4 < l4.length()) {
                    int r33 = r4 + 1;
                    int b6 = b5 | (this.f7531f.b(l4.charAt(r4)) << 6);
                    r12 = r22 + 1;
                    bArr[r22] = (byte) ((b6 >>> 8) & 255);
                    if (r33 < l4.length()) {
                        r4 = r33 + 1;
                        r22 = r12 + 1;
                        bArr[r12] = (byte) ((b6 | this.f7531f.b(l4.charAt(r33))) & 255);
                    } else {
                        r02 = r33;
                    }
                }
                r12 = r22;
                r02 = r4;
            }
            return r12;
        }

        @Override // s0.a.e, s0.a
        void g(Appendable appendable, byte[] bArr, int r7, int r8) {
            l.n(appendable);
            int r02 = r7 + r8;
            l.s(r7, r02, bArr.length);
            while (r8 >= 3) {
                int r12 = r7 + 1;
                int r22 = r12 + 1;
                int r72 = ((bArr[r7] & 255) << 16) | ((bArr[r12] & 255) << 8) | (bArr[r22] & 255);
                appendable.append(this.f7531f.c(r72 >>> 18));
                appendable.append(this.f7531f.c((r72 >>> 12) & 63));
                appendable.append(this.f7531f.c((r72 >>> 6) & 63));
                appendable.append(this.f7531f.c(r72 & 63));
                r8 -= 3;
                r7 = r22 + 1;
            }
            if (r7 < r02) {
                m(appendable, bArr, r7, r02 - r7);
            }
        }

        @Override // s0.a.e
        a n(C0087a c0087a, Character ch) {
            return new c(c0087a, ch);
        }
    }

    public static final class d extends IOException {
        d(String str) {
            super(str);
        }
    }

    static class e extends a {

        /* renamed from: f, reason: collision with root package name */
        final C0087a f7531f;

        /* renamed from: g, reason: collision with root package name */
        final Character f7532g;

        e(String str, String str2, Character ch) {
            this(new C0087a(str, str2.toCharArray()), ch);
        }

        e(C0087a c0087a, Character ch) {
            this.f7531f = (C0087a) l.n(c0087a);
            l.j(ch == null || !c0087a.e(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f7532g = ch;
        }

        @Override // s0.a
        int d(byte[] bArr, CharSequence charSequence) {
            C0087a c0087a;
            l.n(bArr);
            CharSequence l4 = l(charSequence);
            if (!this.f7531f.d(l4.length())) {
                int length = l4.length();
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid input length ");
                sb.append(length);
                throw new d(sb.toString());
            }
            int r12 = 0;
            int r22 = 0;
            while (r12 < l4.length()) {
                long j4 = 0;
                int r5 = 0;
                int r6 = 0;
                while (true) {
                    c0087a = this.f7531f;
                    if (r5 >= c0087a.f7526e) {
                        break;
                    }
                    j4 <<= c0087a.f7525d;
                    if (r12 + r5 < l4.length()) {
                        j4 |= this.f7531f.b(l4.charAt(r6 + r12));
                        r6++;
                    }
                    r5++;
                }
                int r52 = c0087a.f7527f;
                int r8 = (r52 * 8) - (r6 * c0087a.f7525d);
                int r53 = (r52 - 1) * 8;
                while (r53 >= r8) {
                    bArr[r22] = (byte) ((j4 >>> r53) & 255);
                    r53 -= 8;
                    r22++;
                }
                r12 += this.f7531f.f7526e;
            }
            return r22;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f7531f.equals(eVar.f7531f) && i.a(this.f7532g, eVar.f7532g);
        }

        @Override // s0.a
        void g(Appendable appendable, byte[] bArr, int r7, int r8) {
            l.n(appendable);
            l.s(r7, r7 + r8, bArr.length);
            int r02 = 0;
            while (r02 < r8) {
                m(appendable, bArr, r7 + r02, Math.min(this.f7531f.f7527f, r8 - r02));
                r02 += this.f7531f.f7527f;
            }
        }

        public int hashCode() {
            return this.f7531f.hashCode() ^ i.b(this.f7532g);
        }

        @Override // s0.a
        int i(int r5) {
            return (int) (((this.f7531f.f7525d * r5) + 7) / 8);
        }

        @Override // s0.a
        int j(int r4) {
            C0087a c0087a = this.f7531f;
            return c0087a.f7526e * t0.a.a(r4, c0087a.f7527f, RoundingMode.CEILING);
        }

        @Override // s0.a
        public a k() {
            return this.f7532g == null ? this : n(this.f7531f, null);
        }

        @Override // s0.a
        CharSequence l(CharSequence charSequence) {
            l.n(charSequence);
            Character ch = this.f7532g;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        void m(Appendable appendable, byte[] bArr, int r10, int r11) {
            l.n(appendable);
            l.s(r10, r10 + r11, bArr.length);
            int r12 = 0;
            l.d(r11 <= this.f7531f.f7527f);
            long j4 = 0;
            for (int r02 = 0; r02 < r11; r02++) {
                j4 = (j4 | (bArr[r10 + r02] & 255)) << 8;
            }
            int r9 = ((r11 + 1) * 8) - this.f7531f.f7525d;
            while (r12 < r11 * 8) {
                C0087a c0087a = this.f7531f;
                appendable.append(c0087a.c(((int) (j4 >>> (r9 - r12))) & c0087a.f7524c));
                r12 += this.f7531f.f7525d;
            }
            if (this.f7532g != null) {
                while (r12 < this.f7531f.f7527f * 8) {
                    appendable.append(this.f7532g.charValue());
                    r12 += this.f7531f.f7525d;
                }
            }
        }

        a n(C0087a c0087a, Character ch) {
            return new e(c0087a, ch);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f7531f.toString());
            if (8 % this.f7531f.f7525d != 0) {
                if (this.f7532g == null) {
                    str = ".omitPadding()";
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f7532g);
                    str = "')";
                }
                sb.append(str);
            }
            return sb.toString();
        }
    }

    a() {
    }

    public static a a() {
        return f7517a;
    }

    private static byte[] h(byte[] bArr, int r32) {
        if (r32 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[r32];
        System.arraycopy(bArr, 0, bArr2, 0, r32);
        return bArr2;
    }

    public final byte[] b(CharSequence charSequence) {
        try {
            return c(charSequence);
        } catch (d e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    final byte[] c(CharSequence charSequence) {
        CharSequence l4 = l(charSequence);
        byte[] bArr = new byte[i(l4.length())];
        return h(bArr, d(bArr, l4));
    }

    abstract int d(byte[] bArr, CharSequence charSequence);

    public String e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public final String f(byte[] bArr, int r4, int r5) {
        l.s(r4, r4 + r5, bArr.length);
        StringBuilder sb = new StringBuilder(j(r5));
        try {
            g(sb, bArr, r4, r5);
            return sb.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    abstract void g(Appendable appendable, byte[] bArr, int r32, int r4);

    abstract int i(int r12);

    abstract int j(int r12);

    public abstract a k();

    abstract CharSequence l(CharSequence charSequence);
}
