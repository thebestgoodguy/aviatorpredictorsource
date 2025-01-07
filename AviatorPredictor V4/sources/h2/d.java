package h2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.WindowManager;
import h2.d;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3942a;

    /* renamed from: b, reason: collision with root package name */
    private c f3943b;

    /* renamed from: c, reason: collision with root package name */
    private long f3944c;

    /* renamed from: d, reason: collision with root package name */
    private h2.b f3945d;

    /* renamed from: e, reason: collision with root package name */
    private FlutterJNI f3946e;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorService f3947f;

    /* renamed from: g, reason: collision with root package name */
    Future<b> f3948g;

    class a implements Callable<b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f3949a;

        a(Context context) {
            this.f3949a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            d.this.f3946e.prefetchDefaultFontManager();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b call() {
            z2.e.a("FlutterLoader initTask");
            try {
                d.this.g(this.f3949a);
                d.this.f3946e.loadLibrary();
                d.this.f3946e.updateRefreshRate();
                d.this.f3947f.execute(new Runnable() { // from class: h2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.this.c();
                    }
                });
                return new b(z2.b.d(this.f3949a), z2.b.a(this.f3949a), z2.b.c(this.f3949a), null);
            } finally {
                z2.e.b();
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final String f3951a;

        /* renamed from: b, reason: collision with root package name */
        final String f3952b;

        /* renamed from: c, reason: collision with root package name */
        final String f3953c;

        private b(String str, String str2, String str3) {
            this.f3951a = str;
            this.f3952b = str2;
            this.f3953c = str3;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f3954a;

        public String a() {
            return this.f3954a;
        }
    }

    public d() {
        this(e2.a.e().d().a());
    }

    public d(FlutterJNI flutterJNI) {
        this(flutterJNI, e2.a.e().b());
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f3942a = false;
        this.f3946e = flutterJNI;
        this.f3947f = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e g(Context context) {
        return null;
    }

    private static boolean h(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean d() {
        return this.f3945d.f3940g;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.content.Context r10, java.lang.String[] r11) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.d.e(android.content.Context, java.lang.String[]):void");
    }

    public String f() {
        return this.f3945d.f3937d;
    }

    public void i(Context context) {
        j(context, new c());
    }

    public void j(Context context, c cVar) {
        if (this.f3943b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        z2.e.a("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f3943b = cVar;
            this.f3944c = SystemClock.uptimeMillis();
            this.f3945d = h2.a.e(applicationContext);
            (Build.VERSION.SDK_INT >= 17 ? io.flutter.view.e.e((DisplayManager) applicationContext.getSystemService("display"), this.f3946e) : io.flutter.view.e.d(((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getRefreshRate(), this.f3946e)).f();
            this.f3948g = this.f3947f.submit(new a(applicationContext));
        } finally {
            z2.e.b();
        }
    }
}
