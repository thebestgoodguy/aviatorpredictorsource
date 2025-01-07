package g4;

import k3.m;
import k3.n;
import k3.s;
import kotlinx.coroutines.internal.g;
import n3.d;
import o3.c;
import u3.l;
import u3.p;

/* loaded from: classes.dex */
public final class a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(d<?> dVar, Throwable th) {
        m.a aVar = m.f6368e;
        dVar.resumeWith(m.a(n.a(th)));
        throw th;
    }

    public static final void c(d<? super s> dVar, d<?> dVar2) {
        d b5;
        try {
            b5 = c.b(dVar);
            m.a aVar = m.f6368e;
            g.c(b5, m.a(s.f6374a), null, 2, null);
        } catch (Throwable th) {
            b(dVar2, th);
        }
    }

    public static final <R, T> void d(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r4, d<? super T> dVar, l<? super Throwable, s> lVar) {
        d a5;
        d b5;
        try {
            a5 = c.a(pVar, r4, dVar);
            b5 = c.b(a5);
            m.a aVar = m.f6368e;
            g.b(b5, m.a(s.f6374a), lVar);
        } catch (Throwable th) {
            b(dVar, th);
        }
    }

    public static /* synthetic */ void e(p pVar, Object obj, d dVar, l lVar, int r4, Object obj2) {
        if ((r4 & 4) != 0) {
            lVar = null;
        }
        d(pVar, obj, dVar, lVar);
    }
}
