package i2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;
import z2.h;

/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private FlutterMutatorsStack f4305e;

    /* renamed from: f, reason: collision with root package name */
    private float f4306f;

    /* renamed from: g, reason: collision with root package name */
    private int f4307g;

    /* renamed from: h, reason: collision with root package name */
    private int f4308h;

    /* renamed from: i, reason: collision with root package name */
    private int f4309i;

    /* renamed from: j, reason: collision with root package name */
    private int f4310j;

    /* renamed from: k, reason: collision with root package name */
    private final io.flutter.embedding.android.a f4311k;

    /* renamed from: l, reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f4312l;

    /* renamed from: i2.a$a, reason: collision with other inner class name */
    class ViewTreeObserverOnGlobalFocusChangeListenerC0045a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f4313e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f4314f;

        ViewTreeObserverOnGlobalFocusChangeListenerC0045a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f4313e = onFocusChangeListener;
            this.f4314f = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f4313e;
            View view3 = this.f4314f;
            onFocusChangeListener.onFocusChange(view3, h.c(view3));
        }
    }

    public a(Context context, float f5, io.flutter.embedding.android.a aVar) {
        super(context, null);
        this.f4306f = f5;
        this.f4311k = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f4305e.getFinalMatrix());
        float f5 = this.f4306f;
        matrix.preScale(1.0f / f5, 1.0f / f5);
        matrix.postTranslate(-this.f4307g, -this.f4308h);
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int r22, int r32, int r4, int r5) {
        this.f4305e = flutterMutatorsStack;
        this.f4307g = r22;
        this.f4308h = r32;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r4, r5);
        layoutParams.leftMargin = r22;
        layoutParams.topMargin = r32;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f4312l) == null) {
            return;
        }
        this.f4312l = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f4305e.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f4307g, -this.f4308h);
            canvas.clipPath(path);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int r22;
        float f5;
        if (this.f4311k == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int r12 = this.f4307g;
            this.f4309i = r12;
            r22 = this.f4308h;
            this.f4310j = r22;
            f5 = r12;
        } else {
            if (action == 2) {
                matrix.postTranslate(this.f4309i, this.f4310j);
                this.f4309i = this.f4307g;
                this.f4310j = this.f4308h;
                return this.f4311k.g(motionEvent, matrix);
            }
            f5 = this.f4307g;
            r22 = this.f4308h;
        }
        matrix.postTranslate(f5, r22);
        return this.f4311k.g(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f4312l == null) {
            ViewTreeObserverOnGlobalFocusChangeListenerC0045a viewTreeObserverOnGlobalFocusChangeListenerC0045a = new ViewTreeObserverOnGlobalFocusChangeListenerC0045a(onFocusChangeListener, this);
            this.f4312l = viewTreeObserverOnGlobalFocusChangeListenerC0045a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0045a);
        }
    }
}
