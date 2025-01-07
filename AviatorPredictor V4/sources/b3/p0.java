package b3;

import b3.e1;
import io.grpc.internal.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    private static p0 f878d;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<o0> f880a = new LinkedHashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap<String, o0> f881b = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f877c = Logger.getLogger(p0.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final Iterable<Class<?>> f879e = c();

    private static final class a implements e1.b<o0> {
        a() {
        }

        @Override // b3.e1.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(o0 o0Var) {
            return o0Var.c();
        }

        @Override // b3.e1.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(o0 o0Var) {
            return o0Var.d();
        }
    }

    private synchronized void a(o0 o0Var) {
        q0.l.e(o0Var.d(), "isAvailable() returned false");
        this.f880a.add(o0Var);
    }

    public static synchronized p0 b() {
        p0 p0Var;
        synchronized (p0.class) {
            if (f878d == null) {
                List<o0> e5 = e1.e(o0.class, f879e, o0.class.getClassLoader(), new a());
                f878d = new p0();
                for (o0 o0Var : e5) {
                    f877c.fine("Service loader found " + o0Var);
                    if (o0Var.d()) {
                        f878d.a(o0Var);
                    }
                }
                f878d.e();
            }
            p0Var = f878d;
        }
        return p0Var;
    }

    static List<Class<?>> c() {
        ArrayList arrayList = new ArrayList();
        try {
            int r22 = r1.f5647b;
            arrayList.add(r1.class);
        } catch (ClassNotFoundException e5) {
            f877c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e5);
        }
        try {
            int r23 = i3.b.f4330b;
            arrayList.add(i3.b.class);
        } catch (ClassNotFoundException e6) {
            f877c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e6);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void e() {
        this.f881b.clear();
        Iterator<o0> it = this.f880a.iterator();
        while (it.hasNext()) {
            o0 next = it.next();
            String b5 = next.b();
            o0 o0Var = this.f881b.get(b5);
            if (o0Var == null || o0Var.c() < next.c()) {
                this.f881b.put(b5, next);
            }
        }
    }

    public synchronized o0 d(String str) {
        return this.f881b.get(q0.l.o(str, "policy"));
    }
}
