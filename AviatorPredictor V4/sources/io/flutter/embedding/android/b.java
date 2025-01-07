package io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

@Deprecated
/* loaded from: classes.dex */
public final class b implements v {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f4349a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView.ScaleType f4350b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4351c;

    /* renamed from: d, reason: collision with root package name */
    private C0047b f4352d;

    class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f4353a;

        a(Runnable runnable) {
            this.f4353a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4353a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4353a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: io.flutter.embedding.android.b$b, reason: collision with other inner class name */
    public static class C0047b extends ImageView {
        public C0047b(Context context) {
            this(context, null, 0);
        }

        public C0047b(Context context, AttributeSet attributeSet, int r32) {
            super(context, attributeSet, r32);
        }

        public void a(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(Drawable drawable) {
            a(drawable, ImageView.ScaleType.FIT_XY);
        }
    }

    public b(Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500L);
    }

    public b(Drawable drawable, ImageView.ScaleType scaleType, long j4) {
        this.f4349a = drawable;
        this.f4350b = scaleType;
        this.f4351c = j4;
    }

    @Override // io.flutter.embedding.android.v
    public void a(Runnable runnable) {
        C0047b c0047b = this.f4352d;
        if (c0047b == null) {
            runnable.run();
        } else {
            c0047b.animate().alpha(0.0f).setDuration(this.f4351c).setListener(new a(runnable));
        }
    }

    @Override // io.flutter.embedding.android.v
    public /* synthetic */ boolean b() {
        return u.a(this);
    }

    @Override // io.flutter.embedding.android.v
    public View c(Context context, Bundle bundle) {
        C0047b c0047b = new C0047b(context);
        this.f4352d = c0047b;
        c0047b.a(this.f4349a, this.f4350b);
        return this.f4352d;
    }

    @Override // io.flutter.embedding.android.v
    public /* synthetic */ Bundle d() {
        return u.b(this);
    }
}
