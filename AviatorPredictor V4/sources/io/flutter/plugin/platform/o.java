package io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.d;

/* loaded from: classes.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    SingleViewPresentation f4697a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4698b;

    /* renamed from: c, reason: collision with root package name */
    private final io.flutter.plugin.platform.a f4699c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4700d;

    /* renamed from: e, reason: collision with root package name */
    private final d.c f4701e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f4702f;

    /* renamed from: g, reason: collision with root package name */
    private final Surface f4703g;

    /* renamed from: h, reason: collision with root package name */
    private VirtualDisplay f4704h;

    /* renamed from: i, reason: collision with root package name */
    private int f4705i;

    /* renamed from: j, reason: collision with root package name */
    private int f4706j;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f4707e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Runnable f4708f;

        /* renamed from: io.flutter.plugin.platform.o$a$a, reason: collision with other inner class name */
        class RunnableC0051a implements Runnable {
            RunnableC0051a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f4707e.postDelayed(aVar.f4708f, 128L);
            }
        }

        a(View view, Runnable runnable) {
            this.f4707e = view;
            this.f4708f = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.a(this.f4707e, new RunnableC0051a());
            this.f4707e.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static class b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final View f4711a;

        /* renamed from: b, reason: collision with root package name */
        Runnable f4712b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f4711a.getViewTreeObserver().removeOnDrawListener(b.this);
            }
        }

        b(View view, Runnable runnable) {
            this.f4711a = view;
            this.f4712b = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new b(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f4712b;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f4712b = null;
            this.f4711a.post(new a());
        }
    }

    private o(Context context, io.flutter.plugin.platform.a aVar, VirtualDisplay virtualDisplay, c cVar, Surface surface, d.c cVar2, View.OnFocusChangeListener onFocusChangeListener, int r18, Object obj) {
        this.f4698b = context;
        this.f4699c = aVar;
        this.f4701e = cVar2;
        this.f4702f = onFocusChangeListener;
        this.f4703g = surface;
        this.f4704h = virtualDisplay;
        this.f4700d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f4704h.getDisplay(), cVar, aVar, r18, obj, onFocusChangeListener);
        this.f4697a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static o a(Context context, io.flutter.plugin.platform.a aVar, c cVar, d.c cVar2, int r24, int r25, int r26, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        context.getResources().getDisplayMetrics();
        if (r24 == 0 || r25 == 0) {
            return null;
        }
        cVar2.d().setDefaultBufferSize(r24, r25);
        Surface surface = new Surface(cVar2.d());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", r24, r25, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        o oVar = new o(context, aVar, createVirtualDisplay, cVar, surface, cVar2, onFocusChangeListener, r26, obj);
        oVar.f4705i = r24;
        oVar.f4706j = r25;
        return oVar;
    }

    public void b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f4697a;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public int c() {
        return this.f4706j;
    }

    public int d() {
        return this.f4705i;
    }

    public View e() {
        SingleViewPresentation singleViewPresentation = this.f4697a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().f();
    }

    void f(View view) {
        SingleViewPresentation singleViewPresentation = this.f4697a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f4697a.getView().a(view);
    }

    void g() {
        SingleViewPresentation singleViewPresentation = this.f4697a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f4697a.getView().e();
    }

    void h() {
        SingleViewPresentation singleViewPresentation = this.f4697a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f4697a.getView().c();
    }

    public void i(int r10, int r11, Runnable runnable) {
        boolean isFocused = e().isFocused();
        SingleViewPresentation.e detachState = this.f4697a.detachState();
        this.f4704h.setSurface(null);
        this.f4704h.release();
        this.f4705i = r10;
        this.f4706j = r11;
        this.f4701e.d().setDefaultBufferSize(r10, r11);
        this.f4704h = ((DisplayManager) this.f4698b.getSystemService("display")).createVirtualDisplay("flutter-vd", r10, r11, this.f4700d, this.f4703g, 0);
        View e5 = e();
        e5.addOnAttachStateChangeListener(new a(e5, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f4698b, this.f4704h.getDisplay(), this.f4699c, detachState, this.f4702f, isFocused);
        singleViewPresentation.show();
        this.f4697a.cancel();
        this.f4697a = singleViewPresentation;
    }
}
