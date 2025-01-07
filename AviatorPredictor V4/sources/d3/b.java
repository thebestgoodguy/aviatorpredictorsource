package d3;

import d3.i;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class b implements f3.c {

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f3232h = Logger.getLogger(h.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private final a f3233e;

    /* renamed from: f, reason: collision with root package name */
    private final f3.c f3234f;

    /* renamed from: g, reason: collision with root package name */
    private final i f3235g;

    interface a {
        void b(Throwable th);
    }

    b(a aVar, f3.c cVar) {
        this(aVar, cVar, new i(Level.FINE, (Class<?>) h.class));
    }

    b(a aVar, f3.c cVar, i iVar) {
        this.f3233e = (a) q0.l.o(aVar, "transportExceptionHandler");
        this.f3234f = (f3.c) q0.l.o(cVar, "frameWriter");
        this.f3235g = (i) q0.l.o(iVar, "frameLogger");
    }

    static Level a(Throwable th) {
        return th.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // f3.c
    public int L() {
        return this.f3234f.L();
    }

    @Override // f3.c
    public void O(boolean z4, boolean z5, int r9, int r10, List<f3.d> list) {
        try {
            this.f3234f.O(z4, z5, r9, r10, list);
        } catch (IOException e5) {
            this.f3233e.b(e5);
        }
    }

    @Override // f3.c
    public void P(f3.i iVar) {
        this.f3235g.i(i.a.OUTBOUND, iVar);
        try {
            this.f3234f.P(iVar);
        } catch (IOException e5) {
            this.f3233e.b(e5);
        }
    }

    @Override // f3.c
    public void a0() {
        try {
            this.f3234f.a0();
        } catch (IOException e5) {
            this.f3233e.b(e5);
        }
    }

    @Override // f3.c
    public void c(int r32, f3.a aVar) {
        this.f3235g.h(i.a.OUTBOUND, r32, aVar);
        try {
            this.f3234f.c(r32, aVar);
        } catch (IOException e5) {
            this.f3233e.b(e5);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f3234f.close();
        } catch (IOException e5) {
            f3232h.log(a(e5), "Failed closing connection", (Throwable) e5);
        }
    }

    @Override // f3.c
    public void f(int r32, long j4) {
        this.f3235g.k(i.a.OUTBOUND, r32, j4);
        try {
            this.f3234f.f(r32, j4);
        } catch (IOException e5) {
            this.f3233e.b(e5);
        }
    }

    @Override // f3.c
    public void flush() {
        try {
            this.f3234f.flush();
        } catch (IOException e5) {
            this.f3233e.b(e5);
        }
    }

    @Override // f3.c
    public void g(boolean z4, int r11, int r12) {
        i iVar = this.f3235g;
        i.a aVar = i.a.OUTBOUND;
        long j4 = (4294967295L & r12) | (r11 << 32);
        if (z4) {
            iVar.f(aVar, j4);
        } else {
            iVar.e(aVar, j4);
        }
        try {
            this.f3234f.g(z4, r11, r12);
        } catch (IOException e5) {
            this.f3233e.b(e5);
        }
    }

    @Override // f3.c
    public void h0(boolean z4, int r8, h4.c cVar, int r10) {
        this.f3235g.b(i.a.OUTBOUND, r8, cVar.a(), r10, z4);
        try {
            this.f3234f.h0(z4, r8, cVar, r10);
        } catch (IOException e5) {
            this.f3233e.b(e5);
        }
    }

    @Override // f3.c
    public void p(f3.i iVar) {
        this.f3235g.j(i.a.OUTBOUND);
        try {
            this.f3234f.p(iVar);
        } catch (IOException e5) {
            this.f3233e.b(e5);
        }
    }

    @Override // f3.c
    public void q(int r4, f3.a aVar, byte[] bArr) {
        this.f3235g.c(i.a.OUTBOUND, r4, aVar, h4.f.p(bArr));
        try {
            this.f3234f.q(r4, aVar, bArr);
            this.f3234f.flush();
        } catch (IOException e5) {
            this.f3233e.b(e5);
        }
    }
}
