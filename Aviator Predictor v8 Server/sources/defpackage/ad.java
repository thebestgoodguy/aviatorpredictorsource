package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* loaded from: classes61.dex */
public abstract class ad extends aa implements List, RandomAccess {
    private static final j a = new ab(b.a, 0);

    ad() {
    }

    static ad a(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static ad b(Object[] objArr, int r2) {
        return r2 == 0 ? b.a : new b(objArr, r2);
    }

    public static ad d() {
        return b.a;
    }

    @Override // defpackage.aa
    int a(Object[] objArr, int r4) {
        int size = size();
        for (int r0 = 0; r0 < size; r0++) {
            objArr[r0] = get(r0);
        }
        return size;
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ad subList(int r2, int r3) {
        v.a(r2, r3, size());
        int r32 = r3 - r2;
        return r32 == size() ? this : r32 == 0 ? b.a : new ac(this, r2, r32);
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j listIterator(int r3) {
        v.b(r3, size(), "index");
        return isEmpty() ? a : new ab(this, r3);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int r1, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int r1, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aa, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // defpackage.aa
    /* renamed from: e */
    public final i iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int r3 = 0; r3 < size; r3++) {
                        if (u.a(get(r3), list.get(r3))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !u.a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aa
    @Deprecated
    public final ad f() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int r1 = 1;
        for (int r2 = 0; r2 < size; r2++) {
            r1 = (r1 * 31) + get(r2).hashCode();
        }
        return r1;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int r2 = 0; r2 < size; r2++) {
            if (obj.equals(get(r2))) {
                return r2;
            }
        }
        return -1;
    }

    @Override // defpackage.aa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int r1, Object obj) {
        throw new UnsupportedOperationException();
    }
}
