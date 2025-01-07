package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes61.dex */
public final class h {
    static int a(Set set) {
        Iterator it = set.iterator();
        int r1 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            r1 += next != null ? next.hashCode() : 0;
        }
        return r1;
    }
}
