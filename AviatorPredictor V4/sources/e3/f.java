package e3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f3569b = Logger.getLogger(f.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f3570c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d, reason: collision with root package name */
    private static final f f3571d = d();

    /* renamed from: a, reason: collision with root package name */
    private final Provider f3572a;

    class a implements PrivilegedExceptionAction<Method> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    class b implements PrivilegedExceptionAction<Method> {
        b() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    class c implements PrivilegedExceptionAction<Method> {
        c() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    private static class d extends f {

        /* renamed from: e, reason: collision with root package name */
        private final e3.e<Socket> f3573e;

        /* renamed from: f, reason: collision with root package name */
        private final e3.e<Socket> f3574f;

        /* renamed from: g, reason: collision with root package name */
        private final Method f3575g;

        /* renamed from: h, reason: collision with root package name */
        private final Method f3576h;

        /* renamed from: i, reason: collision with root package name */
        private final e3.e<Socket> f3577i;

        /* renamed from: j, reason: collision with root package name */
        private final e3.e<Socket> f3578j;

        /* renamed from: k, reason: collision with root package name */
        private final h f3579k;

        public d(e3.e<Socket> eVar, e3.e<Socket> eVar2, Method method, Method method2, e3.e<Socket> eVar3, e3.e<Socket> eVar4, Provider provider, h hVar) {
            super(provider);
            this.f3573e = eVar;
            this.f3574f = eVar2;
            this.f3575g = method;
            this.f3576h = method2;
            this.f3577i = eVar3;
            this.f3578j = eVar4;
            this.f3579k = hVar;
        }

        @Override // e3.f
        public void c(SSLSocket sSLSocket, String str, List<e3.g> list) {
            if (str != null) {
                this.f3573e.e(sSLSocket, Boolean.TRUE);
                this.f3574f.e(sSLSocket, str);
            }
            if (this.f3578j.g(sSLSocket)) {
                this.f3578j.f(sSLSocket, f.b(list));
            }
        }

        @Override // e3.f
        public String h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f3577i.g(sSLSocket) && (bArr = (byte[]) this.f3577i.f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, i.f3609c);
            }
            return null;
        }

        @Override // e3.f
        public h i() {
            return this.f3579k;
        }
    }

    private static class e extends f {

        /* renamed from: e, reason: collision with root package name */
        private final Method f3580e;

        /* renamed from: f, reason: collision with root package name */
        private final Method f3581f;

        private e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f3580e = method;
            this.f3581f = method2;
        }

        /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }

        @Override // e3.f
        public void c(SSLSocket sSLSocket, String str, List<e3.g> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (e3.g gVar : list) {
                if (gVar != e3.g.HTTP_1_0) {
                    arrayList.add(gVar.toString());
                }
            }
            try {
                this.f3580e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        }

        @Override // e3.f
        public String h(SSLSocket sSLSocket) {
            try {
                return (String) this.f3581f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        }

        @Override // e3.f
        public h i() {
            return h.ALPN_AND_NPN;
        }
    }

    /* renamed from: e3.f$f, reason: collision with other inner class name */
    private static class C0036f extends f {

        /* renamed from: e, reason: collision with root package name */
        private final Method f3582e;

        /* renamed from: f, reason: collision with root package name */
        private final Method f3583f;

        /* renamed from: g, reason: collision with root package name */
        private final Method f3584g;

        /* renamed from: h, reason: collision with root package name */
        private final Class<?> f3585h;

        /* renamed from: i, reason: collision with root package name */
        private final Class<?> f3586i;

        public C0036f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f3582e = method;
            this.f3583f = method2;
            this.f3584g = method3;
            this.f3585h = cls;
            this.f3586i = cls2;
        }

        @Override // e3.f
        public void a(SSLSocket sSLSocket) {
            try {
                this.f3584g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e5) {
                f.f3569b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e5);
            }
        }

        @Override // e3.f
        public void c(SSLSocket sSLSocket, String str, List<e3.g> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int r22 = 0; r22 < size; r22++) {
                e3.g gVar = list.get(r22);
                if (gVar != e3.g.HTTP_1_0) {
                    arrayList.add(gVar.toString());
                }
            }
            try {
                this.f3582e.invoke(null, sSLSocket, Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f3585h, this.f3586i}, new g(arrayList)));
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InvocationTargetException e6) {
                throw new AssertionError(e6);
            }
        }

        @Override // e3.f
        public String h(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f3583f.invoke(null, sSLSocket));
                if (!gVar.f3588b && gVar.f3589c == null) {
                    f.f3569b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (gVar.f3588b) {
                    return null;
                }
                return gVar.f3589c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // e3.f
        public h i() {
            return h.ALPN_AND_NPN;
        }
    }

    private static class g implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f3587a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f3588b;

        /* renamed from: c, reason: collision with root package name */
        private String f3589c;

        public g(List<String> list) {
            this.f3587a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = i.f3608b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f3588b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f3587a;
            }
            if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f3589c = (String) objArr[0];
                return null;
            }
            List list = (List) objArr[0];
            int size = list.size();
            int r8 = 0;
            while (true) {
                if (r8 >= size) {
                    obj2 = this.f3587a.get(0);
                    break;
                }
                if (this.f3587a.contains(list.get(r8))) {
                    obj2 = list.get(r8);
                    break;
                }
                r8++;
            }
            String str = (String) obj2;
            this.f3589c = str;
            return str;
        }
    }

    public enum h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public f(Provider provider) {
        this.f3572a = provider;
    }

    public static byte[] b(List<e3.g> list) {
        h4.c cVar = new h4.c();
        int size = list.size();
        for (int r22 = 0; r22 < size; r22++) {
            e3.g gVar = list.get(r22);
            if (gVar != e3.g.HTTP_1_0) {
                cVar.Z(gVar.toString().length());
                cVar.U(gVar.toString());
            }
        }
        return cVar.v();
    }

    private static f d() {
        Method method;
        Method method2;
        Provider f5 = f();
        a aVar = null;
        if (f5 != null) {
            e3.e eVar = new e3.e(null, "setUseSessionTickets", Boolean.TYPE);
            e3.e eVar2 = new e3.e(null, "setHostname", String.class);
            e3.e eVar3 = new e3.e(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            e3.e eVar4 = new e3.e(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    method2 = null;
                    return new d(eVar, eVar2, method, method2, eVar3, eVar4, f5, (!f5.getName().equals("GmsCore_OpenSSL") || f5.getName().equals("Conscrypt") || f5.getName().equals("Ssl_Guard") || k()) ? h.ALPN_AND_NPN : j() ? h.NPN : h.NONE);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
            return new d(eVar, eVar2, method, method2, eVar3, eVar4, f5, (!f5.getName().equals("GmsCore_OpenSSL") || f5.getName().equals("Conscrypt") || f5.getName().equals("Ssl_Guard") || k()) ? h.ALPN_AND_NPN : j() ? h.NPN : h.NONE);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                sSLContext.init(null, null, null);
                ((Method) AccessController.doPrivileged(new a())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                return new e(provider, (Method) AccessController.doPrivileged(new b()), (Method) AccessController.doPrivileged(new c()), aVar);
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new C0036f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    return new f(provider);
                }
            }
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static f e() {
        return f3571d;
    }

    private static Provider f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f3570c) {
                if (str.equals(provider.getClass().getName())) {
                    f3569b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f3569b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    private static boolean j() {
        try {
            f.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e5) {
            f3569b.log(Level.FINE, "Can't find class", (Throwable) e5);
            return false;
        }
    }

    private static boolean k() {
        try {
            f.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e5) {
            f3569b.log(Level.FINE, "Can't find class", (Throwable) e5);
            return false;
        }
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List<e3.g> list) {
    }

    public Provider g() {
        return this.f3572a;
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public h i() {
        return h.NONE;
    }
}
