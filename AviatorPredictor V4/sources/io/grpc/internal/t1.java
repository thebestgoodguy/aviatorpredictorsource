package io.grpc.internal;

import b3.b0;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
class t1 implements b3.c1 {

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f5664d = Logger.getLogger(t1.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final c f5665e = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final q0.p<ProxySelector> f5666f = new b();

    /* renamed from: a, reason: collision with root package name */
    private final q0.p<ProxySelector> f5667a;

    /* renamed from: b, reason: collision with root package name */
    private final c f5668b;

    /* renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f5669c;

    class a implements c {
        a() {
        }

        @Override // io.grpc.internal.t1.c
        public PasswordAuthentication a(String str, InetAddress inetAddress, int r12, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, r12, "");
            } catch (MalformedURLException unused) {
                t1.f5664d.log(Level.WARNING, String.format("failed to create URL for Authenticator: %s %s", str2, str));
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, r12, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    class b implements q0.p<ProxySelector> {
        b() {
        }

        @Override // q0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    interface c {
        PasswordAuthentication a(String str, InetAddress inetAddress, int r32, String str2, String str3, String str4);
    }

    public t1() {
        this(f5666f, f5665e, System.getenv("GRPC_PROXY_EXP"));
    }

    t1(q0.p<ProxySelector> pVar, c cVar, String str) {
        this.f5667a = (q0.p) q0.l.n(pVar);
        this.f5668b = (c) q0.l.n(cVar);
        this.f5669c = str != null ? d(str) : null;
    }

    private b3.b1 c(InetSocketAddress inetSocketAddress) {
        try {
            URI r9 = new URI("https", null, q0.h(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = this.f5667a.get();
            if (proxySelector == null) {
                f5664d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> select = proxySelector.select(r9);
            if (select.size() > 1) {
                f5664d.warning("More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = select.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication a5 = this.f5668b.a(q0.h(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
            if (inetSocketAddress2.isUnresolved()) {
                inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
            }
            b0.b c5 = b3.b0.e().d(inetSocketAddress).c(inetSocketAddress2);
            if (a5 == null) {
                return c5.a();
            }
            return c5.e(a5.getUserName()).b(a5.getPassword() != null ? new String(a5.getPassword()) : null).a();
        } catch (URISyntaxException e5) {
            f5664d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e5);
            return null;
        }
    }

    private static InetSocketAddress d(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        f5664d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(split[0], parseInt);
    }

    @Override // b3.c1
    public b3.b1 a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return this.f5669c != null ? b3.b0.e().c(this.f5669c).d((InetSocketAddress) socketAddress).a() : c((InetSocketAddress) socketAddress);
        }
        return null;
    }
}
