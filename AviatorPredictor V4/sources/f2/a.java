package f2;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import r2.b;
import r2.r;

/* loaded from: classes.dex */
public class a implements r2.b {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f3652a;

    /* renamed from: b, reason: collision with root package name */
    private final AssetManager f3653b;

    /* renamed from: c, reason: collision with root package name */
    private final f2.c f3654c;

    /* renamed from: d, reason: collision with root package name */
    private final r2.b f3655d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3656e;

    /* renamed from: f, reason: collision with root package name */
    private String f3657f;

    /* renamed from: g, reason: collision with root package name */
    private d f3658g;

    /* renamed from: h, reason: collision with root package name */
    private final b.a f3659h;

    /* renamed from: f2.a$a, reason: collision with other inner class name */
    class C0038a implements b.a {
        C0038a() {
        }

        @Override // r2.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC0084b interfaceC0084b) {
            a.this.f3657f = r.f7473b.a(byteBuffer);
            if (a.this.f3658g != null) {
                a.this.f3658g.a(a.this.f3657f);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f3661a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3662b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3663c;

        public b(String str, String str2) {
            this.f3661a = str;
            this.f3662b = null;
            this.f3663c = str2;
        }

        public b(String str, String str2, String str3) {
            this.f3661a = str;
            this.f3662b = str2;
            this.f3663c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f3661a.equals(bVar.f3661a)) {
                return this.f3663c.equals(bVar.f3663c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f3661a.hashCode() * 31) + this.f3663c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f3661a + ", function: " + this.f3663c + " )";
        }
    }

    private static class c implements r2.b {

        /* renamed from: a, reason: collision with root package name */
        private final f2.c f3664a;

        private c(f2.c cVar) {
            this.f3664a = cVar;
        }

        /* synthetic */ c(f2.c cVar, C0038a c0038a) {
            this(cVar);
        }

        @Override // r2.b
        public void a(String str, b.a aVar, b.c cVar) {
            this.f3664a.a(str, aVar, cVar);
        }

        @Override // r2.b
        public void b(String str, b.a aVar) {
            this.f3664a.b(str, aVar);
        }

        @Override // r2.b
        public void c(String str, ByteBuffer byteBuffer) {
            this.f3664a.e(str, byteBuffer, null);
        }

        @Override // r2.b
        public void e(String str, ByteBuffer byteBuffer, b.InterfaceC0084b interfaceC0084b) {
            this.f3664a.e(str, byteBuffer, interfaceC0084b);
        }
    }

    public interface d {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f3656e = false;
        C0038a c0038a = new C0038a();
        this.f3659h = c0038a;
        this.f3652a = flutterJNI;
        this.f3653b = assetManager;
        f2.c cVar = new f2.c(flutterJNI);
        this.f3654c = cVar;
        cVar.b("flutter/isolate", c0038a);
        this.f3655d = new c(cVar, null);
        if (flutterJNI.isAttached()) {
            this.f3656e = true;
        }
    }

    @Override // r2.b
    @Deprecated
    public void a(String str, b.a aVar, b.c cVar) {
        this.f3655d.a(str, aVar, cVar);
    }

    @Override // r2.b
    @Deprecated
    public void b(String str, b.a aVar) {
        this.f3655d.b(str, aVar);
    }

    @Override // r2.b
    @Deprecated
    public void c(String str, ByteBuffer byteBuffer) {
        this.f3655d.c(str, byteBuffer);
    }

    @Override // r2.b
    @Deprecated
    public void e(String str, ByteBuffer byteBuffer, b.InterfaceC0084b interfaceC0084b) {
        this.f3655d.e(str, byteBuffer, interfaceC0084b);
    }

    public void h(b bVar, List<String> list) {
        if (this.f3656e) {
            e2.b.f("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        z2.e.a("DartExecutor#executeDartEntrypoint");
        try {
            e2.b.e("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f3652a.runBundleAndSnapshotFromLibrary(bVar.f3661a, bVar.f3663c, bVar.f3662b, this.f3653b, list);
            this.f3656e = true;
        } finally {
            z2.e.b();
        }
    }

    public String i() {
        return this.f3657f;
    }

    public boolean j() {
        return this.f3656e;
    }

    public void k() {
        if (this.f3652a.isAttached()) {
            this.f3652a.notifyLowMemoryWarning();
        }
    }

    public void l() {
        e2.b.e("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f3652a.setPlatformMessageHandler(this.f3654c);
    }

    public void m() {
        e2.b.e("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f3652a.setPlatformMessageHandler(null);
    }
}
