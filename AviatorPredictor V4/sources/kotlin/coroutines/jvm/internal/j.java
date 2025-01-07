package kotlin.coroutines.jvm.internal;

/* loaded from: classes.dex */
public abstract class j extends a {
    public j(n3.d<Object> dVar) {
        super(dVar);
        if (dVar == null) {
            return;
        }
        if (!(dVar.getContext() == n3.h.f6694e)) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // n3.d
    public n3.g getContext() {
        return n3.h.f6694e;
    }
}
