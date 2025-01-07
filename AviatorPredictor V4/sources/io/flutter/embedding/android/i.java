package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public class i extends TextureView implements p2.c {

    /* renamed from: e, reason: collision with root package name */
    private boolean f4393e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4394f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4395g;

    /* renamed from: h, reason: collision with root package name */
    private p2.a f4396h;

    /* renamed from: i, reason: collision with root package name */
    private Surface f4397i;

    /* renamed from: j, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f4398j;

    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int r22, int r32) {
            e2.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            i.this.f4393e = true;
            if (i.this.f4394f) {
                i.this.l();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            e2.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            i.this.f4393e = false;
            if (i.this.f4394f) {
                i.this.m();
            }
            if (i.this.f4397i == null) {
                return true;
            }
            i.this.f4397i.release();
            i.this.f4397i = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int r32, int r4) {
            e2.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (i.this.f4394f) {
                i.this.k(r32, r4);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public i(Context context) {
        this(context, null);
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4393e = false;
        this.f4394f = false;
        this.f4395g = false;
        this.f4398j = new a();
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int r32, int r4) {
        if (this.f4396h == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        e2.b.e("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + r32 + " x " + r4);
        this.f4396h.u(r32, r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f4396h == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f4397i;
        if (surface != null) {
            surface.release();
            this.f4397i = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f4397i = surface2;
        this.f4396h.s(surface2, this.f4395g);
        this.f4395g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        p2.a aVar = this.f4396h;
        if (aVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        aVar.t();
        Surface surface = this.f4397i;
        if (surface != null) {
            surface.release();
            this.f4397i = null;
        }
    }

    private void n() {
        setSurfaceTextureListener(this.f4398j);
    }

    @Override // p2.c
    public void a() {
        if (this.f4396h == null) {
            e2.b.f("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f4396h = null;
        this.f4395g = true;
        this.f4394f = false;
    }

    @Override // p2.c
    public void b(p2.a aVar) {
        e2.b.e("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f4396h != null) {
            e2.b.e("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f4396h.t();
        }
        this.f4396h = aVar;
        this.f4394f = true;
        if (this.f4393e) {
            e2.b.e("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
    }

    @Override // p2.c
    public void c() {
        if (this.f4396h == null) {
            e2.b.f("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            e2.b.e("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            m();
        }
        this.f4396h = null;
        this.f4394f = false;
    }

    @Override // p2.c
    public p2.a getAttachedRenderer() {
        return this.f4396h;
    }

    public void setRenderSurface(Surface surface) {
        this.f4397i = surface;
    }
}
