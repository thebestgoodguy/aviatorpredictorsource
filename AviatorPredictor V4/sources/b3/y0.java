package b3;

import b3.e1;
import b3.w0;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f975e = Logger.getLogger(y0.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private static y0 f976f;

    /* renamed from: a, reason: collision with root package name */
    private final w0.d f977a = new b();

    /* renamed from: b, reason: collision with root package name */
    private String f978b = "unknown";

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<x0> f979c = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private r0.i<String, x0> f980d = r0.i.i();

    private final class b extends w0.d {
        private b() {
        }

        @Override // b3.w0.d
        public String a() {
            String str;
            synchronized (y0.this) {
                str = y0.this.f978b;
            }
            return str;
        }

        @Override // b3.w0.d
        public w0 b(URI r32, w0.b bVar) {
            x0 x0Var = y0.this.f().get(r32.getScheme());
            if (x0Var == null) {
                return null;
            }
            return x0Var.b(r32, bVar);
        }
    }

    private static final class c implements e1.b<x0> {
        private c() {
        }

        @Override // b3.e1.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(x0 x0Var) {
            return x0Var.e();
        }

        @Override // b3.e1.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(x0 x0Var) {
            return x0Var.d();
        }
    }

    private synchronized void b(x0 x0Var) {
        q0.l.e(x0Var.d(), "isAvailable() returned false");
        this.f979c.add(x0Var);
    }

    public static synchronized y0 d() {
        y0 y0Var;
        synchronized (y0.class) {
            if (f976f == null) {
                List<x0> e5 = e1.e(x0.class, e(), x0.class.getClassLoader(), new c());
                if (e5.isEmpty()) {
                    f975e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f976f = new y0();
                for (x0 x0Var : e5) {
                    f975e.fine("Service loader found " + x0Var);
                    if (x0Var.d()) {
                        f976f.b(x0Var);
                    }
                }
                f976f.g();
            }
            y0Var = f976f;
        }
        return y0Var;
    }

    static List<Class<?>> e() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(io.grpc.internal.d0.class);
        } catch (ClassNotFoundException e5) {
            f975e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e5);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void g() {
        HashMap hashMap = new HashMap();
        int r12 = Integer.MIN_VALUE;
        String str = "unknown";
        Iterator<x0> it = this.f979c.iterator();
        while (it.hasNext()) {
            x0 next = it.next();
            String c5 = next.c();
            x0 x0Var = (x0) hashMap.get(c5);
            if (x0Var == null || x0Var.e() < next.e()) {
                hashMap.put(c5, next);
            }
            if (r12 < next.e()) {
                r12 = next.e();
                str = next.c();
            }
        }
        this.f980d = r0.i.b(hashMap);
        this.f978b = str;
    }

    public w0.d c() {
        return this.f977a;
    }

    synchronized Map<String, x0> f() {
        return this.f980d;
    }
}
