package l3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e extends d {
    public static char g(char[] cArr) {
        kotlin.jvm.internal.i.d(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T h(T[] tArr) {
        kotlin.jvm.internal.i.d(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> T[] i(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.i.d(tArr, "<this>");
        kotlin.jvm.internal.i.d(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.i.c(tArr2, "copyOf(this, size)");
        d.f(tArr2, comparator);
        return tArr2;
    }

    public static <T> List<T> j(T[] tArr, Comparator<? super T> comparator) {
        List<T> a5;
        kotlin.jvm.internal.i.d(tArr, "<this>");
        kotlin.jvm.internal.i.d(comparator, "comparator");
        a5 = d.a(i(tArr, comparator));
        return a5;
    }
}
