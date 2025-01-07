package q3;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class a extends p3.a {
    @Override // p3.a
    public void a(Throwable th, Throwable th2) {
        i.d(th, "cause");
        i.d(th2, "exception");
        th.addSuppressed(th2);
    }
}
