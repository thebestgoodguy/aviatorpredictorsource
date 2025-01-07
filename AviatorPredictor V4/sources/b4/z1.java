package b4;

/* loaded from: classes.dex */
public abstract class z1 extends g0 {
    public abstract z1 K();

    protected final String M() {
        z1 z1Var;
        z1 c5 = x0.c();
        if (this == c5) {
            return "Dispatchers.Main";
        }
        try {
            z1Var = c5.K();
        } catch (UnsupportedOperationException unused) {
            z1Var = null;
        }
        if (this == z1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // b4.g0
    public String toString() {
        String M = M();
        if (M != null) {
            return M;
        }
        return r0.a(this) + '@' + r0.b(this);
    }
}
