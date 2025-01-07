package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class s<T> implements o0.d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final c f1318a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1319b;

    /* renamed from: c, reason: collision with root package name */
    private final u.b<?> f1320c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1321d;

    /* renamed from: e, reason: collision with root package name */
    private final long f1322e;

    s(c cVar, int r22, u.b<?> bVar, long j4, long j5, String str, String str2) {
        this.f1318a = cVar;
        this.f1319b = r22;
        this.f1320c = bVar;
        this.f1321d = j4;
        this.f1322e = j5;
    }

    static <T> s<T> b(c cVar, int r13, u.b<?> bVar) {
        boolean z4;
        if (!cVar.f()) {
            return null;
        }
        w.t a5 = w.s.b().a();
        if (a5 == null) {
            z4 = true;
        } else {
            if (!a5.l0()) {
                return null;
            }
            z4 = a5.m0();
            o w4 = cVar.w(bVar);
            if (w4 != null) {
                if (!(w4.v() instanceof w.c)) {
                    return null;
                }
                w.c cVar2 = (w.c) w4.v();
                if (cVar2.I() && !cVar2.b()) {
                    w.e c5 = c(w4, cVar2, r13);
                    if (c5 == null) {
                        return null;
                    }
                    w4.G();
                    z4 = c5.n0();
                }
            }
        }
        return new s<>(cVar, r13, bVar, z4 ? System.currentTimeMillis() : 0L, z4 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static w.e c(o<?> oVar, w.c<?> cVar, int r4) {
        int[] k02;
        int[] l02;
        w.e G = cVar.G();
        if (G == null || !G.m0() || ((k02 = G.k0()) != null ? !b0.b.a(k02, r4) : !((l02 = G.l0()) == null || !b0.b.a(l02, r4))) || oVar.s() >= G.j0()) {
            return null;
        }
        return G;
    }

    @Override // o0.d
    public final void a(o0.h<T> hVar) {
        o w4;
        int r12;
        int r22;
        int r32;
        int r122;
        int j02;
        long j4;
        long j5;
        int r21;
        if (this.f1318a.f()) {
            w.t a5 = w.s.b().a();
            if ((a5 == null || a5.l0()) && (w4 = this.f1318a.w(this.f1320c)) != null && (w4.v() instanceof w.c)) {
                w.c cVar = (w.c) w4.v();
                boolean z4 = this.f1321d > 0;
                int y4 = cVar.y();
                if (a5 != null) {
                    z4 &= a5.m0();
                    int j03 = a5.j0();
                    int k02 = a5.k0();
                    r12 = a5.n0();
                    if (cVar.I() && !cVar.b()) {
                        w.e c5 = c(w4, cVar, this.f1319b);
                        if (c5 == null) {
                            return;
                        }
                        boolean z5 = c5.n0() && this.f1321d > 0;
                        k02 = c5.j0();
                        z4 = z5;
                    }
                    r22 = j03;
                    r32 = k02;
                } else {
                    r12 = 0;
                    r22 = 5000;
                    r32 = 100;
                }
                c cVar2 = this.f1318a;
                if (hVar.p()) {
                    r122 = 0;
                    j02 = 0;
                } else {
                    if (hVar.n()) {
                        r122 = 100;
                    } else {
                        Exception l4 = hVar.l();
                        if (l4 instanceof t.b) {
                            Status a6 = ((t.b) l4).a();
                            int k03 = a6.k0();
                            s.a j04 = a6.j0();
                            j02 = j04 == null ? -1 : j04.j0();
                            r122 = k03;
                        } else {
                            r122 = 101;
                        }
                    }
                    j02 = -1;
                }
                if (z4) {
                    long j6 = this.f1321d;
                    j5 = System.currentTimeMillis();
                    j4 = j6;
                    r21 = (int) (SystemClock.elapsedRealtime() - this.f1322e);
                } else {
                    j4 = 0;
                    j5 = 0;
                    r21 = -1;
                }
                cVar2.F(new w.o(this.f1319b, r122, j02, j4, j5, null, null, y4, r21), r12, r22, r32);
            }
        }
    }
}
