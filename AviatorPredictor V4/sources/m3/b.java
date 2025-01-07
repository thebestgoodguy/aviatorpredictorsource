package m3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {
    public static <T extends Comparable<?>> int a(T t4, T t5) {
        if (t4 == t5) {
            return 0;
        }
        if (t4 == null) {
            return -1;
        }
        if (t5 == null) {
            return 1;
        }
        return t4.compareTo(t5);
    }
}
