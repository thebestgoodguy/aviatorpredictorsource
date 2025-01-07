package p0;

/* loaded from: classes.dex */
public final class a {
    public static int a(long j4, long j5) {
        if (j4 < j5) {
            return -1;
        }
        return j4 > j5 ? 1 : 0;
    }

    public static int b(double d5, long j4) {
        if (Double.isNaN(d5) || d5 < -9.223372036854776E18d) {
            return -1;
        }
        if (d5 >= 9.223372036854776E18d) {
            return 1;
        }
        int a5 = a((long) d5, j4);
        return a5 != 0 ? a5 : c(d5, j4);
    }

    public static int c(double d5, double d6) {
        if (d5 < d6) {
            return -1;
        }
        if (d5 > d6) {
            return 1;
        }
        if (d5 == d6) {
            return 0;
        }
        if (Double.isNaN(d6)) {
            return !Double.isNaN(d5) ? 1 : 0;
        }
        return -1;
    }
}
