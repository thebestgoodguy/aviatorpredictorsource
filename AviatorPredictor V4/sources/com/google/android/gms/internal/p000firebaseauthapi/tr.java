package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class tr extends xq {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f2177b = Logger.getLogger(tr.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f2178c = s1.C();

    /* renamed from: a, reason: collision with root package name */
    ur f2179a;

    private tr() {
    }

    /* synthetic */ tr(sr srVar) {
    }

    public static int E(hr hrVar) {
        int q4 = hrVar.q();
        return f(q4) + q4;
    }

    @Deprecated
    static int F(int r22, e0 e0Var, q0 q0Var) {
        int f5 = f(r22 << 3);
        int r23 = f5 + f5;
        rq rqVar = (rq) e0Var;
        int b5 = rqVar.b();
        if (b5 == -1) {
            b5 = q0Var.e(rqVar);
            rqVar.c(b5);
        }
        return r23 + b5;
    }

    public static int G(int r02) {
        if (r02 >= 0) {
            return f(r02);
        }
        return 10;
    }

    public static int H(j jVar) {
        int a5 = jVar.a();
        return f(a5) + a5;
    }

    static int b(e0 e0Var, q0 q0Var) {
        rq rqVar = (rq) e0Var;
        int b5 = rqVar.b();
        if (b5 == -1) {
            b5 = q0Var.e(rqVar);
            rqVar.c(b5);
        }
        return f(b5) + b5;
    }

    static int c(int r12) {
        if (r12 > 4096) {
            return 4096;
        }
        return r12;
    }

    public static int d(String str) {
        int length;
        try {
            length = x1.c(str);
        } catch (w1 unused) {
            length = str.getBytes(f.f1632b).length;
        }
        return f(length) + length;
    }

    public static int e(int r02) {
        return f(r02 << 3);
    }

    public static int f(int r12) {
        if ((r12 & (-128)) == 0) {
            return 1;
        }
        if ((r12 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & r12) == 0) {
            return 3;
        }
        return (r12 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g(long j4) {
        int r02;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            r02 = 6;
        } else {
            r02 = 2;
        }
        if (((-2097152) & j4) != 0) {
            r02 += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? r02 + 1 : r02;
    }

    public static tr h(byte[] bArr) {
        return new pr(bArr, 0, bArr.length);
    }

    public static tr i(OutputStream outputStream, int r22) {
        return new rr(outputStream, r22);
    }

    public abstract void A(int r12, int r22);

    public abstract void B(int r12);

    public abstract void C(int r12, long j4);

    public abstract void D(long j4);

    @Override // com.google.android.gms.internal.p000firebaseauthapi.xq
    public abstract void a(byte[] bArr, int r22, int r32);

    public final void j() {
        if (q() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void k(String str, w1 w1Var) {
        f2177b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) w1Var);
        byte[] bytes = str.getBytes(f.f1632b);
        try {
            int length = bytes.length;
            B(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e5) {
            throw new qr(e5);
        }
    }

    public abstract void m();

    public abstract void n(byte b5);

    public abstract void o(int r12, boolean z4);

    public abstract void p(int r12, hr hrVar);

    public abstract int q();

    public abstract void r(int r12, int r22);

    public abstract void s(int r12);

    public abstract void t(int r12, long j4);

    public abstract void u(long j4);

    public abstract void v(int r12, int r22);

    public abstract void w(int r12);

    abstract void x(int r12, e0 e0Var, q0 q0Var);

    public abstract void y(int r12, String str);

    public abstract void z(int r12, int r22);
}
