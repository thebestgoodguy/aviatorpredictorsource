package b4;

/* loaded from: classes.dex */
public enum o0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1035a;

        static {
            int[] r02 = new int[o0.values().length];
            r02[o0.DEFAULT.ordinal()] = 1;
            r02[o0.ATOMIC.ordinal()] = 2;
            r02[o0.UNDISPATCHED.ordinal()] = 3;
            r02[o0.LAZY.ordinal()] = 4;
            f1035a = r02;
        }
    }

    public final <R, T> void g(u3.p<? super R, ? super n3.d<? super T>, ? extends Object> pVar, R r4, n3.d<? super T> dVar) {
        int r02 = a.f1035a[ordinal()];
        if (r02 == 1) {
            g4.a.e(pVar, r4, dVar, null, 4, null);
            return;
        }
        if (r02 == 2) {
            n3.f.a(pVar, r4, dVar);
        } else if (r02 == 3) {
            g4.b.a(pVar, r4, dVar);
        } else if (r02 != 4) {
            throw new k3.k();
        }
    }

    public final boolean h() {
        return this == LAZY;
    }
}
