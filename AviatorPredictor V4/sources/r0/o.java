package r0;

/* loaded from: classes.dex */
public final class o {
    static Object a(Object obj, int r32) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(r32);
        throw new NullPointerException(sb.toString());
    }

    static Object[] b(Object... objArr) {
        return c(objArr, objArr.length);
    }

    static Object[] c(Object[] objArr, int r32) {
        for (int r02 = 0; r02 < r32; r02++) {
            a(objArr[r02], r02);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int r12) {
        return (T[]) q.b(tArr, r12);
    }
}
