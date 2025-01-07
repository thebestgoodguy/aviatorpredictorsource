package b0;

import w.p;

/* loaded from: classes.dex */
public final class b {
    public static boolean a(int[] r4, int r5) {
        if (r4 == null) {
            return false;
        }
        for (int r02 : r4) {
            if (r02 == r5) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean b(T[] tArr, T t4) {
        int length = tArr != null ? tArr.length : 0;
        int r22 = 0;
        while (true) {
            if (r22 >= length) {
                break;
            }
            if (!p.a(tArr[r22], t4)) {
                r22++;
            } else if (r22 >= 0) {
                return true;
            }
        }
        return false;
    }
}
