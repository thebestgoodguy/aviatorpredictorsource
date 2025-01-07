package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import io.flutter.plugins.firebase.core.l;
import j2.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x0.m;

/* loaded from: classes.dex */
public class i implements j2.a, l.d, l.b {

    /* renamed from: a, reason: collision with root package name */
    private Context f4734a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4735b = false;

    private <T> void A(o0.i<T> iVar, final l.h<T> hVar) {
        iVar.a().c(new o0.d() { // from class: io.flutter.plugins.firebase.core.h
            @Override // o0.d
            public final void a(o0.h hVar2) {
                i.w(l.h.this, hVar2);
            }
        });
    }

    private o0.h<l.g> q(final x0.e eVar) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.d
            @Override // java.lang.Runnable
            public final void run() {
                i.this.t(eVar, iVar);
            }
        });
        return iVar.a();
    }

    private l.f r(x0.m mVar) {
        l.f.a aVar = new l.f.a();
        aVar.b(mVar.b());
        aVar.c(mVar.c());
        if (mVar.f() != null) {
            aVar.e(mVar.f());
        }
        if (mVar.g() != null) {
            aVar.f(mVar.g());
        }
        aVar.d(mVar.d());
        aVar.g(mVar.h());
        aVar.h(mVar.e());
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(String str, o0.i iVar) {
        try {
            try {
                x0.e.p(str).j();
            } catch (IllegalStateException unused) {
            }
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(x0.e eVar, o0.i iVar) {
        try {
            l.g.a aVar = new l.g.a();
            aVar.c(eVar.q());
            aVar.d(r(eVar.r()));
            aVar.b(Boolean.valueOf(eVar.x()));
            aVar.e((Map) o0.k.a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(eVar)));
            iVar.c(aVar.a());
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(l.f fVar, String str, o0.i iVar) {
        try {
            x0.m a5 = new m.b().b(fVar.b()).c(fVar.c()).d(fVar.d()).f(fVar.e()).g(fVar.f()).h(fVar.g()).e(fVar.h()).a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            iVar.c((l.g) o0.k.a(q(x0.e.w(this.f4734a, a5, str))));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(o0.i iVar) {
        try {
            if (this.f4735b) {
                o0.k.a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.f4735b = true;
            }
            List<x0.e> n4 = x0.e.n(this.f4734a);
            ArrayList arrayList = new ArrayList(n4.size());
            Iterator<x0.e> it = n4.iterator();
            while (it.hasNext()) {
                arrayList.add((l.g) o0.k.a(q(it.next())));
            }
            iVar.c(arrayList);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(l.h hVar, o0.h hVar2) {
        if (hVar2.p()) {
            hVar.a(hVar2.m());
        } else {
            hVar.b(hVar2.l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(o0.i iVar) {
        try {
            x0.m a5 = x0.m.a(this.f4734a);
            if (a5 == null) {
                iVar.c(null);
            } else {
                iVar.c(r(a5));
            }
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(String str, Boolean bool, o0.i iVar) {
        try {
            x0.e.p(str).F(bool);
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(String str, Boolean bool, o0.i iVar) {
        try {
            x0.e.p(str).E(bool.booleanValue());
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    @Override // io.flutter.plugins.firebase.core.l.b
    public void a(final String str, final Boolean bool, l.h<Void> hVar) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.e
            @Override // java.lang.Runnable
            public final void run() {
                i.y(str, bool, iVar);
            }
        });
        A(iVar, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.d
    public void b(final String str, final l.f fVar, l.h<l.g> hVar) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.a
            @Override // java.lang.Runnable
            public final void run() {
                i.this.u(fVar, str, iVar);
            }
        });
        A(iVar, hVar);
    }

    @Override // j2.a
    public void c(a.b bVar) {
        t.h(bVar.b(), this);
        p.h(bVar.b(), this);
        this.f4734a = bVar.a();
    }

    @Override // j2.a
    public void d(a.b bVar) {
        this.f4734a = null;
        t.h(bVar.b(), null);
        p.h(bVar.b(), null);
    }

    @Override // io.flutter.plugins.firebase.core.l.d
    public void e(l.h<List<l.g>> hVar) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.b
            @Override // java.lang.Runnable
            public final void run() {
                i.this.v(iVar);
            }
        });
        A(iVar, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.d
    public void f(l.h<l.f> hVar) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.c
            @Override // java.lang.Runnable
            public final void run() {
                i.this.x(iVar);
            }
        });
        A(iVar, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.b
    public void g(final String str, final Boolean bool, l.h<Void> hVar) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.f
            @Override // java.lang.Runnable
            public final void run() {
                i.z(str, bool, iVar);
            }
        });
        A(iVar, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.b
    public void h(final String str, l.h<Void> hVar) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.g
            @Override // java.lang.Runnable
            public final void run() {
                i.s(str, iVar);
            }
        });
        A(iVar, hVar);
    }
}
