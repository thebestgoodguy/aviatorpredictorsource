package l1;

import java.util.Objects;
import l1.q;

/* loaded from: classes.dex */
final class c extends q.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f6535a;

    /* renamed from: b, reason: collision with root package name */
    private final q.a f6536b;

    c(long j4, q.a aVar) {
        this.f6535a = j4;
        Objects.requireNonNull(aVar, "Null offset");
        this.f6536b = aVar;
    }

    @Override // l1.q.b
    public q.a c() {
        return this.f6536b;
    }

    @Override // l1.q.b
    public long d() {
        return this.f6535a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.b)) {
            return false;
        }
        q.b bVar = (q.b) obj;
        return this.f6535a == bVar.d() && this.f6536b.equals(bVar.c());
    }

    public int hashCode() {
        long j4 = this.f6535a;
        return this.f6536b.hashCode() ^ ((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "IndexState{sequenceNumber=" + this.f6535a + ", offset=" + this.f6536b + "}";
    }
}
