package defpackage;

import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes61.dex */
public abstract class ah extends aa implements Set {

    @CheckForNull
    private transient ad a;

    ah() {
    }

    ad d() {
        return ad.a(toArray());
    }

    @Override // defpackage.aa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public abstract i iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.aa
    public ad f() {
        ad adVar = this.a;
        if (adVar != null) {
            return adVar;
        }
        ad d = d();
        this.a = d;
        return d;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return h.a(this);
    }
}
