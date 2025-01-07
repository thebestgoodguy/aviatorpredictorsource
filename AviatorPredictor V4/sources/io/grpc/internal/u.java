package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes.dex */
public class u extends io.grpc.internal.c {

    /* renamed from: i, reason: collision with root package name */
    private static final f<Void> f5670i = new a();

    /* renamed from: j, reason: collision with root package name */
    private static final f<Void> f5671j = new b();

    /* renamed from: k, reason: collision with root package name */
    private static final f<byte[]> f5672k = new c();

    /* renamed from: l, reason: collision with root package name */
    private static final f<ByteBuffer> f5673l = new d();

    /* renamed from: m, reason: collision with root package name */
    private static final g<OutputStream> f5674m = new e();

    /* renamed from: e, reason: collision with root package name */
    private final Deque<u1> f5675e;

    /* renamed from: f, reason: collision with root package name */
    private Deque<u1> f5676f;

    /* renamed from: g, reason: collision with root package name */
    private int f5677g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5678h;

    class a implements f<Void> {
        a() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(u1 u1Var, int r22, Void r32, int r4) {
            return u1Var.N();
        }
    }

    class b implements f<Void> {
        b() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(u1 u1Var, int r22, Void r32, int r4) {
            u1Var.m(r22);
            return 0;
        }
    }

    class c implements f<byte[]> {
        c() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(u1 u1Var, int r22, byte[] bArr, int r4) {
            u1Var.d0(bArr, r4, r22);
            return r4 + r22;
        }
    }

    class d implements f<ByteBuffer> {
        d() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(u1 u1Var, int r32, ByteBuffer byteBuffer, int r5) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + r32);
            u1Var.T(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    class e implements g<OutputStream> {
        e() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(u1 u1Var, int r22, OutputStream outputStream, int r4) {
            u1Var.u(outputStream, r22);
            return 0;
        }
    }

    private interface f<T> extends g<T> {
    }

    private interface g<T> {
        int a(u1 u1Var, int r22, T t4, int r4);
    }

    public u() {
        this.f5675e = new ArrayDeque();
    }

    public u(int r22) {
        this.f5675e = new ArrayDeque(r22);
    }

    private void e() {
        if (!this.f5678h) {
            this.f5675e.remove().close();
            return;
        }
        this.f5676f.add(this.f5675e.remove());
        u1 peek = this.f5675e.peek();
        if (peek != null) {
            peek.z();
        }
    }

    private void h() {
        if (this.f5675e.peek().b() == 0) {
            e();
        }
    }

    private void i(u1 u1Var) {
        if (!(u1Var instanceof u)) {
            this.f5675e.add(u1Var);
            this.f5677g += u1Var.b();
            return;
        }
        u uVar = (u) u1Var;
        while (!uVar.f5675e.isEmpty()) {
            this.f5675e.add(uVar.f5675e.remove());
        }
        this.f5677g += uVar.f5677g;
        uVar.f5677g = 0;
        uVar.close();
    }

    private <T> int k(g<T> gVar, int r4, T t4, int r6) {
        a(r4);
        if (this.f5675e.isEmpty()) {
            h();
            while (r4 > 0 && !this.f5675e.isEmpty()) {
                u1 peek = this.f5675e.peek();
                int min = Math.min(r4, peek.b());
                r6 = gVar.a(peek, min, t4, r6);
                r4 -= min;
                this.f5677g -= min;
            }
            if (r4 <= 0) {
                return r6;
            }
            throw new AssertionError("Failed executing read operation");
        }
        h();
    }

    private <T> int l(f<T> fVar, int r22, T t4, int r4) {
        try {
            return k(fVar, r22, t4, r4);
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // io.grpc.internal.u1
    public u1 J(int r7) {
        u1 poll;
        int r22;
        u1 u1Var;
        if (r7 <= 0) {
            return v1.a();
        }
        a(r7);
        this.f5677g -= r7;
        u1 u1Var2 = null;
        u uVar = null;
        while (true) {
            u1 peek = this.f5675e.peek();
            int b5 = peek.b();
            if (b5 > r7) {
                u1Var = peek.J(r7);
                r22 = 0;
            } else {
                if (this.f5678h) {
                    poll = peek.J(b5);
                    e();
                } else {
                    poll = this.f5675e.poll();
                }
                u1 u1Var3 = poll;
                r22 = r7 - b5;
                u1Var = u1Var3;
            }
            if (u1Var2 == null) {
                u1Var2 = u1Var;
            } else {
                if (uVar == null) {
                    uVar = new u(r22 != 0 ? Math.min(this.f5675e.size() + 2, 16) : 2);
                    uVar.d(u1Var2);
                    u1Var2 = uVar;
                }
                uVar.d(u1Var);
            }
            if (r22 <= 0) {
                return u1Var2;
            }
            r7 = r22;
        }
    }

    @Override // io.grpc.internal.u1
    public int N() {
        return l(f5670i, 1, null, 0);
    }

    @Override // io.grpc.internal.u1
    public void T(ByteBuffer byteBuffer) {
        l(f5673l, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // io.grpc.internal.u1
    public int b() {
        return this.f5677g;
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f5675e.isEmpty()) {
            this.f5675e.remove().close();
        }
        if (this.f5676f != null) {
            while (!this.f5676f.isEmpty()) {
                this.f5676f.remove().close();
            }
        }
    }

    public void d(u1 u1Var) {
        boolean z4 = this.f5678h && this.f5675e.isEmpty();
        i(u1Var);
        if (z4) {
            this.f5675e.peek().z();
        }
    }

    @Override // io.grpc.internal.u1
    public void d0(byte[] bArr, int r32, int r4) {
        l(f5672k, r4, bArr, r32);
    }

    @Override // io.grpc.internal.u1
    public void m(int r4) {
        l(f5671j, r4, null, 0);
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1
    public boolean markSupported() {
        Iterator<u1> it = this.f5675e.iterator();
        while (it.hasNext()) {
            if (!it.next().markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1
    public void reset() {
        if (!this.f5678h) {
            throw new InvalidMarkException();
        }
        u1 peek = this.f5675e.peek();
        if (peek != null) {
            int b5 = peek.b();
            peek.reset();
            this.f5677g += peek.b() - b5;
        }
        while (true) {
            u1 pollLast = this.f5676f.pollLast();
            if (pollLast == null) {
                return;
            }
            pollLast.reset();
            this.f5675e.addFirst(pollLast);
            this.f5677g += pollLast.b();
        }
    }

    @Override // io.grpc.internal.u1
    public void u(OutputStream outputStream, int r4) {
        k(f5674m, r4, outputStream, 0);
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1
    public void z() {
        if (this.f5676f == null) {
            this.f5676f = new ArrayDeque(Math.min(this.f5675e.size(), 16));
        }
        while (!this.f5676f.isEmpty()) {
            this.f5676f.remove().close();
        }
        this.f5678h = true;
        u1 peek = this.f5675e.peek();
        if (peek != null) {
            peek.z();
        }
    }
}
