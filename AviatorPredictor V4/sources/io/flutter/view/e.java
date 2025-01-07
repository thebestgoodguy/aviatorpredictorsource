package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static e f4945d;

    /* renamed from: e, reason: collision with root package name */
    private static b f4946e;

    /* renamed from: b, reason: collision with root package name */
    private FlutterJNI f4948b;

    /* renamed from: a, reason: collision with root package name */
    private long f4947a = -1;

    /* renamed from: c, reason: collision with root package name */
    private final FlutterJNI.b f4949c = new a();

    class a implements FlutterJNI.b {

        /* renamed from: io.flutter.view.e$a$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0053a implements Choreographer.FrameCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f4951a;

            ChoreographerFrameCallbackC0053a(long j4) {
                this.f4951a = j4;
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j4) {
                long nanoTime = System.nanoTime() - j4;
                e.this.f4948b.onVsync(nanoTime < 0 ? 0L : nanoTime, e.this.f4947a, this.f4951a);
            }
        }

        a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j4) {
            Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC0053a(j4));
        }
    }

    class b implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private DisplayManager f4953a;

        b(DisplayManager displayManager) {
            this.f4953a = displayManager;
        }

        void a() {
            this.f4953a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int r12) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int r6) {
            if (r6 == 0) {
                float refreshRate = this.f4953a.getDisplay(0).getRefreshRate();
                e.this.f4947a = (long) (1.0E9d / refreshRate);
                e.this.f4948b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int r12) {
        }
    }

    private e(FlutterJNI flutterJNI) {
        this.f4948b = flutterJNI;
    }

    public static e d(float f5, FlutterJNI flutterJNI) {
        if (f4945d == null) {
            f4945d = new e(flutterJNI);
        }
        flutterJNI.setRefreshRateFPS(f5);
        e eVar = f4945d;
        eVar.f4947a = (long) (1.0E9d / f5);
        return eVar;
    }

    public static e e(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f4945d == null) {
            f4945d = new e(flutterJNI);
        }
        if (f4946e == null) {
            e eVar = f4945d;
            Objects.requireNonNull(eVar);
            b bVar = eVar.new b(displayManager);
            f4946e = bVar;
            bVar.a();
        }
        if (f4945d.f4947a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f4945d.f4947a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f4945d;
    }

    public void f() {
        this.f4948b.setAsyncWaitForVsyncDelegate(this.f4949c);
    }
}
