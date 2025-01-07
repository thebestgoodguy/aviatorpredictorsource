package l1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements Comparable<l> {

    /* renamed from: f, reason: collision with root package name */
    private static final Comparator<l> f6547f;

    /* renamed from: g, reason: collision with root package name */
    private static final c1.e<l> f6548g;

    /* renamed from: e, reason: collision with root package name */
    private final u f6549e;

    static {
        k kVar = new Comparator() { // from class: l1.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((l) obj).compareTo((l) obj2);
            }
        };
        f6547f = kVar;
        f6548g = new c1.e<>(Collections.emptyList(), kVar);
    }

    private l(u uVar) {
        p1.b.d(v(uVar), "Not a document key path: %s", uVar);
        this.f6549e = uVar;
    }

    public static Comparator<l> d() {
        return f6547f;
    }

    public static l h() {
        return p(Collections.emptyList());
    }

    public static c1.e<l> i() {
        return f6548g;
    }

    public static l k(String str) {
        u x4 = u.x(str);
        p1.b.d(x4.s() > 4 && x4.p(0).equals("projects") && x4.p(2).equals("databases") && x4.p(4).equals("documents"), "Tried to parse an invalid key: %s", x4);
        return n(x4.t(5));
    }

    public static l n(u uVar) {
        return new l(uVar);
    }

    public static l p(List<String> list) {
        return new l(u.w(list));
    }

    public static boolean v(u uVar) {
        return uVar.s() % 2 == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f6549e.equals(((l) obj).f6549e);
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        return this.f6549e.compareTo(lVar.f6549e);
    }

    public int hashCode() {
        return this.f6549e.hashCode();
    }

    public String q() {
        return this.f6549e.p(r0.s() - 2);
    }

    public u r() {
        return this.f6549e.u();
    }

    public String s() {
        return this.f6549e.n();
    }

    public u t() {
        return this.f6549e;
    }

    public String toString() {
        return this.f6549e.toString();
    }

    public boolean u(String str) {
        if (this.f6549e.s() >= 2) {
            u uVar = this.f6549e;
            if (uVar.f6539e.get(uVar.s() - 2).equals(str)) {
                return true;
            }
        }
        return false;
    }
}
