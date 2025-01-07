package q1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    private final String f7167a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f7168b;

    a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f7167a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f7168b = list;
    }

    @Override // q1.m
    public List<String> b() {
        return this.f7168b;
    }

    @Override // q1.m
    public String c() {
        return this.f7167a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f7167a.equals(mVar.c()) && this.f7168b.equals(mVar.b());
    }

    public int hashCode() {
        return ((this.f7167a.hashCode() ^ 1000003) * 1000003) ^ this.f7168b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f7167a + ", usedDates=" + this.f7168b + "}";
    }
}
