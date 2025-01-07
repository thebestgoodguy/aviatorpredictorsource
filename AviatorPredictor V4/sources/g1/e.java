package g1;

import o0.k;
import p1.p;
import p1.u;
import r1.a;

/* loaded from: classes.dex */
public final class e extends a<String> {

    /* renamed from: a, reason: collision with root package name */
    private u<String> f3870a;

    /* renamed from: b, reason: collision with root package name */
    private z0.b f3871b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3872c;

    /* renamed from: d, reason: collision with root package name */
    private final z0.a f3873d = new z0.a() { // from class: g1.d
    };

    public e(r1.a<z0.b> aVar) {
        aVar.a(new a.InterfaceC0081a() { // from class: g1.c
            @Override // r1.a.InterfaceC0081a
            public final void a(r1.b bVar) {
                e.this.h(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o0.h g(o0.h hVar) {
        return hVar.p() ? k.d(((y0.a) hVar.m()).a()) : k.c(hVar.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(r1.b bVar) {
        synchronized (this) {
            z0.b bVar2 = (z0.b) bVar.get();
            this.f3871b = bVar2;
            if (bVar2 != null) {
                bVar2.a(this.f3873d);
            }
        }
    }

    @Override // g1.a
    public synchronized o0.h<String> a() {
        z0.b bVar = this.f3871b;
        if (bVar == null) {
            return k.c(new x0.b("AppCheck is not available"));
        }
        o0.h<y0.a> b5 = bVar.b(this.f3872c);
        this.f3872c = false;
        return b5.j(p.f7051b, new o0.a() { // from class: g1.b
            @Override // o0.a
            public final Object a(o0.h hVar) {
                o0.h g5;
                g5 = e.g(hVar);
                return g5;
            }
        });
    }

    @Override // g1.a
    public synchronized void b() {
        this.f3872c = true;
    }

    @Override // g1.a
    public synchronized void c() {
        this.f3870a = null;
        z0.b bVar = this.f3871b;
        if (bVar != null) {
            bVar.c(this.f3873d);
        }
    }

    @Override // g1.a
    public synchronized void d(u<String> uVar) {
        this.f3870a = uVar;
    }
}
