package l1;

import java.util.Objects;
import l1.q;

/* loaded from: classes.dex */
final class b extends q.a {

    /* renamed from: g, reason: collision with root package name */
    private final w f6532g;

    /* renamed from: h, reason: collision with root package name */
    private final l f6533h;

    /* renamed from: i, reason: collision with root package name */
    private final int f6534i;

    b(w wVar, l lVar, int r4) {
        Objects.requireNonNull(wVar, "Null readTime");
        this.f6532g = wVar;
        Objects.requireNonNull(lVar, "Null documentKey");
        this.f6533h = lVar;
        this.f6534i = r4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.a)) {
            return false;
        }
        q.a aVar = (q.a) obj;
        return this.f6532g.equals(aVar.q()) && this.f6533h.equals(aVar.n()) && this.f6534i == aVar.p();
    }

    public int hashCode() {
        return ((((this.f6532g.hashCode() ^ 1000003) * 1000003) ^ this.f6533h.hashCode()) * 1000003) ^ this.f6534i;
    }

    @Override // l1.q.a
    public l n() {
        return this.f6533h;
    }

    @Override // l1.q.a
    public int p() {
        return this.f6534i;
    }

    @Override // l1.q.a
    public w q() {
        return this.f6532g;
    }

    public String toString() {
        return "IndexOffset{readTime=" + this.f6532g + ", documentKey=" + this.f6533h + ", largestBatchId=" + this.f6534i + "}";
    }
}
