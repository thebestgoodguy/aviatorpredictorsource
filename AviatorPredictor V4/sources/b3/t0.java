package b3;

import b3.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f896c = Logger.getLogger(t0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static t0 f897d;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<s0> f898a = new LinkedHashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private List<s0> f899b = Collections.emptyList();

    class a implements Comparator<s0> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(s0 s0Var, s0 s0Var2) {
            return s0Var.c() - s0Var2.c();
        }
    }

    private static final class b implements e1.b<s0> {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // b3.e1.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(s0 s0Var) {
            return s0Var.c();
        }

        @Override // b3.e1.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(s0 s0Var) {
            return s0Var.b();
        }
    }

    private synchronized void a(s0 s0Var) {
        q0.l.e(s0Var.b(), "isAvailable() returned false");
        this.f898a.add(s0Var);
    }

    public static synchronized t0 b() {
        t0 t0Var;
        synchronized (t0.class) {
            if (f897d == null) {
                List<s0> e5 = e1.e(s0.class, c(), s0.class.getClassLoader(), new b(null));
                f897d = new t0();
                for (s0 s0Var : e5) {
                    f896c.fine("Service loader found " + s0Var);
                    if (s0Var.b()) {
                        f897d.a(s0Var);
                    }
                }
                f897d.f();
            }
            t0Var = f897d;
        }
        return t0Var;
    }

    static List<Class<?>> c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(d3.f.class);
        } catch (ClassNotFoundException e5) {
            f896c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e5);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e6) {
            f896c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e6);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void f() {
        ArrayList arrayList = new ArrayList(this.f898a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f899b = Collections.unmodifiableList(arrayList);
    }

    s0 d() {
        List<s0> e5 = e();
        if (e5.isEmpty()) {
            return null;
        }
        return e5.get(0);
    }

    synchronized List<s0> e() {
        return this.f899b;
    }
}
