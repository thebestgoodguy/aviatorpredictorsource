package u1;

import java.util.Objects;

/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f7646a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7647b;

    a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f7646a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f7647b = str2;
    }

    @Override // u1.f
    public String b() {
        return this.f7646a;
    }

    @Override // u1.f
    public String c() {
        return this.f7647b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f7646a.equals(fVar.b()) && this.f7647b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f7646a.hashCode() ^ 1000003) * 1000003) ^ this.f7647b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f7646a + ", version=" + this.f7647b + "}";
    }
}
