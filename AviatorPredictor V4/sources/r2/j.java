package r2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import r2.b;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final r2.b f7457a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7458b;

    /* renamed from: c, reason: collision with root package name */
    private final k f7459c;

    /* renamed from: d, reason: collision with root package name */
    private final b.c f7460d;

    private final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final c f7461a;

        /* renamed from: r2.j$a$a, reason: collision with other inner class name */
        class C0086a implements d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.InterfaceC0084b f7463a;

            C0086a(b.InterfaceC0084b interfaceC0084b) {
                this.f7463a = interfaceC0084b;
            }

            @Override // r2.j.d
            public void a(Object obj) {
                this.f7463a.a(j.this.f7459c.a(obj));
            }

            @Override // r2.j.d
            public void b(String str, String str2, Object obj) {
                this.f7463a.a(j.this.f7459c.f(str, str2, obj));
            }

            @Override // r2.j.d
            public void c() {
                this.f7463a.a(null);
            }
        }

        a(c cVar) {
            this.f7461a = cVar;
        }

        private String b(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        @Override // r2.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC0084b interfaceC0084b) {
            try {
                this.f7461a.a(j.this.f7459c.b(byteBuffer), new C0086a(interfaceC0084b));
            } catch (RuntimeException e5) {
                e2.b.c("MethodChannel#" + j.this.f7458b, "Failed to handle method call", e5);
                interfaceC0084b.a(j.this.f7459c.d("error", e5.getMessage(), null, b(e5)));
            }
        }
    }

    private final class b implements b.InterfaceC0084b {

        /* renamed from: a, reason: collision with root package name */
        private final d f7465a;

        b(d dVar) {
            this.f7465a = dVar;
        }

        @Override // r2.b.InterfaceC0084b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f7465a.c();
                } else {
                    try {
                        this.f7465a.a(j.this.f7459c.c(byteBuffer));
                    } catch (r2.d e5) {
                        this.f7465a.b(e5.f7451e, e5.getMessage(), e5.f7452f);
                    }
                }
            } catch (RuntimeException e6) {
                e2.b.c("MethodChannel#" + j.this.f7458b, "Failed to handle method call result", e6);
            }
        }
    }

    public interface c {
        void a(i iVar, d dVar);
    }

    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public j(r2.b bVar, String str) {
        this(bVar, str, q.f7470b);
    }

    public j(r2.b bVar, String str, k kVar) {
        this(bVar, str, kVar, null);
    }

    public j(r2.b bVar, String str, k kVar, b.c cVar) {
        this.f7457a = bVar;
        this.f7458b = str;
        this.f7459c = kVar;
        this.f7460d = cVar;
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f7457a.e(this.f7458b, this.f7459c.e(new i(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.f7460d != null) {
            this.f7457a.a(this.f7458b, cVar != null ? new a(cVar) : null, this.f7460d);
        } else {
            this.f7457a.b(this.f7458b, cVar != null ? new a(cVar) : null);
        }
    }
}
