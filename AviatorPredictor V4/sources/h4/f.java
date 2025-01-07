package h4;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: h, reason: collision with root package name */
    static final char[] f3979h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: i, reason: collision with root package name */
    public static final f f3980i = p(new byte[0]);

    /* renamed from: e, reason: collision with root package name */
    final byte[] f3981e;

    /* renamed from: f, reason: collision with root package name */
    transient int f3982f;

    /* renamed from: g, reason: collision with root package name */
    transient String f3983g;

    f(byte[] bArr) {
        this.f3981e = bArr;
    }

    static int g(String str, int r6) {
        int length = str.length();
        int r12 = 0;
        int r22 = 0;
        while (r12 < length) {
            if (r22 == r6) {
                return r12;
            }
            int codePointAt = str.codePointAt(r12);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            r22++;
            r12 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static f i(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(p.f4011a));
        fVar.f3983g = str;
        return fVar;
    }

    public static f p(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String d() {
        return b.a(this.f3981e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int s4 = fVar.s();
            byte[] bArr = this.f3981e;
            if (s4 == bArr.length && fVar.r(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int s4 = s();
        int s5 = fVar.s();
        int min = Math.min(s4, s5);
        for (int r4 = 0; r4 < min; r4++) {
            int k4 = k(r4) & 255;
            int k5 = fVar.k(r4) & 255;
            if (k4 != k5) {
                return k4 < k5 ? -1 : 1;
            }
        }
        if (s4 == s5) {
            return 0;
        }
        return s4 < s5 ? -1 : 1;
    }

    public int hashCode() {
        int r02 = this.f3982f;
        if (r02 != 0) {
            return r02;
        }
        int hashCode = Arrays.hashCode(this.f3981e);
        this.f3982f = hashCode;
        return hashCode;
    }

    public byte k(int r22) {
        return this.f3981e[r22];
    }

    public String n() {
        byte[] bArr = this.f3981e;
        char[] cArr = new char[bArr.length * 2];
        int r4 = 0;
        for (byte b5 : bArr) {
            int r6 = r4 + 1;
            char[] cArr2 = f3979h;
            cArr[r4] = cArr2[(b5 >> 4) & 15];
            r4 = r6 + 1;
            cArr[r6] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public boolean q(int r22, f fVar, int r4, int r5) {
        return fVar.r(r4, this.f3981e, r22, r5);
    }

    public boolean r(int r32, byte[] bArr, int r5, int r6) {
        if (r32 >= 0) {
            byte[] bArr2 = this.f3981e;
            if (r32 <= bArr2.length - r6 && r5 >= 0 && r5 <= bArr.length - r6 && p.a(bArr2, r32, bArr, r5, r6)) {
                return true;
            }
        }
        return false;
    }

    public int s() {
        return this.f3981e.length;
    }

    public final boolean t(f fVar) {
        return q(0, fVar, 0, fVar.s());
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f3981e.length == 0) {
            return "[size=0]";
        }
        String x4 = x();
        int g5 = g(x4, 64);
        if (g5 == -1) {
            if (this.f3981e.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(n());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f3981e.length);
                sb2.append(" hex=");
                sb2.append(u(0, 64).n());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = x4.substring(0, g5).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (g5 < x4.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f3981e.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    public f u(int r4, int r5) {
        if (r4 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f3981e;
        if (r5 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f3981e.length + ")");
        }
        int r12 = r5 - r4;
        if (r12 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (r4 == 0 && r5 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[r12];
        System.arraycopy(bArr, r4, bArr2, 0, r12);
        return new f(bArr2);
    }

    public f v() {
        int r02 = 0;
        while (true) {
            byte[] bArr = this.f3981e;
            if (r02 >= bArr.length) {
                return this;
            }
            byte b5 = bArr[r02];
            if (b5 >= 65 && b5 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[r02] = (byte) (b5 + 32);
                for (int r5 = r02 + 1; r5 < bArr2.length; r5++) {
                    byte b6 = bArr2[r5];
                    if (b6 >= 65 && b6 <= 90) {
                        bArr2[r5] = (byte) (b6 + 32);
                    }
                }
                return new f(bArr2);
            }
            r02++;
        }
    }

    public byte[] w() {
        return (byte[]) this.f3981e.clone();
    }

    public String x() {
        String str = this.f3983g;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f3981e, p.f4011a);
        this.f3983g = str2;
        return str2;
    }

    void y(c cVar) {
        byte[] bArr = this.f3981e;
        cVar.o0(bArr, 0, bArr.length);
    }
}
