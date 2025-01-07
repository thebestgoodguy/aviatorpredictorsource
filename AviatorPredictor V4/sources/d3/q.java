package d3;

import b3.i0;
import b3.u0;
import io.grpc.internal.l2;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f3395a = Logger.getLogger(q.class.getName());

    private q() {
    }

    public static u0 a(List<f3.d> list) {
        return i0.c(b(list));
    }

    private static byte[][] b(List<f3.d> list) {
        byte[][] bArr = new byte[list.size() * 2][];
        int r12 = 0;
        for (f3.d dVar : list) {
            int r32 = r12 + 1;
            bArr[r12] = dVar.f3720a.w();
            r12 = r32 + 1;
            bArr[r32] = dVar.f3721b.w();
        }
        return l2.e(bArr);
    }

    public static u0 c(List<f3.d> list) {
        return i0.c(b(list));
    }
}
