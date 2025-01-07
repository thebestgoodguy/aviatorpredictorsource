package a1;

/* loaded from: classes.dex */
final class g implements o0.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f40a;

    g(h hVar) {
        this.f40a = hVar;
    }

    @Override // o0.a
    public final /* bridge */ /* synthetic */ Object a(o0.h hVar) {
        com.google.firebase.auth.n1 n1Var;
        com.google.firebase.auth.n1 n1Var2;
        com.google.firebase.auth.n1 n1Var3;
        n1Var = this.f40a.f47h;
        if (n1Var == null) {
            return hVar;
        }
        if (hVar.p()) {
            com.google.firebase.auth.i iVar = (com.google.firebase.auth.i) hVar.m();
            m1 m1Var = (m1) iVar.k();
            e1 e1Var = (e1) iVar.f0();
            n1Var3 = this.f40a.f47h;
            return o0.k.d(new g1(m1Var, e1Var, n1Var3));
        }
        Exception l4 = hVar.l();
        if (l4 instanceof com.google.firebase.auth.w) {
            n1Var2 = this.f40a.f47h;
            ((com.google.firebase.auth.w) l4).d(n1Var2);
        }
        return o0.k.c(l4);
    }
}
