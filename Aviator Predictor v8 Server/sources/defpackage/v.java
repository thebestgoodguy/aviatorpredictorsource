package defpackage;

/* loaded from: classes61.dex */
public final class v {
    public static int a(int r5, int r6, String str) {
        String a;
        if (r5 >= 0 && r5 < r6) {
            return r5;
        }
        if (r5 < 0) {
            a = w.a("%s (%s) must not be negative", "index", Integer.valueOf(r5));
        } else {
            if (r6 < 0) {
                throw new IllegalArgumentException("negative size: " + r6);
            }
            a = w.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(r5), Integer.valueOf(r6));
        }
        throw new IndexOutOfBoundsException(a);
    }

    public static void a(int r2, int r3, int r4) {
        if (r2 < 0 || r3 < r2 || r3 > r4) {
            throw new IndexOutOfBoundsException((r2 < 0 || r2 > r4) ? c(r2, r4, "start index") : (r3 < 0 || r3 > r4) ? c(r3, r4, "end index") : w.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(r3), Integer.valueOf(r2)));
        }
    }

    public static int b(int r1, int r2, String str) {
        if (r1 < 0 || r1 > r2) {
            throw new IndexOutOfBoundsException(c(r1, r2, "index"));
        }
        return r1;
    }

    private static String c(int r4, int r5, String str) {
        if (r4 < 0) {
            return w.a("%s (%s) must not be negative", str, Integer.valueOf(r4));
        }
        if (r5 >= 0) {
            return w.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(r4), Integer.valueOf(r5));
        }
        throw new IllegalArgumentException("negative size: " + r5);
    }
}
