package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class i0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f1760a;

    /* renamed from: b, reason: collision with root package name */
    private final i1 f1761b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1762c;

    /* renamed from: d, reason: collision with root package name */
    private final zr f1763d;

    private i0(i1 i1Var, zr zrVar, e0 e0Var) {
        this.f1761b = i1Var;
        this.f1762c = zrVar.h(e0Var);
        this.f1763d = zrVar;
        this.f1760a = e0Var;
    }

    static i0 k(i1 i1Var, zr zrVar, e0 e0Var) {
        return new i0(i1Var, zrVar, e0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final int a(Object obj) {
        int hashCode = this.f1761b.d(obj).hashCode();
        if (!this.f1762c) {
            return hashCode;
        }
        this.f1763d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final void b(Object obj) {
        this.f1761b.m(obj);
        this.f1763d.e(obj);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final void c(Object obj, ur urVar) {
        this.f1763d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final Object d() {
        return this.f1760a.l().i();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final int e(Object obj) {
        i1 i1Var = this.f1761b;
        int b5 = i1Var.b(i1Var.d(obj));
        if (!this.f1762c) {
            return b5;
        }
        this.f1763d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final void f(Object obj, Object obj2) {
        s0.f(this.f1761b, obj, obj2);
        if (this.f1762c) {
            s0.e(this.f1763d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final void g(Object obj, byte[] bArr, int r32, int r4, uq uqVar) {
        ks ksVar = (ks) obj;
        if (ksVar.zzc == j1.c()) {
            ksVar.zzc = j1.e();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final boolean h(Object obj, Object obj2) {
        if (!this.f1761b.d(obj).equals(this.f1761b.d(obj2))) {
            return false;
        }
        if (!this.f1762c) {
            return true;
        }
        this.f1763d.a(obj);
        this.f1763d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final boolean i(Object obj) {
        this.f1763d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final void j(Object obj, p0 p0Var, yr yrVar) {
        boolean C;
        i1 i1Var = this.f1761b;
        zr zrVar = this.f1763d;
        Object c5 = i1Var.c(obj);
        ds b5 = zrVar.b(obj);
        while (p0Var.c() != Integer.MAX_VALUE) {
            try {
                int e5 = p0Var.e();
                if (e5 != 11) {
                    if ((e5 & 7) == 2) {
                        Object c6 = zrVar.c(yrVar, this.f1760a, e5 >>> 3);
                        if (c6 != null) {
                            zrVar.f(p0Var, c6, yrVar, b5);
                        } else {
                            C = i1Var.p(c5, p0Var);
                        }
                    } else {
                        C = p0Var.C();
                    }
                    if (!C) {
                        return;
                    }
                } else {
                    int r4 = 0;
                    Object obj2 = null;
                    hr hrVar = null;
                    while (p0Var.c() != Integer.MAX_VALUE) {
                        int e6 = p0Var.e();
                        if (e6 == 16) {
                            r4 = p0Var.p();
                            obj2 = zrVar.c(yrVar, this.f1760a, r4);
                        } else if (e6 == 26) {
                            if (obj2 != null) {
                                zrVar.f(p0Var, obj2, yrVar, b5);
                            } else {
                                hrVar = p0Var.n();
                            }
                        } else if (!p0Var.C()) {
                            break;
                        }
                    }
                    if (p0Var.e() != 12) {
                        throw h.b();
                    }
                    if (hrVar != null) {
                        if (obj2 != null) {
                            zrVar.g(hrVar, obj2, yrVar, b5);
                        } else {
                            i1Var.k(c5, r4, hrVar);
                        }
                    }
                }
            } finally {
                i1Var.n(obj, c5);
            }
        }
    }
}
