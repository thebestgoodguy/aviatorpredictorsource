package n3;

import k3.m;
import k3.s;
import kotlin.jvm.internal.i;
import u3.p;

/* loaded from: classes.dex */
public final class f {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r4, d<? super T> dVar) {
        d a5;
        d b5;
        i.d(pVar, "<this>");
        i.d(dVar, "completion");
        a5 = o3.c.a(pVar, r4, dVar);
        b5 = o3.c.b(a5);
        m.a aVar = m.f6368e;
        b5.resumeWith(m.a(s.f6374a));
    }
}
