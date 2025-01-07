package t0;

/* loaded from: classes.dex */
final class c {
    static void a(boolean z4, String str, long j4, long j5) {
        if (z4) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(j4);
        sb.append(", ");
        sb.append(j5);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    static int b(String str, int r4) {
        if (r4 > 0) {
            return r4;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append(str);
        sb.append(" (");
        sb.append(r4);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    static void c(boolean z4) {
        if (!z4) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
