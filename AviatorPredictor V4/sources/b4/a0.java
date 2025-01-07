package b4;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f983a;

    /* renamed from: b, reason: collision with root package name */
    public final u3.l<Throwable, k3.s> f984b;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(Object obj, u3.l<? super Throwable, k3.s> lVar) {
        this.f983a = obj;
        this.f984b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.i.a(this.f983a, a0Var.f983a) && kotlin.jvm.internal.i.a(this.f984b, a0Var.f984b);
    }

    public int hashCode() {
        Object obj = this.f983a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f984b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f983a + ", onCancellation=" + this.f984b + ')';
    }
}
