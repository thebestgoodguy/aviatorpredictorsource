package b4;

/* loaded from: classes.dex */
public final class o {
    public static final <T> m<T> a(n3.d<? super T> dVar) {
        if (!(dVar instanceof kotlinx.coroutines.internal.f)) {
            return new m<>(dVar, 1);
        }
        m<T> k4 = ((kotlinx.coroutines.internal.f) dVar).k();
        if (k4 == null || !k4.G()) {
            k4 = null;
        }
        return k4 == null ? new m<>(dVar, 2) : k4;
    }
}
