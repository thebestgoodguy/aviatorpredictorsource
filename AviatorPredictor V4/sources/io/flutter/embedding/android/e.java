package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import f2.a;
import io.flutter.plugin.platform.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
class e implements io.flutter.embedding.android.c<Activity> {

    /* renamed from: a, reason: collision with root package name */
    private c f4358a;

    /* renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.engine.a f4359b;

    /* renamed from: c, reason: collision with root package name */
    k f4360c;

    /* renamed from: d, reason: collision with root package name */
    private io.flutter.plugin.platform.b f4361d;

    /* renamed from: e, reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f4362e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4363f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4364g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4366i;

    /* renamed from: j, reason: collision with root package name */
    private final p2.b f4367j = new a();

    /* renamed from: h, reason: collision with root package name */
    private boolean f4365h = false;

    class a implements p2.b {
        a() {
        }

        @Override // p2.b
        public void c() {
            e.this.f4358a.c();
            e.this.f4364g = false;
        }

        @Override // p2.b
        public void f() {
            e.this.f4358a.f();
            e.this.f4364g = true;
            e.this.f4365h = true;
        }
    }

    class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f4369e;

        b(k kVar) {
            this.f4369e = kVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (e.this.f4364g && e.this.f4362e != null) {
                this.f4369e.getViewTreeObserver().removeOnPreDrawListener(this);
                e.this.f4362e = null;
            }
            return e.this.f4364g;
        }
    }

    interface c extends b.d {
        w A();

        void B(i iVar);

        void C(io.flutter.embedding.engine.a aVar);

        androidx.lifecycle.d b();

        void c();

        Activity d();

        void e();

        void f();

        String g();

        Context getContext();

        io.flutter.embedding.engine.e h();

        List<String> k();

        boolean l();

        t m();

        boolean n();

        boolean o();

        String p();

        boolean q();

        String r();

        void s(io.flutter.embedding.engine.a aVar);

        v t();

        String u();

        io.flutter.plugin.platform.b v(Activity activity, io.flutter.embedding.engine.a aVar);

        void w(h hVar);

        String x();

        io.flutter.embedding.engine.a y(Context context);

        boolean z();
    }

    e(c cVar) {
        this.f4358a = cVar;
    }

    private void g(k kVar) {
        if (this.f4358a.m() != t.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f4362e != null) {
            kVar.getViewTreeObserver().removeOnPreDrawListener(this.f4362e);
        }
        this.f4362e = new b(kVar);
        kVar.getViewTreeObserver().addOnPreDrawListener(this.f4362e);
    }

    private void h() {
        String str;
        if (this.f4358a.p() == null && !this.f4359b.h().j()) {
            String g5 = this.f4358a.g();
            if (g5 == null && (g5 = n(this.f4358a.d().getIntent())) == null) {
                g5 = "/";
            }
            String u4 = this.f4358a.u();
            if (("Executing Dart entrypoint: " + this.f4358a.r() + ", library uri: " + u4) == null) {
                str = "\"\"";
            } else {
                str = u4 + ", and sending initial route: " + g5;
            }
            e2.b.e("FlutterActivityAndFragmentDelegate", str);
            this.f4359b.l().c(g5);
            String x4 = this.f4358a.x();
            if (x4 == null || x4.isEmpty()) {
                x4 = e2.a.e().c().f();
            }
            this.f4359b.h().h(u4 == null ? new a.b(x4, this.f4358a.r()) : new a.b(x4, u4, this.f4358a.r()), this.f4358a.k());
        }
    }

    private void i() {
        if (this.f4358a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String n(Intent intent) {
        Uri data;
        String path;
        if (!this.f4358a.z() || (data = intent.getData()) == null || (path = data.getPath()) == null || path.isEmpty()) {
            return null;
        }
        if (data.getQuery() != null && !data.getQuery().isEmpty()) {
            path = path + "?" + data.getQuery();
        }
        if (data.getFragment() == null || data.getFragment().isEmpty()) {
            return path;
        }
        return path + "#" + data.getFragment();
    }

    void A(Bundle bundle) {
        e2.b.e("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        i();
        if (this.f4358a.q()) {
            bundle.putByteArray("framework", this.f4359b.q().h());
        }
        if (this.f4358a.l()) {
            Bundle bundle2 = new Bundle();
            this.f4359b.g().e(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    void B() {
        e2.b.e("FlutterActivityAndFragmentDelegate", "onStart()");
        i();
        h();
        this.f4360c.setVisibility(0);
    }

    void C() {
        e2.b.e("FlutterActivityAndFragmentDelegate", "onStop()");
        i();
        if (this.f4358a.o()) {
            this.f4359b.i().c();
        }
        this.f4360c.setVisibility(8);
    }

    void D(int r32) {
        i();
        io.flutter.embedding.engine.a aVar = this.f4359b;
        if (aVar != null) {
            if (this.f4365h && r32 >= 10) {
                aVar.h().k();
                this.f4359b.t().a();
            }
            this.f4359b.p().m(r32);
        }
    }

    void E() {
        i();
        if (this.f4359b == null) {
            e2.b.f("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            e2.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f4359b.g().f();
        }
    }

    void F() {
        this.f4358a = null;
        this.f4359b = null;
        this.f4360c = null;
        this.f4361d = null;
    }

    void G() {
        e2.b.e("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String p4 = this.f4358a.p();
        if (p4 != null) {
            io.flutter.embedding.engine.a a5 = io.flutter.embedding.engine.b.b().a(p4);
            this.f4359b = a5;
            this.f4363f = true;
            if (a5 != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + p4 + "'");
        }
        c cVar = this.f4358a;
        io.flutter.embedding.engine.a y4 = cVar.y(cVar.getContext());
        this.f4359b = y4;
        if (y4 != null) {
            this.f4363f = true;
            return;
        }
        e2.b.e("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.f4359b = new io.flutter.embedding.engine.a(this.f4358a.getContext(), this.f4358a.h().b(), false, this.f4358a.q());
        this.f4363f = false;
    }

    void H() {
        io.flutter.plugin.platform.b bVar = this.f4361d;
        if (bVar != null) {
            bVar.A();
        }
    }

    @Override // io.flutter.embedding.android.c
    public void e() {
        if (!this.f4358a.n()) {
            this.f4358a.e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f4358a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    @Override // io.flutter.embedding.android.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Activity f() {
        Activity d5 = this.f4358a.d();
        if (d5 != null) {
            return d5;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    io.flutter.embedding.engine.a k() {
        return this.f4359b;
    }

    boolean l() {
        return this.f4366i;
    }

    boolean m() {
        return this.f4363f;
    }

    void o(int r4, int r5, Intent intent) {
        i();
        if (this.f4359b == null) {
            e2.b.f("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        e2.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + r4 + "\nresultCode: " + r5 + "\ndata: " + intent);
        this.f4359b.g().a(r4, r5, intent);
    }

    void p(Context context) {
        i();
        if (this.f4359b == null) {
            G();
        }
        if (this.f4358a.l()) {
            e2.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f4359b.g().h(this, this.f4358a.b());
        }
        c cVar = this.f4358a;
        this.f4361d = cVar.v(cVar.d(), this.f4359b);
        this.f4358a.C(this.f4359b);
        this.f4366i = true;
    }

    void q() {
        i();
        if (this.f4359b == null) {
            e2.b.f("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            e2.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f4359b.l().a();
        }
    }

    View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int r8, boolean z4) {
        k kVar;
        e2.b.e("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        i();
        if (this.f4358a.m() == t.surface) {
            h hVar = new h(this.f4358a.getContext(), this.f4358a.A() == w.transparent);
            this.f4358a.w(hVar);
            kVar = new k(this.f4358a.getContext(), hVar);
        } else {
            i iVar = new i(this.f4358a.getContext());
            iVar.setOpaque(this.f4358a.A() == w.opaque);
            this.f4358a.B(iVar);
            kVar = new k(this.f4358a.getContext(), iVar);
        }
        this.f4360c = kVar;
        this.f4360c.l(this.f4367j);
        e2.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f4360c.n(this.f4359b);
        this.f4360c.setId(r8);
        v t4 = this.f4358a.t();
        if (t4 == null) {
            if (z4) {
                g(this.f4360c);
            }
            return this.f4360c;
        }
        e2.b.f("FlutterActivityAndFragmentDelegate", "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
        FlutterSplashView flutterSplashView = new FlutterSplashView(this.f4358a.getContext());
        flutterSplashView.setId(z2.h.d(486947586));
        flutterSplashView.g(this.f4360c, t4);
        return flutterSplashView;
    }

    void s() {
        e2.b.e("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        i();
        if (this.f4362e != null) {
            this.f4360c.getViewTreeObserver().removeOnPreDrawListener(this.f4362e);
            this.f4362e = null;
        }
        this.f4360c.s();
        this.f4360c.z(this.f4367j);
    }

    void t() {
        e2.b.e("FlutterActivityAndFragmentDelegate", "onDetach()");
        i();
        this.f4358a.s(this.f4359b);
        if (this.f4358a.l()) {
            e2.b.e("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f4358a.d().isChangingConfigurations()) {
                this.f4359b.g().j();
            } else {
                this.f4359b.g().i();
            }
        }
        io.flutter.plugin.platform.b bVar = this.f4361d;
        if (bVar != null) {
            bVar.o();
            this.f4361d = null;
        }
        if (this.f4358a.o()) {
            this.f4359b.i().a();
        }
        if (this.f4358a.n()) {
            this.f4359b.e();
            if (this.f4358a.p() != null) {
                io.flutter.embedding.engine.b.b().d(this.f4358a.p());
            }
            this.f4359b = null;
        }
        this.f4366i = false;
    }

    void u(Intent intent) {
        i();
        if (this.f4359b == null) {
            e2.b.f("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        e2.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRoute message.");
        this.f4359b.g().b(intent);
        String n4 = n(intent);
        if (n4 == null || n4.isEmpty()) {
            return;
        }
        this.f4359b.l().b(n4);
    }

    void v() {
        e2.b.e("FlutterActivityAndFragmentDelegate", "onPause()");
        i();
        if (this.f4358a.o()) {
            this.f4359b.i().b();
        }
    }

    void w() {
        e2.b.e("FlutterActivityAndFragmentDelegate", "onPostResume()");
        i();
        if (this.f4359b != null) {
            H();
        } else {
            e2.b.f("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    void x(int r4, String[] strArr, int[] r6) {
        i();
        if (this.f4359b == null) {
            e2.b.f("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        e2.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + r4 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(r6));
        this.f4359b.g().d(r4, strArr, r6);
    }

    void y(Bundle bundle) {
        Bundle bundle2;
        e2.b.e("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        i();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f4358a.q()) {
            this.f4359b.q().j(bArr);
        }
        if (this.f4358a.l()) {
            this.f4359b.g().c(bundle2);
        }
    }

    void z() {
        e2.b.e("FlutterActivityAndFragmentDelegate", "onResume()");
        i();
        if (this.f4358a.o()) {
            this.f4359b.i().d();
        }
    }
}
