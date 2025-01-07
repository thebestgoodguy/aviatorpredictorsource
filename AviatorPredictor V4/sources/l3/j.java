package l3;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends i {
    public static <T> int g(Iterable<? extends T> iterable, int r22) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : r22;
    }
}
