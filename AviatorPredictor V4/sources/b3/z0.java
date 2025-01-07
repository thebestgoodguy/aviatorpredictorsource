package b3;

/* loaded from: classes.dex */
abstract class z0<ReqT, RespT> extends g<ReqT, RespT> {
    z0() {
    }

    @Override // b3.g
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // b3.g
    public void b() {
        f().b();
    }

    @Override // b3.g
    public void c(int r22) {
        f().c(r22);
    }

    protected abstract g<?, ?> f();

    public String toString() {
        return q0.h.c(this).d("delegate", f()).toString();
    }
}
