package l3;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
class c0 {
    public static final <T> Set<T> a(T t4) {
        Set<T> singleton = Collections.singleton(t4);
        kotlin.jvm.internal.i.c(singleton, "singleton(element)");
        return singleton;
    }
}
