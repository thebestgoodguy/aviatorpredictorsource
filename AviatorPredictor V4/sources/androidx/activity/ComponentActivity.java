package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
public class ComponentActivity extends g.c implements s, androidx.savedstate.b, c {

    /* renamed from: i, reason: collision with root package name */
    private r f175i;

    /* renamed from: k, reason: collision with root package name */
    private int f177k;

    /* renamed from: g, reason: collision with root package name */
    private final h f173g = new h(this);

    /* renamed from: h, reason: collision with root package name */
    private final androidx.savedstate.a f174h = androidx.savedstate.a.a(this);

    /* renamed from: j, reason: collision with root package name */
    private final OnBackPressedDispatcher f176j = new OnBackPressedDispatcher(new a());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        Object f181a;

        /* renamed from: b, reason: collision with root package name */
        r f182b;

        b() {
        }
    }

    public ComponentActivity() {
        if (b() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 19) {
            b().a(new e() { // from class: androidx.activity.ComponentActivity.2
                @Override // androidx.lifecycle.e
                public void d(g gVar, d.a aVar) {
                    if (aVar == d.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        b().a(new e() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.e
            public void d(g gVar, d.a aVar) {
                if (aVar != d.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.g().a();
            }
        });
        if (19 > r02 || r02 > 23) {
            return;
        }
        b().a(new ImmLeaksCleaner(this));
    }

    @Override // g.c, androidx.lifecycle.g
    public d b() {
        return this.f173g;
    }

    @Override // androidx.lifecycle.s
    public r g() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f175i == null) {
            b bVar = (b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.f175i = bVar.f182b;
            }
            if (this.f175i == null) {
                this.f175i = new r();
            }
        }
        return this.f175i;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher i() {
        return this.f176j;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry j() {
        return this.f174h.b();
    }

    @Deprecated
    public Object m() {
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f176j.c();
    }

    @Override // g.c, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f174h.c(bundle);
        o.f(this);
        int r22 = this.f177k;
        if (r22 != 0) {
            setContentView(r22);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object m4 = m();
        r rVar = this.f175i;
        if (rVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            rVar = bVar.f182b;
        }
        if (rVar == null && m4 == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f181a = m4;
        bVar2.f182b = rVar;
        return bVar2;
    }

    @Override // g.c, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        d b5 = b();
        if (b5 instanceof h) {
            ((h) b5).p(d.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f174h.d(bundle);
    }
}
