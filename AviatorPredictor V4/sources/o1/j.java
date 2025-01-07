package o1;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o1.k;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6809a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f6810b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f6811c;

    /* renamed from: d, reason: collision with root package name */
    private final List<p1.n<k.a>> f6812d = new ArrayList();

    class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f6813e;

        a(AtomicBoolean atomicBoolean) {
            this.f6813e = atomicBoolean;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f6813e.compareAndSet(true, false)) {
                j.this.l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (this.f6813e.compareAndSet(true, false)) {
                j.this.l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f6813e.compareAndSet(true, false)) {
                j.this.l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    class b implements ComponentCallbacks2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f6815e;

        b(AtomicBoolean atomicBoolean) {
            this.f6815e = atomicBoolean;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int r22) {
            if (r22 == 20) {
                this.f6815e.set(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c extends ConnectivityManager.NetworkCallback {
        private c() {
        }

        /* synthetic */ c(j jVar, a aVar) {
            this();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            j.this.k(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            j.this.k(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class d extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6818a;

        private d() {
            this.f6818a = false;
        }

        /* synthetic */ d(j jVar, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z4;
            boolean h5 = j.this.h();
            if (!j.this.h() || this.f6818a) {
                if (!h5 && this.f6818a) {
                    jVar = j.this;
                    z4 = false;
                }
                this.f6818a = h5;
            }
            jVar = j.this;
            z4 = true;
            jVar.k(z4);
            this.f6818a = h5;
        }
    }

    public j(Context context) {
        p1.b.d(context != null, "Context must be non-null", new Object[0]);
        this.f6809a = context;
        this.f6810b = (ConnectivityManager) context.getSystemService("connectivity");
        f();
        g();
    }

    private void f() {
        Application application = (Application) this.f6809a.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new a(atomicBoolean));
        application.registerComponentCallbacks(new b(atomicBoolean));
    }

    private void g() {
        Runnable runnable;
        a aVar = null;
        if (Build.VERSION.SDK_INT < 24 || this.f6810b == null) {
            final d dVar = new d(this, aVar);
            this.f6809a.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            runnable = new Runnable() { // from class: o1.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.j(dVar);
                }
            };
        } else {
            final c cVar = new c(this, aVar);
            this.f6810b.registerDefaultNetworkCallback(cVar);
            runnable = new Runnable() { // from class: o1.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.i(cVar);
                }
            };
        }
        this.f6811c = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f6809a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(c cVar) {
        this.f6810b.unregisterNetworkCallback(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(d dVar) {
        this.f6809a.unregisterReceiver(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(boolean z4) {
        synchronized (this.f6812d) {
            Iterator<p1.n<k.a>> it = this.f6812d.iterator();
            while (it.hasNext()) {
                it.next().accept(z4 ? k.a.REACHABLE : k.a.UNREACHABLE);
            }
        }
    }

    @Override // o1.k
    public void a(p1.n<k.a> nVar) {
        synchronized (this.f6812d) {
            this.f6812d.add(nVar);
        }
    }

    public void l() {
        p1.v.a("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (h()) {
            k(true);
        }
    }

    @Override // o1.k
    public void shutdown() {
        Runnable runnable = this.f6811c;
        if (runnable != null) {
            runnable.run();
            this.f6811c = null;
        }
    }
}
