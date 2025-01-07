package z3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import u3.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends g {
    public static <T, R> b<R> c(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.i.d(bVar, "<this>");
        kotlin.jvm.internal.i.d(lVar, "transform");
        return new i(bVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C d(b<? extends T> bVar, C c5) {
        kotlin.jvm.internal.i.d(bVar, "<this>");
        kotlin.jvm.internal.i.d(c5, "destination");
        Iterator<? extends T> it = bVar.iterator();
        while (it.hasNext()) {
            c5.add(it.next());
        }
        return c5;
    }

    public static <T> List<T> e(b<? extends T> bVar) {
        kotlin.jvm.internal.i.d(bVar, "<this>");
        return l3.i.e(f(bVar));
    }

    public static final <T> List<T> f(b<? extends T> bVar) {
        kotlin.jvm.internal.i.d(bVar, "<this>");
        return (List) d(bVar, new ArrayList());
    }
}
