package r0;

/* loaded from: classes.dex */
final class f {
    static int a(int r4) {
        return (int) (Integer.rotateLeft((int) (r4 * (-862048943)), 15) * 461845907);
    }

    static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
