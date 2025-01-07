package j1;

import com.google.protobuf.j;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[][] f5949c = {new byte[]{0, 0}, new byte[]{Byte.MIN_VALUE, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, Byte.MIN_VALUE}, new byte[]{-1, -64}};

    /* renamed from: b, reason: collision with root package name */
    private int f5951b = 0;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f5950a = new byte[1024];

    private void b(int r32) {
        int r33 = r32 + this.f5951b;
        byte[] bArr = this.f5950a;
        if (r33 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= r33) {
            r33 = length;
        }
        this.f5950a = Arrays.copyOf(bArr, r33);
    }

    private int d(long j4) {
        if (j4 < 0) {
            j4 = ~j4;
        }
        return f.a((64 - Long.numberOfLeadingZeros(j4)) + 1, 7, RoundingMode.UP);
    }

    private int e(long j4) {
        return f.a(64 - Long.numberOfLeadingZeros(j4), 8, RoundingMode.UP);
    }

    private void f(byte b5) {
        if (b5 == 0) {
            l((byte) 0);
            l((byte) -1);
        } else if (b5 != -1) {
            l(b5);
        } else {
            l((byte) -1);
            l((byte) 0);
        }
    }

    private void g(byte b5) {
        if (b5 == 0) {
            m((byte) 0);
            m((byte) -1);
        } else if (b5 != -1) {
            m(b5);
        } else {
            m((byte) -1);
            m((byte) 0);
        }
    }

    private void l(byte b5) {
        b(1);
        byte[] bArr = this.f5950a;
        int r12 = this.f5951b;
        this.f5951b = r12 + 1;
        bArr[r12] = b5;
    }

    private void m(byte b5) {
        b(1);
        byte[] bArr = this.f5950a;
        int r12 = this.f5951b;
        this.f5951b = r12 + 1;
        bArr[r12] = (byte) (~b5);
    }

    private void p() {
        l((byte) 0);
        l((byte) 1);
    }

    private void q() {
        m((byte) 0);
        m((byte) 1);
    }

    public byte[] a() {
        return Arrays.copyOf(this.f5950a, this.f5951b);
    }

    public void c(byte[] bArr) {
        b(bArr.length);
        for (byte b5 : bArr) {
            byte[] bArr2 = this.f5950a;
            int r4 = this.f5951b;
            this.f5951b = r4 + 1;
            bArr2[r4] = b5;
        }
    }

    public void h(j jVar) {
        for (int r02 = 0; r02 < jVar.size(); r02++) {
            f(jVar.r(r02));
        }
        p();
    }

    public void i(j jVar) {
        for (int r02 = 0; r02 < jVar.size(); r02++) {
            g(jVar.r(r02));
        }
        q();
    }

    public void j(double d5) {
        long doubleToLongBits = Double.doubleToLongBits(d5);
        t(doubleToLongBits ^ (doubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void k(double d5) {
        long doubleToLongBits = Double.doubleToLongBits(d5);
        u(doubleToLongBits ^ (doubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void n() {
        l((byte) -1);
        l((byte) -1);
    }

    public void o() {
        m((byte) -1);
        m((byte) -1);
    }

    public void r(long j4) {
        int r32;
        long j5 = j4 < 0 ? ~j4 : j4;
        if (j5 < 64) {
            b(1);
            byte[] bArr = this.f5950a;
            int r12 = this.f5951b;
            this.f5951b = r12 + 1;
            bArr[r12] = (byte) (j4 ^ f5949c[1][0]);
            return;
        }
        int d5 = d(j5);
        b(d5);
        if (d5 < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(d5)));
        }
        byte b5 = j4 < 0 ? (byte) -1 : (byte) 0;
        int r22 = this.f5951b;
        if (d5 == 10) {
            r32 = r22 + 2;
            byte[] bArr2 = this.f5950a;
            bArr2[r22] = b5;
            bArr2[r22 + 1] = b5;
        } else if (d5 == 9) {
            r32 = r22 + 1;
            this.f5950a[r22] = b5;
        } else {
            r32 = r22;
        }
        for (int r13 = (d5 - 1) + r22; r13 >= r32; r13--) {
            this.f5950a[r13] = (byte) (255 & j4);
            j4 >>= 8;
        }
        byte[] bArr3 = this.f5950a;
        int r11 = this.f5951b;
        byte b6 = bArr3[r11];
        byte[][] bArr4 = f5949c;
        bArr3[r11] = (byte) (b6 ^ bArr4[d5][0]);
        int r14 = r11 + 1;
        bArr3[r14] = (byte) (bArr4[d5][1] ^ bArr3[r14]);
        this.f5951b = r11 + d5;
    }

    public void s(long j4) {
        r(~j4);
    }

    public void t(long j4) {
        int e5 = e(j4);
        b(e5 + 1);
        byte[] bArr = this.f5950a;
        int r22 = this.f5951b;
        int r32 = r22 + 1;
        this.f5951b = r32;
        bArr[r22] = (byte) e5;
        int r33 = r32 + e5;
        while (true) {
            r33--;
            int r12 = this.f5951b;
            if (r33 < r12) {
                this.f5951b = r12 + e5;
                return;
            } else {
                this.f5950a[r33] = (byte) (255 & j4);
                j4 >>>= 8;
            }
        }
    }

    public void u(long j4) {
        int e5 = e(j4);
        b(e5 + 1);
        byte[] bArr = this.f5950a;
        int r22 = this.f5951b;
        int r32 = r22 + 1;
        this.f5951b = r32;
        bArr[r22] = (byte) (~e5);
        int r33 = r32 + e5;
        while (true) {
            r33--;
            int r12 = this.f5951b;
            if (r33 < r12) {
                this.f5951b = r12 + e5;
                return;
            } else {
                this.f5950a[r33] = (byte) (~(255 & j4));
                j4 >>>= 8;
            }
        }
    }

    public void v(CharSequence charSequence) {
        int r4;
        int length = charSequence.length();
        int r12 = 0;
        while (r12 < length) {
            int charAt = charSequence.charAt(r12);
            if (charAt >= 128) {
                if (charAt < 2048) {
                    r4 = (charAt >>> 6) | 960;
                } else if (charAt < 55296 || 57343 < charAt) {
                    f((byte) ((charAt >>> 12) | 480));
                    r4 = ((charAt >>> 6) & 63) | 128;
                } else {
                    charAt = Character.codePointAt(charSequence, r12);
                    r12++;
                    f((byte) ((charAt >>> 18) | 240));
                    f((byte) (((charAt >>> 12) & 63) | 128));
                    f((byte) (((charAt >>> 6) & 63) | 128));
                    charAt = (charAt & 63) | 128;
                }
                f((byte) r4);
                charAt = (charAt & 63) | 128;
            }
            f((byte) charAt);
            r12++;
        }
        p();
    }

    public void w(CharSequence charSequence) {
        int r4;
        int length = charSequence.length();
        int r12 = 0;
        while (r12 < length) {
            int charAt = charSequence.charAt(r12);
            if (charAt >= 128) {
                if (charAt < 2048) {
                    r4 = (charAt >>> 6) | 960;
                } else if (charAt < 55296 || 57343 < charAt) {
                    g((byte) ((charAt >>> 12) | 480));
                    r4 = ((charAt >>> 6) & 63) | 128;
                } else {
                    charAt = Character.codePointAt(charSequence, r12);
                    r12++;
                    g((byte) ((charAt >>> 18) | 240));
                    g((byte) (((charAt >>> 12) & 63) | 128));
                    g((byte) (((charAt >>> 6) & 63) | 128));
                    charAt = (charAt & 63) | 128;
                }
                g((byte) r4);
                charAt = (charAt & 63) | 128;
            }
            g((byte) charAt);
            r12++;
        }
        q();
    }
}
