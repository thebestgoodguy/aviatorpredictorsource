package x3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {
    public static int a(int r02, int r12) {
        return r02 < r12 ? r12 : r02;
    }

    public static long b(long j4, long j5) {
        return j4 < j5 ? j5 : j4;
    }

    public static int c(int r02, int r12) {
        return r02 > r12 ? r12 : r02;
    }

    public static long d(long j4, long j5) {
        return j4 > j5 ? j5 : j4;
    }

    public static int e(int r22, int r32, int r4) {
        if (r32 <= r4) {
            return r22 < r32 ? r32 : r22 > r4 ? r4 : r22;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + r4 + " is less than minimum " + r32 + '.');
    }

    public static a f(int r22, int r32) {
        return a.f8296h.a(r22, r32, -1);
    }

    public static c g(int r12, int r22) {
        return r22 <= Integer.MIN_VALUE ? c.f8304i.a() : new c(r12, r22 - 1);
    }
}
