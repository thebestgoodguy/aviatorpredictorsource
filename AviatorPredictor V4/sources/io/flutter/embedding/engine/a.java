package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import q2.f;
import q2.g;
import q2.h;
import q2.i;
import q2.l;
import q2.m;
import q2.n;
import q2.o;
import q2.p;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f4489a;

    /* renamed from: b, reason: collision with root package name */
    private final p2.a f4490b;

    /* renamed from: c, reason: collision with root package name */
    private final f2.a f4491c;

    /* renamed from: d, reason: collision with root package name */
    private final c f4492d;

    /* renamed from: e, reason: collision with root package name */
    private final s2.a f4493e;

    /* renamed from: f, reason: collision with root package name */
    private final q2.a f4494f;

    /* renamed from: g, reason: collision with root package name */
    private final q2.b f4495g;

    /* renamed from: h, reason: collision with root package name */
    private final q2.e f4496h;

    /* renamed from: i, reason: collision with root package name */
    private final f f4497i;

    /* renamed from: j, reason: collision with root package name */
    private final g f4498j;

    /* renamed from: k, reason: collision with root package name */
    private final h f4499k;

    /* renamed from: l, reason: collision with root package name */
    private final l f4500l;

    /* renamed from: m, reason: collision with root package name */
    private final i f4501m;

    /* renamed from: n, reason: collision with root package name */
    private final m f4502n;

    /* renamed from: o, reason: collision with root package name */
    private final n f4503o;

    /* renamed from: p, reason: collision with root package name */
    private final o f4504p;

    /* renamed from: q, reason: collision with root package name */
    private final p f4505q;

    /* renamed from: r, reason: collision with root package name */
    private final io.flutter.plugin.platform.n f4506r;

    /* renamed from: s, reason: collision with root package name */
    private final Set<b> f4507s;

    /* renamed from: t, reason: collision with root package name */
    private final b f4508t;

    /* renamed from: io.flutter.embedding.engine.a$a, reason: collision with other inner class name */
    class C0048a implements b {
        C0048a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
            e2.b.e("FlutterEngine", "onPreEngineRestart()");
            Iterator it = a.this.f4507s.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
            a.this.f4506r.Z();
            a.this.f4500l.g();
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context, h2.d dVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.n nVar, String[] strArr, boolean z4, boolean z5) {
        AssetManager assets;
        this.f4507s = new HashSet();
        this.f4508t = new C0048a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        e2.a e5 = e2.a.e();
        flutterJNI = flutterJNI == null ? e5.d().a() : flutterJNI;
        this.f4489a = flutterJNI;
        f2.a aVar = new f2.a(flutterJNI, assets);
        this.f4491c = aVar;
        aVar.l();
        g2.a a5 = e2.a.e().a();
        this.f4494f = new q2.a(aVar, flutterJNI);
        q2.b bVar = new q2.b(aVar);
        this.f4495g = bVar;
        this.f4496h = new q2.e(aVar);
        f fVar = new f(aVar);
        this.f4497i = fVar;
        this.f4498j = new g(aVar);
        this.f4499k = new h(aVar);
        this.f4501m = new i(aVar);
        this.f4500l = new l(aVar, z5);
        this.f4502n = new m(aVar);
        this.f4503o = new n(aVar);
        this.f4504p = new o(aVar);
        this.f4505q = new p(aVar);
        if (a5 != null) {
            a5.a(bVar);
        }
        s2.a aVar2 = new s2.a(context, fVar);
        this.f4493e = aVar2;
        dVar = dVar == null ? e5.c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.i(context.getApplicationContext());
            dVar.e(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f4508t);
        flutterJNI.setPlatformViewsController(nVar);
        flutterJNI.setLocalizationPlugin(aVar2);
        flutterJNI.setDeferredComponentManager(e5.a());
        if (!flutterJNI.isAttached()) {
            d();
        }
        this.f4490b = new p2.a(flutterJNI);
        this.f4506r = nVar;
        nVar.T();
        this.f4492d = new c(context.getApplicationContext(), this, dVar);
        aVar2.d(context.getResources().getConfiguration());
        if (z4 && dVar.d()) {
            o2.a.a(this);
        }
    }

    public a(Context context, String[] strArr, boolean z4, boolean z5) {
        this(context, null, null, new io.flutter.plugin.platform.n(), strArr, z4, z5);
    }

    private void d() {
        e2.b.e("FlutterEngine", "Attaching to JNI.");
        this.f4489a.attachToNative();
        if (!v()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean v() {
        return this.f4489a.isAttached();
    }

    public void e() {
        e2.b.e("FlutterEngine", "Destroying.");
        Iterator<b> it = this.f4507s.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f4492d.l();
        this.f4506r.V();
        this.f4491c.m();
        this.f4489a.removeEngineLifecycleListener(this.f4508t);
        this.f4489a.setDeferredComponentManager(null);
        this.f4489a.detachFromNativeAndReleaseResources();
        if (e2.a.e().a() != null) {
            e2.a.e().a().c();
            this.f4495g.c(null);
        }
    }

    public q2.a f() {
        return this.f4494f;
    }

    public k2.b g() {
        return this.f4492d;
    }

    public f2.a h() {
        return this.f4491c;
    }

    public q2.e i() {
        return this.f4496h;
    }

    public s2.a j() {
        return this.f4493e;
    }

    public g k() {
        return this.f4498j;
    }

    public h l() {
        return this.f4499k;
    }

    public i m() {
        return this.f4501m;
    }

    public io.flutter.plugin.platform.n n() {
        return this.f4506r;
    }

    public j2.b o() {
        return this.f4492d;
    }

    public p2.a p() {
        return this.f4490b;
    }

    public l q() {
        return this.f4500l;
    }

    public m r() {
        return this.f4502n;
    }

    public n s() {
        return this.f4503o;
    }

    public o t() {
        return this.f4504p;
    }

    public p u() {
        return this.f4505q;
    }
}
