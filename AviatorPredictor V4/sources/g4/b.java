package g4;

import k3.m;
import k3.n;
import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.internal.c0;
import n3.d;
import n3.g;
import u3.p;

/* loaded from: classes.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r4, d<? super T> dVar) {
        Object a5;
        Object c5;
        d a6 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c6 = c0.c(context, null);
            try {
            } finally {
                c0.a(context, c6);
            }
        } catch (Throwable th) {
            m.a aVar = m.f6368e;
            a5 = n.a(th);
        }
        if (pVar == null) {
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
        a5 = ((p) kotlin.jvm.internal.n.a(pVar, 2)).invoke(r4, a6);
        c5 = o3.d.c();
        if (a5 != c5) {
            m.a aVar2 = m.f6368e;
            a6.resumeWith(m.a(a5));
        }
    }
}
