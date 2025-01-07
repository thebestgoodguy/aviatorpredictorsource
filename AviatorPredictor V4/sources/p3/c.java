package p3;

/* loaded from: classes.dex */
public final class c {
    private static final int a(int r02, int r12, int r22) {
        return c(c(r02, r22) - c(r12, r22), r22);
    }

    public static final int b(int r02, int r12, int r22) {
        if (r22 > 0) {
            return r02 >= r12 ? r12 : r12 - a(r12, r02, r22);
        }
        if (r22 < 0) {
            return r02 <= r12 ? r12 : r12 + a(r02, r12, -r22);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int c(int r02, int r12) {
        int r03 = r02 % r12;
        return r03 >= 0 ? r03 : r03 + r12;
    }
}
