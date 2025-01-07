package l3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends c {
    public static <T> List<T> a(T[] tArr) {
        kotlin.jvm.internal.i.d(tArr, "<this>");
        List<T> a5 = f.a(tArr);
        kotlin.jvm.internal.i.c(a5, "asList(this)");
        return a5;
    }

    public static final <T> T[] b(T[] tArr, T[] tArr2, int r32, int r4, int r5) {
        kotlin.jvm.internal.i.d(tArr, "<this>");
        kotlin.jvm.internal.i.d(tArr2, "destination");
        System.arraycopy(tArr, r4, tArr2, r32, r5 - r4);
        return tArr2;
    }

    public static /* synthetic */ Object[] c(Object[] objArr, Object[] objArr2, int r32, int r4, int r5, int r6, Object obj) {
        if ((r6 & 2) != 0) {
            r32 = 0;
        }
        if ((r6 & 4) != 0) {
            r4 = 0;
        }
        if ((r6 & 8) != 0) {
            r5 = objArr.length;
        }
        return b(objArr, objArr2, r32, r4, r5);
    }

    public static <T> void d(T[] tArr, T t4, int r32, int r4) {
        kotlin.jvm.internal.i.d(tArr, "<this>");
        Arrays.fill(tArr, r32, r4, t4);
    }

    public static /* synthetic */ void e(Object[] objArr, Object obj, int r22, int r32, int r4, Object obj2) {
        if ((r4 & 2) != 0) {
            r22 = 0;
        }
        if ((r4 & 4) != 0) {
            r32 = objArr.length;
        }
        d(objArr, obj, r22, r32);
    }

    public static final <T> void f(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.i.d(tArr, "<this>");
        kotlin.jvm.internal.i.d(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
