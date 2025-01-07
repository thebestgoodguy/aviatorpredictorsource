package io.grpc.internal;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* loaded from: classes.dex */
class r0 implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    private int f5623i;

    /* renamed from: j, reason: collision with root package name */
    private int f5624j;

    /* renamed from: k, reason: collision with root package name */
    private Inflater f5625k;

    /* renamed from: n, reason: collision with root package name */
    private int f5628n;

    /* renamed from: o, reason: collision with root package name */
    private int f5629o;

    /* renamed from: p, reason: collision with root package name */
    private long f5630p;

    /* renamed from: e, reason: collision with root package name */
    private final u f5619e = new u();

    /* renamed from: f, reason: collision with root package name */
    private final CRC32 f5620f = new CRC32();

    /* renamed from: g, reason: collision with root package name */
    private final b f5621g = new b(this, null);

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f5622h = new byte[512];

    /* renamed from: l, reason: collision with root package name */
    private c f5626l = c.HEADER;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5627m = false;

    /* renamed from: q, reason: collision with root package name */
    private int f5631q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f5632r = 0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f5633s = true;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5634a;

        static {
            int[] r02 = new int[c.values().length];
            f5634a = r02;
            try {
                r02[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5634a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5634a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5634a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5634a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5634a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5634a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5634a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5634a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5634a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private class b {
        private b() {
        }

        /* synthetic */ b(r0 r0Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            while (k() > 0) {
                if (h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h() {
            int N;
            if (r0.this.f5624j - r0.this.f5623i > 0) {
                N = r0.this.f5622h[r0.this.f5623i] & 255;
                r0.e(r0.this, 1);
            } else {
                N = r0.this.f5619e.N();
            }
            r0.this.f5620f.update(N);
            r0.l(r0.this, 1);
            return N;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return j() | (j() << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int j() {
            return h() | (h() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            return (r0.this.f5624j - r0.this.f5623i) + r0.this.f5619e.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int r8) {
            int r02;
            int r03 = r0.this.f5624j - r0.this.f5623i;
            if (r03 > 0) {
                int min = Math.min(r03, r8);
                r0.this.f5620f.update(r0.this.f5622h, r0.this.f5623i, min);
                r0.e(r0.this, min);
                r02 = r8 - min;
            } else {
                r02 = r8;
            }
            if (r02 > 0) {
                byte[] bArr = new byte[512];
                int r4 = 0;
                while (r4 < r02) {
                    int min2 = Math.min(r02 - r4, 512);
                    r0.this.f5619e.d0(bArr, 0, min2);
                    r0.this.f5620f.update(bArr, 0, min2);
                    r4 += min2;
                }
            }
            r0.l(r0.this, r8);
        }
    }

    private enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    r0() {
    }

    private boolean F() {
        c cVar;
        Inflater inflater = this.f5625k;
        if (inflater == null) {
            this.f5625k = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f5620f.reset();
        int r02 = this.f5624j;
        int r22 = this.f5623i;
        int r03 = r02 - r22;
        if (r03 > 0) {
            this.f5625k.setInput(this.f5622h, r22, r03);
            cVar = c.INFLATING;
        } else {
            cVar = c.INFLATER_NEEDS_INPUT;
        }
        this.f5626l = cVar;
        return true;
    }

    private boolean K() {
        if (this.f5621g.k() < 10) {
            return false;
        }
        if (this.f5621g.j() != 35615) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.f5621g.h() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.f5628n = this.f5621g.h();
        this.f5621g.l(6);
        this.f5626l = c.HEADER_EXTRA_LEN;
        return true;
    }

    private boolean M() {
        if ((this.f5628n & 16) == 16 && !this.f5621g.g()) {
            return false;
        }
        this.f5626l = c.HEADER_CRC;
        return true;
    }

    private boolean R() {
        if ((this.f5628n & 2) == 2) {
            if (this.f5621g.k() < 2) {
                return false;
            }
            if ((65535 & ((int) this.f5620f.getValue())) != this.f5621g.j()) {
                throw new ZipException("Corrupt GZIP header");
            }
        }
        this.f5626l = c.INITIALIZE_INFLATER;
        return true;
    }

    private boolean S() {
        int k4 = this.f5621g.k();
        int r12 = this.f5629o;
        if (k4 < r12) {
            return false;
        }
        this.f5621g.l(r12);
        this.f5626l = c.HEADER_NAME;
        return true;
    }

    private boolean X() {
        c cVar;
        if ((this.f5628n & 4) != 4) {
            cVar = c.HEADER_NAME;
        } else {
            if (this.f5621g.k() < 2) {
                return false;
            }
            this.f5629o = this.f5621g.j();
            cVar = c.HEADER_EXTRA;
        }
        this.f5626l = cVar;
        return true;
    }

    private boolean c0() {
        if ((this.f5628n & 8) == 8 && !this.f5621g.g()) {
            return false;
        }
        this.f5626l = c.HEADER_COMMENT;
        return true;
    }

    static /* synthetic */ int e(r0 r0Var, int r22) {
        int r02 = r0Var.f5623i + r22;
        r0Var.f5623i = r02;
        return r02;
    }

    private boolean f0() {
        if (this.f5625k != null && this.f5621g.k() <= 18) {
            this.f5625k.end();
            this.f5625k = null;
        }
        if (this.f5621g.k() < 8) {
            return false;
        }
        if (this.f5620f.getValue() != this.f5621g.i() || this.f5630p != this.f5621g.i()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.f5620f.reset();
        this.f5626l = c.HEADER;
        return true;
    }

    static /* synthetic */ int l(r0 r0Var, int r22) {
        int r02 = r0Var.f5631q + r22;
        r0Var.f5631q = r02;
        return r02;
    }

    private boolean r() {
        q0.l.u(this.f5625k != null, "inflater is null");
        q0.l.u(this.f5623i == this.f5624j, "inflaterInput has unconsumed bytes");
        int min = Math.min(this.f5619e.b(), 512);
        if (min == 0) {
            return false;
        }
        this.f5623i = 0;
        this.f5624j = min;
        this.f5619e.d0(this.f5622h, 0, min);
        this.f5625k.setInput(this.f5622h, this.f5623i, min);
        this.f5626l = c.INFLATING;
        return true;
    }

    private int y(byte[] bArr, int r4, int r5) {
        c cVar;
        q0.l.u(this.f5625k != null, "inflater is null");
        try {
            int totalIn = this.f5625k.getTotalIn();
            int inflate = this.f5625k.inflate(bArr, r4, r5);
            int totalIn2 = this.f5625k.getTotalIn() - totalIn;
            this.f5631q += totalIn2;
            this.f5632r += totalIn2;
            this.f5623i += totalIn2;
            this.f5620f.update(bArr, r4, inflate);
            if (!this.f5625k.finished()) {
                if (this.f5625k.needsInput()) {
                    cVar = c.INFLATER_NEEDS_INPUT;
                }
                return inflate;
            }
            this.f5630p = this.f5625k.getBytesWritten() & 4294967295L;
            cVar = c.TRAILER;
            this.f5626l = cVar;
            return inflate;
        } catch (DataFormatException e5) {
            throw new DataFormatException("Inflater data format exception: " + e5.getMessage());
        }
    }

    int C(byte[] bArr, int r8, int r9) {
        boolean z4 = true;
        q0.l.u(!this.f5627m, "GzipInflatingBuffer is closed");
        boolean z5 = true;
        int r32 = 0;
        while (z5) {
            int r4 = r9 - r32;
            if (r4 <= 0) {
                if (z5 && (this.f5626l != c.HEADER || this.f5621g.k() >= 10)) {
                    z4 = false;
                }
                this.f5633s = z4;
                return r32;
            }
            switch (a.f5634a[this.f5626l.ordinal()]) {
                case 1:
                    z5 = K();
                    continue;
                case 2:
                    z5 = X();
                    continue;
                case 3:
                    z5 = S();
                    continue;
                case 4:
                    z5 = c0();
                    continue;
                case 5:
                    z5 = M();
                    continue;
                case 6:
                    z5 = R();
                    continue;
                case 7:
                    z5 = F();
                    continue;
                case 8:
                    r32 += y(bArr, r8 + r32, r4);
                    if (this.f5626l == c.TRAILER) {
                        break;
                    } else {
                        z5 = true;
                    }
                case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    z5 = r();
                    continue;
                case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    break;
                default:
                    throw new AssertionError("Invalid state: " + this.f5626l);
            }
            z5 = f0();
        }
        if (z5) {
            z4 = false;
        }
        this.f5633s = z4;
        return r32;
    }

    boolean H() {
        q0.l.u(!this.f5627m, "GzipInflatingBuffer is closed");
        return this.f5633s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f5627m) {
            return;
        }
        this.f5627m = true;
        this.f5619e.close();
        Inflater inflater = this.f5625k;
        if (inflater != null) {
            inflater.end();
            this.f5625k = null;
        }
    }

    void n(u1 u1Var) {
        q0.l.u(!this.f5627m, "GzipInflatingBuffer is closed");
        this.f5619e.d(u1Var);
        this.f5633s = false;
    }

    int s() {
        int r02 = this.f5631q;
        this.f5631q = 0;
        return r02;
    }

    int t() {
        int r02 = this.f5632r;
        this.f5632r = 0;
        return r02;
    }

    boolean v() {
        q0.l.u(!this.f5627m, "GzipInflatingBuffer is closed");
        return (this.f5621g.k() == 0 && this.f5626l == c.HEADER) ? false : true;
    }
}
