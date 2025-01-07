package r2;

import java.nio.ByteBuffer;
import r2.b;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final r2.b f7432a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7433b;

    /* renamed from: c, reason: collision with root package name */
    private final h<T> f7434c;

    /* renamed from: d, reason: collision with root package name */
    private final b.c f7435d;

    private final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final d<T> f7436a;

        /* renamed from: r2.a$b$a, reason: collision with other inner class name */
        class C0083a implements e<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.InterfaceC0084b f7438a;

            C0083a(b.InterfaceC0084b interfaceC0084b) {
                this.f7438a = interfaceC0084b;
            }

            @Override // r2.a.e
            public void a(T t4) {
                this.f7438a.a(a.this.f7434c.b(t4));
            }
        }

        private b(d<T> dVar) {
            this.f7436a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // r2.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC0084b interfaceC0084b) {
            try {
                this.f7436a.a(a.this.f7434c.a(byteBuffer), new C0083a(interfaceC0084b));
            } catch (RuntimeException e5) {
                e2.b.c("BasicMessageChannel#" + a.this.f7433b, "Failed to handle message", e5);
                interfaceC0084b.a(null);
            }
        }
    }

    private final class c implements b.InterfaceC0084b {

        /* renamed from: a, reason: collision with root package name */
        private final e<T> f7440a;

        private c(e<T> eVar) {
            this.f7440a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // r2.b.InterfaceC0084b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f7440a.a(a.this.f7434c.a(byteBuffer));
            } catch (RuntimeException e5) {
                e2.b.c("BasicMessageChannel#" + a.this.f7433b, "Failed to handle message reply", e5);
            }
        }
    }

    public interface d<T> {
        void a(T t4, e<T> eVar);
    }

    public interface e<T> {
        void a(T t4);
    }

    public a(r2.b bVar, String str, h<T> hVar) {
        this(bVar, str, hVar, null);
    }

    public a(r2.b bVar, String str, h<T> hVar, b.c cVar) {
        this.f7432a = bVar;
        this.f7433b = str;
        this.f7434c = hVar;
        this.f7435d = cVar;
    }

    public void c(T t4) {
        d(t4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(T t4, e<T> eVar) {
        this.f7432a.e(this.f7433b, this.f7434c.b(t4), eVar != null ? new c(eVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [r2.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [r2.a$a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r2.b$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public void e(d<T> dVar) {
        if (this.f7435d != null) {
            this.f7432a.a(this.f7433b, dVar != null ? new b(dVar) : null, this.f7435d);
        } else {
            this.f7432a.b(this.f7433b, dVar != null ? new b(dVar) : 0);
        }
    }
}
