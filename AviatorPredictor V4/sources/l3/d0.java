package l3;

import java.util.Set;

/* loaded from: classes.dex */
class d0 extends c0 {
    public static <T> Set<T> b() {
        return u.f6598e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        Set<T> b5;
        kotlin.jvm.internal.i.d(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : c0.a(set.iterator().next());
        }
        b5 = b();
        return b5;
    }
}
