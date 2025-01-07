package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Keep
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private Object createParams;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final e state;
    private int viewId;

    private static class a extends FrameLayout {

        /* renamed from: e, reason: collision with root package name */
        private final io.flutter.plugin.platform.a f4618e;

        /* renamed from: f, reason: collision with root package name */
        private final View f4619f;

        public a(Context context, io.flutter.plugin.platform.a aVar, View view) {
            super(context);
            this.f4618e = aVar;
            this.f4619f = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4618e.a(this.f4619f, view, accessibilityEvent);
        }
    }

    static class b extends ViewGroup {

        /* renamed from: e, reason: collision with root package name */
        private final Rect f4620e;

        /* renamed from: f, reason: collision with root package name */
        private final Rect f4621f;

        public b(Context context) {
            super(context);
            this.f4620e = new Rect();
            this.f4621f = new Rect();
        }

        private static int a(int r12) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(r12), Integer.MIN_VALUE);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z4, int r12, int r13, int r14, int r15) {
            for (int r11 = 0; r11 < getChildCount(); r11++) {
                View childAt = getChildAt(r11);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f4620e.set(r12, r13, r14, r15);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f4620e, layoutParams.x, layoutParams.y, this.f4621f);
                Rect rect = this.f4621f;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        @Override // android.view.View
        protected void onMeasure(int r5, int r6) {
            for (int r02 = 0; r02 < getChildCount(); r02++) {
                getChildAt(r02).measure(a(r5), a(r6));
            }
            super.onMeasure(r5, r6);
        }
    }

    private static class c extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final InputMethodManager f4622a;

        c(Context context) {
            this(context, null);
        }

        private c(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f4622a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new c(super.createDisplayContext(display), this.f4622a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f4622a : super.getSystemService(str);
        }
    }

    private static class d extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final f f4623a;

        /* renamed from: b, reason: collision with root package name */
        private WindowManager f4624b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f4625c;

        d(Context context, f fVar, Context context2) {
            super(context);
            this.f4623a = fVar;
            this.f4625c = context2;
        }

        private WindowManager a() {
            if (this.f4624b == null) {
                this.f4624b = this.f4623a.b();
            }
            return this.f4624b;
        }

        private boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int r22 = 0; r22 < stackTrace.length && r22 < 11; r22++) {
                if (stackTrace[r22].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[r22].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.f4625c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private io.flutter.plugin.platform.c f4626a;

        /* renamed from: b, reason: collision with root package name */
        private f f4627b;

        /* renamed from: c, reason: collision with root package name */
        private b f4628c;

        e() {
        }
    }

    static class f implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final WindowManager f4629a;

        /* renamed from: b, reason: collision with root package name */
        b f4630b;

        f(WindowManager windowManager, b bVar) {
            this.f4629a = windowManager;
            this.f4630b = bVar;
        }

        private void a(Object[] objArr) {
            b bVar = this.f4630b;
            if (bVar == null) {
                e2.b.f(SingleViewPresentation.TAG, "Embedded view called addView while detached from presentation");
            } else {
                bVar.addView((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
            }
        }

        private void c(Object[] objArr) {
            b bVar = this.f4630b;
            if (bVar == null) {
                e2.b.f(SingleViewPresentation.TAG, "Embedded view called removeView while detached from presentation");
            } else {
                bVar.removeView((View) objArr[0]);
            }
        }

        private void d(Object[] objArr) {
            if (this.f4630b == null) {
                e2.b.f(SingleViewPresentation.TAG, "Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = (View) objArr[0];
            view.clearAnimation();
            this.f4630b.removeView(view);
        }

        private void e(Object[] objArr) {
            b bVar = this.f4630b;
            if (bVar == null) {
                e2.b.f(SingleViewPresentation.TAG, "Embedded view called updateViewLayout while detached from presentation");
            } else {
                bVar.updateViewLayout((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
            }
        }

        public WindowManager b() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            name.hashCode();
            switch (name) {
                case "addView":
                    a(objArr);
                    return null;
                case "removeViewImmediate":
                    d(objArr);
                    return null;
                case "updateViewLayout":
                    e(objArr);
                    return null;
                case "removeView":
                    c(objArr);
                    return null;
                default:
                    try {
                        return method.invoke(this.f4629a, objArr);
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
            }
        }
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.a aVar, e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z4) {
        super(new c(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z4;
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.c cVar, io.flutter.plugin.platform.a aVar, int r6, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        super(new c(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = r6;
        this.createParams = obj;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        e eVar = new e();
        this.state = eVar;
        eVar.f4626a = cVar;
        getWindow().setFlags(8, 8);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setType(2030);
        }
    }

    public e detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public io.flutter.plugin.platform.c getView() {
        if (this.state.f4626a == null) {
            return null;
        }
        return this.state.f4626a;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f4628c == null) {
            this.state.f4628c = new b(getContext());
        }
        if (this.state.f4627b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            e eVar = this.state;
            eVar.f4627b = new f(windowManager, eVar.f4628c);
        }
        this.container = new FrameLayout(getContext());
        d dVar = new d(getContext(), this.state.f4627b, this.outerContext);
        View f5 = this.state.f4626a.f();
        if (f5.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) f5.getContext()).setBaseContext(dVar);
        } else {
            e2.b.f(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(f5);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, f5);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f4628c);
        f5.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            f5.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }
}
