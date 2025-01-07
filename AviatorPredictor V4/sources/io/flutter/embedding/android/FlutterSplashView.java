package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.android.k;

/* loaded from: classes.dex */
final class FlutterSplashView extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    private static String f4331n = "FlutterSplashView";

    /* renamed from: e, reason: collision with root package name */
    private v f4332e;

    /* renamed from: f, reason: collision with root package name */
    private k f4333f;

    /* renamed from: g, reason: collision with root package name */
    private View f4334g;

    /* renamed from: h, reason: collision with root package name */
    Bundle f4335h;

    /* renamed from: i, reason: collision with root package name */
    private String f4336i;

    /* renamed from: j, reason: collision with root package name */
    private String f4337j;

    /* renamed from: k, reason: collision with root package name */
    private final k.f f4338k;

    /* renamed from: l, reason: collision with root package name */
    private final p2.b f4339l;

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f4340m;

    @Keep
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new a();
        private String previousCompletedSplashIsolate;
        private Bundle splashScreenState;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int r12) {
                return new SavedState[r12];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r22) {
            super.writeToParcel(parcel, r22);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }
    }

    class a implements k.f {
        a() {
        }

        @Override // io.flutter.embedding.android.k.f
        public void a(io.flutter.embedding.engine.a aVar) {
            FlutterSplashView.this.f4333f.y(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.g(flutterSplashView.f4333f, FlutterSplashView.this.f4332e);
        }

        @Override // io.flutter.embedding.android.k.f
        public void b() {
        }
    }

    class b implements p2.b {
        b() {
        }

        @Override // p2.b
        public void c() {
        }

        @Override // p2.b
        public void f() {
            if (FlutterSplashView.this.f4332e != null) {
                FlutterSplashView.this.k();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f4334g);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            flutterSplashView2.f4337j = flutterSplashView2.f4336i;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int r32) {
        super(context, attributeSet, r32);
        this.f4338k = new a();
        this.f4339l = new b();
        this.f4340m = new c();
        setSaveEnabled(true);
    }

    private boolean h() {
        k kVar = this.f4333f;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
        }
        if (kVar.w()) {
            return this.f4333f.getAttachedFlutterEngine().h().i() != null && this.f4333f.getAttachedFlutterEngine().h().i().equals(this.f4337j);
        }
        throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
    }

    private boolean i() {
        k kVar = this.f4333f;
        return (kVar == null || !kVar.w() || this.f4333f.u() || h()) ? false : true;
    }

    private boolean j() {
        v vVar;
        k kVar = this.f4333f;
        return kVar != null && kVar.w() && (vVar = this.f4332e) != null && vVar.b() && l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f4336i = this.f4333f.getAttachedFlutterEngine().h().i();
        e2.b.e(f4331n, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f4336i);
        this.f4332e.a(this.f4340m);
    }

    private boolean l() {
        k kVar = this.f4333f;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
        }
        if (kVar.w()) {
            return this.f4333f.u() && !h();
        }
        throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
    }

    public void g(k kVar, v vVar) {
        k kVar2 = this.f4333f;
        if (kVar2 != null) {
            kVar2.z(this.f4339l);
            removeView(this.f4333f);
        }
        View view = this.f4334g;
        if (view != null) {
            removeView(view);
        }
        this.f4333f = kVar;
        addView(kVar);
        this.f4332e = vVar;
        if (vVar != null) {
            if (i()) {
                e2.b.e(f4331n, "Showing splash screen UI.");
                View c5 = vVar.c(getContext(), this.f4335h);
                this.f4334g = c5;
                addView(c5);
                kVar.l(this.f4339l);
                return;
            }
            if (!j()) {
                if (kVar.w()) {
                    return;
                }
                e2.b.e(f4331n, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
                kVar.k(this.f4338k);
                return;
            }
            e2.b.e(f4331n, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
            View c6 = vVar.c(getContext(), this.f4335h);
            this.f4334g = c6;
            addView(c6);
            k();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4337j = savedState.previousCompletedSplashIsolate;
        this.f4335h = savedState.splashScreenState;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.previousCompletedSplashIsolate = this.f4337j;
        v vVar = this.f4332e;
        savedState.splashScreenState = vVar != null ? vVar.d() : null;
        return savedState;
    }
}
