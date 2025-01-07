package f3;

import f3.b;
import f3.f;
import h4.n;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f3749a = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final h4.f f3750b = h4.f.i("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    static final class a implements n {

        /* renamed from: e, reason: collision with root package name */
        private final h4.e f3751e;

        /* renamed from: f, reason: collision with root package name */
        int f3752f;

        /* renamed from: g, reason: collision with root package name */
        byte f3753g;

        /* renamed from: h, reason: collision with root package name */
        int f3754h;

        /* renamed from: i, reason: collision with root package name */
        int f3755i;

        /* renamed from: j, reason: collision with root package name */
        short f3756j;

        public a(h4.e eVar) {
            this.f3751e = eVar;
        }

        private void a() {
            int r02 = this.f3754h;
            int m4 = g.m(this.f3751e);
            this.f3755i = m4;
            this.f3752f = m4;
            byte g02 = (byte) (this.f3751e.g0() & 255);
            this.f3753g = (byte) (this.f3751e.g0() & 255);
            if (g.f3749a.isLoggable(Level.FINE)) {
                g.f3749a.fine(b.b(true, this.f3754h, this.f3752f, g02, this.f3753g));
            }
            int G = this.f3751e.G() & Integer.MAX_VALUE;
            this.f3754h = G;
            if (g02 != 9) {
                throw g.k("%s != TYPE_CONTINUATION", Byte.valueOf(g02));
            }
            if (G != r02) {
                throw g.k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // h4.n, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // h4.n
        public long o(h4.c cVar, long j4) {
            while (true) {
                int r02 = this.f3755i;
                if (r02 != 0) {
                    long o4 = this.f3751e.o(cVar, Math.min(j4, r02));
                    if (o4 == -1) {
                        return -1L;
                    }
                    this.f3755i -= (int) o4;
                    return o4;
                }
                this.f3751e.A(this.f3756j);
                this.f3756j = (short) 0;
                if ((this.f3753g & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String[] f3757a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f3758b = new String[64];

        /* renamed from: c, reason: collision with root package name */
        private static final String[] f3759c = new String[256];

        static {
            int r02 = 0;
            int r12 = 0;
            while (true) {
                String[] strArr = f3759c;
                if (r12 >= strArr.length) {
                    break;
                }
                strArr[r12] = String.format("%8s", Integer.toBinaryString(r12)).replace(' ', '0');
                r12++;
            }
            String[] strArr2 = f3758b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] r22 = {1};
            strArr2[8] = "PADDED";
            for (int r13 = 0; r13 < 1; r13++) {
                int r7 = r22[r13];
                String[] strArr3 = f3758b;
                strArr3[r7 | 8] = strArr3[r7] + "|PADDED";
            }
            String[] strArr4 = f3758b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] r4 = {4, 32, 36};
            for (int r72 = 0; r72 < 3; r72++) {
                int r8 = r4[r72];
                for (int r9 = 0; r9 < 1; r9++) {
                    int r10 = r22[r9];
                    String[] strArr5 = f3758b;
                    int r122 = r10 | r8;
                    strArr5[r122] = strArr5[r10] + '|' + strArr5[r8];
                    strArr5[r122 | 8] = strArr5[r10] + '|' + strArr5[r8] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr6 = f3758b;
                if (r02 >= strArr6.length) {
                    return;
                }
                if (strArr6[r02] == null) {
                    strArr6[r02] = f3759c[r02];
                }
                r02++;
            }
        }

        b() {
        }

        static String a(byte b5, byte b6) {
            if (b6 == 0) {
                return "";
            }
            if (b5 != 2 && b5 != 3) {
                if (b5 == 4 || b5 == 6) {
                    return b6 == 1 ? "ACK" : f3759c[b6];
                }
                if (b5 != 7 && b5 != 8) {
                    String[] strArr = f3758b;
                    String str = b6 < strArr.length ? strArr[b6] : f3759c[b6];
                    return (b5 != 5 || (b6 & 4) == 0) ? (b5 != 0 || (b6 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f3759c[b6];
        }

        static String b(boolean z4, int r5, int r6, byte b5, byte b6) {
            String[] strArr = f3757a;
            String format = b5 < strArr.length ? strArr[b5] : String.format("0x%02x", Byte.valueOf(b5));
            String a5 = a(b5, b6);
            Object[] objArr = new Object[5];
            objArr[0] = z4 ? "<<" : ">>";
            objArr[1] = Integer.valueOf(r5);
            objArr[2] = Integer.valueOf(r6);
            objArr[3] = format;
            objArr[4] = a5;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    static final class c implements f3.b {

        /* renamed from: e, reason: collision with root package name */
        private final h4.e f3760e;

        /* renamed from: f, reason: collision with root package name */
        private final a f3761f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f3762g;

        /* renamed from: h, reason: collision with root package name */
        final f.a f3763h;

        c(h4.e eVar, int r22, boolean z4) {
            this.f3760e = eVar;
            this.f3762g = z4;
            a aVar = new a(eVar);
            this.f3761f = aVar;
            this.f3763h = new f.a(r22, aVar);
        }

        private void a(b.a aVar, int r6, byte b5, int r8) {
            boolean z4 = (b5 & 1) != 0;
            if ((b5 & 32) != 0) {
                throw g.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short g02 = (b5 & 8) != 0 ? (short) (this.f3760e.g0() & 255) : (short) 0;
            aVar.h(z4, r8, this.f3760e, g.l(r6, b5, g02));
            this.f3760e.A(g02);
        }

        private void d(b.a aVar, int r5, byte b5, int r7) {
            if (r5 < 8) {
                throw g.k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(r5));
            }
            if (r7 != 0) {
                throw g.k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int G = this.f3760e.G();
            int G2 = this.f3760e.G();
            int r52 = r5 - 8;
            f3.a d5 = f3.a.d(G2);
            if (d5 == null) {
                throw g.k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(G2));
            }
            h4.f fVar = h4.f.f3980i;
            if (r52 > 0) {
                fVar = this.f3760e.x(r52);
            }
            aVar.l(G, d5, fVar);
        }

        private List<f3.d> e(int r22, short s4, byte b5, int r5) {
            a aVar = this.f3761f;
            aVar.f3755i = r22;
            aVar.f3752f = r22;
            aVar.f3756j = s4;
            aVar.f3753g = b5;
            aVar.f3754h = r5;
            this.f3763h.l();
            return this.f3763h.e();
        }

        private void h(b.a aVar, int r11, byte b5, int r13) {
            if (r13 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z4 = (b5 & 1) != 0;
            short g02 = (b5 & 8) != 0 ? (short) (this.f3760e.g0() & 255) : (short) 0;
            if ((b5 & 32) != 0) {
                k(aVar, r13);
                r11 -= 5;
            }
            aVar.k(false, z4, r13, -1, e(g.l(r11, b5, g02), g02, b5, r13), e.HTTP_20_HEADERS);
        }

        private void i(b.a aVar, int r5, byte b5, int r7) {
            if (r5 != 8) {
                throw g.k("TYPE_PING length != 8: %s", Integer.valueOf(r5));
            }
            if (r7 != 0) {
                throw g.k("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.g((b5 & 1) != 0, this.f3760e.G(), this.f3760e.G());
        }

        private void k(b.a aVar, int r6) {
            int G = this.f3760e.G();
            aVar.m(r6, G & Integer.MAX_VALUE, (this.f3760e.g0() & 255) + 1, (Integer.MIN_VALUE & G) != 0);
        }

        private void l(b.a aVar, int r32, byte b5, int r5) {
            if (r32 != 5) {
                throw g.k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(r32));
            }
            if (r5 == 0) {
                throw g.k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            k(aVar, r5);
        }

        private void n(b.a aVar, int r5, byte b5, int r7) {
            if (r7 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short g02 = (b5 & 8) != 0 ? (short) (this.f3760e.g0() & 255) : (short) 0;
            aVar.j(r7, this.f3760e.G() & Integer.MAX_VALUE, e(g.l(r5 - 4, b5, g02), g02, b5, r7));
        }

        private void r(b.a aVar, int r4, byte b5, int r6) {
            if (r4 != 4) {
                throw g.k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(r4));
            }
            if (r6 == 0) {
                throw g.k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int G = this.f3760e.G();
            f3.a d5 = f3.a.d(G);
            if (d5 == null) {
                throw g.k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(G));
            }
            aVar.c(r6, d5);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void s(b.a aVar, int r7, byte b5, int r9) {
            if (r9 != 0) {
                throw g.k("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b5 & 1) != 0) {
                if (r7 != 0) {
                    throw g.k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.i();
                return;
            }
            if (r7 % 6 != 0) {
                throw g.k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(r7));
            }
            i iVar = new i();
            for (int r12 = 0; r12 < r7; r12 += 6) {
                short D = this.f3760e.D();
                int G = this.f3760e.G();
                switch (D) {
                    case 1:
                    case 6:
                        iVar.e(D, 0, G);
                    case 2:
                        if (G != 0 && G != 1) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        iVar.e(D, 0, G);
                    case 3:
                        D = 4;
                        iVar.e(D, 0, G);
                    case 4:
                        D = 7;
                        if (G < 0) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        iVar.e(D, 0, G);
                    case 5:
                        if (G < 16384 || G > 16777215) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(G));
                        }
                        iVar.e(D, 0, G);
                        break;
                    default:
                }
            }
            aVar.n(false, iVar);
            if (iVar.b() >= 0) {
                this.f3763h.g(iVar.b());
            }
        }

        private void t(b.a aVar, int r6, byte b5, int r8) {
            if (r6 != 4) {
                throw g.k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(r6));
            }
            long G = this.f3760e.G() & 2147483647L;
            if (G == 0) {
                throw g.k("windowSizeIncrement was 0", new Object[0]);
            }
            aVar.f(r8, G);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f3760e.close();
        }

        @Override // f3.b
        public boolean e0(b.a aVar) {
            try {
                this.f3760e.Q(9L);
                int m4 = g.m(this.f3760e);
                if (m4 < 0 || m4 > 16384) {
                    throw g.k("FRAME_SIZE_ERROR: %s", Integer.valueOf(m4));
                }
                byte g02 = (byte) (this.f3760e.g0() & 255);
                byte g03 = (byte) (this.f3760e.g0() & 255);
                int G = this.f3760e.G() & Integer.MAX_VALUE;
                if (g.f3749a.isLoggable(Level.FINE)) {
                    g.f3749a.fine(b.b(true, G, m4, g02, g03));
                }
                switch (g02) {
                    case 0:
                        a(aVar, m4, g03, G);
                        return true;
                    case 1:
                        h(aVar, m4, g03, G);
                        return true;
                    case 2:
                        l(aVar, m4, g03, G);
                        return true;
                    case 3:
                        r(aVar, m4, g03, G);
                        return true;
                    case 4:
                        s(aVar, m4, g03, G);
                        return true;
                    case 5:
                        n(aVar, m4, g03, G);
                        return true;
                    case 6:
                        i(aVar, m4, g03, G);
                        return true;
                    case 7:
                        d(aVar, m4, g03, G);
                        return true;
                    case 8:
                        t(aVar, m4, g03, G);
                        return true;
                    default:
                        this.f3760e.A(m4);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    static final class d implements f3.c {

        /* renamed from: e, reason: collision with root package name */
        private final h4.d f3764e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f3765f;

        /* renamed from: g, reason: collision with root package name */
        private final h4.c f3766g;

        /* renamed from: h, reason: collision with root package name */
        private final f.b f3767h;

        /* renamed from: i, reason: collision with root package name */
        private int f3768i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f3769j;

        d(h4.d dVar, boolean z4) {
            this.f3764e = dVar;
            this.f3765f = z4;
            h4.c cVar = new h4.c();
            this.f3766g = cVar;
            this.f3767h = new f.b(cVar);
            this.f3768i = 16384;
        }

        private void h(int r8, long j4) {
            while (j4 > 0) {
                int min = (int) Math.min(this.f3768i, j4);
                long j5 = min;
                j4 -= j5;
                d(r8, min, (byte) 9, j4 == 0 ? (byte) 4 : (byte) 0);
                this.f3764e.w(this.f3766g, j5);
            }
        }

        @Override // f3.c
        public int L() {
            return this.f3768i;
        }

        @Override // f3.c
        public synchronized void O(boolean z4, boolean z5, int r32, int r4, List<f3.d> list) {
            try {
                if (z5) {
                    throw new UnsupportedOperationException();
                }
                if (this.f3769j) {
                    throw new IOException("closed");
                }
                e(z4, r32, list);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // f3.c
        public synchronized void P(i iVar) {
            if (this.f3769j) {
                throw new IOException("closed");
            }
            int r12 = 0;
            d(0, iVar.f() * 6, (byte) 4, (byte) 0);
            while (r12 < 10) {
                if (iVar.d(r12)) {
                    this.f3764e.E(r12 == 4 ? 3 : r12 == 7 ? 4 : r12);
                    this.f3764e.I(iVar.a(r12));
                }
                r12++;
            }
            this.f3764e.flush();
        }

        void a(int r32, byte b5, h4.c cVar, int r6) {
            d(r32, r6, (byte) 0, b5);
            if (r6 > 0) {
                this.f3764e.w(cVar, r6);
            }
        }

        @Override // f3.c
        public synchronized void a0() {
            if (this.f3769j) {
                throw new IOException("closed");
            }
            if (this.f3765f) {
                if (g.f3749a.isLoggable(Level.FINE)) {
                    g.f3749a.fine(String.format(">> CONNECTION %s", g.f3750b.n()));
                }
                this.f3764e.j(g.f3750b.w());
                this.f3764e.flush();
            }
        }

        @Override // f3.c
        public synchronized void c(int r4, f3.a aVar) {
            if (this.f3769j) {
                throw new IOException("closed");
            }
            if (aVar.f3710e == -1) {
                throw new IllegalArgumentException();
            }
            d(r4, 4, (byte) 3, (byte) 0);
            this.f3764e.I(aVar.f3710e);
            this.f3764e.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f3769j = true;
            this.f3764e.close();
        }

        void d(int r4, int r5, byte b5, byte b6) {
            if (g.f3749a.isLoggable(Level.FINE)) {
                g.f3749a.fine(b.b(false, r4, r5, b5, b6));
            }
            int r02 = this.f3768i;
            if (r5 > r02) {
                throw g.j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(r02), Integer.valueOf(r5));
            }
            if ((Integer.MIN_VALUE & r4) != 0) {
                throw g.j("reserved bit set: %s", Integer.valueOf(r4));
            }
            g.n(this.f3764e, r5);
            this.f3764e.Z(b5 & 255);
            this.f3764e.Z(b6 & 255);
            this.f3764e.I(r4 & Integer.MAX_VALUE);
        }

        void e(boolean z4, int r8, List<f3.d> list) {
            if (this.f3769j) {
                throw new IOException("closed");
            }
            this.f3767h.e(list);
            long i02 = this.f3766g.i0();
            int min = (int) Math.min(this.f3768i, i02);
            long j4 = min;
            byte b5 = i02 == j4 ? (byte) 4 : (byte) 0;
            if (z4) {
                b5 = (byte) (b5 | 1);
            }
            d(r8, min, (byte) 1, b5);
            this.f3764e.w(this.f3766g, j4);
            if (i02 > j4) {
                h(r8, i02 - j4);
            }
        }

        @Override // f3.c
        public synchronized void f(int r5, long j4) {
            if (this.f3769j) {
                throw new IOException("closed");
            }
            if (j4 == 0 || j4 > 2147483647L) {
                throw g.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j4));
            }
            d(r5, 4, (byte) 8, (byte) 0);
            this.f3764e.I((int) j4);
            this.f3764e.flush();
        }

        @Override // f3.c
        public synchronized void flush() {
            if (this.f3769j) {
                throw new IOException("closed");
            }
            this.f3764e.flush();
        }

        @Override // f3.c
        public synchronized void g(boolean z4, int r5, int r6) {
            if (this.f3769j) {
                throw new IOException("closed");
            }
            d(0, 8, (byte) 6, z4 ? (byte) 1 : (byte) 0);
            this.f3764e.I(r5);
            this.f3764e.I(r6);
            this.f3764e.flush();
        }

        @Override // f3.c
        public synchronized void h0(boolean z4, int r32, h4.c cVar, int r5) {
            if (this.f3769j) {
                throw new IOException("closed");
            }
            a(r32, z4 ? (byte) 1 : (byte) 0, cVar, r5);
        }

        @Override // f3.c
        public synchronized void p(i iVar) {
            if (this.f3769j) {
                throw new IOException("closed");
            }
            this.f3768i = iVar.c(this.f3768i);
            d(0, 0, (byte) 4, (byte) 1);
            this.f3764e.flush();
        }

        @Override // f3.c
        public synchronized void q(int r4, f3.a aVar, byte[] bArr) {
            if (this.f3769j) {
                throw new IOException("closed");
            }
            if (aVar.f3710e == -1) {
                throw g.j("errorCode.httpCode == -1", new Object[0]);
            }
            d(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f3764e.I(r4);
            this.f3764e.I(aVar.f3710e);
            if (bArr.length > 0) {
                this.f3764e.j(bArr);
            }
            this.f3764e.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IllegalArgumentException j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException k(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int r12, byte b5, short s4) {
        if ((b5 & 8) != 0) {
            r12--;
        }
        if (s4 <= r12) {
            return (short) (r12 - s4);
        }
        throw k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s4), Integer.valueOf(r12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(h4.e eVar) {
        return (eVar.g0() & 255) | ((eVar.g0() & 255) << 16) | ((eVar.g0() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(h4.d dVar, int r22) {
        dVar.Z((r22 >>> 16) & 255);
        dVar.Z((r22 >>> 8) & 255);
        dVar.Z(r22 & 255);
    }

    @Override // f3.j
    public f3.c a(h4.d dVar, boolean z4) {
        return new d(dVar, z4);
    }

    @Override // f3.j
    public f3.b b(h4.e eVar, boolean z4) {
        return new c(eVar, 4096, z4);
    }
}
