package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import j2.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k2.c;
import r2.l;
import r2.m;
import r2.n;
import r2.o;

/* loaded from: classes.dex */
class c implements j2.b, k2.b {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.a f4513b;

    /* renamed from: c, reason: collision with root package name */
    private final a.b f4514c;

    /* renamed from: e, reason: collision with root package name */
    private io.flutter.embedding.android.c<Activity> f4516e;

    /* renamed from: f, reason: collision with root package name */
    private C0049c f4517f;

    /* renamed from: i, reason: collision with root package name */
    private Service f4520i;

    /* renamed from: j, reason: collision with root package name */
    private f f4521j;

    /* renamed from: l, reason: collision with root package name */
    private BroadcastReceiver f4523l;

    /* renamed from: m, reason: collision with root package name */
    private d f4524m;

    /* renamed from: o, reason: collision with root package name */
    private ContentProvider f4526o;

    /* renamed from: p, reason: collision with root package name */
    private e f4527p;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends j2.a>, j2.a> f4512a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<? extends j2.a>, k2.a> f4515d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private boolean f4518g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<? extends j2.a>, n2.a> f4519h = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final Map<Class<? extends j2.a>, l2.a> f4522k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private final Map<Class<? extends j2.a>, m2.a> f4525n = new HashMap();

    private static class b implements a.InterfaceC0061a {

        /* renamed from: a, reason: collision with root package name */
        final h2.d f4528a;

        private b(h2.d dVar) {
            this.f4528a = dVar;
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$c, reason: collision with other inner class name */
    private static class C0049c implements k2.c {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f4529a;

        /* renamed from: b, reason: collision with root package name */
        private final HiddenLifecycleReference f4530b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<n> f4531c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        private final Set<l> f4532d = new HashSet();

        /* renamed from: e, reason: collision with root package name */
        private final Set<m> f4533e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private final Set<o> f4534f = new HashSet();

        /* renamed from: g, reason: collision with root package name */
        private final Set<c.a> f4535g = new HashSet();

        public C0049c(Activity activity, androidx.lifecycle.d dVar) {
            this.f4529a = activity;
            this.f4530b = new HiddenLifecycleReference(dVar);
        }

        boolean a(int r5, int r6, Intent intent) {
            boolean z4;
            Iterator it = new HashSet(this.f4532d).iterator();
            while (true) {
                while (it.hasNext()) {
                    z4 = ((l) it.next()).a(r5, r6, intent) || z4;
                }
                return z4;
            }
        }

        void b(Intent intent) {
            Iterator<m> it = this.f4533e.iterator();
            while (it.hasNext()) {
                it.next().b(intent);
            }
        }

        boolean c(int r5, String[] strArr, int[] r7) {
            boolean z4;
            Iterator<n> it = this.f4531c.iterator();
            while (true) {
                while (it.hasNext()) {
                    z4 = it.next().d(r5, strArr, r7) || z4;
                }
                return z4;
            }
        }

        @Override // k2.c
        public Activity d() {
            return this.f4529a;
        }

        void e(Bundle bundle) {
            Iterator<c.a> it = this.f4535g.iterator();
            while (it.hasNext()) {
                it.next().c(bundle);
            }
        }

        void f(Bundle bundle) {
            Iterator<c.a> it = this.f4535g.iterator();
            while (it.hasNext()) {
                it.next().e(bundle);
            }
        }

        void g() {
            Iterator<o> it = this.f4534f.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
        }
    }

    private static class d implements l2.b {
    }

    private static class e implements m2.b {
    }

    private static class f implements n2.b {
    }

    c(Context context, io.flutter.embedding.engine.a aVar, h2.d dVar) {
        this.f4513b = aVar;
        this.f4514c = new a.b(context, aVar, aVar.h(), aVar.p(), aVar.n().N(), new b(dVar));
    }

    private void k(Activity activity, androidx.lifecycle.d dVar) {
        this.f4517f = new C0049c(activity, dVar);
        this.f4513b.n().f0(activity.getIntent().getBooleanExtra("enable-software-rendering", false));
        this.f4513b.n().z(activity, this.f4513b.p(), this.f4513b.h());
        for (k2.a aVar : this.f4515d.values()) {
            if (this.f4518g) {
                aVar.g(this.f4517f);
            } else {
                aVar.i(this.f4517f);
            }
        }
        this.f4518g = false;
    }

    private void m() {
        this.f4513b.n().H();
        this.f4516e = null;
        this.f4517f = null;
    }

    private void n() {
        if (s()) {
            i();
            return;
        }
        if (v()) {
            q();
        } else if (t()) {
            o();
        } else if (u()) {
            p();
        }
    }

    private boolean s() {
        return this.f4516e != null;
    }

    private boolean t() {
        return this.f4523l != null;
    }

    private boolean u() {
        return this.f4526o != null;
    }

    private boolean v() {
        return this.f4520i != null;
    }

    @Override // k2.b
    public boolean a(int r22, int r32, Intent intent) {
        if (!s()) {
            e2.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        z2.e.a("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            return this.f4517f.a(r22, r32, intent);
        } finally {
            z2.e.b();
        }
    }

    @Override // k2.b
    public void b(Intent intent) {
        if (!s()) {
            e2.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        z2.e.a("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f4517f.b(intent);
        } finally {
            z2.e.b();
        }
    }

    @Override // k2.b
    public void c(Bundle bundle) {
        if (!s()) {
            e2.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        z2.e.a("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f4517f.e(bundle);
        } finally {
            z2.e.b();
        }
    }

    @Override // k2.b
    public boolean d(int r22, String[] strArr, int[] r4) {
        if (!s()) {
            e2.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        z2.e.a("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            return this.f4517f.c(r22, strArr, r4);
        } finally {
            z2.e.b();
        }
    }

    @Override // k2.b
    public void e(Bundle bundle) {
        if (!s()) {
            e2.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        z2.e.a("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f4517f.f(bundle);
        } finally {
            z2.e.b();
        }
    }

    @Override // k2.b
    public void f() {
        if (!s()) {
            e2.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        z2.e.a("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f4517f.g();
        } finally {
            z2.e.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j2.b
    public void g(j2.a aVar) {
        z2.e.a("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (r(aVar.getClass())) {
                e2.b.f("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f4513b + ").");
                return;
            }
            e2.b.e("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f4512a.put(aVar.getClass(), aVar);
            aVar.c(this.f4514c);
            if (aVar instanceof k2.a) {
                k2.a aVar2 = (k2.a) aVar;
                this.f4515d.put(aVar.getClass(), aVar2);
                if (s()) {
                    aVar2.i(this.f4517f);
                }
            }
            if (aVar instanceof n2.a) {
                n2.a aVar3 = (n2.a) aVar;
                this.f4519h.put(aVar.getClass(), aVar3);
                if (v()) {
                    aVar3.b(this.f4521j);
                }
            }
            if (aVar instanceof l2.a) {
                l2.a aVar4 = (l2.a) aVar;
                this.f4522k.put(aVar.getClass(), aVar4);
                if (t()) {
                    aVar4.a(this.f4524m);
                }
            }
            if (aVar instanceof m2.a) {
                m2.a aVar5 = (m2.a) aVar;
                this.f4525n.put(aVar.getClass(), aVar5);
                if (u()) {
                    aVar5.b(this.f4527p);
                }
            }
        } finally {
            z2.e.b();
        }
    }

    @Override // k2.b
    public void h(io.flutter.embedding.android.c<Activity> cVar, androidx.lifecycle.d dVar) {
        z2.e.a("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.flutter.embedding.android.c<Activity> cVar2 = this.f4516e;
            if (cVar2 != null) {
                cVar2.e();
            }
            n();
            this.f4516e = cVar;
            k(cVar.f(), dVar);
        } finally {
            z2.e.b();
        }
    }

    @Override // k2.b
    public void i() {
        if (!s()) {
            e2.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        z2.e.a("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator<k2.a> it = this.f4515d.values().iterator();
            while (it.hasNext()) {
                it.next().f();
            }
            m();
        } finally {
            z2.e.b();
        }
    }

    @Override // k2.b
    public void j() {
        if (!s()) {
            e2.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        z2.e.a("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f4518g = true;
            Iterator<k2.a> it = this.f4515d.values().iterator();
            while (it.hasNext()) {
                it.next().k();
            }
            m();
        } finally {
            z2.e.b();
        }
    }

    public void l() {
        e2.b.e("FlutterEngineCxnRegstry", "Destroying.");
        n();
        y();
    }

    public void o() {
        if (!t()) {
            e2.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        z2.e.a("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator<l2.a> it = this.f4522k.values().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        } finally {
            z2.e.b();
        }
    }

    public void p() {
        if (!u()) {
            e2.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        z2.e.a("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator<m2.a> it = this.f4525n.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        } finally {
            z2.e.b();
        }
    }

    public void q() {
        if (!v()) {
            e2.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        z2.e.a("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator<n2.a> it = this.f4519h.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f4520i = null;
        } finally {
            z2.e.b();
        }
    }

    public boolean r(Class<? extends j2.a> cls) {
        return this.f4512a.containsKey(cls);
    }

    public void w(Class<? extends j2.a> cls) {
        j2.a aVar = this.f4512a.get(cls);
        if (aVar == null) {
            return;
        }
        z2.e.a("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (aVar instanceof k2.a) {
                if (s()) {
                    ((k2.a) aVar).f();
                }
                this.f4515d.remove(cls);
            }
            if (aVar instanceof n2.a) {
                if (v()) {
                    ((n2.a) aVar).a();
                }
                this.f4519h.remove(cls);
            }
            if (aVar instanceof l2.a) {
                if (t()) {
                    ((l2.a) aVar).b();
                }
                this.f4522k.remove(cls);
            }
            if (aVar instanceof m2.a) {
                if (u()) {
                    ((m2.a) aVar).a();
                }
                this.f4525n.remove(cls);
            }
            aVar.d(this.f4514c);
            this.f4512a.remove(cls);
        } finally {
            z2.e.b();
        }
    }

    public void x(Set<Class<? extends j2.a>> set) {
        Iterator<Class<? extends j2.a>> it = set.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    public void y() {
        x(new HashSet(this.f4512a.keySet()));
        this.f4512a.clear();
    }
}
