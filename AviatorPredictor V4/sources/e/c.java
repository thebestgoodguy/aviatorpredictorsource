package e;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f3446a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    static final long[] f3447b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    static final Object[] f3448c = new Object[0];

    static int a(int[] r32, int r4, int r5) {
        int r42 = r4 - 1;
        int r02 = 0;
        while (r02 <= r42) {
            int r12 = (r02 + r42) >>> 1;
            int r22 = r32[r12];
            if (r22 < r5) {
                r02 = r12 + 1;
            } else {
                if (r22 <= r5) {
                    return r12;
                }
                r42 = r12 - 1;
            }
        }
        return ~r02;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int c(int r22) {
        for (int r02 = 4; r02 < 32; r02++) {
            int r12 = (1 << r02) - 12;
            if (r22 <= r12) {
                return r12;
            }
        }
        return r22;
    }

    public static int d(int r02) {
        return c(r02 * 4) / 4;
    }
}
