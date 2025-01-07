package m1;

import l1.r;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final r f6636a;

    /* renamed from: b, reason: collision with root package name */
    private final p f6637b;

    public e(r rVar, p pVar) {
        this.f6636a = rVar;
        this.f6637b = pVar;
    }

    public r a() {
        return this.f6636a;
    }

    public p b() {
        return this.f6637b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f6636a.equals(eVar.f6636a)) {
            return this.f6637b.equals(eVar.f6637b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f6636a.hashCode() * 31) + this.f6637b.hashCode();
    }
}
