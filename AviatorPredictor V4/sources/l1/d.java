package l1;

import java.util.Objects;
import l1.q;

/* loaded from: classes.dex */
final class d extends q.c {

    /* renamed from: e, reason: collision with root package name */
    private final r f6537e;

    /* renamed from: f, reason: collision with root package name */
    private final q.c.a f6538f;

    d(r rVar, q.c.a aVar) {
        Objects.requireNonNull(rVar, "Null fieldPath");
        this.f6537e = rVar;
        Objects.requireNonNull(aVar, "Null kind");
        this.f6538f = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.c)) {
            return false;
        }
        q.c cVar = (q.c) obj;
        return this.f6537e.equals(cVar.h()) && this.f6538f.equals(cVar.i());
    }

    @Override // l1.q.c
    public r h() {
        return this.f6537e;
    }

    public int hashCode() {
        return ((this.f6537e.hashCode() ^ 1000003) * 1000003) ^ this.f6538f.hashCode();
    }

    @Override // l1.q.c
    public q.c.a i() {
        return this.f6538f;
    }

    public String toString() {
        return "Segment{fieldPath=" + this.f6537e + ", kind=" + this.f6538f + "}";
    }
}
