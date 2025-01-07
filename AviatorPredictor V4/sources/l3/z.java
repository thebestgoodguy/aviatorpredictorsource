package l3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z extends y {
    public static final <K, V> Map<K, V> d() {
        return t.f6597e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> e(Map<K, ? extends V> map) {
        kotlin.jvm.internal.i.d(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : y.c(map) : d();
    }

    public static final <K, V> void f(Map<? super K, ? super V> map, Iterable<? extends k3.l<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.i.d(map, "<this>");
        kotlin.jvm.internal.i.d(iterable, "pairs");
        for (k3.l<? extends K, ? extends V> lVar : iterable) {
            map.put(lVar.a(), lVar.b());
        }
    }

    public static <K, V> Map<K, V> g(Iterable<? extends k3.l<? extends K, ? extends V>> iterable) {
        int a5;
        kotlin.jvm.internal.i.d(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return e(h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size == 1) {
            return y.b(iterable instanceof List ? (k3.l<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
        }
        a5 = y.a(collection.size());
        return h(iterable, new LinkedHashMap(a5));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M h(Iterable<? extends k3.l<? extends K, ? extends V>> iterable, M m4) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        kotlin.jvm.internal.i.d(m4, "destination");
        f(m4, iterable);
        return m4;
    }
}
