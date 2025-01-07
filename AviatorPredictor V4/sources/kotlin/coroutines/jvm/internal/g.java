package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class g {
    private static final void a(int r32, int r4) {
        if (r4 <= r32) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + r32 + ", got " + r4 + ". Please update the Kotlin standard library.").toString());
    }

    private static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num == null ? 0 : num.intValue()) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(a aVar) {
        String str;
        kotlin.jvm.internal.i.d(aVar, "<this>");
        f b5 = b(aVar);
        if (b5 == null) {
            return null;
        }
        a(1, b5.v());
        int c5 = c(aVar);
        int r12 = c5 < 0 ? -1 : b5.l()[c5];
        String b6 = i.f6376a.b(aVar);
        if (b6 == null) {
            str = b5.c();
        } else {
            str = ((Object) b6) + '/' + b5.c();
        }
        return new StackTraceElement(str, b5.m(), b5.f(), r12);
    }
}
