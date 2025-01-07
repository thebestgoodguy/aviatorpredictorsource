package x0;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import b1.w;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import w.p;
import w.r;

/* loaded from: classes.dex */
public class e {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f8119k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static final Executor f8120l = new d();

    /* renamed from: m, reason: collision with root package name */
    static final Map<String, e> f8121m = new e.a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f8122a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8123b;

    /* renamed from: c, reason: collision with root package name */
    private final m f8124c;

    /* renamed from: d, reason: collision with root package name */
    private final b1.n f8125d;

    /* renamed from: g, reason: collision with root package name */
    private final w<s1.a> f8128g;

    /* renamed from: h, reason: collision with root package name */
    private final r1.b<q1.g> f8129h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f8126e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f8127f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List<b> f8130i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List<f> f8131j = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z4);
    }

    private static class c implements a.InterfaceC0021a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference<c> f8132a = new AtomicReference<>();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (b0.j.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f8132a.get() == null) {
                    c cVar = new c();
                    if (f8132a.compareAndSet(null, cVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0021a
        public void a(boolean z4) {
            synchronized (e.f8119k) {
                Iterator it = new ArrayList(e.f8121m.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f8126e.get()) {
                        eVar.C(z4);
                    }
                }
            }
        }
    }

    private static class d implements Executor {

        /* renamed from: e, reason: collision with root package name */
        private static final Handler f8133e = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f8133e.post(runnable);
        }
    }

    /* renamed from: x0.e$e, reason: collision with other inner class name */
    private static class C0103e extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference<C0103e> f8134b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        private final Context f8135a;

        public C0103e(Context context) {
            this.f8135a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f8134b.get() == null) {
                C0103e c0103e = new C0103e(context);
                if (f8134b.compareAndSet(null, c0103e)) {
                    context.registerReceiver(c0103e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f8135a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f8119k) {
                Iterator<e> it = e.f8121m.values().iterator();
                while (it.hasNext()) {
                    it.next().t();
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, m mVar) {
        this.f8122a = (Context) r.i(context);
        this.f8123b = r.e(str);
        this.f8124c = (m) r.i(mVar);
        b1.n e5 = b1.n.i(f8120l).d(b1.g.c(context, ComponentDiscoveryService.class).b()).c(new FirebaseCommonRegistrar()).b(b1.d.p(context, Context.class, new Class[0])).b(b1.d.p(this, e.class, new Class[0])).b(b1.d.p(mVar, m.class, new Class[0])).e();
        this.f8125d = e5;
        this.f8128g = new w<>(new r1.b() { // from class: x0.c
            @Override // r1.b
            public final Object get() {
                s1.a z4;
                z4 = e.this.z(context);
                return z4;
            }
        });
        this.f8129h = e5.b(q1.g.class);
        g(new b() { // from class: x0.d
            @Override // x0.e.b
            public final void a(boolean z4) {
                e.this.A(z4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(boolean z4) {
        if (z4) {
            return;
        }
        this.f8129h.get().n();
    }

    private static String B(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z4) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<b> it = this.f8130i.iterator();
        while (it.hasNext()) {
            it.next().a(z4);
        }
    }

    private void D() {
        Iterator<f> it = this.f8131j.iterator();
        while (it.hasNext()) {
            it.next().b(this.f8123b, this.f8124c);
        }
    }

    private void i() {
        r.l(!this.f8127f.get(), "FirebaseApp was deleted");
    }

    private static List<String> l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f8119k) {
            Iterator<e> it = f8121m.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().q());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<e> n(Context context) {
        ArrayList arrayList;
        synchronized (f8119k) {
            arrayList = new ArrayList(f8121m.values());
        }
        return arrayList;
    }

    public static e o() {
        e eVar;
        synchronized (f8119k) {
            eVar = f8121m.get("[DEFAULT]");
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + b0.k.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    public static e p(String str) {
        e eVar;
        String str2;
        synchronized (f8119k) {
            eVar = f8121m.get(B(str));
            if (eVar == null) {
                List<String> l4 = l();
                if (l4.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", l4);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
            eVar.f8129h.get().n();
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!i.g.a(this.f8122a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            C0103e.b(this.f8122a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f8125d.l(y());
        this.f8129h.get().n();
    }

    public static e u(Context context) {
        synchronized (f8119k) {
            if (f8121m.containsKey("[DEFAULT]")) {
                return o();
            }
            m a5 = m.a(context);
            if (a5 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return v(context, a5);
        }
    }

    public static e v(Context context, m mVar) {
        return w(context, mVar, "[DEFAULT]");
    }

    public static e w(Context context, m mVar, String str) {
        e eVar;
        c.c(context);
        String B = B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f8119k) {
            Map<String, e> map = f8121m;
            r.l(!map.containsKey(B), "FirebaseApp name " + B + " already exists!");
            r.j(context, "Application context cannot be null.");
            eVar = new e(context, B, mVar);
            map.put(B, eVar);
        }
        eVar.t();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ s1.a z(Context context) {
        return new s1.a(context, s(), (f1.c) this.f8125d.a(f1.c.class));
    }

    public void E(boolean z4) {
        boolean z5;
        i();
        if (this.f8126e.compareAndSet(!z4, z4)) {
            boolean d5 = com.google.android.gms.common.api.internal.a.b().d();
            if (z4 && d5) {
                z5 = true;
            } else if (z4 || !d5) {
                return;
            } else {
                z5 = false;
            }
            C(z5);
        }
    }

    public void F(Boolean bool) {
        i();
        this.f8128g.get().e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f8123b.equals(((e) obj).q());
        }
        return false;
    }

    public void g(b bVar) {
        i();
        if (this.f8126e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            bVar.a(true);
        }
        this.f8130i.add(bVar);
    }

    public void h(f fVar) {
        i();
        r.i(fVar);
        this.f8131j.add(fVar);
    }

    public int hashCode() {
        return this.f8123b.hashCode();
    }

    public void j() {
        if (this.f8127f.compareAndSet(false, true)) {
            synchronized (f8119k) {
                f8121m.remove(this.f8123b);
            }
            D();
        }
    }

    public <T> T k(Class<T> cls) {
        i();
        return (T) this.f8125d.a(cls);
    }

    public Context m() {
        i();
        return this.f8122a;
    }

    public String q() {
        i();
        return this.f8123b;
    }

    public m r() {
        i();
        return this.f8124c;
    }

    public String s() {
        return b0.c.e(q().getBytes(Charset.defaultCharset())) + "+" + b0.c.e(r().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return p.c(this).a("name", this.f8123b).a("options", this.f8124c).toString();
    }

    public boolean x() {
        i();
        return this.f8128g.get().b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }
}
