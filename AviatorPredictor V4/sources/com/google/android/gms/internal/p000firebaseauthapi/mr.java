package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class mr implements p0 {

    /* renamed from: a, reason: collision with root package name */
    private final lr f1943a;

    /* renamed from: b, reason: collision with root package name */
    private int f1944b;

    /* renamed from: c, reason: collision with root package name */
    private int f1945c;

    /* renamed from: d, reason: collision with root package name */
    private int f1946d = 0;

    private mr(lr lrVar) {
        f.f(lrVar, "input");
        this.f1943a = lrVar;
        lrVar.f1906c = this;
    }

    private final Object O(q0 q0Var, yr yrVar) {
        int r02 = this.f1945c;
        this.f1945c = ((this.f1944b >>> 3) << 3) | 4;
        try {
            Object d5 = q0Var.d();
            q0Var.j(d5, this, yrVar);
            q0Var.b(d5);
            if (this.f1944b == this.f1945c) {
                return d5;
            }
            throw h.g();
        } finally {
            this.f1945c = r02;
        }
    }

    private final Object P(q0 q0Var, yr yrVar) {
        int q4 = ((jr) this.f1943a).q();
        lr lrVar = this.f1943a;
        if (lrVar.f1904a >= lrVar.f1905b) {
            throw new h("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int b5 = lrVar.b(q4);
        Object d5 = q0Var.d();
        this.f1943a.f1904a++;
        q0Var.j(d5, this, yrVar);
        q0Var.b(d5);
        this.f1943a.g(0);
        r5.f1904a--;
        this.f1943a.h(b5);
        return d5;
    }

    private final void Q(int r22) {
        if (this.f1943a.a() != r22) {
            throw h.i();
        }
    }

    private final void R(int r22) {
        if ((this.f1944b & 7) != r22) {
            throw h.a();
        }
    }

    private static final void S(int r02) {
        if ((r02 & 3) != 0) {
            throw h.g();
        }
    }

    private static final void T(int r02) {
        if ((r02 & 7) != 0) {
            throw h.g();
        }
    }

    public static mr U(lr lrVar) {
        mr mrVar = lrVar.f1906c;
        return mrVar != null ? mrVar : new mr(lrVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void A(List list) {
        int c5;
        int c6;
        if (!(list instanceof s)) {
            int r02 = this.f1944b & 7;
            if (r02 != 1) {
                if (r02 != 2) {
                    throw h.a();
                }
                int q4 = ((jr) this.f1943a).q();
                T(q4);
                int a5 = this.f1943a.a() + q4;
                do {
                    list.add(Long.valueOf(((jr) this.f1943a).r()));
                } while (this.f1943a.a() < a5);
                return;
            }
            do {
                list.add(Long.valueOf(((jr) this.f1943a).r()));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        s sVar = (s) list;
        int r5 = this.f1944b & 7;
        if (r5 != 1) {
            if (r5 != 2) {
                throw h.a();
            }
            int q5 = ((jr) this.f1943a).q();
            T(q5);
            int a6 = this.f1943a.a() + q5;
            do {
                sVar.q(((jr) this.f1943a).r());
            } while (this.f1943a.a() < a6);
            return;
        }
        do {
            sVar.q(((jr) this.f1943a).r());
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    @Deprecated
    public final void B(List list, q0 q0Var, yr yrVar) {
        int c5;
        int r02 = this.f1944b;
        if ((r02 & 7) != 3) {
            throw h.a();
        }
        do {
            list.add(O(q0Var, yrVar));
            lr lrVar = this.f1943a;
            if (lrVar.i() || this.f1946d != 0) {
                return;
            } else {
                c5 = lrVar.c();
            }
        } while (c5 == r02);
        this.f1946d = c5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final boolean C() {
        int r12;
        lr lrVar = this.f1943a;
        if (lrVar.i() || (r12 = this.f1944b) == this.f1945c) {
            return false;
        }
        return lrVar.k(r12);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void D(List list) {
        int c5;
        int c6;
        if (!(list instanceof s)) {
            int r02 = this.f1944b & 7;
            if (r02 != 0) {
                if (r02 != 2) {
                    throw h.a();
                }
                int a5 = this.f1943a.a() + ((jr) this.f1943a).q();
                do {
                    list.add(Long.valueOf(((jr) this.f1943a).s()));
                } while (this.f1943a.a() < a5);
                Q(a5);
                return;
            }
            do {
                list.add(Long.valueOf(((jr) this.f1943a).s()));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        s sVar = (s) list;
        int r5 = this.f1944b & 7;
        if (r5 != 0) {
            if (r5 != 2) {
                throw h.a();
            }
            int a6 = this.f1943a.a() + ((jr) this.f1943a).q();
            do {
                sVar.q(((jr) this.f1943a).s());
            } while (this.f1943a.a() < a6);
            Q(a6);
            return;
        }
        do {
            sVar.q(((jr) this.f1943a).s());
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void E(List list) {
        int c5;
        int c6;
        if (!(list instanceof vr)) {
            int r02 = this.f1944b & 7;
            if (r02 != 1) {
                if (r02 != 2) {
                    throw h.a();
                }
                int q4 = ((jr) this.f1943a).q();
                T(q4);
                int a5 = this.f1943a.a() + q4;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((jr) this.f1943a).r())));
                } while (this.f1943a.a() < a5);
                return;
            }
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(((jr) this.f1943a).r())));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        vr vrVar = (vr) list;
        int r5 = this.f1944b & 7;
        if (r5 != 1) {
            if (r5 != 2) {
                throw h.a();
            }
            int q5 = ((jr) this.f1943a).q();
            T(q5);
            int a6 = this.f1943a.a() + q5;
            do {
                vrVar.p(Double.longBitsToDouble(((jr) this.f1943a).r()));
            } while (this.f1943a.a() < a6);
            return;
        }
        do {
            vrVar.p(Double.longBitsToDouble(((jr) this.f1943a).r()));
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void F(List list) {
        int c5;
        int c6;
        if (!(list instanceof ls)) {
            int r02 = this.f1944b & 7;
            if (r02 != 0) {
                if (r02 != 2) {
                    throw h.a();
                }
                int a5 = this.f1943a.a() + ((jr) this.f1943a).q();
                do {
                    list.add(Integer.valueOf(lr.l(((jr) this.f1943a).q())));
                } while (this.f1943a.a() < a5);
                Q(a5);
                return;
            }
            do {
                list.add(Integer.valueOf(lr.l(((jr) this.f1943a).q())));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        ls lsVar = (ls) list;
        int r32 = this.f1944b & 7;
        if (r32 != 0) {
            if (r32 != 2) {
                throw h.a();
            }
            int a6 = this.f1943a.a() + ((jr) this.f1943a).q();
            do {
                lsVar.q(lr.l(((jr) this.f1943a).q()));
            } while (this.f1943a.a() < a6);
            Q(a6);
            return;
        }
        do {
            lsVar.q(lr.l(((jr) this.f1943a).q()));
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void G(List list) {
        int c5;
        int c6;
        if (!(list instanceof ls)) {
            int r02 = this.f1944b & 7;
            if (r02 == 2) {
                int q4 = ((jr) this.f1943a).q();
                S(q4);
                int a5 = this.f1943a.a() + q4;
                do {
                    list.add(Integer.valueOf(((jr) this.f1943a).p()));
                } while (this.f1943a.a() < a5);
                return;
            }
            if (r02 != 5) {
                throw h.a();
            }
            do {
                list.add(Integer.valueOf(((jr) this.f1943a).p()));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        ls lsVar = (ls) list;
        int r5 = this.f1944b & 7;
        if (r5 == 2) {
            int q5 = ((jr) this.f1943a).q();
            S(q5);
            int a6 = this.f1943a.a() + q5;
            do {
                lsVar.q(((jr) this.f1943a).p());
            } while (this.f1943a.a() < a6);
            return;
        }
        if (r5 != 5) {
            throw h.a();
        }
        do {
            lsVar.q(((jr) this.f1943a).p());
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final int H() {
        R(0);
        return ((jr) this.f1943a).q();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void I(List list) {
        int c5;
        if ((this.f1944b & 7) != 2) {
            throw h.a();
        }
        do {
            list.add(n());
            lr lrVar = this.f1943a;
            if (lrVar.i()) {
                return;
            } else {
                c5 = lrVar.c();
            }
        } while (c5 == this.f1944b);
        this.f1946d = c5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void J(List list) {
        int c5;
        int c6;
        if (!(list instanceof ls)) {
            int r02 = this.f1944b & 7;
            if (r02 != 0) {
                if (r02 != 2) {
                    throw h.a();
                }
                int a5 = this.f1943a.a() + ((jr) this.f1943a).q();
                do {
                    list.add(Integer.valueOf(((jr) this.f1943a).q()));
                } while (this.f1943a.a() < a5);
                Q(a5);
                return;
            }
            do {
                list.add(Integer.valueOf(((jr) this.f1943a).q()));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        ls lsVar = (ls) list;
        int r32 = this.f1944b & 7;
        if (r32 != 0) {
            if (r32 != 2) {
                throw h.a();
            }
            int a6 = this.f1943a.a() + ((jr) this.f1943a).q();
            do {
                lsVar.q(((jr) this.f1943a).q());
            } while (this.f1943a.a() < a6);
            Q(a6);
            return;
        }
        do {
            lsVar.q(((jr) this.f1943a).q());
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void K(List list) {
        int c5;
        int c6;
        if (!(list instanceof fs)) {
            int r02 = this.f1944b & 7;
            if (r02 == 2) {
                int q4 = ((jr) this.f1943a).q();
                S(q4);
                int a5 = this.f1943a.a() + q4;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((jr) this.f1943a).p())));
                } while (this.f1943a.a() < a5);
                return;
            }
            if (r02 != 5) {
                throw h.a();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(((jr) this.f1943a).p())));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        fs fsVar = (fs) list;
        int r5 = this.f1944b & 7;
        if (r5 == 2) {
            int q5 = ((jr) this.f1943a).q();
            S(q5);
            int a6 = this.f1943a.a() + q5;
            do {
                fsVar.p(Float.intBitsToFloat(((jr) this.f1943a).p()));
            } while (this.f1943a.a() < a6);
            return;
        }
        if (r5 != 5) {
            throw h.a();
        }
        do {
            fsVar.p(Float.intBitsToFloat(((jr) this.f1943a).p()));
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    @Deprecated
    public final Object L(q0 q0Var, yr yrVar) {
        R(3);
        return O(q0Var, yrVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final String M() {
        R(2);
        return this.f1943a.e();
    }

    public final void N(List list, boolean z4) {
        int c5;
        int c6;
        if ((this.f1944b & 7) != 2) {
            throw h.a();
        }
        if (!(list instanceof l) || z4) {
            do {
                list.add(z4 ? y() : M());
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        l lVar = (l) list;
        do {
            lVar.g(n());
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final double a() {
        R(1);
        return Double.longBitsToDouble(((jr) this.f1943a).r());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final float b() {
        R(5);
        return Float.intBitsToFloat(((jr) this.f1943a).p());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final int c() {
        int r02 = this.f1946d;
        if (r02 != 0) {
            this.f1944b = r02;
            this.f1946d = 0;
        } else {
            r02 = this.f1943a.c();
            this.f1944b = r02;
        }
        if (r02 == 0 || r02 == this.f1945c) {
            return Integer.MAX_VALUE;
        }
        return r02 >>> 3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final int d() {
        R(0);
        return ((jr) this.f1943a).q();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final int e() {
        return this.f1944b;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final int f() {
        R(5);
        return ((jr) this.f1943a).p();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final long g() {
        R(0);
        return ((jr) this.f1943a).s();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final long h() {
        R(1);
        return ((jr) this.f1943a).r();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final long i() {
        R(1);
        return ((jr) this.f1943a).r();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final int j() {
        R(0);
        return lr.l(((jr) this.f1943a).q());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final boolean k() {
        R(0);
        return this.f1943a.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final long l() {
        R(0);
        return lr.m(((jr) this.f1943a).s());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void m(List list) {
        int c5;
        int c6;
        if (!(list instanceof ls)) {
            int r02 = this.f1944b & 7;
            if (r02 != 0) {
                if (r02 != 2) {
                    throw h.a();
                }
                int a5 = this.f1943a.a() + ((jr) this.f1943a).q();
                do {
                    list.add(Integer.valueOf(((jr) this.f1943a).q()));
                } while (this.f1943a.a() < a5);
                Q(a5);
                return;
            }
            do {
                list.add(Integer.valueOf(((jr) this.f1943a).q()));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        ls lsVar = (ls) list;
        int r32 = this.f1944b & 7;
        if (r32 != 0) {
            if (r32 != 2) {
                throw h.a();
            }
            int a6 = this.f1943a.a() + ((jr) this.f1943a).q();
            do {
                lsVar.q(((jr) this.f1943a).q());
            } while (this.f1943a.a() < a6);
            Q(a6);
            return;
        }
        do {
            lsVar.q(((jr) this.f1943a).q());
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final hr n() {
        R(2);
        return this.f1943a.d();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void o(List list) {
        int c5;
        int c6;
        if (!(list instanceof s)) {
            int r02 = this.f1944b & 7;
            if (r02 != 0) {
                if (r02 != 2) {
                    throw h.a();
                }
                int a5 = this.f1943a.a() + ((jr) this.f1943a).q();
                do {
                    list.add(Long.valueOf(lr.m(((jr) this.f1943a).s())));
                } while (this.f1943a.a() < a5);
                Q(a5);
                return;
            }
            do {
                list.add(Long.valueOf(lr.m(((jr) this.f1943a).s())));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        s sVar = (s) list;
        int r5 = this.f1944b & 7;
        if (r5 != 0) {
            if (r5 != 2) {
                throw h.a();
            }
            int a6 = this.f1943a.a() + ((jr) this.f1943a).q();
            do {
                sVar.q(lr.m(((jr) this.f1943a).s()));
            } while (this.f1943a.a() < a6);
            Q(a6);
            return;
        }
        do {
            sVar.q(lr.m(((jr) this.f1943a).s()));
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final int p() {
        R(0);
        return ((jr) this.f1943a).q();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void q(List list, q0 q0Var, yr yrVar) {
        int c5;
        int r02 = this.f1944b;
        if ((r02 & 7) != 2) {
            throw h.a();
        }
        do {
            list.add(P(q0Var, yrVar));
            lr lrVar = this.f1943a;
            if (lrVar.i() || this.f1946d != 0) {
                return;
            } else {
                c5 = lrVar.c();
            }
        } while (c5 == r02);
        this.f1946d = c5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void r(List list) {
        int c5;
        int c6;
        if (!(list instanceof s)) {
            int r02 = this.f1944b & 7;
            if (r02 != 1) {
                if (r02 != 2) {
                    throw h.a();
                }
                int q4 = ((jr) this.f1943a).q();
                T(q4);
                int a5 = this.f1943a.a() + q4;
                do {
                    list.add(Long.valueOf(((jr) this.f1943a).r()));
                } while (this.f1943a.a() < a5);
                return;
            }
            do {
                list.add(Long.valueOf(((jr) this.f1943a).r()));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        s sVar = (s) list;
        int r5 = this.f1944b & 7;
        if (r5 != 1) {
            if (r5 != 2) {
                throw h.a();
            }
            int q5 = ((jr) this.f1943a).q();
            T(q5);
            int a6 = this.f1943a.a() + q5;
            do {
                sVar.q(((jr) this.f1943a).r());
            } while (this.f1943a.a() < a6);
            return;
        }
        do {
            sVar.q(((jr) this.f1943a).r());
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void s(List list) {
        int c5;
        int c6;
        if (!(list instanceof ls)) {
            int r02 = this.f1944b & 7;
            if (r02 != 0) {
                if (r02 != 2) {
                    throw h.a();
                }
                int a5 = this.f1943a.a() + ((jr) this.f1943a).q();
                do {
                    list.add(Integer.valueOf(((jr) this.f1943a).q()));
                } while (this.f1943a.a() < a5);
                Q(a5);
                return;
            }
            do {
                list.add(Integer.valueOf(((jr) this.f1943a).q()));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        ls lsVar = (ls) list;
        int r32 = this.f1944b & 7;
        if (r32 != 0) {
            if (r32 != 2) {
                throw h.a();
            }
            int a6 = this.f1943a.a() + ((jr) this.f1943a).q();
            do {
                lsVar.q(((jr) this.f1943a).q());
            } while (this.f1943a.a() < a6);
            Q(a6);
            return;
        }
        do {
            lsVar.q(((jr) this.f1943a).q());
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final long t() {
        R(0);
        return ((jr) this.f1943a).s();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void u(List list) {
        int c5;
        int c6;
        if (!(list instanceof wq)) {
            int r02 = this.f1944b & 7;
            if (r02 != 0) {
                if (r02 != 2) {
                    throw h.a();
                }
                int a5 = this.f1943a.a() + ((jr) this.f1943a).q();
                do {
                    list.add(Boolean.valueOf(this.f1943a.j()));
                } while (this.f1943a.a() < a5);
                Q(a5);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.f1943a.j()));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        wq wqVar = (wq) list;
        int r32 = this.f1944b & 7;
        if (r32 != 0) {
            if (r32 != 2) {
                throw h.a();
            }
            int a6 = this.f1943a.a() + ((jr) this.f1943a).q();
            do {
                wqVar.p(this.f1943a.j());
            } while (this.f1943a.a() < a6);
            Q(a6);
            return;
        }
        do {
            wqVar.p(this.f1943a.j());
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final int v() {
        R(5);
        return ((jr) this.f1943a).p();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void w(List list) {
        int c5;
        int c6;
        if (!(list instanceof ls)) {
            int r02 = this.f1944b & 7;
            if (r02 == 2) {
                int q4 = ((jr) this.f1943a).q();
                S(q4);
                int a5 = this.f1943a.a() + q4;
                do {
                    list.add(Integer.valueOf(((jr) this.f1943a).p()));
                } while (this.f1943a.a() < a5);
                return;
            }
            if (r02 != 5) {
                throw h.a();
            }
            do {
                list.add(Integer.valueOf(((jr) this.f1943a).p()));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        ls lsVar = (ls) list;
        int r5 = this.f1944b & 7;
        if (r5 == 2) {
            int q5 = ((jr) this.f1943a).q();
            S(q5);
            int a6 = this.f1943a.a() + q5;
            do {
                lsVar.q(((jr) this.f1943a).p());
            } while (this.f1943a.a() < a6);
            return;
        }
        if (r5 != 5) {
            throw h.a();
        }
        do {
            lsVar.q(((jr) this.f1943a).p());
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void x(List list) {
        int c5;
        int c6;
        if (!(list instanceof s)) {
            int r02 = this.f1944b & 7;
            if (r02 != 0) {
                if (r02 != 2) {
                    throw h.a();
                }
                int a5 = this.f1943a.a() + ((jr) this.f1943a).q();
                do {
                    list.add(Long.valueOf(((jr) this.f1943a).s()));
                } while (this.f1943a.a() < a5);
                Q(a5);
                return;
            }
            do {
                list.add(Long.valueOf(((jr) this.f1943a).s()));
                lr lrVar = this.f1943a;
                if (lrVar.i()) {
                    return;
                } else {
                    c5 = lrVar.c();
                }
            } while (c5 == this.f1944b);
            this.f1946d = c5;
            return;
        }
        s sVar = (s) list;
        int r5 = this.f1944b & 7;
        if (r5 != 0) {
            if (r5 != 2) {
                throw h.a();
            }
            int a6 = this.f1943a.a() + ((jr) this.f1943a).q();
            do {
                sVar.q(((jr) this.f1943a).s());
            } while (this.f1943a.a() < a6);
            Q(a6);
            return;
        }
        do {
            sVar.q(((jr) this.f1943a).s());
            lr lrVar2 = this.f1943a;
            if (lrVar2.i()) {
                return;
            } else {
                c6 = lrVar2.c();
            }
        } while (c6 == this.f1944b);
        this.f1946d = c6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final String y() {
        R(2);
        return this.f1943a.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final Object z(q0 q0Var, yr yrVar) {
        R(2);
        return P(q0Var, yrVar);
    }
}
