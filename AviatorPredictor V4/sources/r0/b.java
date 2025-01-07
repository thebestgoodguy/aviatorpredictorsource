package r0;

import java.io.Serializable;

/* loaded from: classes.dex */
final class b<F, T> extends p<F> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    final q0.d<F, ? extends T> f7384e;

    /* renamed from: f, reason: collision with root package name */
    final p<T> f7385f;

    b(q0.d<F, ? extends T> dVar, p<T> pVar) {
        this.f7384e = (q0.d) q0.l.n(dVar);
        this.f7385f = (p) q0.l.n(pVar);
    }

    @Override // r0.p, java.util.Comparator
    public int compare(F f5, F f6) {
        return this.f7385f.compare(this.f7384e.d(f5), this.f7384e.d(f6));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7384e.equals(bVar.f7384e) && this.f7385f.equals(bVar.f7385f);
    }

    public int hashCode() {
        return q0.i.b(this.f7384e, this.f7385f);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f7385f);
        String valueOf2 = String.valueOf(this.f7384e);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
