package b3;

import b3.u0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f810a = StandardCharsets.US_ASCII;

    /* renamed from: b, reason: collision with root package name */
    public static final s0.a f811b = u0.f904f;

    public interface a<T> extends u0.j<T> {
    }

    public static int a(u0 u0Var) {
        return u0Var.h();
    }

    public static <T> u0.g<T> b(String str, a<T> aVar) {
        boolean z4 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z4 = true;
        }
        return u0.g.g(str, z4, aVar);
    }

    public static u0 c(byte[]... bArr) {
        return new u0(bArr);
    }

    public static byte[][] d(u0 u0Var) {
        return u0Var.q();
    }
}
