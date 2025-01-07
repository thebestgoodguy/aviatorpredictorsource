package l1;

import com.google.protobuf.t1;
import x1.r;

/* loaded from: classes.dex */
public final class v {
    public static t1 a(x1.x xVar) {
        return xVar.m0().Z("__local_write_time__").p0();
    }

    public static x1.x b(x1.x xVar) {
        x1.x Y = xVar.m0().Y("__previous_value__", null);
        return c(Y) ? b(Y) : Y;
    }

    public static boolean c(x1.x xVar) {
        x1.x Y = xVar != null ? xVar.m0().Y("__type__", null) : null;
        return Y != null && "server_timestamp".equals(Y.o0());
    }

    public static x1.x d(x0.o oVar, x1.x xVar) {
        x1.x t4 = x1.x.r0().Q("server_timestamp").t();
        r.b E = x1.r.d0().E("__type__", t4).E("__local_write_time__", x1.x.r0().R(t1.Z().D(oVar.i()).B(oVar.g())).t());
        if (xVar != null) {
            E.E("__previous_value__", xVar);
        }
        return x1.x.r0().L(E).t();
    }
}
