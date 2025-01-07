package io.grpc.internal;

import b3.i0;
import b3.u0;
import io.grpc.internal.a;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class t0 extends a.c {

    /* renamed from: w, reason: collision with root package name */
    private static final i0.a<Integer> f5658w;

    /* renamed from: x, reason: collision with root package name */
    private static final u0.g<Integer> f5659x;

    /* renamed from: s, reason: collision with root package name */
    private b3.f1 f5660s;

    /* renamed from: t, reason: collision with root package name */
    private b3.u0 f5661t;

    /* renamed from: u, reason: collision with root package name */
    private Charset f5662u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5663v;

    class a implements i0.a<Integer> {
        a() {
        }

        @Override // b3.u0.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, b3.i0.f810a));
        }

        @Override // b3.u0.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f5658w = aVar;
        f5659x = b3.i0.b(":status", aVar);
    }

    protected t0(int r12, h2 h2Var, n2 n2Var) {
        super(r12, h2Var, n2Var);
        this.f5662u = q0.b.f7138c;
    }

    private static Charset O(b3.u0 u0Var) {
        String str = (String) u0Var.g(q0.f5571i);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return q0.b.f7138c;
    }

    private b3.f1 Q(b3.u0 u0Var) {
        b3.f1 f1Var = (b3.f1) u0Var.g(b3.k0.f833b);
        if (f1Var != null) {
            return f1Var.q((String) u0Var.g(b3.k0.f832a));
        }
        if (this.f5663v) {
            return b3.f1.f758h.q("missing GRPC status in response");
        }
        Integer num = (Integer) u0Var.g(f5659x);
        return (num != null ? q0.l(num.intValue()) : b3.f1.f770t.q("missing HTTP status code")).e("missing GRPC status, inferred error from HTTP status code");
    }

    private static void R(b3.u0 u0Var) {
        u0Var.e(f5659x);
        u0Var.e(b3.k0.f833b);
        u0Var.e(b3.k0.f832a);
    }

    private b3.f1 V(b3.u0 u0Var) {
        Integer num = (Integer) u0Var.g(f5659x);
        if (num == null) {
            return b3.f1.f770t.q("Missing HTTP status code");
        }
        String str = (String) u0Var.g(q0.f5571i);
        if (q0.m(str)) {
            return null;
        }
        return q0.l(num.intValue()).e("invalid content-type: " + str);
    }

    protected abstract void P(b3.f1 f1Var, boolean z4, b3.u0 u0Var);

    protected void S(u1 u1Var, boolean z4) {
        b3.f1 f1Var = this.f5660s;
        if (f1Var != null) {
            this.f5660s = f1Var.e("DATA-----------------------------\n" + v1.e(u1Var, this.f5662u));
            u1Var.close();
            if (this.f5660s.n().length() > 1000 || z4) {
                P(this.f5660s, false, this.f5661t);
                return;
            }
            return;
        }
        if (!this.f5663v) {
            P(b3.f1.f770t.q("headers not received before payload"), false, new b3.u0());
            return;
        }
        int b5 = u1Var.b();
        D(u1Var);
        if (z4) {
            this.f5660s = b3.f1.f770t.q(b5 > 0 ? "Received unexpected EOS on non-empty DATA frame from server" : "Received unexpected EOS on empty DATA frame from server");
            b3.u0 u0Var = new b3.u0();
            this.f5661t = u0Var;
            N(this.f5660s, false, u0Var);
        }
    }

    /* JADX WARN: Finally extract failed */
    protected void T(b3.u0 u0Var) {
        q0.l.o(u0Var, "headers");
        b3.f1 f1Var = this.f5660s;
        if (f1Var != null) {
            this.f5660s = f1Var.e("headers: " + u0Var);
            return;
        }
        try {
            if (this.f5663v) {
                b3.f1 q4 = b3.f1.f770t.q("Received headers twice");
                this.f5660s = q4;
                if (q4 != null) {
                    this.f5660s = q4.e("headers: " + u0Var);
                    this.f5661t = u0Var;
                    this.f5662u = O(u0Var);
                    return;
                }
                return;
            }
            Integer num = (Integer) u0Var.g(f5659x);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                b3.f1 f1Var2 = this.f5660s;
                if (f1Var2 != null) {
                    this.f5660s = f1Var2.e("headers: " + u0Var);
                    this.f5661t = u0Var;
                    this.f5662u = O(u0Var);
                    return;
                }
                return;
            }
            this.f5663v = true;
            b3.f1 V = V(u0Var);
            this.f5660s = V;
            if (V != null) {
                if (V != null) {
                    this.f5660s = V.e("headers: " + u0Var);
                    this.f5661t = u0Var;
                    this.f5662u = O(u0Var);
                    return;
                }
                return;
            }
            R(u0Var);
            E(u0Var);
            b3.f1 f1Var3 = this.f5660s;
            if (f1Var3 != null) {
                this.f5660s = f1Var3.e("headers: " + u0Var);
                this.f5661t = u0Var;
                this.f5662u = O(u0Var);
            }
        } catch (Throwable th) {
            b3.f1 f1Var4 = this.f5660s;
            if (f1Var4 != null) {
                this.f5660s = f1Var4.e("headers: " + u0Var);
                this.f5661t = u0Var;
                this.f5662u = O(u0Var);
            }
            throw th;
        }
    }

    protected void U(b3.u0 u0Var) {
        q0.l.o(u0Var, "trailers");
        if (this.f5660s == null && !this.f5663v) {
            b3.f1 V = V(u0Var);
            this.f5660s = V;
            if (V != null) {
                this.f5661t = u0Var;
            }
        }
        b3.f1 f1Var = this.f5660s;
        if (f1Var == null) {
            b3.f1 Q = Q(u0Var);
            R(u0Var);
            F(u0Var, Q);
        } else {
            b3.f1 e5 = f1Var.e("trailers: " + u0Var);
            this.f5660s = e5;
            P(e5, false, this.f5661t);
        }
    }

    @Override // io.grpc.internal.a.c, io.grpc.internal.k1.b
    public /* bridge */ /* synthetic */ void c(boolean z4) {
        super.c(z4);
    }
}
