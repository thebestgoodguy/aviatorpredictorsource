package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.d;
import io.flutter.embedding.android.e;
import java.util.List;

/* loaded from: classes.dex */
public class d extends Activity implements e.c, androidx.lifecycle.g {

    /* renamed from: g, reason: collision with root package name */
    public static final int f4355g = z2.h.d(61938);

    /* renamed from: e, reason: collision with root package name */
    protected e f4356e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.lifecycle.h f4357f = new androidx.lifecycle.h(this);

    private void D() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    private void E() {
        if (G() == f.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View F() {
        return this.f4356e.r(null, null, null, f4355g, m() == t.surface);
    }

    private Drawable J() {
        try {
            Bundle I = I();
            int r12 = I != null ? I.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (r12 != 0) {
                return h.a.a(getResources(), r12, getTheme());
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (Resources.NotFoundException e5) {
            e2.b.b("FlutterActivity", "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e5;
        }
    }

    private boolean K() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private void L() {
        e eVar = this.f4356e;
        if (eVar != null) {
            eVar.F();
            this.f4356e = null;
        }
    }

    private boolean M(String str) {
        StringBuilder sb;
        String str2;
        e eVar = this.f4356e;
        if (eVar == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else {
            if (eVar.l()) {
                return true;
            }
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        e2.b.f("FlutterActivity", sb.toString());
        return false;
    }

    private void N() {
        try {
            Bundle I = I();
            if (I != null) {
                int r12 = I.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (r12 != -1) {
                    setTheme(r12);
                }
            } else {
                e2.b.e("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            e2.b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public w A() {
        return G() == f.opaque ? w.opaque : w.transparent;
    }

    @Override // io.flutter.embedding.android.e.c
    public void B(i iVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public void C(io.flutter.embedding.engine.a aVar) {
        if (this.f4356e.m()) {
            return;
        }
        o2.a.a(aVar);
    }

    protected f G() {
        return getIntent().hasExtra("background_mode") ? f.valueOf(getIntent().getStringExtra("background_mode")) : f.opaque;
    }

    protected io.flutter.embedding.engine.a H() {
        return this.f4356e.k();
    }

    protected Bundle I() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @Override // io.flutter.plugin.platform.b.d
    public boolean a() {
        return false;
    }

    @Override // io.flutter.embedding.android.e.c, androidx.lifecycle.g
    public androidx.lifecycle.d b() {
        return this.f4357f;
    }

    @Override // io.flutter.embedding.android.e.c
    public void c() {
    }

    @Override // io.flutter.embedding.android.e.c
    public Activity d() {
        return this;
    }

    @Override // io.flutter.embedding.android.e.c
    public void e() {
        e2.b.f("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + H() + " evicted by another attaching activity");
        e eVar = this.f4356e;
        if (eVar != null) {
            eVar.s();
            this.f4356e.t();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle I = I();
            if (I != null) {
                return I.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public Context getContext() {
        return this;
    }

    @Override // io.flutter.embedding.android.e.c
    public io.flutter.embedding.engine.e h() {
        return io.flutter.embedding.engine.e.a(getIntent());
    }

    @Override // io.flutter.embedding.android.e.c
    public List<String> k() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean l() {
        return true;
    }

    @Override // io.flutter.embedding.android.e.c
    public t m() {
        return G() == f.opaque ? t.surface : t.texture;
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean n() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (p() != null || this.f4356e.m()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean o() {
        return true;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int r22, int r32, Intent intent) {
        if (M("onActivityResult")) {
            this.f4356e.o(r22, r32, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (M("onBackPressed")) {
            this.f4356e.q();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        N();
        super.onCreate(bundle);
        e eVar = new e(this);
        this.f4356e = eVar;
        eVar.p(this);
        this.f4356e.y(bundle);
        this.f4357f.i(d.a.ON_CREATE);
        E();
        setContentView(F());
        D();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (M("onDestroy")) {
            this.f4356e.s();
            this.f4356e.t();
        }
        L();
        this.f4357f.i(d.a.ON_DESTROY);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (M("onNewIntent")) {
            this.f4356e.u(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (M("onPause")) {
            this.f4356e.v();
        }
        this.f4357f.i(d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (M("onPostResume")) {
            this.f4356e.w();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r22, String[] strArr, int[] r4) {
        if (M("onRequestPermissionsResult")) {
            this.f4356e.x(r22, strArr, r4);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f4357f.i(d.a.ON_RESUME);
        if (M("onResume")) {
            this.f4356e.z();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (M("onSaveInstanceState")) {
            this.f4356e.A(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f4357f.i(d.a.ON_START);
        if (M("onStart")) {
            this.f4356e.B();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (M("onStop")) {
            this.f4356e.C();
        }
        this.f4357f.i(d.a.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int r22) {
        super.onTrimMemory(r22);
        if (M("onTrimMemory")) {
            this.f4356e.D(r22);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (M("onUserLeaveHint")) {
            this.f4356e.E();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public String p() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean q() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : p() == null;
    }

    @Override // io.flutter.embedding.android.e.c
    public String r() {
        try {
            Bundle I = I();
            String string = I != null ? I.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public void s(io.flutter.embedding.engine.a aVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public v t() {
        Drawable J = J();
        if (J != null) {
            return new b(J);
        }
        return null;
    }

    @Override // io.flutter.embedding.android.e.c
    public String u() {
        try {
            Bundle I = I();
            if (I != null) {
                return I.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public io.flutter.plugin.platform.b v(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new io.flutter.plugin.platform.b(d(), aVar.m(), this);
    }

    @Override // io.flutter.embedding.android.e.c
    public void w(h hVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public String x() {
        String dataString;
        if (K() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // io.flutter.embedding.android.e.c
    public io.flutter.embedding.engine.a y(Context context) {
        return null;
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean z() {
        try {
            Bundle I = I();
            if (I != null) {
                return I.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
