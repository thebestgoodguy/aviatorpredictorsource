package b4;

/* loaded from: classes.dex */
final class m1 extends i {

    /* renamed from: e, reason: collision with root package name */
    private final u3.l<Throwable, k3.s> f1026e;

    /* JADX WARN: Multi-variable type inference failed */
    public m1(u3.l<? super Throwable, k3.s> lVar) {
        this.f1026e = lVar;
    }

    @Override // b4.j
    public void a(Throwable th) {
        this.f1026e.invoke(th);
    }

    @Override // u3.l
    public /* bridge */ /* synthetic */ k3.s invoke(Throwable th) {
        a(th);
        return k3.s.f6374a;
    }

    public String toString() {
        return "InvokeOnCancel[" + r0.a(this.f1026e) + '@' + r0.b(this) + ']';
    }
}
