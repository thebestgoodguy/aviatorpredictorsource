package l3;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i extends h {
    public static <T> List<T> b() {
        return s.f6596e;
    }

    public static <T> int c(List<? extends T> list) {
        kotlin.jvm.internal.i.d(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> d(T... tArr) {
        List<T> a5;
        kotlin.jvm.internal.i.d(tArr, "elements");
        if (tArr.length <= 0) {
            return b();
        }
        a5 = d.a(tArr);
        return a5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> e(List<? extends T> list) {
        kotlin.jvm.internal.i.d(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : h.a(list.get(0)) : b();
    }

    public static void f() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
