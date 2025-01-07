package io.grpc.internal;

import b3.l;
import io.grpc.internal.j2;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;

/* loaded from: classes.dex */
public class k1 implements Closeable, y {

    /* renamed from: e, reason: collision with root package name */
    private b f5396e;

    /* renamed from: f, reason: collision with root package name */
    private int f5397f;

    /* renamed from: g, reason: collision with root package name */
    private final h2 f5398g;

    /* renamed from: h, reason: collision with root package name */
    private final n2 f5399h;

    /* renamed from: i, reason: collision with root package name */
    private b3.u f5400i;

    /* renamed from: j, reason: collision with root package name */
    private r0 f5401j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f5402k;

    /* renamed from: l, reason: collision with root package name */
    private int f5403l;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5406o;

    /* renamed from: p, reason: collision with root package name */
    private u f5407p;

    /* renamed from: r, reason: collision with root package name */
    private long f5409r;

    /* renamed from: u, reason: collision with root package name */
    private int f5412u;

    /* renamed from: m, reason: collision with root package name */
    private e f5404m = e.HEADER;

    /* renamed from: n, reason: collision with root package name */
    private int f5405n = 5;

    /* renamed from: q, reason: collision with root package name */
    private u f5408q = new u();

    /* renamed from: s, reason: collision with root package name */
    private boolean f5410s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f5411t = -1;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5413v = false;

    /* renamed from: w, reason: collision with root package name */
    private volatile boolean f5414w = false;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5415a;

        static {
            int[] r02 = new int[e.values().length];
            f5415a = r02;
            try {
                r02[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5415a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b {
        void a(j2.a aVar);

        void b(Throwable th);

        void c(boolean z4);

        void d(int r12);
    }

    private static class c implements j2.a {

        /* renamed from: e, reason: collision with root package name */
        private InputStream f5416e;

        private c(InputStream inputStream) {
            this.f5416e = inputStream;
        }

        /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        @Override // io.grpc.internal.j2.a
        public InputStream next() {
            InputStream inputStream = this.f5416e;
            this.f5416e = null;
            return inputStream;
        }
    }

    static final class d extends FilterInputStream {

        /* renamed from: e, reason: collision with root package name */
        private final int f5417e;

        /* renamed from: f, reason: collision with root package name */
        private final h2 f5418f;

        /* renamed from: g, reason: collision with root package name */
        private long f5419g;

        /* renamed from: h, reason: collision with root package name */
        private long f5420h;

        /* renamed from: i, reason: collision with root package name */
        private long f5421i;

        d(InputStream inputStream, int r4, h2 h2Var) {
            super(inputStream);
            this.f5421i = -1L;
            this.f5417e = r4;
            this.f5418f = h2Var;
        }

        private void a() {
            long j4 = this.f5420h;
            long j5 = this.f5419g;
            if (j4 > j5) {
                this.f5418f.f(j4 - j5);
                this.f5419g = this.f5420h;
            }
        }

        private void d() {
            long j4 = this.f5420h;
            int r22 = this.f5417e;
            if (j4 > r22) {
                throw b3.f1.f765o.q(String.format("Decompressed gRPC message exceeds maximum size %d", Integer.valueOf(r22))).d();
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int r32) {
            ((FilterInputStream) this).in.mark(r32);
            this.f5421i = this.f5420h;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f5420h++;
            }
            d();
            a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int r4, int r5) {
            int read = ((FilterInputStream) this).in.read(bArr, r4, r5);
            if (read != -1) {
                this.f5420h += read;
            }
            d();
            a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f5421i == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f5420h = this.f5421i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j4) {
            long skip = ((FilterInputStream) this).in.skip(j4);
            this.f5420h += skip;
            d();
            a();
            return skip;
        }
    }

    private enum e {
        HEADER,
        BODY
    }

    public k1(b bVar, b3.u uVar, int r5, h2 h2Var, n2 n2Var) {
        this.f5396e = (b) q0.l.o(bVar, "sink");
        this.f5400i = (b3.u) q0.l.o(uVar, "decompressor");
        this.f5397f = r5;
        this.f5398g = (h2) q0.l.o(h2Var, "statsTraceCtx");
        this.f5399h = (n2) q0.l.o(n2Var, "transportTracer");
    }

    private boolean C() {
        int r22;
        int r02 = 0;
        try {
            if (this.f5407p == null) {
                this.f5407p = new u();
            }
            int r12 = 0;
            r22 = 0;
            while (true) {
                try {
                    int b5 = this.f5405n - this.f5407p.b();
                    if (b5 <= 0) {
                        if (r12 > 0) {
                            this.f5396e.d(r12);
                            if (this.f5404m == e.BODY) {
                                if (this.f5401j != null) {
                                    this.f5398g.g(r22);
                                    this.f5412u += r22;
                                } else {
                                    this.f5398g.g(r12);
                                    this.f5412u += r12;
                                }
                            }
                        }
                        return true;
                    }
                    if (this.f5401j != null) {
                        try {
                            byte[] bArr = this.f5402k;
                            if (bArr == null || this.f5403l == bArr.length) {
                                this.f5402k = new byte[Math.min(b5, 2097152)];
                                this.f5403l = 0;
                            }
                            int C = this.f5401j.C(this.f5402k, this.f5403l, Math.min(b5, this.f5402k.length - this.f5403l));
                            r12 += this.f5401j.s();
                            r22 += this.f5401j.t();
                            if (C == 0) {
                                if (r12 > 0) {
                                    this.f5396e.d(r12);
                                    if (this.f5404m == e.BODY) {
                                        if (this.f5401j != null) {
                                            this.f5398g.g(r22);
                                            this.f5412u += r22;
                                        } else {
                                            this.f5398g.g(r12);
                                            this.f5412u += r12;
                                        }
                                    }
                                }
                                return false;
                            }
                            this.f5407p.d(v1.f(this.f5402k, this.f5403l, C));
                            this.f5403l += C;
                        } catch (IOException e5) {
                            throw new RuntimeException(e5);
                        } catch (DataFormatException e6) {
                            throw new RuntimeException(e6);
                        }
                    } else {
                        if (this.f5408q.b() == 0) {
                            if (r12 > 0) {
                                this.f5396e.d(r12);
                                if (this.f5404m == e.BODY) {
                                    if (this.f5401j != null) {
                                        this.f5398g.g(r22);
                                        this.f5412u += r22;
                                    } else {
                                        this.f5398g.g(r12);
                                        this.f5412u += r12;
                                    }
                                }
                            }
                            return false;
                        }
                        int min = Math.min(b5, this.f5408q.b());
                        r12 += min;
                        this.f5407p.d(this.f5408q.J(min));
                    }
                } catch (Throwable th) {
                    int r7 = r12;
                    th = th;
                    r02 = r7;
                    if (r02 > 0) {
                        this.f5396e.d(r02);
                        if (this.f5404m == e.BODY) {
                            if (this.f5401j != null) {
                                this.f5398g.g(r22);
                                this.f5412u += r22;
                            } else {
                                this.f5398g.g(r02);
                                this.f5412u += r02;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            r22 = 0;
        }
    }

    private void a() {
        if (this.f5410s) {
            return;
        }
        this.f5410s = true;
        while (true) {
            try {
                if (this.f5414w || this.f5409r <= 0 || !C()) {
                    break;
                }
                int r22 = a.f5415a[this.f5404m.ordinal()];
                if (r22 == 1) {
                    y();
                } else {
                    if (r22 != 2) {
                        throw new AssertionError("Invalid state: " + this.f5404m);
                    }
                    v();
                    this.f5409r--;
                }
            } finally {
                this.f5410s = false;
            }
        }
        if (this.f5414w) {
            close();
            return;
        }
        if (this.f5413v && t()) {
            close();
        }
    }

    private InputStream l() {
        b3.u uVar = this.f5400i;
        if (uVar == l.b.f836a) {
            throw b3.f1.f770t.q("Can't decode compressed gRPC message as compression not configured").d();
        }
        try {
            return new d(uVar.b(v1.c(this.f5407p, true)), this.f5397f, this.f5398g);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    private InputStream n() {
        this.f5398g.f(this.f5407p.b());
        return v1.c(this.f5407p, true);
    }

    private boolean s() {
        return r() || this.f5413v;
    }

    private boolean t() {
        r0 r0Var = this.f5401j;
        return r0Var != null ? r0Var.H() : this.f5408q.b() == 0;
    }

    private void v() {
        this.f5398g.e(this.f5411t, this.f5412u, -1L);
        this.f5412u = 0;
        InputStream l4 = this.f5406o ? l() : n();
        this.f5407p = null;
        this.f5396e.a(new c(l4, null));
        this.f5404m = e.HEADER;
        this.f5405n = 5;
    }

    private void y() {
        int N = this.f5407p.N();
        if ((N & 254) != 0) {
            throw b3.f1.f770t.q("gRPC frame header malformed: reserved bits not zero").d();
        }
        this.f5406o = (N & 1) != 0;
        int G = this.f5407p.G();
        this.f5405n = G;
        if (G < 0 || G > this.f5397f) {
            throw b3.f1.f765o.q(String.format("gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f5397f), Integer.valueOf(this.f5405n))).d();
        }
        int r02 = this.f5411t + 1;
        this.f5411t = r02;
        this.f5398g.d(r02);
        this.f5399h.d();
        this.f5404m = e.BODY;
    }

    public void F(r0 r0Var) {
        q0.l.u(this.f5400i == l.b.f836a, "per-message decompressor already set");
        q0.l.u(this.f5401j == null, "full stream decompressor already set");
        this.f5401j = (r0) q0.l.o(r0Var, "Can't pass a null full stream decompressor");
        this.f5408q = null;
    }

    void H(b bVar) {
        this.f5396e = bVar;
    }

    void K() {
        this.f5414w = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.y
    public void close() {
        if (r()) {
            return;
        }
        u uVar = this.f5407p;
        boolean z4 = true;
        boolean z5 = uVar != null && uVar.b() > 0;
        try {
            r0 r0Var = this.f5401j;
            if (r0Var != null) {
                if (!z5 && !r0Var.v()) {
                    z4 = false;
                }
                this.f5401j.close();
                z5 = z4;
            }
            u uVar2 = this.f5408q;
            if (uVar2 != null) {
                uVar2.close();
            }
            u uVar3 = this.f5407p;
            if (uVar3 != null) {
                uVar3.close();
            }
            this.f5401j = null;
            this.f5408q = null;
            this.f5407p = null;
            this.f5396e.c(z5);
        } catch (Throwable th) {
            this.f5401j = null;
            this.f5408q = null;
            this.f5407p = null;
            throw th;
        }
    }

    @Override // io.grpc.internal.y
    public void d(int r5) {
        q0.l.e(r5 > 0, "numMessages must be > 0");
        if (r()) {
            return;
        }
        this.f5409r += r5;
        a();
    }

    @Override // io.grpc.internal.y
    public void e(int r12) {
        this.f5397f = r12;
    }

    @Override // io.grpc.internal.y
    public void h() {
        if (r()) {
            return;
        }
        if (t()) {
            close();
        } else {
            this.f5413v = true;
        }
    }

    @Override // io.grpc.internal.y
    public void i(b3.u uVar) {
        q0.l.u(this.f5401j == null, "Already set full stream decompressor");
        this.f5400i = (b3.u) q0.l.o(uVar, "Can't pass an empty decompressor");
    }

    @Override // io.grpc.internal.y
    public void k(u1 u1Var) {
        q0.l.o(u1Var, "data");
        boolean z4 = true;
        try {
            if (!s()) {
                r0 r0Var = this.f5401j;
                if (r0Var != null) {
                    r0Var.n(u1Var);
                } else {
                    this.f5408q.d(u1Var);
                }
                z4 = false;
                a();
            }
        } finally {
            if (z4) {
                u1Var.close();
            }
        }
    }

    public boolean r() {
        return this.f5408q == null && this.f5401j == null;
    }
}
