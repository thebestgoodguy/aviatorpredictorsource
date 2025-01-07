package p2;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.view.d;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class a implements io.flutter.view.d {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f7072a;

    /* renamed from: c, reason: collision with root package name */
    private Surface f7074c;

    /* renamed from: g, reason: collision with root package name */
    private final p2.b f7078g;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f7073b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    private boolean f7075d = false;

    /* renamed from: e, reason: collision with root package name */
    private Handler f7076e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    private final Set<WeakReference<d.b>> f7077f = new HashSet();

    /* renamed from: p2.a$a, reason: collision with other inner class name */
    class C0073a implements p2.b {
        C0073a() {
        }

        @Override // p2.b
        public void c() {
            a.this.f7075d = false;
        }

        @Override // p2.b
        public void f() {
            a.this.f7075d = true;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f7080a;

        /* renamed from: b, reason: collision with root package name */
        public final d f7081b;

        /* renamed from: c, reason: collision with root package name */
        public final c f7082c;

        public b(Rect rect, d dVar) {
            this.f7080a = rect;
            this.f7081b = dVar;
            this.f7082c = c.UNKNOWN;
        }

        public b(Rect rect, d dVar, c cVar) {
            this.f7080a = rect;
            this.f7081b = dVar;
            this.f7082c = cVar;
        }
    }

    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);


        /* renamed from: e, reason: collision with root package name */
        public final int f7087e;

        c(int r32) {
            this.f7087e = r32;
        }
    }

    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);


        /* renamed from: e, reason: collision with root package name */
        public final int f7093e;

        d(int r32) {
            this.f7093e = r32;
        }
    }

    static final class e implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final long f7094e;

        /* renamed from: f, reason: collision with root package name */
        private final FlutterJNI f7095f;

        e(long j4, FlutterJNI flutterJNI) {
            this.f7094e = j4;
            this.f7095f = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7095f.isAttached()) {
                e2.b.e("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f7094e + ").");
                this.f7095f.unregisterTexture(this.f7094e);
            }
        }
    }

    final class f implements d.c, d.b {

        /* renamed from: a, reason: collision with root package name */
        private final long f7096a;

        /* renamed from: b, reason: collision with root package name */
        private final SurfaceTextureWrapper f7097b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7098c;

        /* renamed from: d, reason: collision with root package name */
        private d.b f7099d;

        /* renamed from: e, reason: collision with root package name */
        private d.a f7100e;

        /* renamed from: f, reason: collision with root package name */
        private final Runnable f7101f;

        /* renamed from: g, reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f7102g;

        /* renamed from: p2.a$f$a, reason: collision with other inner class name */
        class RunnableC0074a implements Runnable {
            RunnableC0074a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f7100e != null) {
                    f.this.f7100e.a();
                }
            }
        }

        class b implements SurfaceTexture.OnFrameAvailableListener {
            b() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (f.this.f7098c || !a.this.f7072a.isAttached()) {
                    return;
                }
                f fVar = f.this;
                a.this.l(fVar.f7096a);
            }
        }

        f(long j4, SurfaceTexture surfaceTexture) {
            RunnableC0074a runnableC0074a = new RunnableC0074a();
            this.f7101f = runnableC0074a;
            this.f7102g = new b();
            this.f7096a = j4;
            this.f7097b = new SurfaceTextureWrapper(surfaceTexture, runnableC0074a);
            if (Build.VERSION.SDK_INT >= 21) {
                d().setOnFrameAvailableListener(this.f7102g, new Handler());
            } else {
                d().setOnFrameAvailableListener(this.f7102g);
            }
        }

        @Override // io.flutter.view.d.c
        public long a() {
            return this.f7096a;
        }

        @Override // io.flutter.view.d.c
        public void b(d.b bVar) {
            this.f7099d = bVar;
        }

        @Override // io.flutter.view.d.c
        public void c(d.a aVar) {
            this.f7100e = aVar;
        }

        @Override // io.flutter.view.d.c
        public SurfaceTexture d() {
            return this.f7097b.surfaceTexture();
        }

        protected void finalize() {
            try {
                if (this.f7098c) {
                    return;
                }
                a.this.f7076e.post(new e(this.f7096a, a.this.f7072a));
            } finally {
                super.finalize();
            }
        }

        public SurfaceTextureWrapper h() {
            return this.f7097b;
        }

        @Override // io.flutter.view.d.b
        public void onTrimMemory(int r22) {
            d.b bVar = this.f7099d;
            if (bVar != null) {
                bVar.onTrimMemory(r22);
            }
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public float f7106a = 1.0f;

        /* renamed from: b, reason: collision with root package name */
        public int f7107b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f7108c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f7109d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f7110e = 0;

        /* renamed from: f, reason: collision with root package name */
        public int f7111f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f7112g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f7113h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f7114i = 0;

        /* renamed from: j, reason: collision with root package name */
        public int f7115j = 0;

        /* renamed from: k, reason: collision with root package name */
        public int f7116k = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f7117l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f7118m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f7119n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f7120o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f7121p = -1;

        /* renamed from: q, reason: collision with root package name */
        public List<b> f7122q = new ArrayList();

        boolean a() {
            return this.f7107b > 0 && this.f7108c > 0 && this.f7106a > 0.0f;
        }
    }

    public a(FlutterJNI flutterJNI) {
        C0073a c0073a = new C0073a();
        this.f7078g = c0073a;
        this.f7072a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0073a);
    }

    private void h() {
        Iterator<WeakReference<d.b>> it = this.f7077f.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(long j4) {
        this.f7072a.markTextureFrameAvailable(j4);
    }

    private void o(long j4, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f7072a.registerTexture(j4, surfaceTextureWrapper);
    }

    @Override // io.flutter.view.d
    public d.c a() {
        e2.b.e("FlutterRenderer", "Creating a SurfaceTexture.");
        return n(new SurfaceTexture(0));
    }

    public void f(p2.b bVar) {
        this.f7072a.addIsDisplayingFlutterUiListener(bVar);
        if (this.f7075d) {
            bVar.f();
        }
    }

    void g(d.b bVar) {
        h();
        this.f7077f.add(new WeakReference<>(bVar));
    }

    public void i(ByteBuffer byteBuffer, int r32) {
        this.f7072a.dispatchPointerDataPacket(byteBuffer, r32);
    }

    public boolean j() {
        return this.f7075d;
    }

    public boolean k() {
        return this.f7072a.getIsSoftwareRenderingEnabled();
    }

    public void m(int r32) {
        Iterator<WeakReference<d.b>> it = this.f7077f.iterator();
        while (it.hasNext()) {
            d.b bVar = it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(r32);
            } else {
                it.remove();
            }
        }
    }

    public d.c n(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        f fVar = new f(this.f7073b.getAndIncrement(), surfaceTexture);
        e2.b.e("FlutterRenderer", "New SurfaceTexture ID: " + fVar.a());
        o(fVar.a(), fVar.h());
        g(fVar);
        return fVar;
    }

    public void p(p2.b bVar) {
        this.f7072a.removeIsDisplayingFlutterUiListener(bVar);
    }

    public void q(boolean z4) {
        this.f7072a.setSemanticsEnabled(z4);
    }

    public void r(g gVar) {
        if (gVar.a()) {
            e2.b.e("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar.f7107b + " x " + gVar.f7108c + "\nPadding - L: " + gVar.f7112g + ", T: " + gVar.f7109d + ", R: " + gVar.f7110e + ", B: " + gVar.f7111f + "\nInsets - L: " + gVar.f7116k + ", T: " + gVar.f7113h + ", R: " + gVar.f7114i + ", B: " + gVar.f7115j + "\nSystem Gesture Insets - L: " + gVar.f7120o + ", T: " + gVar.f7117l + ", R: " + gVar.f7118m + ", B: " + gVar.f7118m + "\nDisplay Features: " + gVar.f7122q.size());
            int[] r12 = new int[gVar.f7122q.size() * 4];
            int[] r15 = new int[gVar.f7122q.size()];
            int[] r14 = new int[gVar.f7122q.size()];
            for (int r22 = 0; r22 < gVar.f7122q.size(); r22++) {
                b bVar = gVar.f7122q.get(r22);
                int r4 = r22 * 4;
                Rect rect = bVar.f7080a;
                r12[r4] = rect.left;
                r12[r4 + 1] = rect.top;
                r12[r4 + 2] = rect.right;
                r12[r4 + 3] = rect.bottom;
                r15[r22] = bVar.f7081b.f7093e;
                r14[r22] = bVar.f7082c.f7087e;
            }
            this.f7072a.setViewportMetrics(gVar.f7106a, gVar.f7107b, gVar.f7108c, gVar.f7109d, gVar.f7110e, gVar.f7111f, gVar.f7112g, gVar.f7113h, gVar.f7114i, gVar.f7115j, gVar.f7116k, gVar.f7117l, gVar.f7118m, gVar.f7119n, gVar.f7120o, gVar.f7121p, r12, r15, r14);
        }
    }

    public void s(Surface surface, boolean z4) {
        if (this.f7074c != null && !z4) {
            t();
        }
        this.f7074c = surface;
        this.f7072a.onSurfaceCreated(surface);
    }

    public void t() {
        this.f7072a.onSurfaceDestroyed();
        this.f7074c = null;
        if (this.f7075d) {
            this.f7078g.c();
        }
        this.f7075d = false;
    }

    public void u(int r22, int r32) {
        this.f7072a.onSurfaceChanged(r22, r32);
    }

    public void v(Surface surface) {
        this.f7074c = surface;
        this.f7072a.onSurfaceWindowChanged(surface);
    }
}
