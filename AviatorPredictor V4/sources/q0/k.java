package q0;

import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f7151a = Logger.getLogger(k.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final j f7152b = b();

    private static final class b implements j {
        private b() {
        }
    }

    private k() {
    }

    static String a(double d5) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d5));
    }

    private static j b() {
        return new b();
    }

    static boolean c(String str) {
        return str == null || str.isEmpty();
    }

    static long d() {
        return System.nanoTime();
    }
}
