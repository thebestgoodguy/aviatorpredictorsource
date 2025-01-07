package m1;

import java.util.Objects;

/* loaded from: classes.dex */
final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    private final int f6632a;

    /* renamed from: b, reason: collision with root package name */
    private final f f6633b;

    b(int r12, f fVar) {
        this.f6632a = r12;
        Objects.requireNonNull(fVar, "Null mutation");
        this.f6633b = fVar;
    }

    @Override // m1.k
    public int c() {
        return this.f6632a;
    }

    @Override // m1.k
    public f d() {
        return this.f6633b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f6632a == kVar.c() && this.f6633b.equals(kVar.d());
    }

    public int hashCode() {
        return ((this.f6632a ^ 1000003) * 1000003) ^ this.f6633b.hashCode();
    }

    public String toString() {
        return "Overlay{largestBatchId=" + this.f6632a + ", mutation=" + this.f6633b + "}";
    }
}
