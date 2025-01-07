package q2;

import r2.j;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final r2.j f7211a;

    /* renamed from: b, reason: collision with root package name */
    private final j.c f7212b;

    class a implements j.c {
        a() {
        }

        @Override // r2.j.c
        public void a(r2.i iVar, j.d dVar) {
            dVar.a(null);
        }
    }

    public h(f2.a aVar) {
        a aVar2 = new a();
        this.f7212b = aVar2;
        r2.j jVar = new r2.j(aVar, "flutter/navigation", r2.f.f7454a);
        this.f7211a = jVar;
        jVar.e(aVar2);
    }

    public void a() {
        e2.b.e("NavigationChannel", "Sending message to pop route.");
        this.f7211a.c("popRoute", null);
    }

    public void b(String str) {
        e2.b.e("NavigationChannel", "Sending message to push route '" + str + "'");
        this.f7211a.c("pushRoute", str);
    }

    public void c(String str) {
        e2.b.e("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f7211a.c("setInitialRoute", str);
    }
}
