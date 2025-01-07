package r2;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import r2.b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final r2.b f7442a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7443b;

    /* renamed from: c, reason: collision with root package name */
    private final k f7444c;

    /* renamed from: d, reason: collision with root package name */
    private final b.c f7445d;

    public interface b {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    /* renamed from: r2.c$c, reason: collision with other inner class name */
    private final class C0085c implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final d f7446a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<b> f7447b = new AtomicReference<>(null);

        /* renamed from: r2.c$c$a */
        private final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            final AtomicBoolean f7449a;

            private a() {
                this.f7449a = new AtomicBoolean(false);
            }

            @Override // r2.c.b
            public void a(Object obj) {
                if (this.f7449a.get() || C0085c.this.f7447b.get() != this) {
                    return;
                }
                c.this.f7442a.c(c.this.f7443b, c.this.f7444c.a(obj));
            }

            @Override // r2.c.b
            public void b(String str, String str2, Object obj) {
                if (this.f7449a.get() || C0085c.this.f7447b.get() != this) {
                    return;
                }
                c.this.f7442a.c(c.this.f7443b, c.this.f7444c.f(str, str2, obj));
            }

            @Override // r2.c.b
            public void c() {
                if (this.f7449a.getAndSet(true) || C0085c.this.f7447b.get() != this) {
                    return;
                }
                c.this.f7442a.c(c.this.f7443b, null);
            }
        }

        C0085c(d dVar) {
            this.f7446a = dVar;
        }

        private void c(Object obj, b.InterfaceC0084b interfaceC0084b) {
            ByteBuffer f5;
            if (this.f7447b.getAndSet(null) != null) {
                try {
                    this.f7446a.a(obj);
                    interfaceC0084b.a(c.this.f7444c.a(null));
                    return;
                } catch (RuntimeException e5) {
                    e2.b.c("EventChannel#" + c.this.f7443b, "Failed to close event stream", e5);
                    f5 = c.this.f7444c.f("error", e5.getMessage(), null);
                }
            } else {
                f5 = c.this.f7444c.f("error", "No active stream to cancel", null);
            }
            interfaceC0084b.a(f5);
        }

        private void d(Object obj, b.InterfaceC0084b interfaceC0084b) {
            a aVar = new a();
            if (this.f7447b.getAndSet(aVar) != null) {
                try {
                    this.f7446a.a(null);
                } catch (RuntimeException e5) {
                    e2.b.c("EventChannel#" + c.this.f7443b, "Failed to close existing event stream", e5);
                }
            }
            try {
                this.f7446a.b(obj, aVar);
                interfaceC0084b.a(c.this.f7444c.a(null));
            } catch (RuntimeException e6) {
                this.f7447b.set(null);
                e2.b.c("EventChannel#" + c.this.f7443b, "Failed to open event stream", e6);
                interfaceC0084b.a(c.this.f7444c.f("error", e6.getMessage(), null));
            }
        }

        @Override // r2.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC0084b interfaceC0084b) {
            i b5 = c.this.f7444c.b(byteBuffer);
            if (b5.f7455a.equals("listen")) {
                d(b5.f7456b, interfaceC0084b);
            } else if (b5.f7455a.equals("cancel")) {
                c(b5.f7456b, interfaceC0084b);
            } else {
                interfaceC0084b.a(null);
            }
        }
    }

    public interface d {
        void a(Object obj);

        void b(Object obj, b bVar);
    }

    public c(r2.b bVar, String str) {
        this(bVar, str, q.f7470b);
    }

    public c(r2.b bVar, String str, k kVar) {
        this(bVar, str, kVar, null);
    }

    public c(r2.b bVar, String str, k kVar, b.c cVar) {
        this.f7442a = bVar;
        this.f7443b = str;
        this.f7444c = kVar;
        this.f7445d = cVar;
    }

    public void d(d dVar) {
        if (this.f7445d != null) {
            this.f7442a.a(this.f7443b, dVar != null ? new C0085c(dVar) : null, this.f7445d);
        } else {
            this.f7442a.b(this.f7443b, dVar != null ? new C0085c(dVar) : null);
        }
    }
}
