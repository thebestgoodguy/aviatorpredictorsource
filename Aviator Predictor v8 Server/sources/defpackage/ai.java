package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

/* loaded from: classes61.dex */
public final class ai {
    @CanIgnoreReturnValue
    public static <T> T a(@CheckForNull T t) {
        t.getClass();
        return t;
    }

    public static void a(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
