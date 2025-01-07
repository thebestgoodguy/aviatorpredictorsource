package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class h<E> extends e {

    /* renamed from: e, reason: collision with root package name */
    private final Activity f308e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f309f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f310g;

    /* renamed from: h, reason: collision with root package name */
    private final int f311h;

    /* renamed from: i, reason: collision with root package name */
    final j f312i;

    h(Activity activity, Context context, Handler handler, int r5) {
        this.f312i = new j();
        this.f308e = activity;
        this.f309f = (Context) j.d.b(context, "context == null");
        this.f310g = (Handler) j.d.b(handler, "handler == null");
        this.f311h = r5;
    }

    h(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.e
    public View c(int r12) {
        return null;
    }

    @Override // androidx.fragment.app.e
    public boolean d() {
        return true;
    }

    Activity e() {
        return this.f308e;
    }

    Context f() {
        return this.f309f;
    }

    Handler h() {
        return this.f310g;
    }

    void k(Fragment fragment) {
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.f309f);
    }

    public int o() {
        return this.f311h;
    }

    public boolean p() {
        return true;
    }

    public boolean q(Fragment fragment) {
        return true;
    }

    public void r(Fragment fragment, Intent intent, int r32, Bundle bundle) {
        if (r32 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f309f.startActivity(intent);
    }

    public void s() {
    }
}
