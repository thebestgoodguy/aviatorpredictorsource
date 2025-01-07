package h4;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f3975g = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: e, reason: collision with root package name */
    j f3976e;

    /* renamed from: f, reason: collision with root package name */
    long f3977f;

    class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int r22) {
            c.this.Z((byte) r22);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int r32, int r4) {
            c.this.o0(bArr, r32, r4);
        }
    }

    @Override // h4.e
    public void A(long j4) {
        while (j4 > 0) {
            if (this.f3976e == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j4, r0.f3998c - r0.f3997b);
            long j5 = min;
            this.f3977f -= j5;
            j4 -= j5;
            j jVar = this.f3976e;
            int r22 = jVar.f3997b + min;
            jVar.f3997b = r22;
            if (r22 == jVar.f3998c) {
                this.f3976e = jVar.b();
                k.a(jVar);
            }
        }
    }

    @Override // h4.e
    public short D() {
        long j4 = this.f3977f;
        if (j4 < 2) {
            throw new IllegalStateException("size < 2: " + this.f3977f);
        }
        j jVar = this.f3976e;
        int r5 = jVar.f3997b;
        int r6 = jVar.f3998c;
        if (r6 - r5 < 2) {
            return (short) (((g0() & 255) << 8) | (g0() & 255));
        }
        byte[] bArr = jVar.f3996a;
        int r8 = r5 + 1;
        int r9 = r8 + 1;
        int r52 = ((bArr[r5] & 255) << 8) | (bArr[r8] & 255);
        this.f3977f = j4 - 2;
        if (r9 == r6) {
            this.f3976e = jVar.b();
            k.a(jVar);
        } else {
            jVar.f3997b = r9;
        }
        return (short) r52;
    }

    public void F(byte[] bArr) {
        int r02 = 0;
        while (r02 < bArr.length) {
            int s4 = s(bArr, r02, bArr.length - r02);
            if (s4 == -1) {
                throw new EOFException();
            }
            r02 += s4;
        }
    }

    @Override // h4.e
    public int G() {
        long j4 = this.f3977f;
        if (j4 < 4) {
            throw new IllegalStateException("size < 4: " + this.f3977f);
        }
        j jVar = this.f3976e;
        int r5 = jVar.f3997b;
        int r6 = jVar.f3998c;
        if (r6 - r5 < 4) {
            return ((g0() & 255) << 24) | ((g0() & 255) << 16) | ((g0() & 255) << 8) | (g0() & 255);
        }
        byte[] bArr = jVar.f3996a;
        int r8 = r5 + 1;
        int r9 = r8 + 1;
        int r52 = ((bArr[r5] & 255) << 24) | ((bArr[r8] & 255) << 16);
        int r82 = r9 + 1;
        int r53 = r52 | ((bArr[r9] & 255) << 8);
        int r92 = r82 + 1;
        int r54 = r53 | (bArr[r82] & 255);
        this.f3977f = j4 - 4;
        if (r92 == r6) {
            this.f3976e = jVar.b();
            k.a(jVar);
        } else {
            jVar.f3997b = r92;
        }
        return r54;
    }

    public String H(long j4, Charset charset) {
        p.b(this.f3977f, 0L, j4);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j4 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j4);
        }
        if (j4 == 0) {
            return "";
        }
        j jVar = this.f3976e;
        int r12 = jVar.f3997b;
        if (r12 + j4 > jVar.f3998c) {
            return new String(b0(j4), charset);
        }
        String str = new String(jVar.f3996a, r12, (int) j4, charset);
        int r10 = (int) (jVar.f3997b + j4);
        jVar.f3997b = r10;
        this.f3977f -= j4;
        if (r10 == jVar.f3998c) {
            this.f3976e = jVar.b();
            k.a(jVar);
        }
        return str;
    }

    @Override // h4.e
    public void Q(long j4) {
        if (this.f3977f < j4) {
            throw new EOFException();
        }
    }

    public String R() {
        try {
            return H(this.f3977f, p.f4011a);
        } catch (EOFException e5) {
            throw new AssertionError(e5);
        }
    }

    public String S(long j4) {
        return H(j4, p.f4011a);
    }

    @Override // h4.e
    public c W() {
        return this;
    }

    String X(long j4) {
        String S;
        long j5 = 1;
        if (j4 > 0) {
            long j6 = j4 - 1;
            if (l(j6) == 13) {
                S = S(j6);
                j5 = 2;
                A(j5);
                return S;
            }
        }
        S = S(j4);
        A(j5);
        return S;
    }

    @Override // h4.e
    public boolean Y() {
        return this.f3977f == 0;
    }

    public c a() {
        return this;
    }

    @Override // h4.e
    public byte[] b0(long j4) {
        p.b(this.f3977f, 0L, j4);
        if (j4 <= 2147483647L) {
            byte[] bArr = new byte[(int) j4];
            F(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j4);
    }

    public String c0() {
        return f0(Long.MAX_VALUE);
    }

    @Override // h4.n, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void d() {
        try {
            A(this.f3977f);
        } catch (EOFException e5) {
            throw new AssertionError(e5);
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f3977f == 0) {
            return cVar;
        }
        j d5 = this.f3976e.d();
        cVar.f3976e = d5;
        d5.f4002g = d5;
        d5.f4001f = d5;
        j jVar = this.f3976e;
        while (true) {
            jVar = jVar.f4001f;
            if (jVar == this.f3976e) {
                cVar.f3977f = this.f3977f;
                return cVar;
            }
            cVar.f3976e.f4002g.c(jVar.d());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j4 = this.f3977f;
        if (j4 != cVar.f3977f) {
            return false;
        }
        long j5 = 0;
        if (j4 == 0) {
            return true;
        }
        j jVar = this.f3976e;
        j jVar2 = cVar.f3976e;
        int r32 = jVar.f3997b;
        int r4 = jVar2.f3997b;
        while (j5 < this.f3977f) {
            long min = Math.min(jVar.f3998c - r32, jVar2.f3998c - r4);
            int r9 = 0;
            while (r9 < min) {
                int r11 = r32 + 1;
                int r12 = r4 + 1;
                if (jVar.f3996a[r32] != jVar2.f3996a[r4]) {
                    return false;
                }
                r9++;
                r32 = r11;
                r4 = r12;
            }
            if (r32 == jVar.f3998c) {
                jVar = jVar.f4001f;
                r32 = jVar.f3997b;
            }
            if (r4 == jVar2.f3998c) {
                jVar2 = jVar2.f4001f;
                r4 = jVar2.f3997b;
            }
            j5 += min;
        }
        return true;
    }

    public String f0(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j4);
        }
        long j5 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        long n4 = n((byte) 10, 0L, j5);
        if (n4 != -1) {
            return X(n4);
        }
        if (j5 < i0() && l(j5 - 1) == 13 && l(j5) == 10) {
            return X(j5);
        }
        c cVar = new c();
        k(cVar, 0L, Math.min(32L, i0()));
        throw new EOFException("\\n not found: limit=" + Math.min(i0(), j4) + " content=" + cVar.y().n() + (char) 8230);
    }

    @Override // h4.d, h4.m, java.io.Flushable
    public void flush() {
    }

    @Override // h4.e
    public byte g0() {
        long j4 = this.f3977f;
        if (j4 == 0) {
            throw new IllegalStateException("size == 0");
        }
        j jVar = this.f3976e;
        int r32 = jVar.f3997b;
        int r4 = jVar.f3998c;
        int r6 = r32 + 1;
        byte b5 = jVar.f3996a[r32];
        this.f3977f = j4 - 1;
        if (r6 == r4) {
            this.f3976e = jVar.b();
            k.a(jVar);
        } else {
            jVar.f3997b = r6;
        }
        return b5;
    }

    public final long h() {
        long j4 = this.f3977f;
        if (j4 == 0) {
            return 0L;
        }
        j jVar = this.f3976e.f4002g;
        return (jVar.f3998c >= 8192 || !jVar.f4000e) ? j4 : j4 - (r3 - jVar.f3997b);
    }

    public int hashCode() {
        j jVar = this.f3976e;
        if (jVar == null) {
            return 0;
        }
        int r12 = 1;
        do {
            int r32 = jVar.f3998c;
            for (int r22 = jVar.f3997b; r22 < r32; r22++) {
                r12 = (r12 * 31) + jVar.f3996a[r22];
            }
            jVar = jVar.f4001f;
        } while (jVar != this.f3976e);
        return r12;
    }

    public final long i0() {
        return this.f3977f;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final f j0() {
        long j4 = this.f3977f;
        if (j4 <= 2147483647L) {
            return k0((int) j4);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f3977f);
    }

    public final c k(c cVar, long j4, long j5) {
        if (cVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        p.b(this.f3977f, j4, j5);
        if (j5 == 0) {
            return this;
        }
        cVar.f3977f += j5;
        j jVar = this.f3976e;
        while (true) {
            int r32 = jVar.f3998c;
            int r4 = jVar.f3997b;
            if (j4 < r32 - r4) {
                break;
            }
            j4 -= r32 - r4;
            jVar = jVar.f4001f;
        }
        while (j5 > 0) {
            j d5 = jVar.d();
            int r10 = (int) (d5.f3997b + j4);
            d5.f3997b = r10;
            d5.f3998c = Math.min(r10 + ((int) j5), d5.f3998c);
            j jVar2 = cVar.f3976e;
            if (jVar2 == null) {
                d5.f4002g = d5;
                d5.f4001f = d5;
                cVar.f3976e = d5;
            } else {
                jVar2.f4002g.c(d5);
            }
            j5 -= d5.f3998c - d5.f3997b;
            jVar = jVar.f4001f;
            j4 = 0;
        }
        return this;
    }

    public final f k0(int r22) {
        return r22 == 0 ? f.f3980i : new l(this, r22);
    }

    public final byte l(long j4) {
        int r22;
        p.b(this.f3977f, j4, 1L);
        long j5 = this.f3977f;
        if (j5 - j4 <= j4) {
            long j6 = j4 - j5;
            j jVar = this.f3976e;
            do {
                jVar = jVar.f4002g;
                int r12 = jVar.f3998c;
                r22 = jVar.f3997b;
                j6 += r12 - r22;
            } while (j6 < 0);
            return jVar.f3996a[r22 + ((int) j6)];
        }
        j jVar2 = this.f3976e;
        while (true) {
            int r13 = jVar2.f3998c;
            int r23 = jVar2.f3997b;
            long j7 = r13 - r23;
            if (j4 < j7) {
                return jVar2.f3996a[r23 + ((int) j4)];
            }
            j4 -= j7;
            jVar2 = jVar2.f4001f;
        }
    }

    j l0(int r4) {
        if (r4 < 1 || r4 > 8192) {
            throw new IllegalArgumentException();
        }
        j jVar = this.f3976e;
        if (jVar != null) {
            j jVar2 = jVar.f4002g;
            return (jVar2.f3998c + r4 > 8192 || !jVar2.f4000e) ? jVar2.c(k.b()) : jVar2;
        }
        j b5 = k.b();
        this.f3976e = b5;
        b5.f4002g = b5;
        b5.f4001f = b5;
        return b5;
    }

    public c m0(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        fVar.y(this);
        return this;
    }

    public long n(byte b5, long j4, long j5) {
        j jVar;
        long j6 = 0;
        if (j4 < 0 || j5 < j4) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f3977f), Long.valueOf(j4), Long.valueOf(j5)));
        }
        long j7 = this.f3977f;
        long j8 = j5 > j7 ? j7 : j5;
        if (j4 == j8 || (jVar = this.f3976e) == null) {
            return -1L;
        }
        if (j7 - j4 < j4) {
            while (j7 > j4) {
                jVar = jVar.f4002g;
                j7 -= jVar.f3998c - jVar.f3997b;
            }
        } else {
            while (true) {
                long j9 = (jVar.f3998c - jVar.f3997b) + j6;
                if (j9 >= j4) {
                    break;
                }
                jVar = jVar.f4001f;
                j6 = j9;
            }
            j7 = j6;
        }
        long j10 = j4;
        while (j7 < j8) {
            byte[] bArr = jVar.f3996a;
            int min = (int) Math.min(jVar.f3998c, (jVar.f3997b + j8) - j7);
            for (int r12 = (int) ((jVar.f3997b + j10) - j7); r12 < min; r12++) {
                if (bArr[r12] == b5) {
                    return (r12 - jVar.f3997b) + j7;
                }
            }
            j7 += jVar.f3998c - jVar.f3997b;
            jVar = jVar.f4001f;
            j10 = j7;
        }
        return -1L;
    }

    @Override // h4.d
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public c j(byte[] bArr) {
        if (bArr != null) {
            return o0(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // h4.n
    public long o(c cVar, long j4) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j4 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j4);
        }
        long j5 = this.f3977f;
        if (j5 == 0) {
            return -1L;
        }
        if (j4 > j5) {
            j4 = j5;
        }
        cVar.w(this, j4);
        return j4;
    }

    public c o0(byte[] bArr, int r11, int r12) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j4 = r12;
        p.b(bArr.length, r11, j4);
        int r122 = r12 + r11;
        while (r11 < r122) {
            j l02 = l0(1);
            int min = Math.min(r122 - r11, 8192 - l02.f3998c);
            System.arraycopy(bArr, r11, l02.f3996a, l02.f3998c, min);
            r11 += min;
            l02.f3998c += min;
        }
        this.f3977f += j4;
        return this;
    }

    @Override // h4.d
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public c Z(int r5) {
        j l02 = l0(1);
        byte[] bArr = l02.f3996a;
        int r22 = l02.f3998c;
        l02.f3998c = r22 + 1;
        bArr[r22] = (byte) r5;
        this.f3977f++;
        return this;
    }

    public c q0(long j4) {
        if (j4 == 0) {
            return Z(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j4)) / 4) + 1;
        j l02 = l0(numberOfTrailingZeros);
        byte[] bArr = l02.f3996a;
        int r4 = l02.f3998c;
        for (int r5 = (r4 + numberOfTrailingZeros) - 1; r5 >= r4; r5--) {
            bArr[r5] = f3975g[(int) (15 & j4)];
            j4 >>>= 4;
        }
        l02.f3998c += numberOfTrailingZeros;
        this.f3977f += numberOfTrailingZeros;
        return this;
    }

    public OutputStream r() {
        return new a();
    }

    @Override // h4.d
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public c I(int r6) {
        j l02 = l0(4);
        byte[] bArr = l02.f3996a;
        int r22 = l02.f3998c;
        int r32 = r22 + 1;
        bArr[r22] = (byte) ((r6 >>> 24) & 255);
        int r23 = r32 + 1;
        bArr[r32] = (byte) ((r6 >>> 16) & 255);
        int r33 = r23 + 1;
        bArr[r23] = (byte) ((r6 >>> 8) & 255);
        bArr[r33] = (byte) (r6 & 255);
        l02.f3998c = r33 + 1;
        this.f3977f += 4;
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        j jVar = this.f3976e;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), jVar.f3998c - jVar.f3997b);
        byteBuffer.put(jVar.f3996a, jVar.f3997b, min);
        int r7 = jVar.f3997b + min;
        jVar.f3997b = r7;
        this.f3977f -= min;
        if (r7 == jVar.f3998c) {
            this.f3976e = jVar.b();
            k.a(jVar);
        }
        return min;
    }

    public int s(byte[] bArr, int r9, int r10) {
        p.b(bArr.length, r9, r10);
        j jVar = this.f3976e;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(r10, jVar.f3998c - jVar.f3997b);
        System.arraycopy(jVar.f3996a, jVar.f3997b, bArr, r9, min);
        int r8 = jVar.f3997b + min;
        jVar.f3997b = r8;
        this.f3977f -= min;
        if (r8 == jVar.f3998c) {
            this.f3976e = jVar.b();
            k.a(jVar);
        }
        return min;
    }

    @Override // h4.d
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public c E(int r6) {
        j l02 = l0(2);
        byte[] bArr = l02.f3996a;
        int r22 = l02.f3998c;
        int r32 = r22 + 1;
        bArr[r22] = (byte) ((r6 >>> 8) & 255);
        bArr[r32] = (byte) (r6 & 255);
        l02.f3998c = r32 + 1;
        this.f3977f += 2;
        return this;
    }

    public final c t0(OutputStream outputStream, long j4) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        p.b(this.f3977f, 0L, j4);
        j jVar = this.f3976e;
        while (j4 > 0) {
            int min = (int) Math.min(j4, jVar.f3998c - jVar.f3997b);
            outputStream.write(jVar.f3996a, jVar.f3997b, min);
            int r12 = jVar.f3997b + min;
            jVar.f3997b = r12;
            long j5 = min;
            this.f3977f -= j5;
            j4 -= j5;
            if (r12 == jVar.f3998c) {
                j b5 = jVar.b();
                this.f3976e = b5;
                k.a(jVar);
                jVar = b5;
            }
        }
        return this;
    }

    public String toString() {
        return j0().toString();
    }

    @Override // h4.d
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public c U(String str) {
        return v0(str, 0, str.length());
    }

    public byte[] v() {
        try {
            return b0(this.f3977f);
        } catch (EOFException e5) {
            throw new AssertionError(e5);
        }
    }

    public c v0(String str, int r9, int r10) {
        int r22;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (r9 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + r9);
        }
        if (r10 < r9) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + r10 + " < " + r9);
        }
        if (r10 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + r10 + " > " + str.length());
        }
        while (r9 < r10) {
            char charAt = str.charAt(r9);
            if (charAt < 128) {
                j l02 = l0(1);
                byte[] bArr = l02.f3996a;
                int r4 = l02.f3998c - r9;
                int min = Math.min(r10, 8192 - r4);
                int r6 = r9 + 1;
                bArr[r9 + r4] = (byte) charAt;
                while (r6 < min) {
                    char charAt2 = str.charAt(r6);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[r6 + r4] = (byte) charAt2;
                    r6++;
                }
                int r92 = l02.f3998c;
                int r42 = (r4 + r6) - r92;
                l02.f3998c = r92 + r42;
                this.f3977f += r42;
                r9 = r6;
            } else {
                if (charAt < 2048) {
                    r22 = (charAt >> 6) | 192;
                } else if (charAt < 55296 || charAt > 57343) {
                    Z((charAt >> '\f') | 224);
                    r22 = ((charAt >> 6) & 63) | 128;
                } else {
                    int r43 = r9 + 1;
                    char charAt3 = r43 < r10 ? str.charAt(r43) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        Z(63);
                        r9 = r43;
                    } else {
                        int r02 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                        Z((r02 >> 18) | 240);
                        Z(((r02 >> 12) & 63) | 128);
                        Z(((r02 >> 6) & 63) | 128);
                        Z((r02 & 63) | 128);
                        r9 += 2;
                    }
                }
                Z(r22);
                Z((charAt & '?') | 128);
                r9++;
            }
        }
        return this;
    }

    @Override // h4.m
    public void w(c cVar, long j4) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        p.b(cVar.f3977f, 0L, j4);
        while (j4 > 0) {
            j jVar = cVar.f3976e;
            if (j4 < jVar.f3998c - jVar.f3997b) {
                j jVar2 = this.f3976e;
                j jVar3 = jVar2 != null ? jVar2.f4002g : null;
                if (jVar3 != null && jVar3.f4000e) {
                    if ((jVar3.f3998c + j4) - (jVar3.f3999d ? 0 : jVar3.f3997b) <= 8192) {
                        jVar.f(jVar3, (int) j4);
                        cVar.f3977f -= j4;
                        this.f3977f += j4;
                        return;
                    }
                }
                cVar.f3976e = jVar.e((int) j4);
            }
            j jVar4 = cVar.f3976e;
            long j5 = jVar4.f3998c - jVar4.f3997b;
            cVar.f3976e = jVar4.b();
            j jVar5 = this.f3976e;
            if (jVar5 == null) {
                this.f3976e = jVar4;
                jVar4.f4002g = jVar4;
                jVar4.f4001f = jVar4;
            } else {
                jVar5.f4002g.c(jVar4).a();
            }
            cVar.f3977f -= j5;
            this.f3977f += j5;
            j4 -= j5;
        }
    }

    public c w0(int r4) {
        int r12;
        int r13;
        if (r4 >= 128) {
            if (r4 < 2048) {
                r13 = (r4 >> 6) | 192;
            } else {
                if (r4 < 65536) {
                    if (r4 >= 55296 && r4 <= 57343) {
                        Z(63);
                        return this;
                    }
                    r12 = (r4 >> 12) | 224;
                } else {
                    if (r4 > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(r4));
                    }
                    Z((r4 >> 18) | 240);
                    r12 = ((r4 >> 12) & 63) | 128;
                }
                Z(r12);
                r13 = ((r4 >> 6) & 63) | 128;
            }
            Z(r13);
            r4 = (r4 & 63) | 128;
        }
        Z(r4);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int r12 = remaining;
        while (r12 > 0) {
            j l02 = l0(1);
            int min = Math.min(r12, 8192 - l02.f3998c);
            byteBuffer.get(l02.f3996a, l02.f3998c, min);
            r12 -= min;
            l02.f3998c += min;
        }
        this.f3977f += remaining;
        return remaining;
    }

    @Override // h4.e
    public f x(long j4) {
        return new f(b0(j4));
    }

    public f y() {
        return new f(v());
    }
}
