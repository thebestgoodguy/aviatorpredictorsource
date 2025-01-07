package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.d;
import g.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class d extends ComponentActivity {

    /* renamed from: n, reason: collision with root package name */
    boolean f298n;

    /* renamed from: o, reason: collision with root package name */
    boolean f299o;

    /* renamed from: q, reason: collision with root package name */
    boolean f301q;

    /* renamed from: r, reason: collision with root package name */
    boolean f302r;

    /* renamed from: s, reason: collision with root package name */
    int f303s;

    /* renamed from: t, reason: collision with root package name */
    e.f<String> f304t;

    /* renamed from: l, reason: collision with root package name */
    final f f296l = f.b(new a());

    /* renamed from: m, reason: collision with root package name */
    final androidx.lifecycle.h f297m = new androidx.lifecycle.h(this);

    /* renamed from: p, reason: collision with root package name */
    boolean f300p = true;

    class a extends h<d> implements androidx.lifecycle.s, androidx.activity.c {
        public a() {
            super(d.this);
        }

        @Override // androidx.lifecycle.g
        public androidx.lifecycle.d b() {
            return d.this.f297m;
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public View c(int r22) {
            return d.this.findViewById(r22);
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public boolean d() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.s
        public androidx.lifecycle.r g() {
            return d.this.g();
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher i() {
            return d.this.i();
        }

        @Override // androidx.fragment.app.h
        public void k(Fragment fragment) {
            d.this.t(fragment);
        }

        @Override // androidx.fragment.app.h
        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.h
        public LayoutInflater n() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.h
        public int o() {
            Window window = d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h
        public boolean p() {
            return d.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.h
        public boolean q(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.h
        public void r(Fragment fragment, Intent intent, int r4, Bundle bundle) {
            d.this.w(fragment, intent, r4, bundle);
        }

        @Override // androidx.fragment.app.h
        public void s() {
            d.this.x();
        }

        @Override // androidx.fragment.app.h
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public d m() {
            return d.this;
        }
    }

    private int n(Fragment fragment) {
        if (this.f304t.k() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.f304t.f(this.f303s) >= 0) {
            this.f303s = (this.f303s + 1) % 65534;
        }
        int r02 = this.f303s;
        this.f304t.h(r02, fragment.f225i);
        this.f303s = (this.f303s + 1) % 65534;
        return r02;
    }

    static void o(int r12) {
        if ((r12 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void r() {
        while (s(q(), d.b.CREATED)) {
        }
    }

    private static boolean s(i iVar, d.b bVar) {
        boolean z4 = false;
        for (Fragment fragment : iVar.f()) {
            if (fragment != null) {
                if (fragment.b().b().d(d.b.STARTED)) {
                    fragment.W.p(bVar);
                    z4 = true;
                }
                if (fragment.x() != null) {
                    z4 |= s(fragment.q(), bVar);
                }
            }
        }
        return z4;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f298n);
        printWriter.print(" mResumed=");
        printWriter.print(this.f299o);
        printWriter.print(" mStopped=");
        printWriter.print(this.f300p);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f296l.u().b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int r4, int r5, Intent intent) {
        this.f296l.v();
        int r02 = r4 >> 16;
        if (r02 == 0) {
            a.InterfaceC0041a d5 = g.a.d();
            if (d5 == null || !d5.a(this, r4, r5, intent)) {
                super.onActivityResult(r4, r5, intent);
                return;
            }
            return;
        }
        int r03 = r02 - 1;
        String d6 = this.f304t.d(r03);
        this.f304t.j(r03);
        if (d6 == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment t4 = this.f296l.t(d6);
        if (t4 != null) {
            t4.W(r4 & 65535, r5, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + d6);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f296l.v();
        this.f296l.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, g.c, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f296l.a(null);
        if (bundle != null) {
            this.f296l.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f303s = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f304t = new e.f<>(intArray.length);
                    for (int r32 = 0; r32 < intArray.length; r32++) {
                        this.f304t.h(intArray[r32], stringArray[r32]);
                    }
                }
            }
        }
        if (this.f304t == null) {
            this.f304t = new e.f<>();
            this.f303s = 0;
        }
        super.onCreate(bundle);
        this.f297m.i(d.a.ON_CREATE);
        this.f296l.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r32, Menu menu) {
        return r32 == 0 ? super.onCreatePanelMenu(r32, menu) | this.f296l.g(menu, getMenuInflater()) : super.onCreatePanelMenu(r32, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View p4 = p(view, str, context, attributeSet);
        return p4 == null ? super.onCreateView(view, str, context, attributeSet) : p4;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View p4 = p(null, str, context, attributeSet);
        return p4 == null ? super.onCreateView(str, context, attributeSet) : p4;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f296l.h();
        this.f297m.i(d.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f296l.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r22, MenuItem menuItem) {
        if (super.onMenuItemSelected(r22, menuItem)) {
            return true;
        }
        if (r22 == 0) {
            return this.f296l.k(menuItem);
        }
        if (r22 != 6) {
            return false;
        }
        return this.f296l.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4) {
        this.f296l.j(z4);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f296l.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r22, Menu menu) {
        if (r22 == 0) {
            this.f296l.l(menu);
        }
        super.onPanelClosed(r22, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f299o = false;
        this.f296l.m();
        this.f297m.i(d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4) {
        this.f296l.n(z4);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r12, View view, Menu menu) {
        return r12 == 0 ? u(view, menu) | this.f296l.o(menu) : super.onPreparePanel(r12, view, menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r5, String[] strArr, int[] r7) {
        this.f296l.v();
        int r02 = (r5 >> 16) & 65535;
        if (r02 != 0) {
            int r03 = r02 - 1;
            String d5 = this.f304t.d(r03);
            this.f304t.j(r03);
            if (d5 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t4 = this.f296l.t(d5);
            if (t4 != null) {
                t4.v0(r5 & 65535, strArr, r7);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + d5);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f299o = true;
        this.f296l.v();
        this.f296l.s();
    }

    @Override // androidx.activity.ComponentActivity, g.c, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        r();
        this.f297m.i(d.a.ON_STOP);
        Parcelable y4 = this.f296l.y();
        if (y4 != null) {
            bundle.putParcelable("android:support:fragments", y4);
        }
        if (this.f304t.k() > 0) {
            bundle.putInt("android:support:next_request_index", this.f303s);
            int[] r02 = new int[this.f304t.k()];
            String[] strArr = new String[this.f304t.k()];
            for (int r22 = 0; r22 < this.f304t.k(); r22++) {
                r02[r22] = this.f304t.g(r22);
                strArr[r22] = this.f304t.l(r22);
            }
            bundle.putIntArray("android:support:request_indicies", r02);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f300p = false;
        if (!this.f298n) {
            this.f298n = true;
            this.f296l.c();
        }
        this.f296l.v();
        this.f296l.s();
        this.f297m.i(d.a.ON_START);
        this.f296l.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f296l.v();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f300p = true;
        r();
        this.f296l.r();
        this.f297m.i(d.a.ON_STOP);
    }

    final View p(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f296l.w(view, str, context, attributeSet);
    }

    public i q() {
        return this.f296l.u();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int r32) {
        if (!this.f302r && r32 != -1) {
            o(r32);
        }
        super.startActivityForResult(intent, r32);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int r32, Bundle bundle) {
        if (!this.f302r && r32 != -1) {
            o(r32);
        }
        super.startActivityForResult(intent, r32, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int r32, Intent intent, int r5, int r6, int r7) {
        if (!this.f301q && r32 != -1) {
            o(r32);
        }
        super.startIntentSenderForResult(intentSender, r32, intent, r5, r6, r7);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int r32, Intent intent, int r5, int r6, int r7, Bundle bundle) {
        if (!this.f301q && r32 != -1) {
            o(r32);
        }
        super.startIntentSenderForResult(intentSender, r32, intent, r5, r6, r7, bundle);
    }

    public void t(Fragment fragment) {
    }

    @Deprecated
    protected boolean u(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void v() {
        this.f297m.i(d.a.ON_RESUME);
        this.f296l.p();
    }

    public void w(Fragment fragment, Intent intent, int r6, Bundle bundle) {
        this.f302r = true;
        try {
            if (r6 == -1) {
                g.a.e(this, intent, -1, bundle);
            } else {
                o(r6);
                g.a.e(this, intent, ((n(fragment) + 1) << 16) + (r6 & 65535), bundle);
            }
        } finally {
            this.f302r = false;
        }
    }

    @Deprecated
    public void x() {
        invalidateOptionsMenu();
    }
}
