package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    private final View f5970e;

    /* renamed from: f, reason: collision with root package name */
    private ViewTreeObserver f5971f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f5972g;

    private d(View view, Runnable runnable) {
        this.f5970e = view;
        this.f5971f = view.getViewTreeObserver();
        this.f5972g = runnable;
    }

    public static d a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        d dVar = new d(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(dVar);
        view.addOnAttachStateChangeListener(dVar);
        return dVar;
    }

    public void b() {
        (this.f5971f.isAlive() ? this.f5971f : this.f5970e.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f5970e.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f5972g.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f5971f = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
