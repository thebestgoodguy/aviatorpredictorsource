package a3;

import android.content.Context;
import j2.a;
import kotlin.jvm.internal.i;
import r2.j;

/* loaded from: classes.dex */
public final class a implements j2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0002a f149b = new C0002a(null);

    /* renamed from: a, reason: collision with root package name */
    private j f150a;

    /* renamed from: a3.a$a, reason: collision with other inner class name */
    public static final class C0002a {
        private C0002a() {
        }

        public /* synthetic */ C0002a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    private final void b() {
        j jVar = this.f150a;
        if (jVar != null) {
            jVar.e(null);
        }
        this.f150a = null;
    }

    public final void a(r2.b bVar, Context context) {
        i.d(bVar, "messenger");
        i.d(context, "context");
        this.f150a = new j(bVar, "PonnamKarthik/fluttertoast");
        d dVar = new d(context);
        j jVar = this.f150a;
        if (jVar == null) {
            return;
        }
        jVar.e(dVar);
    }

    @Override // j2.a
    public void c(a.b bVar) {
        i.d(bVar, "binding");
        r2.b b5 = bVar.b();
        i.c(b5, "binding.binaryMessenger");
        Context a5 = bVar.a();
        i.c(a5, "binding.applicationContext");
        a(b5, a5);
    }

    @Override // j2.a
    public void d(a.b bVar) {
        i.d(bVar, "p0");
        b();
    }
}
