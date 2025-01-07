package l1;

import java.util.ArrayList;
import java.util.List;
import l1.e;
import p1.g0;

/* loaded from: classes.dex */
public abstract class e<B extends e<B>> implements Comparable<B> {

    /* renamed from: e, reason: collision with root package name */
    final List<String> f6539e;

    e(List<String> list) {
        this.f6539e = list;
    }

    public B d(String str) {
        ArrayList arrayList = new ArrayList(this.f6539e);
        arrayList.add(str);
        return k(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    public B g(B b5) {
        ArrayList arrayList = new ArrayList(this.f6539e);
        arrayList.addAll(b5.f6539e);
        return k(arrayList);
    }

    public abstract String h();

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.f6539e.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(B b5) {
        int s4 = s();
        int s5 = b5.s();
        for (int r22 = 0; r22 < s4 && r22 < s5; r22++) {
            int compareTo = p(r22).compareTo(b5.p(r22));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return g0.k(s4, s5);
    }

    abstract B k(List<String> list);

    public String n() {
        return this.f6539e.get(s() - 1);
    }

    public String p(int r22) {
        return this.f6539e.get(r22);
    }

    public boolean q() {
        return s() == 0;
    }

    public boolean r(B b5) {
        if (s() > b5.s()) {
            return false;
        }
        for (int r02 = 0; r02 < s(); r02++) {
            if (!p(r02).equals(b5.p(r02))) {
                return false;
            }
        }
        return true;
    }

    public int s() {
        return this.f6539e.size();
    }

    public B t(int r7) {
        int s4 = s();
        p1.b.d(s4 >= r7, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(r7), Integer.valueOf(s4));
        return k(this.f6539e.subList(r7, s4));
    }

    public String toString() {
        return h();
    }

    public B u() {
        return k(this.f6539e.subList(0, s() - 1));
    }
}
