package u;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import t.a;
import w.c;

/* loaded from: classes.dex */
public final class g implements a.f, ServiceConnection {

    /* renamed from: l, reason: collision with root package name */
    private static final String f7611l = g.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    private final String f7612a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7613b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f7614c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f7615d;

    /* renamed from: e, reason: collision with root package name */
    private final c f7616e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f7617f;

    /* renamed from: g, reason: collision with root package name */
    private final h f7618g;

    /* renamed from: h, reason: collision with root package name */
    private IBinder f7619h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7620i;

    /* renamed from: j, reason: collision with root package name */
    private String f7621j;

    /* renamed from: k, reason: collision with root package name */
    private String f7622k;

    private final void s() {
        if (Thread.currentThread() != this.f7617f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void t(String str) {
        String.valueOf(this.f7619h);
    }

    @Override // t.a.f
    public final void a(c.e eVar) {
    }

    @Override // t.a.f
    public final boolean b() {
        s();
        return this.f7620i;
    }

    @Override // t.a.f
    public final s.c[] c() {
        return new s.c[0];
    }

    @Override // t.a.f
    public final boolean d() {
        s();
        return this.f7619h != null;
    }

    @Override // t.a.f
    public final String e() {
        String str = this.f7612a;
        if (str != null) {
            return str;
        }
        w.r.i(this.f7614c);
        return this.f7614c.getPackageName();
    }

    @Override // t.a.f
    public final void f(w.j jVar, Set<Scope> set) {
    }

    @Override // t.a.f
    public final void g(c.InterfaceC0100c interfaceC0100c) {
        s();
        t("Connect started.");
        if (d()) {
            try {
                l("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f7614c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f7612a).setAction(this.f7613b);
            }
            boolean bindService = this.f7615d.bindService(intent, this, w.h.a());
            this.f7620i = bindService;
            if (!bindService) {
                this.f7619h = null;
                this.f7618g.a(new s.a(16));
            }
            t("Finished connect.");
        } catch (SecurityException e5) {
            this.f7620i = false;
            this.f7619h = null;
            throw e5;
        }
    }

    @Override // t.a.f
    public final String h() {
        return this.f7621j;
    }

    @Override // t.a.f
    public final Set<Scope> i() {
        return Collections.emptySet();
    }

    @Override // t.a.f
    public final void k() {
        s();
        t("Disconnect called.");
        try {
            this.f7615d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f7620i = false;
        this.f7619h = null;
    }

    @Override // t.a.f
    public final void l(String str) {
        s();
        this.f7621j = str;
        k();
    }

    @Override // t.a.f
    public final boolean m() {
        return false;
    }

    final /* synthetic */ void n() {
        this.f7620i = false;
        this.f7619h = null;
        t("Disconnected.");
        this.f7616e.f(1);
    }

    @Override // t.a.f
    public final boolean o() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f7617f.post(new Runnable() { // from class: u.u
            @Override // java.lang.Runnable
            public final void run() {
                g.this.q(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f7617f.post(new Runnable() { // from class: u.t
            @Override // java.lang.Runnable
            public final void run() {
                g.this.n();
            }
        });
    }

    @Override // t.a.f
    public final int p() {
        return 0;
    }

    final /* synthetic */ void q(IBinder iBinder) {
        this.f7620i = false;
        this.f7619h = iBinder;
        t("Connected.");
        this.f7616e.h(new Bundle());
    }

    public final void r(String str) {
        this.f7622k = str;
    }
}
