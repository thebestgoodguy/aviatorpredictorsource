package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.view.d;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
class g extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private int f4645e;

    /* renamed from: f, reason: collision with root package name */
    private int f4646f;

    /* renamed from: g, reason: collision with root package name */
    private int f4647g;

    /* renamed from: h, reason: collision with root package name */
    private int f4648h;

    /* renamed from: i, reason: collision with root package name */
    private int f4649i;

    /* renamed from: j, reason: collision with root package name */
    private int f4650j;

    /* renamed from: k, reason: collision with root package name */
    private SurfaceTexture f4651k;

    /* renamed from: l, reason: collision with root package name */
    private Surface f4652l;

    /* renamed from: m, reason: collision with root package name */
    private io.flutter.embedding.android.a f4653m;

    /* renamed from: n, reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f4654n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicLong f4655o;

    /* renamed from: p, reason: collision with root package name */
    private final d.a f4656p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4657q;

    /* renamed from: r, reason: collision with root package name */
    private final d.b f4658r;

    class a implements d.a {
        a() {
        }

        @Override // io.flutter.view.d.a
        public void a() {
            if (Build.VERSION.SDK_INT == 29) {
                g.this.f4655o.decrementAndGet();
            }
        }
    }

    class b implements d.b {
        b() {
        }

        @Override // io.flutter.view.d.b
        public void onTrimMemory(int r22) {
            if (r22 != 80 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            g.this.f4657q = true;
        }
    }

    class c implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f4661e;

        c(View.OnFocusChangeListener onFocusChangeListener) {
            this.f4661e = onFocusChangeListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f4661e;
            g gVar = g.this;
            onFocusChangeListener.onFocusChange(gVar, z2.h.c(gVar));
        }
    }

    public g(Context context) {
        super(context);
        this.f4655o = new AtomicLong(0L);
        this.f4656p = new a();
        this.f4657q = false;
        this.f4658r = new b();
        setWillNotDraw(false);
    }

    public g(Context context, d.c cVar) {
        this(context);
        cVar.c(this.f4656p);
        cVar.b(this.f4658r);
        l(cVar.d());
    }

    private void f() {
        if (Build.VERSION.SDK_INT == 29) {
            this.f4655o.incrementAndGet();
        }
    }

    private void g() {
        if (this.f4657q) {
            Surface surface = this.f4652l;
            if (surface != null) {
                surface.release();
            }
            this.f4652l = c(this.f4651k);
            this.f4657q = false;
        }
    }

    private boolean n() {
        return Build.VERSION.SDK_INT != 29 || this.f4655o.get() <= 0;
    }

    protected Surface c(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public int d() {
        return this.f4650j;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        String str;
        Surface surface = this.f4652l;
        if (surface == null) {
            super.draw(canvas);
            str = "Platform view cannot be composed without a surface.";
        } else if (surface.isValid()) {
            SurfaceTexture surfaceTexture = this.f4651k;
            if (surfaceTexture != null && !surfaceTexture.isReleased()) {
                if (!n()) {
                    invalidate();
                    return;
                }
                g();
                Canvas lockHardwareCanvas = this.f4652l.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(lockHardwareCanvas);
                    f();
                    return;
                } finally {
                    this.f4652l.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            str = "Invalid texture. The platform view cannot be displayed.";
        } else {
            str = "Invalid surface. The platform view cannot be displayed.";
        }
        e2.b.b("PlatformViewWrapper", str);
    }

    public int e() {
        return this.f4649i;
    }

    public void h() {
        this.f4651k = null;
        Surface surface = this.f4652l;
        if (surface != null) {
            surface.release();
            this.f4652l = null;
        }
    }

    public void i(int r22, int r32) {
        this.f4649i = r22;
        this.f4650j = r32;
        SurfaceTexture surfaceTexture = this.f4651k;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(r22, r32);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] r12, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(r12, rect);
    }

    public void j(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f4647g = layoutParams.leftMargin;
        this.f4648h = layoutParams.topMargin;
    }

    public void k(View.OnFocusChangeListener onFocusChangeListener) {
        o();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f4654n == null) {
            c cVar = new c(onFocusChangeListener);
            this.f4654n = cVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(cVar);
        }
    }

    public void l(SurfaceTexture surfaceTexture) {
        int r12;
        if (Build.VERSION.SDK_INT < 23) {
            e2.b.b("PlatformViewWrapper", "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.f4651k = surfaceTexture;
        int r02 = this.f4649i;
        if (r02 > 0 && (r12 = this.f4650j) > 0) {
            surfaceTexture.setDefaultBufferSize(r02, r12);
        }
        Surface surface = this.f4652l;
        if (surface != null) {
            surface.release();
        }
        Surface c5 = c(surfaceTexture);
        this.f4652l = c5;
        Canvas lockHardwareCanvas = c5.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            f();
        } finally {
            this.f4652l.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public void m(io.flutter.embedding.android.a aVar) {
        this.f4653m = aVar;
    }

    public void o() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f4654n) == null) {
            return;
        }
        this.f4654n = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int r22;
        float f5;
        if (this.f4653m == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int r12 = this.f4647g;
            this.f4645e = r12;
            r22 = this.f4648h;
            this.f4646f = r22;
            f5 = r12;
        } else {
            if (action == 2) {
                matrix.postTranslate(this.f4645e, this.f4646f);
                this.f4645e = this.f4647g;
                this.f4646f = this.f4648h;
                return this.f4653m.g(motionEvent, matrix);
            }
            f5 = this.f4647g;
            r22 = this.f4648h;
        }
        matrix.postTranslate(f5, r22);
        return this.f4653m.g(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }
}
