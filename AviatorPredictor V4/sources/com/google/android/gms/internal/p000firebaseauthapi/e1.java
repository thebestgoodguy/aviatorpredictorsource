package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class e1 extends AbstractMap {

    /* renamed from: e, reason: collision with root package name */
    private final int f1533e;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1536h;

    /* renamed from: i, reason: collision with root package name */
    private volatile b1 f1537i;

    /* renamed from: f, reason: collision with root package name */
    private List f1534f = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    private Map f1535g = Collections.emptyMap();

    /* renamed from: j, reason: collision with root package name */
    private Map f1538j = Collections.emptyMap();

    private final int k(Comparable comparable) {
        int size = this.f1534f.size() - 1;
        int r12 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((x0) this.f1534f.get(size)).d());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (r12 <= size) {
            int r22 = (r12 + size) / 2;
            int compareTo2 = comparable.compareTo(((x0) this.f1534f.get(r22)).d());
            if (compareTo2 < 0) {
                size = r22 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return r22;
                }
                r12 = r22 + 1;
            }
        }
        return -(r12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(int r6) {
        n();
        Object value = ((x0) this.f1534f.remove(r6)).getValue();
        if (!this.f1535g.isEmpty()) {
            Iterator it = m().entrySet().iterator();
            List list = this.f1534f;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new x0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap m() {
        n();
        if (this.f1535g.isEmpty() && !(this.f1535g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1535g = treeMap;
            this.f1538j = treeMap.descendingMap();
        }
        return (SortedMap) this.f1535g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.f1536h) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f1536h) {
            return;
        }
        this.f1535g = this.f1535g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f1535g);
        this.f1538j = this.f1538j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f1538j);
        this.f1536h = true;
    }

    public final int b() {
        return this.f1534f.size();
    }

    public final Iterable c() {
        return this.f1535g.isEmpty() ? w0.a() : this.f1535g.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        if (!this.f1534f.isEmpty()) {
            this.f1534f.clear();
        }
        if (this.f1535g.isEmpty()) {
            return;
        }
        this.f1535g.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return k(comparable) >= 0 || this.f1535g.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        n();
        int k4 = k(comparable);
        if (k4 >= 0) {
            return ((x0) this.f1534f.get(k4)).setValue(obj);
        }
        n();
        if (this.f1534f.isEmpty() && !(this.f1534f instanceof ArrayList)) {
            this.f1534f = new ArrayList(this.f1533e);
        }
        int r02 = -(k4 + 1);
        if (r02 >= this.f1533e) {
            return m().put(comparable, obj);
        }
        int size = this.f1534f.size();
        int r22 = this.f1533e;
        if (size == r22) {
            x0 x0Var = (x0) this.f1534f.remove(r22 - 1);
            m().put(x0Var.d(), x0Var.getValue());
        }
        this.f1534f.add(r02, new x0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1537i == null) {
            this.f1537i = new b1(this, null);
        }
        return this.f1537i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return super.equals(obj);
        }
        e1 e1Var = (e1) obj;
        int size = size();
        if (size != e1Var.size()) {
            return false;
        }
        int b5 = b();
        if (b5 == e1Var.b()) {
            for (int r4 = 0; r4 < b5; r4++) {
                if (!g(r4).equals(e1Var.g(r4))) {
                    return false;
                }
            }
            if (b5 == size) {
                return true;
            }
            entrySet = this.f1535g;
            entrySet2 = e1Var.f1535g;
        } else {
            entrySet = entrySet();
            entrySet2 = e1Var.entrySet();
        }
        return entrySet.equals(entrySet2);
    }

    public final Map.Entry g(int r22) {
        return (Map.Entry) this.f1534f.get(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k4 = k(comparable);
        return k4 >= 0 ? ((x0) this.f1534f.get(k4)).getValue() : this.f1535g.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b5 = b();
        int r22 = 0;
        for (int r12 = 0; r12 < b5; r12++) {
            r22 += ((x0) this.f1534f.get(r12)).hashCode();
        }
        return this.f1535g.size() > 0 ? r22 + this.f1535g.hashCode() : r22;
    }

    public final boolean j() {
        return this.f1536h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int k4 = k(comparable);
        if (k4 >= 0) {
            return l(k4);
        }
        if (this.f1535g.isEmpty()) {
            return null;
        }
        return this.f1535g.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1534f.size() + this.f1535g.size();
    }
}
