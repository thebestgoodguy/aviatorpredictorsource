package kotlinx.coroutines.internal;

import b4.q0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k<E> {
    public static <E> Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int r12, kotlin.jvm.internal.e eVar) {
        if ((r12 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e5) {
        if (q0.a() && !(!(e5 instanceof List))) {
            throw new AssertionError();
        }
        if (obj == null) {
            return a(e5);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e5);
            return a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e5);
        return a(arrayList);
    }
}
