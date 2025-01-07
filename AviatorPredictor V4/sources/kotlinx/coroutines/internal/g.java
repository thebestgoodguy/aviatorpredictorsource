package kotlinx.coroutines.internal;

import b4.a1;
import b4.g2;
import b4.i2;
import b4.p1;
import b4.q0;
import java.util.concurrent.CancellationException;
import k3.m;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final y f6423a = new y("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final y f6424b = new y("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final <T> void b(n3.d<? super T> dVar, Object obj, u3.l<? super Throwable, k3.s> lVar) {
        boolean z4;
        if (!(dVar instanceof f)) {
            dVar.resumeWith(obj);
            return;
        }
        f fVar = (f) dVar;
        Object c5 = b4.d0.c(obj, lVar);
        if (fVar.f6415h.H(fVar.getContext())) {
            fVar.f6417j = c5;
            fVar.f1052g = 1;
            fVar.f6415h.F(fVar.getContext(), fVar);
            return;
        }
        q0.a();
        a1 a5 = g2.f1005a.a();
        if (a5.f0()) {
            fVar.f6417j = c5;
            fVar.f1052g = 1;
            a5.R(fVar);
            return;
        }
        a5.X(true);
        try {
            p1 p1Var = (p1) fVar.getContext().get(p1.f1038a);
            if (p1Var == null || p1Var.e()) {
                z4 = false;
            } else {
                CancellationException l4 = p1Var.l();
                fVar.a(c5, l4);
                m.a aVar = k3.m.f6368e;
                fVar.resumeWith(k3.m.a(k3.n.a(l4)));
                z4 = true;
            }
            if (!z4) {
                n3.d<T> dVar2 = fVar.f6416i;
                Object obj2 = fVar.f6418k;
                n3.g context = dVar2.getContext();
                Object c6 = c0.c(context, obj2);
                i2<?> e5 = c6 != c0.f6404a ? b4.f0.e(dVar2, context, c6) : null;
                try {
                    fVar.f6416i.resumeWith(obj);
                    k3.s sVar = k3.s.f6374a;
                    if (e5 == null || e5.y0()) {
                        c0.a(context, c6);
                    }
                } catch (Throwable th) {
                    if (e5 == null || e5.y0()) {
                        c0.a(context, c6);
                    }
                    throw th;
                }
            }
            while (a5.j0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(n3.d dVar, Object obj, u3.l lVar, int r32, Object obj2) {
        if ((r32 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}
