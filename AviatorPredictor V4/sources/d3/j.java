package d3;

import e3.f;
import io.grpc.internal.q0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
class j {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f3361b = Logger.getLogger(j.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final e3.f f3362c = e3.f.e();

    /* renamed from: d, reason: collision with root package name */
    private static j f3363d = d(j.class.getClassLoader());

    /* renamed from: a, reason: collision with root package name */
    protected final e3.f f3364a;

    static final class a extends j {

        /* renamed from: e, reason: collision with root package name */
        private static final e3.e<Socket> f3365e;

        /* renamed from: f, reason: collision with root package name */
        private static final e3.e<Socket> f3366f;

        /* renamed from: g, reason: collision with root package name */
        private static final e3.e<Socket> f3367g;

        /* renamed from: h, reason: collision with root package name */
        private static final e3.e<Socket> f3368h;

        /* renamed from: i, reason: collision with root package name */
        private static final e3.e<Socket> f3369i;

        /* renamed from: j, reason: collision with root package name */
        private static final e3.e<Socket> f3370j;

        /* renamed from: k, reason: collision with root package name */
        private static final Method f3371k;

        /* renamed from: l, reason: collision with root package name */
        private static final Method f3372l;

        /* renamed from: m, reason: collision with root package name */
        private static final Method f3373m;

        /* renamed from: n, reason: collision with root package name */
        private static final Method f3374n;

        /* renamed from: o, reason: collision with root package name */
        private static final Method f3375o;

        /* renamed from: p, reason: collision with root package name */
        private static final Method f3376p;

        /* renamed from: q, reason: collision with root package name */
        private static final Constructor<?> f3377q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Class<?> cls;
            Class<?> cls2 = Boolean.TYPE;
            Constructor<?> constructor = null;
            f3365e = new e3.e<>(null, "setUseSessionTickets", cls2);
            f3366f = new e3.e<>(null, "setHostname", String.class);
            f3367g = new e3.e<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f3368h = new e3.e<>(null, "setAlpnProtocols", byte[].class);
            f3369i = new e3.e<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f3370j = new e3.e<>(null, "setNpnProtocols", byte[].class);
            try {
                method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                    try {
                        method3 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                        try {
                            cls = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                        } catch (ClassNotFoundException | NoSuchMethodException e5) {
                            e = e5;
                            method4 = null;
                        }
                    } catch (ClassNotFoundException e6) {
                        e = e6;
                        method3 = null;
                        method4 = method3;
                        j.f3361b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f3373m = method2;
                        f3374n = method;
                        f3375o = method3;
                        f3371k = method4;
                        f3372l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        try {
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        } catch (ClassNotFoundException e7) {
                            e = e7;
                            j.f3361b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                            f3376p = method6;
                            f3377q = constructor;
                        } catch (NoSuchMethodException e8) {
                            e = e8;
                            j.f3361b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                            f3376p = method6;
                            f3377q = constructor;
                        }
                        f3376p = method6;
                        f3377q = constructor;
                    } catch (NoSuchMethodException e9) {
                        e = e9;
                        method3 = null;
                        method4 = method3;
                        j.f3361b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f3373m = method2;
                        f3374n = method;
                        f3375o = method3;
                        f3371k = method4;
                        f3372l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f3376p = method6;
                        f3377q = constructor;
                    }
                    try {
                        method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
                    } catch (ClassNotFoundException e10) {
                        e = e10;
                        j.f3361b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f3373m = method2;
                        f3374n = method;
                        f3375o = method3;
                        f3371k = method4;
                        f3372l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f3376p = method6;
                        f3377q = constructor;
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        j.f3361b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f3373m = method2;
                        f3374n = method;
                        f3375o = method3;
                        f3371k = method4;
                        f3372l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f3376p = method6;
                        f3377q = constructor;
                    }
                } catch (ClassNotFoundException e12) {
                    e = e12;
                    method = null;
                    method3 = null;
                } catch (NoSuchMethodException e13) {
                    e = e13;
                    method = null;
                    method3 = null;
                }
            } catch (ClassNotFoundException e14) {
                e = e14;
                method = null;
                method2 = null;
                method3 = null;
            } catch (NoSuchMethodException e15) {
                e = e15;
                method = null;
                method2 = null;
                method3 = null;
            }
            f3373m = method2;
            f3374n = method;
            f3375o = method3;
            f3371k = method4;
            f3372l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException | NoSuchMethodException e16) {
                e = e16;
                method6 = null;
            }
            f3376p = method6;
            f3377q = constructor;
        }

        a(e3.f fVar) {
            super(fVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
        @Override // d3.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<e3.g> r11) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d3.j.a.c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        @Override // d3.j
        public String f(SSLSocket sSLSocket) {
            Method method = f3375o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InvocationTargetException e6) {
                    if (!(e6.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e6);
                    }
                    j.f3361b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f3364a.i() == f.h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f3367g.f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, e3.i.f3609c);
                    }
                } catch (Exception e7) {
                    j.f3361b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e7);
                }
            }
            if (this.f3364a.i() == f.h.NONE) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f3369i.f(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, e3.i.f3609c);
                }
                return null;
            } catch (Exception e8) {
                j.f3361b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e8);
                return null;
            }
        }

        @Override // d3.j
        public String h(SSLSocket sSLSocket, String str, List<e3.g> list) {
            String f5 = f(sSLSocket);
            return f5 == null ? super.h(sSLSocket, str, list) : f5;
        }
    }

    j(e3.f fVar) {
        this.f3364a = (e3.f) q0.l.o(fVar, "platform");
    }

    static j d(ClassLoader classLoader) {
        boolean z4;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e5) {
            f3361b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e5);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e6) {
                f3361b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e6);
                z4 = false;
            }
        }
        z4 = true;
        return z4 ? new a(f3362c) : new j(f3362c);
    }

    public static j e() {
        return f3363d;
    }

    static boolean g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            q0.c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] i(List<e3.g> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<e3.g> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    protected void c(SSLSocket sSLSocket, String str, List<e3.g> list) {
        this.f3364a.c(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        return this.f3364a.h(sSLSocket);
    }

    public String h(SSLSocket sSLSocket, String str, List<e3.g> list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String f5 = f(sSLSocket);
            if (f5 != null) {
                return f5;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f3364a.a(sSLSocket);
        }
    }
}
