package i1;

/* loaded from: classes.dex */
public class s0 implements com.google.firebase.firestore.a0 {

    /* renamed from: a, reason: collision with root package name */
    private final l0 f4223a;

    /* renamed from: b, reason: collision with root package name */
    private final y0 f4224b;

    /* renamed from: c, reason: collision with root package name */
    private final h<u1> f4225c;

    public s0(l0 l0Var, y0 y0Var, h<u1> hVar) {
        this.f4223a = l0Var;
        this.f4224b = y0Var;
        this.f4225c = hVar;
    }

    @Override // com.google.firebase.firestore.a0
    public void remove() {
        this.f4225c.d();
        this.f4223a.X(this.f4224b);
    }
}
