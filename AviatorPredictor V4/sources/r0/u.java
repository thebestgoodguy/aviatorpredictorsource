package r0;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class u {
    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int r12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            r12 = ~(~(r12 + (next != null ? next.hashCode() : 0)));
        }
        return r12;
    }
}
