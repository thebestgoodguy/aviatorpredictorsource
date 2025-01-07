package b3;

import b3.g;

/* loaded from: classes.dex */
public abstract class z<ReqT, RespT> extends z0<ReqT, RespT> {
    @Override // b3.z0, b3.g
    public /* bridge */ /* synthetic */ void a(String str, Throwable th) {
        super.a(str, th);
    }

    @Override // b3.z0, b3.g
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // b3.z0, b3.g
    public /* bridge */ /* synthetic */ void c(int r12) {
        super.c(r12);
    }

    @Override // b3.g
    public void d(ReqT reqt) {
        f().d(reqt);
    }

    @Override // b3.g
    public void e(g.a<RespT> aVar, u0 u0Var) {
        f().e(aVar, u0Var);
    }

    @Override // b3.z0
    protected abstract g<ReqT, RespT> f();

    @Override // b3.z0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
