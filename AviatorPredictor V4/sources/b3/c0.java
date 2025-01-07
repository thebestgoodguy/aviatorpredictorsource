package b3;

import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f712f = Logger.getLogger(c0.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static final c0 f713g = new c0();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentNavigableMap<Long, g0<Object>> f714a = new ConcurrentSkipListMap();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentNavigableMap<Long, g0<Object>> f715b = new ConcurrentSkipListMap();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentMap<Long, g0<Object>> f716c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentMap<Long, g0<Object>> f717d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentMap<Long, Object> f718e = new ConcurrentHashMap();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f719a;

        public b(c cVar) {
            this.f719a = (c) q0.l.n(cVar);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f720a;

        /* renamed from: b, reason: collision with root package name */
        public final Certificate f721b;

        /* renamed from: c, reason: collision with root package name */
        public final Certificate f722c;

        public c(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e5) {
                c0.f712f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e5);
            }
            this.f720a = cipherSuite;
            this.f721b = certificate2;
            this.f722c = certificate;
        }
    }

    private static <T extends g0<?>> void b(Map<Long, T> map, T t4) {
        map.put(Long.valueOf(t4.d().d()), t4);
    }

    public static long f(l0 l0Var) {
        return l0Var.d().d();
    }

    public static c0 g() {
        return f713g;
    }

    private static <T extends g0<?>> void h(Map<Long, T> map, T t4) {
        map.remove(Long.valueOf(f(t4)));
    }

    public void c(g0<Object> g0Var) {
        b(this.f717d, g0Var);
    }

    public void d(g0<Object> g0Var) {
        b(this.f715b, g0Var);
    }

    public void e(g0<Object> g0Var) {
        b(this.f716c, g0Var);
    }

    public void i(g0<Object> g0Var) {
        h(this.f717d, g0Var);
    }

    public void j(g0<Object> g0Var) {
        h(this.f715b, g0Var);
    }

    public void k(g0<Object> g0Var) {
        h(this.f716c, g0Var);
    }
}
