package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public class g extends View implements p2.c {

    /* renamed from: e, reason: collision with root package name */
    private ImageReader f4374e;

    /* renamed from: f, reason: collision with root package name */
    private Image f4375f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f4376g;

    /* renamed from: h, reason: collision with root package name */
    private p2.a f4377h;

    /* renamed from: i, reason: collision with root package name */
    private b f4378i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4379j;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4380a;

        static {
            int[] r02 = new int[b.values().length];
            f4380a = r02;
            try {
                r02[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4380a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        background,
        overlay
    }

    public g(Context context, int r22, int r32, b bVar) {
        this(context, g(r22, r32), bVar);
    }

    g(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f4379j = false;
        this.f4374e = imageReader;
        this.f4378i = bVar;
        h();
    }

    private void e() {
        Image image = this.f4375f;
        if (image != null) {
            image.close();
            this.f4375f = null;
        }
    }

    private static ImageReader g(int r9, int r10) {
        int r32;
        int r4;
        if (r9 <= 0) {
            i("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(r9));
            r32 = 1;
        } else {
            r32 = r9;
        }
        if (r10 <= 0) {
            i("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(r10));
            r4 = 1;
        } else {
            r4 = r10;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(r32, r4, 1, 3, 768L) : ImageReader.newInstance(r32, r4, 1, 3);
    }

    private void h() {
        setAlpha(0.0f);
    }

    private static void i(String str, Object... objArr) {
        e2.b.f("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f4375f.getHardwareBuffer();
            this.f4376g = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f4375f.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f4375f.getHeight();
        Bitmap bitmap = this.f4376g;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f4376g.getHeight() != height) {
            this.f4376g = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f4376g.copyPixelsFromBuffer(buffer);
    }

    @Override // p2.c
    public void a() {
    }

    @Override // p2.c
    public void b(p2.a aVar) {
        if (a.f4380a[this.f4378i.ordinal()] == 1) {
            aVar.v(this.f4374e.getSurface());
        }
        setAlpha(1.0f);
        this.f4377h = aVar;
        this.f4379j = true;
    }

    @Override // p2.c
    public void c() {
        if (this.f4379j) {
            setAlpha(0.0f);
            d();
            this.f4376g = null;
            e();
            invalidate();
            this.f4379j = false;
        }
    }

    public boolean d() {
        if (!this.f4379j) {
            return false;
        }
        Image acquireLatestImage = this.f4374e.acquireLatestImage();
        if (acquireLatestImage != null) {
            e();
            this.f4375f = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public void f() {
        this.f4374e.close();
    }

    @Override // p2.c
    public p2.a getAttachedRenderer() {
        return this.f4377h;
    }

    public ImageReader getImageReader() {
        return this.f4374e;
    }

    public Surface getSurface() {
        return this.f4374e.getSurface();
    }

    public void j(int r22, int r32) {
        if (this.f4377h == null) {
            return;
        }
        if (r22 == this.f4374e.getWidth() && r32 == this.f4374e.getHeight()) {
            return;
        }
        e();
        f();
        this.f4374e = g(r22, r32);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4375f != null) {
            k();
        }
        Bitmap bitmap = this.f4376g;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int r12, int r22, int r32, int r4) {
        if (!(r12 == this.f4374e.getWidth() && r22 == this.f4374e.getHeight()) && this.f4378i == b.background && this.f4379j) {
            j(r12, r22);
            this.f4377h.v(this.f4374e.getSurface());
        }
    }
}
