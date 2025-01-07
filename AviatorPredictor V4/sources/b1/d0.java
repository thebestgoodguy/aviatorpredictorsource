package b1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class d0 {
    public static void a(boolean z4, String str) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T b(T t4) {
        Objects.requireNonNull(t4);
        return t4;
    }

    public static <T> T c(T t4, String str) {
        Objects.requireNonNull(t4, str);
        return t4;
    }

    public static void d(boolean z4, String str) {
        if (!z4) {
            throw new IllegalStateException(str);
        }
    }
}
