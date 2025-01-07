package kotlinx.coroutines.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 {
    public static final int a(String str, int r8, int r9, int r10) {
        return (int) z.c(str, r8, r9, r10);
    }

    public static final long b(String str, long j4, long j5, long j6) {
        Long h5;
        String d5 = z.d(str);
        if (d5 == null) {
            return j4;
        }
        h5 = a4.l.h(d5);
        if (h5 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d5 + '\'').toString());
        }
        long longValue = h5.longValue();
        boolean z4 = false;
        if (j5 <= longValue && longValue <= j6) {
            z4 = true;
        }
        if (z4) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j6 + ", but is '" + longValue + '\'').toString());
    }

    public static final boolean c(String str, boolean z4) {
        String d5 = z.d(str);
        return d5 == null ? z4 : Boolean.parseBoolean(d5);
    }

    public static /* synthetic */ int d(String str, int r12, int r22, int r32, int r4, Object obj) {
        if ((r4 & 4) != 0) {
            r22 = 1;
        }
        if ((r4 & 8) != 0) {
            r32 = Integer.MAX_VALUE;
        }
        return z.b(str, r12, r22, r32);
    }

    public static /* synthetic */ long e(String str, long j4, long j5, long j6, int r14, Object obj) {
        if ((r14 & 4) != 0) {
            j5 = 1;
        }
        long j7 = j5;
        if ((r14 & 8) != 0) {
            j6 = Long.MAX_VALUE;
        }
        return z.c(str, j4, j7, j6);
    }
}
