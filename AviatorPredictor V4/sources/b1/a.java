package b1;

import java.util.Set;

/* loaded from: classes.dex */
abstract class a implements e {
    a() {
    }

    @Override // b1.e
    public <T> T a(Class<T> cls) {
        r1.b<T> b5 = b(cls);
        if (b5 == null) {
            return null;
        }
        return b5.get();
    }

    @Override // b1.e
    public <T> Set<T> c(Class<T> cls) {
        return d(cls).get();
    }
}
