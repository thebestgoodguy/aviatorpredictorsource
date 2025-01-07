package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final h<?> f306a;

    private f(h<?> hVar) {
        this.f306a = hVar;
    }

    public static f b(h<?> hVar) {
        return new f((h) j.d.b(hVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.f306a;
        hVar.f312i.p(hVar, hVar, fragment);
    }

    public void c() {
        this.f306a.f312i.y();
    }

    public void d(Configuration configuration) {
        this.f306a.f312i.z(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f306a.f312i.A(menuItem);
    }

    public void f() {
        this.f306a.f312i.B();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f306a.f312i.C(menu, menuInflater);
    }

    public void h() {
        this.f306a.f312i.D();
    }

    public void i() {
        this.f306a.f312i.F();
    }

    public void j(boolean z4) {
        this.f306a.f312i.G(z4);
    }

    public boolean k(MenuItem menuItem) {
        return this.f306a.f312i.V(menuItem);
    }

    public void l(Menu menu) {
        this.f306a.f312i.W(menu);
    }

    public void m() {
        this.f306a.f312i.Y();
    }

    public void n(boolean z4) {
        this.f306a.f312i.Z(z4);
    }

    public boolean o(Menu menu) {
        return this.f306a.f312i.a0(menu);
    }

    public void p() {
        this.f306a.f312i.c0();
    }

    public void q() {
        this.f306a.f312i.d0();
    }

    public void r() {
        this.f306a.f312i.f0();
    }

    public boolean s() {
        return this.f306a.f312i.l0();
    }

    public Fragment t(String str) {
        return this.f306a.f312i.q0(str);
    }

    public i u() {
        return this.f306a.f312i;
    }

    public void v() {
        this.f306a.f312i.S0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f306a.f312i.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        h<?> hVar = this.f306a;
        if (!(hVar instanceof androidx.lifecycle.s)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        hVar.f312i.c1(parcelable);
    }

    public Parcelable y() {
        return this.f306a.f312i.e1();
    }
}
