package j;

import java.util.Objects;

/* loaded from: classes.dex */
public final class d {
    public static <T> T a(T t4) {
        Objects.requireNonNull(t4);
        return t4;
    }

    public static <T> T b(T t4, Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
