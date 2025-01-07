package a4;

/* loaded from: classes.dex */
class a {
    public static final int a(int r4) {
        boolean z4 = false;
        if (2 <= r4 && r4 < 37) {
            z4 = true;
        }
        if (z4) {
            return r4;
        }
        throw new IllegalArgumentException("radix " + r4 + " was not in valid range " + new x3.c(2, 36));
    }

    public static final int b(char c5, int r12) {
        return Character.digit((int) c5, r12);
    }

    public static final boolean c(char c5) {
        return Character.isWhitespace(c5) || Character.isSpaceChar(c5);
    }
}
