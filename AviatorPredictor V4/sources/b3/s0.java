package b3;

/* loaded from: classes.dex */
public abstract class s0 {

    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static s0 d() {
        s0 d5 = t0.b().d();
        if (d5 != null) {
            return d5;
        }
        throw new a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    protected abstract r0<?> a(String str);

    protected abstract boolean b();

    protected abstract int c();
}
