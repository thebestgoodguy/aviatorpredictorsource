package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* loaded from: classes.dex */
public class h extends SurfaceView implements p2.c {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4384e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4385f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4386g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4387h;

    /* renamed from: i, reason: collision with root package name */
    private p2.a f4388i;

    /* renamed from: j, reason: collision with root package name */
    private final SurfaceHolder.Callback f4389j;

    /* renamed from: k, reason: collision with root package name */
    private final p2.b f4390k;

    class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int r22, int r32, int r4) {
            e2.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (h.this.f4387h) {
                h.this.j(r32, r4);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            e2.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            h.this.f4385f = true;
            if (h.this.f4387h) {
                h.this.k();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            e2.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            h.this.f4385f = false;
            if (h.this.f4387h) {
                h.this.l();
            }
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
            e2.b.e("FlutterSurfaceView", "onFlutterUiDisplayed()");
            h.this.setAlpha(1.0f);
            if (h.this.f4388i != null) {
                h.this.f4388i.p(this);
            }
        }
    }

    private h(Context context, AttributeSet attributeSet, boolean z4) {
        super(context, attributeSet);
        this.f4385f = false;
        this.f4386g = false;
        this.f4387h = false;
        this.f4389j = new a();
        this.f4390k = new b();
        this.f4384e = z4;
        m();
    }

    public h(Context context, boolean z4) {
        this(context, null, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int r32, int r4) {
        if (this.f4388i == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        e2.b.e("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + r32 + " x " + r4);
        this.f4388i.u(r32, r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f4388i == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f4388i.s(getHolder().getSurface(), this.f4386g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        p2.a aVar = this.f4388i;
        if (aVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        aVar.t();
    }

    private void m() {
        if (this.f4384e) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f4389j);
        setAlpha(0.0f);
    }

    @Override // p2.c
    public void a() {
        if (this.f4388i == null) {
            e2.b.f("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f4388i = null;
        this.f4386g = true;
        this.f4387h = false;
    }

    @Override // p2.c
    public void b(p2.a aVar) {
        e2.b.e("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f4388i != null) {
            e2.b.e("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f4388i.t();
            this.f4388i.p(this.f4390k);
        }
        this.f4388i = aVar;
        this.f4387h = true;
        aVar.f(this.f4390k);
        if (this.f4385f) {
            e2.b.e("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
        this.f4386g = false;
    }

    @Override // p2.c
    public void c() {
        if (this.f4388i == null) {
            e2.b.f("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            e2.b.e("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            l();
        }
        setAlpha(0.0f);
        this.f4388i.p(this.f4390k);
        this.f4388i = null;
        this.f4387h = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] r02 = new int[2];
        getLocationInWindow(r02);
        region.op(r02[0], r02[1], (r02[0] + getRight()) - getLeft(), (r02[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // p2.c
    public p2.a getAttachedRenderer() {
        return this.f4388i;
    }
}
