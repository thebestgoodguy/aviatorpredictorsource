package w;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    private static s f8057b;

    /* renamed from: c, reason: collision with root package name */
    private static final t f8058c = new t(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private t f8059a;

    private s() {
    }

    public static synchronized s b() {
        s sVar;
        synchronized (s.class) {
            if (f8057b == null) {
                f8057b = new s();
            }
            sVar = f8057b;
        }
        return sVar;
    }

    public t a() {
        return this.f8059a;
    }

    public final synchronized void c(t tVar) {
        if (tVar == null) {
            this.f8059a = f8058c;
            return;
        }
        t tVar2 = this.f8059a;
        if (tVar2 == null || tVar2.n0() < tVar.n0()) {
            this.f8059a = tVar;
        }
    }
}
