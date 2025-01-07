package u;

import t.a;
import t.a.d;

/* loaded from: classes.dex */
public final class b<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final int f7592a;

    /* renamed from: b, reason: collision with root package name */
    private final t.a<O> f7593b;

    /* renamed from: c, reason: collision with root package name */
    private final O f7594c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7595d;

    private b(t.a<O> aVar, O o4, String str) {
        this.f7593b = aVar;
        this.f7594c = o4;
        this.f7595d = str;
        this.f7592a = w.p.b(aVar, o4, str);
    }

    public static <O extends a.d> b<O> a(t.a<O> aVar, O o4, String str) {
        return new b<>(aVar, o4, str);
    }

    public final String b() {
        return this.f7593b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return w.p.a(this.f7593b, bVar.f7593b) && w.p.a(this.f7594c, bVar.f7594c) && w.p.a(this.f7595d, bVar.f7595d);
    }

    public final int hashCode() {
        return this.f7592a;
    }
}
