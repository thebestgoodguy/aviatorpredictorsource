package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f208k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f209a;

    /* renamed from: b, reason: collision with root package name */
    Object f210b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f211c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f212d;

    /* renamed from: e, reason: collision with root package name */
    public int f213e;

    /* renamed from: f, reason: collision with root package name */
    public int f214f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f215g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f216h;

    /* renamed from: i, reason: collision with root package name */
    public String f217i;

    /* renamed from: j, reason: collision with root package name */
    public String f218j;

    public IconCompat() {
        this.f209a = -1;
        this.f211c = null;
        this.f212d = null;
        this.f213e = 0;
        this.f214f = 0;
        this.f215g = null;
        this.f216h = f208k;
        this.f217i = null;
    }

    private IconCompat(int r32) {
        this.f209a = -1;
        this.f211c = null;
        this.f212d = null;
        this.f213e = 0;
        this.f214f = 0;
        this.f215g = null;
        this.f216h = f208k;
        this.f217i = null;
        this.f209a = r32;
    }

    static Bitmap a(Bitmap bitmap, boolean z4) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f5 = min;
        float f6 = 0.5f * f5;
        float f7 = 0.9166667f * f6;
        if (z4) {
            float f8 = 0.010416667f * f5;
            paint.setColor(0);
            paint.setShadowLayer(f8, 0.0f, f5 * 0.020833334f, 1023410176);
            canvas.drawCircle(f6, f6, f7, paint);
            paint.setShadowLayer(f8, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f6, f6, f7, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f6, f6, f7, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int r4) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (r4 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f213e = r4;
        if (resources != null) {
            try {
                iconCompat.f210b = resources.getResourceName(r4);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f210b = str;
        }
        iconCompat.f218j = str;
        return iconCompat;
    }

    private static int d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        }
    }

    private static String f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon package", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon package", e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon package", e7);
            return null;
        }
    }

    private static int h(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e5) {
            e = e5;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e6) {
            e = e6;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e7) {
            e = e7;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    private static Uri j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        }
    }

    private static String p(int r02) {
        switch (r02) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int c() {
        int r02 = this.f209a;
        if (r02 == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.f210b);
        }
        if (r02 == 2) {
            return this.f213e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String e() {
        int r02 = this.f209a;
        if (r02 == -1 && Build.VERSION.SDK_INT >= 23) {
            return f((Icon) this.f210b);
        }
        if (r02 == 2) {
            return TextUtils.isEmpty(this.f218j) ? ((String) this.f210b).split(":", -1)[0] : this.f218j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int r02 = this.f209a;
        return (r02 != -1 || Build.VERSION.SDK_INT < 23) ? r02 : h((Icon) this.f210b);
    }

    public Uri i() {
        int r02 = this.f209a;
        if (r02 == -1 && Build.VERSION.SDK_INT >= 23) {
            return j((Icon) this.f210b);
        }
        if (r02 == 4 || r02 == 6) {
            return Uri.parse((String) this.f210b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream k(Context context) {
        StringBuilder sb;
        String str;
        Uri i4 = i();
        String scheme = i4.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(i4);
            } catch (Exception e5) {
                e = e5;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f210b));
            } catch (FileNotFoundException e6) {
                e = e6;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(i4);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public void l() {
        Parcelable parcelable;
        this.f216h = PorterDuff.Mode.valueOf(this.f217i);
        switch (this.f209a) {
            case -1:
                parcelable = this.f212d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f212d;
                if (parcelable == null) {
                    byte[] bArr = this.f211c;
                    this.f210b = bArr;
                    this.f209a = 3;
                    this.f213e = 0;
                    this.f214f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f211c, Charset.forName("UTF-16"));
                this.f210b = str;
                if (this.f209a == 2 && this.f218j == null) {
                    this.f218j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f210b = this.f211c;
                return;
        }
        this.f210b = parcelable;
    }

    public void m(boolean z4) {
        this.f217i = this.f216h.name();
        switch (this.f209a) {
            case -1:
                if (z4) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z4) {
                    Bitmap bitmap = (Bitmap) this.f210b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f211c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f211c = ((String) this.f210b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f211c = (byte[]) this.f210b;
                return;
            case 4:
            case 6:
                this.f211c = this.f210b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f212d = (Parcelable) this.f210b;
    }

    @Deprecated
    public Icon n() {
        return o(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r0 >= 26) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Icon o(android.content.Context r5) {
        /*
            r4 = this;
            int r0 = r4.f209a
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto Lb5;
                case 0: goto L8;
                case 1: goto L9c;
                case 2: goto L91;
                case 3: goto L84;
                case 4: goto L7b;
                case 5: goto L65;
                case 6: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r5.<init>(r0)
            throw r5
        L10:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L20
            android.net.Uri r5 = r4.i()
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r5)
            goto La4
        L20:
            if (r5 == 0) goto L4a
            java.io.InputStream r5 = r4.k(r5)
            if (r5 == 0) goto L2f
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            if (r0 < r2) goto L76
            goto L6d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.append(r1)
            android.net.Uri r1 = r4.i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.append(r1)
            android.net.Uri r1 = r4.i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L65:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L72
            java.lang.Object r5 = r4.f210b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L6d:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto La4
        L72:
            java.lang.Object r5 = r4.f210b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L76:
            android.graphics.Bitmap r5 = a(r5, r1)
            goto La0
        L7b:
            java.lang.Object r5 = r4.f210b
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
            goto La4
        L84:
            java.lang.Object r5 = r4.f210b
            byte[] r5 = (byte[]) r5
            int r0 = r4.f213e
            int r1 = r4.f214f
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
            goto La4
        L91:
            java.lang.String r5 = r4.e()
            int r0 = r4.f213e
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
            goto La4
        L9c:
            java.lang.Object r5 = r4.f210b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        La0:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
        La4:
            android.content.res.ColorStateList r0 = r4.f215g
            if (r0 == 0) goto Lab
            r5.setTintList(r0)
        Lab:
            android.graphics.PorterDuff$Mode r0 = r4.f216h
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.f208k
            if (r0 == r1) goto Lb4
            r5.setTintMode(r0)
        Lb4:
            return r5
        Lb5:
            java.lang.Object r5 = r4.f210b
            android.graphics.drawable.Icon r5 = (android.graphics.drawable.Icon) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.o(android.content.Context):android.graphics.drawable.Icon");
    }

    public String toString() {
        int height;
        if (this.f209a == -1) {
            return String.valueOf(this.f210b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(p(this.f209a));
        switch (this.f209a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f210b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f210b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f218j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f213e);
                if (this.f214f != 0) {
                    sb.append(" off=");
                    height = this.f214f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f210b);
                break;
        }
        if (this.f215g != null) {
            sb.append(" tint=");
            sb.append(this.f215g);
        }
        if (this.f216h != f208k) {
            sb.append(" mode=");
            sb.append(this.f216h);
        }
        sb.append(")");
        return sb.toString();
    }
}
