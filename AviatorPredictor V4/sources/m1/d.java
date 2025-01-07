package m1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l1.r;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static d f6634b = b(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    private final Set<r> f6635a;

    private d(Set<r> set) {
        this.f6635a = set;
    }

    public static d b(Set<r> set) {
        return new d(set);
    }

    public boolean a(r rVar) {
        Iterator<r> it = this.f6635a.iterator();
        while (it.hasNext()) {
            if (it.next().r(rVar)) {
                return true;
            }
        }
        return false;
    }

    public Set<r> c() {
        return this.f6635a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f6635a.equals(((d) obj).f6635a);
    }

    public int hashCode() {
        return this.f6635a.hashCode();
    }

    public String toString() {
        return "FieldMask{mask=" + this.f6635a.toString() + "}";
    }
}
