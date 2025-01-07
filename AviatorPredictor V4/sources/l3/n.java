package l3;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n extends m {
    public static <T> boolean h(Collection<? super T> collection, Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.d(collection, "<this>");
        kotlin.jvm.internal.i.d(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z4 = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z4 = true;
            }
        }
        return z4;
    }
}
