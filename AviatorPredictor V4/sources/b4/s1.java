package b4;

/* loaded from: classes.dex */
public class s1 extends w1 implements x {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1049f;

    public s1(p1 p1Var) {
        super(true);
        S(p1Var);
        this.f1049f = t0();
    }

    private final boolean t0() {
        r O = O();
        s sVar = O instanceof s ? (s) O : null;
        if (sVar == null) {
            return false;
        }
        do {
            w1 z4 = sVar.z();
            if (z4.L()) {
                return true;
            }
            r O2 = z4.O();
            sVar = O2 instanceof s ? (s) O2 : null;
        } while (sVar != null);
        return false;
    }

    @Override // b4.w1
    public boolean L() {
        return this.f1049f;
    }

    @Override // b4.w1
    public boolean M() {
        return true;
    }
}
