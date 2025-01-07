package b3;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* loaded from: classes.dex */
public final class b0 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    private final SocketAddress f691e;

    /* renamed from: f, reason: collision with root package name */
    private final InetSocketAddress f692f;

    /* renamed from: g, reason: collision with root package name */
    private final String f693g;

    /* renamed from: h, reason: collision with root package name */
    private final String f694h;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private SocketAddress f695a;

        /* renamed from: b, reason: collision with root package name */
        private InetSocketAddress f696b;

        /* renamed from: c, reason: collision with root package name */
        private String f697c;

        /* renamed from: d, reason: collision with root package name */
        private String f698d;

        private b() {
        }

        public b0 a() {
            return new b0(this.f695a, this.f696b, this.f697c, this.f698d);
        }

        public b b(String str) {
            this.f698d = str;
            return this;
        }

        public b c(SocketAddress socketAddress) {
            this.f695a = (SocketAddress) q0.l.o(socketAddress, "proxyAddress");
            return this;
        }

        public b d(InetSocketAddress inetSocketAddress) {
            this.f696b = (InetSocketAddress) q0.l.o(inetSocketAddress, "targetAddress");
            return this;
        }

        public b e(String str) {
            this.f697c = str;
            return this;
        }
    }

    private b0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        q0.l.o(socketAddress, "proxyAddress");
        q0.l.o(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            q0.l.w(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f691e = socketAddress;
        this.f692f = inetSocketAddress;
        this.f693g = str;
        this.f694h = str2;
    }

    public static b e() {
        return new b();
    }

    public String a() {
        return this.f694h;
    }

    public SocketAddress b() {
        return this.f691e;
    }

    public InetSocketAddress c() {
        return this.f692f;
    }

    public String d() {
        return this.f693g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return q0.i.a(this.f691e, b0Var.f691e) && q0.i.a(this.f692f, b0Var.f692f) && q0.i.a(this.f693g, b0Var.f693g) && q0.i.a(this.f694h, b0Var.f694h);
    }

    public int hashCode() {
        return q0.i.b(this.f691e, this.f692f, this.f693g, this.f694h);
    }

    public String toString() {
        return q0.h.c(this).d("proxyAddr", this.f691e).d("targetAddr", this.f692f).d("username", this.f693g).e("hasPassword", this.f694h != null).toString();
    }
}
