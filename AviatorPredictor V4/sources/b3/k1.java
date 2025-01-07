package b3;

import b3.r;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class k1 extends r.c {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f834a = Logger.getLogger(k1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static final ThreadLocal<r> f835b = new ThreadLocal<>();

    k1() {
    }

    @Override // b3.r.c
    public r b() {
        r rVar = f835b.get();
        return rVar == null ? r.f885d : rVar;
    }

    @Override // b3.r.c
    public void c(r rVar, r rVar2) {
        ThreadLocal<r> threadLocal;
        if (b() != rVar) {
            f834a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (rVar2 != r.f885d) {
            threadLocal = f835b;
        } else {
            threadLocal = f835b;
            rVar2 = null;
        }
        threadLocal.set(rVar2);
    }

    @Override // b3.r.c
    public r d(r rVar) {
        r b5 = b();
        f835b.set(rVar);
        return b5;
    }
}
