package g;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.d;
import androidx.lifecycle.o;
import k.a;

/* loaded from: classes.dex */
public class c extends Activity implements androidx.lifecycle.g, a.InterfaceC0062a {

    /* renamed from: e, reason: collision with root package name */
    private e.e<Class<Object>, Object> f3798e = new e.e<>();

    /* renamed from: f, reason: collision with root package name */
    private androidx.lifecycle.h f3799f = new androidx.lifecycle.h(this);

    public androidx.lifecycle.d b() {
        return this.f3799f;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !k.a.d(decorView, keyEvent)) {
            return k.a.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !k.a.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // k.a.InterfaceC0062a
    public boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o.f(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f3799f.k(d.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
