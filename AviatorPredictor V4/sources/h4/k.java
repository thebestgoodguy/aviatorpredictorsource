package h4;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    static j f4003a;

    /* renamed from: b, reason: collision with root package name */
    static long f4004b;

    private k() {
    }

    static void a(j jVar) {
        if (jVar.f4001f != null || jVar.f4002g != null) {
            throw new IllegalArgumentException();
        }
        if (jVar.f3999d) {
            return;
        }
        synchronized (k.class) {
            long j4 = f4004b;
            if (j4 + 8192 > 65536) {
                return;
            }
            f4004b = j4 + 8192;
            jVar.f4001f = f4003a;
            jVar.f3998c = 0;
            jVar.f3997b = 0;
            f4003a = jVar;
        }
    }

    static j b() {
        synchronized (k.class) {
            j jVar = f4003a;
            if (jVar == null) {
                return new j();
            }
            f4003a = jVar.f4001f;
            jVar.f4001f = null;
            f4004b -= 8192;
            return jVar;
        }
    }
}
