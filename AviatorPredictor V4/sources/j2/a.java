package j2;

import android.content.Context;
import io.flutter.plugin.platform.e;
import io.flutter.view.d;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: j2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0061a {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f5952a;

        /* renamed from: b, reason: collision with root package name */
        private final io.flutter.embedding.engine.a f5953b;

        /* renamed from: c, reason: collision with root package name */
        private final r2.b f5954c;

        /* renamed from: d, reason: collision with root package name */
        private final d f5955d;

        /* renamed from: e, reason: collision with root package name */
        private final e f5956e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC0061a f5957f;

        public b(Context context, io.flutter.embedding.engine.a aVar, r2.b bVar, d dVar, e eVar, InterfaceC0061a interfaceC0061a) {
            this.f5952a = context;
            this.f5953b = aVar;
            this.f5954c = bVar;
            this.f5955d = dVar;
            this.f5956e = eVar;
            this.f5957f = interfaceC0061a;
        }

        public Context a() {
            return this.f5952a;
        }

        public r2.b b() {
            return this.f5954c;
        }
    }

    void c(b bVar);

    void d(b bVar);
}
