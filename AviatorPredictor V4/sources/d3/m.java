package d3;

import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    static final List<e3.g> f3379a = Collections.unmodifiableList(Arrays.asList(e3.g.HTTP_2));

    static String a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    public static SSLSocket b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int r6, e3.b bVar) {
        q0.l.o(sSLSocketFactory, "sslSocketFactory");
        q0.l.o(socket, "socket");
        q0.l.o(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, r6, true);
        bVar.c(sSLSocket, false);
        String h5 = j.e().h(sSLSocket, str, bVar.f() ? f3379a : null);
        List<e3.g> list = f3379a;
        q0.l.w(list.contains(e3.g.d(h5)), "Only " + list + " are supported, but negotiated protocol is %s", h5);
        if (hostnameVerifier == null) {
            hostnameVerifier = e3.d.f3564a;
        }
        if (hostnameVerifier.verify(a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
