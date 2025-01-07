package l1;

import java.util.List;
import java.util.Objects;
import l1.q;

/* loaded from: classes.dex */
final class a extends q {

    /* renamed from: c, reason: collision with root package name */
    private final int f6528c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6529d;

    /* renamed from: e, reason: collision with root package name */
    private final List<q.c> f6530e;

    /* renamed from: f, reason: collision with root package name */
    private final q.b f6531f;

    a(int r12, String str, List<q.c> list, q.b bVar) {
        this.f6528c = r12;
        Objects.requireNonNull(str, "Null collectionGroup");
        this.f6529d = str;
        Objects.requireNonNull(list, "Null segments");
        this.f6530e = list;
        Objects.requireNonNull(bVar, "Null indexState");
        this.f6531f = bVar;
    }

    @Override // l1.q
    public String d() {
        return this.f6529d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f6528c == qVar.f() && this.f6529d.equals(qVar.d()) && this.f6530e.equals(qVar.h()) && this.f6531f.equals(qVar.g());
    }

    @Override // l1.q
    public int f() {
        return this.f6528c;
    }

    @Override // l1.q
    public q.b g() {
        return this.f6531f;
    }

    @Override // l1.q
    public List<q.c> h() {
        return this.f6530e;
    }

    public int hashCode() {
        return ((((((this.f6528c ^ 1000003) * 1000003) ^ this.f6529d.hashCode()) * 1000003) ^ this.f6530e.hashCode()) * 1000003) ^ this.f6531f.hashCode();
    }

    public String toString() {
        return "FieldIndex{indexId=" + this.f6528c + ", collectionGroup=" + this.f6529d + ", segments=" + this.f6530e + ", indexState=" + this.f6531f + "}";
    }
}
