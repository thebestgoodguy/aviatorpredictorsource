package b4;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final g2 f1005a = new g2();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<a1> f1006b = new ThreadLocal<>();

    private g2() {
    }

    public final a1 a() {
        ThreadLocal<a1> threadLocal = f1006b;
        a1 a1Var = threadLocal.get();
        if (a1Var != null) {
            return a1Var;
        }
        a1 a5 = d1.a();
        threadLocal.set(a5);
        return a5;
    }

    public final void b() {
        f1006b.set(null);
    }

    public final void c(a1 a1Var) {
        f1006b.set(a1Var);
    }
}
