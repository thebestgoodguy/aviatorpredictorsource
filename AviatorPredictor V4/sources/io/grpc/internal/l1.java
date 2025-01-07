package io.grpc.internal;

import b3.l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class l1 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    private final d f5442a;

    /* renamed from: c, reason: collision with root package name */
    private o2 f5444c;

    /* renamed from: h, reason: collision with root package name */
    private final p2 f5449h;

    /* renamed from: i, reason: collision with root package name */
    private final h2 f5450i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5451j;

    /* renamed from: k, reason: collision with root package name */
    private int f5452k;

    /* renamed from: m, reason: collision with root package name */
    private long f5454m;

    /* renamed from: b, reason: collision with root package name */
    private int f5443b = -1;

    /* renamed from: d, reason: collision with root package name */
    private b3.n f5445d = l.b.f836a;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5446e = true;

    /* renamed from: f, reason: collision with root package name */
    private final c f5447f = new c();

    /* renamed from: g, reason: collision with root package name */
    private final ByteBuffer f5448g = ByteBuffer.allocate(5);

    /* renamed from: l, reason: collision with root package name */
    private int f5453l = -1;

    private final class b extends OutputStream {

        /* renamed from: e, reason: collision with root package name */
        private final List<o2> f5455e;

        /* renamed from: f, reason: collision with root package name */
        private o2 f5456f;

        private b() {
            this.f5455e = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int b() {
            Iterator<o2> it = this.f5455e.iterator();
            int r12 = 0;
            while (it.hasNext()) {
                r12 += it.next().b();
            }
            return r12;
        }

        @Override // java.io.OutputStream
        public void write(int r4) {
            o2 o2Var = this.f5456f;
            if (o2Var == null || o2Var.d() <= 0) {
                write(new byte[]{(byte) r4}, 0, 1);
            } else {
                this.f5456f.e((byte) r4);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int r4, int r5) {
            if (this.f5456f == null) {
                o2 a5 = l1.this.f5449h.a(r5);
                this.f5456f = a5;
                this.f5455e.add(a5);
            }
            while (r5 > 0) {
                int min = Math.min(r5, this.f5456f.d());
                if (min == 0) {
                    o2 a6 = l1.this.f5449h.a(Math.max(r5, this.f5456f.b() * 2));
                    this.f5456f = a6;
                    this.f5455e.add(a6);
                } else {
                    this.f5456f.c(bArr, r4, min);
                    r4 += min;
                    r5 -= min;
                }
            }
        }
    }

    private class c extends OutputStream {
        private c() {
        }

        @Override // java.io.OutputStream
        public void write(int r4) {
            write(new byte[]{(byte) r4}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int r32, int r4) {
            l1.this.o(bArr, r32, r4);
        }
    }

    public interface d {
        void o(o2 o2Var, boolean z4, boolean z5, int r4);
    }

    public l1(d dVar, p2 p2Var, h2 h2Var) {
        this.f5442a = (d) q0.l.o(dVar, "sink");
        this.f5449h = (p2) q0.l.o(p2Var, "bufferAllocator");
        this.f5450i = (h2) q0.l.o(h2Var, "statsTraceCtx");
    }

    private void g(boolean z4, boolean z5) {
        o2 o2Var = this.f5444c;
        this.f5444c = null;
        this.f5442a.o(o2Var, z4, z5, this.f5452k);
        this.f5452k = 0;
    }

    private int h(InputStream inputStream) {
        if ((inputStream instanceof b3.m0) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    private void i() {
        o2 o2Var = this.f5444c;
        if (o2Var != null) {
            o2Var.a();
            this.f5444c = null;
        }
    }

    private void k() {
        if (c()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    private void l(b bVar, boolean z4) {
        int b5 = bVar.b();
        this.f5448g.clear();
        this.f5448g.put(z4 ? (byte) 1 : (byte) 0).putInt(b5);
        o2 a5 = this.f5449h.a(5);
        a5.c(this.f5448g.array(), 0, this.f5448g.position());
        if (b5 == 0) {
            this.f5444c = a5;
            return;
        }
        this.f5442a.o(a5, false, false, this.f5452k - 1);
        this.f5452k = 1;
        List list = bVar.f5455e;
        for (int r7 = 0; r7 < list.size() - 1; r7++) {
            this.f5442a.o((o2) list.get(r7), false, false, 0);
        }
        this.f5444c = (o2) list.get(list.size() - 1);
        this.f5454m = b5;
    }

    private int m(InputStream inputStream, int r5) {
        b bVar = new b();
        OutputStream c5 = this.f5445d.c(bVar);
        try {
            int p4 = p(inputStream, c5);
            c5.close();
            int r02 = this.f5443b;
            if (r02 >= 0 && p4 > r02) {
                throw b3.f1.f765o.q(String.format("message too large %d > %d", Integer.valueOf(p4), Integer.valueOf(this.f5443b))).d();
            }
            l(bVar, true);
            return p4;
        } catch (Throwable th) {
            c5.close();
            throw th;
        }
    }

    private int n(InputStream inputStream, int r5) {
        int r02 = this.f5443b;
        if (r02 >= 0 && r5 > r02) {
            throw b3.f1.f765o.q(String.format("message too large %d > %d", Integer.valueOf(r5), Integer.valueOf(this.f5443b))).d();
        }
        this.f5448g.clear();
        this.f5448g.put((byte) 0).putInt(r5);
        if (this.f5444c == null) {
            this.f5444c = this.f5449h.a(this.f5448g.position() + r5);
        }
        o(this.f5448g.array(), 0, this.f5448g.position());
        return p(inputStream, this.f5447f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(byte[] bArr, int r4, int r5) {
        while (r5 > 0) {
            o2 o2Var = this.f5444c;
            if (o2Var != null && o2Var.d() == 0) {
                g(false, false);
            }
            if (this.f5444c == null) {
                this.f5444c = this.f5449h.a(r5);
            }
            int min = Math.min(r5, this.f5444c.d());
            this.f5444c.c(bArr, r4, min);
            r4 += min;
            r5 -= min;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int p(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof b3.w) {
            return ((b3.w) inputStream).a(outputStream);
        }
        long b5 = s0.b.b(inputStream, outputStream);
        q0.l.i(b5 <= 2147483647L, "Message size overflow: %s", b5);
        return (int) b5;
    }

    private int q(InputStream inputStream, int r4) {
        if (r4 != -1) {
            this.f5454m = r4;
            return n(inputStream, r4);
        }
        b bVar = new b();
        int p4 = p(inputStream, bVar);
        int r02 = this.f5443b;
        if (r02 >= 0 && p4 > r02) {
            throw b3.f1.f765o.q(String.format("message too large %d > %d", Integer.valueOf(p4), Integer.valueOf(this.f5443b))).d();
        }
        l(bVar, false);
        return p4;
    }

    @Override // io.grpc.internal.o0
    public void a(int r32) {
        q0.l.u(this.f5443b == -1, "max size already set");
        this.f5443b = r32;
    }

    @Override // io.grpc.internal.o0
    public boolean c() {
        return this.f5451j;
    }

    @Override // io.grpc.internal.o0
    public void close() {
        if (c()) {
            return;
        }
        this.f5451j = true;
        o2 o2Var = this.f5444c;
        if (o2Var != null && o2Var.b() == 0) {
            i();
        }
        g(true, true);
    }

    @Override // io.grpc.internal.o0
    public void d(InputStream inputStream) {
        k();
        this.f5452k++;
        int r12 = this.f5453l + 1;
        this.f5453l = r12;
        this.f5454m = 0L;
        this.f5450i.i(r12);
        boolean z4 = this.f5446e && this.f5445d != l.b.f836a;
        try {
            int h5 = h(inputStream);
            int q4 = (h5 == 0 || !z4) ? q(inputStream, h5) : m(inputStream, h5);
            if (h5 != -1 && q4 != h5) {
                throw b3.f1.f770t.q(String.format("Message length inaccurate %s != %s", Integer.valueOf(q4), Integer.valueOf(h5))).d();
            }
            long j4 = q4;
            this.f5450i.k(j4);
            this.f5450i.l(this.f5454m);
            this.f5450i.j(this.f5453l, this.f5454m, j4);
        } catch (IOException e5) {
            throw b3.f1.f770t.q("Failed to frame message").p(e5).d();
        } catch (RuntimeException e6) {
            throw b3.f1.f770t.q("Failed to frame message").p(e6).d();
        }
    }

    @Override // io.grpc.internal.o0
    public void flush() {
        o2 o2Var = this.f5444c;
        if (o2Var == null || o2Var.b() <= 0) {
            return;
        }
        g(false, true);
    }

    @Override // io.grpc.internal.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public l1 b(b3.n nVar) {
        this.f5445d = (b3.n) q0.l.o(nVar, "Can't pass an empty compressor");
        return this;
    }
}
