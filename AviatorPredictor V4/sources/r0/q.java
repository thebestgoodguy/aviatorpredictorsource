package r0;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
final class q {
    static <T> T[] a(Object[] objArr, int r12, int r22, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, r12, r22, tArr.getClass());
    }

    static <T> T[] b(T[] tArr, int r12) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), r12));
    }
}
