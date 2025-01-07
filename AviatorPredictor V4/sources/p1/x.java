package p1;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public class x {
    public static void a(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T b(T t4) {
        Objects.requireNonNull(t4);
        return t4;
    }

    public static <T> T c(T t4, Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T d(T t4, String str, Object... objArr) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.format(Locale.US, str, objArr));
    }
}
