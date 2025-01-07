package p1;

import android.util.Log;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static b f7064a = b.WARN;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7065a;

        static {
            int[] r02 = new int[b.values().length];
            f7065a = r02;
            try {
                r02[b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7065a[b.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7065a[b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        DEBUG,
        WARN,
        NONE
    }

    public static void a(String str, String str2, Object... objArr) {
        b(b.DEBUG, str, str2, objArr);
    }

    private static void b(b bVar, String str, String str2, Object... objArr) {
        if (bVar.ordinal() >= f7064a.ordinal()) {
            String str3 = String.format("(%s) [%s]: ", "24.2.1", str) + String.format(str2, objArr);
            int r5 = a.f7065a[bVar.ordinal()];
            if (r5 == 1) {
                Log.i("Firestore", str3);
            } else if (r5 == 2) {
                Log.w("Firestore", str3);
            } else if (r5 == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static boolean c() {
        return f7064a.ordinal() >= b.DEBUG.ordinal();
    }

    public static void d(String str, String str2, Object... objArr) {
        b(b.WARN, str, str2, objArr);
    }
}
