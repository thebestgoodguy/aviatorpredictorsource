package l3;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
class y extends x {
    public static int a(int r12) {
        if (r12 < 0) {
            return r12;
        }
        if (r12 < 3) {
            return r12 + 1;
        }
        if (r12 < 1073741824) {
            return (int) ((r12 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> b(k3.l<? extends K, ? extends V> lVar) {
        kotlin.jvm.internal.i.d(lVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(lVar.c(), lVar.d());
        kotlin.jvm.internal.i.c(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.i.d(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.i.c(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
