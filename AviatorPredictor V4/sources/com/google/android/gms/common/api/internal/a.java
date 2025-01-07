package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: i, reason: collision with root package name */
    private static final a f1232i = new a();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f1233e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f1234f = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<InterfaceC0021a> f1235g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f1236h = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0021a {
        void a(boolean z4);
    }

    private a() {
    }

    public static a b() {
        return f1232i;
    }

    public static void c(Application application) {
        a aVar = f1232i;
        synchronized (aVar) {
            if (!aVar.f1236h) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f1236h = true;
            }
        }
    }

    private final void f(boolean z4) {
        synchronized (f1232i) {
            Iterator<InterfaceC0021a> it = this.f1235g.iterator();
            while (it.hasNext()) {
                it.next().a(z4);
            }
        }
    }

    public void a(InterfaceC0021a interfaceC0021a) {
        synchronized (f1232i) {
            this.f1235g.add(interfaceC0021a);
        }
    }

    public boolean d() {
        return this.f1233e.get();
    }

    public boolean e(boolean z4) {
        if (!this.f1234f.get()) {
            if (!b0.j.b()) {
                return z4;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f1234f.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f1233e.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f1233e.compareAndSet(true, false);
        this.f1234f.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f1233e.compareAndSet(true, false);
        this.f1234f.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r32) {
        if (r32 == 20 && this.f1233e.compareAndSet(false, true)) {
            this.f1234f.set(true);
            f(true);
        }
    }
}
