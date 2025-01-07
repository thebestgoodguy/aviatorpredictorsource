package com.google.protobuf;

import com.google.protobuf.w;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class q1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: e, reason: collision with root package name */
    private final int f3043e;

    /* renamed from: f, reason: collision with root package name */
    private List<q1<K, V>.e> f3044f;

    /* renamed from: g, reason: collision with root package name */
    private Map<K, V> f3045g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3046h;

    /* renamed from: i, reason: collision with root package name */
    private volatile q1<K, V>.g f3047i;

    /* renamed from: j, reason: collision with root package name */
    private Map<K, V> f3048j;

    /* renamed from: k, reason: collision with root package name */
    private volatile q1<K, V>.c f3049k;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    static class a<FieldDescriptorType> extends q1<FieldDescriptorType, Object> {
        a(int r22) {
            super(r22, null);
        }

        @Override // com.google.protobuf.q1
        public void p() {
            if (!o()) {
                for (int r02 = 0; r02 < k(); r02++) {
                    Map.Entry<FieldDescriptorType, Object> j4 = j(r02);
                    if (((w.b) j4.getKey()).f()) {
                        j4.setValue(Collections.unmodifiableList((List) j4.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m()) {
                    if (((w.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.p();
        }

        @Override // com.google.protobuf.q1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((w.b) obj, obj2);
        }
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: e, reason: collision with root package name */
        private int f3050e;

        /* renamed from: f, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f3051f;

        private b() {
            this.f3050e = q1.this.f3044f.size();
        }

        /* synthetic */ b(q1 q1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> c() {
            if (this.f3051f == null) {
                this.f3051f = q1.this.f3048j.entrySet().iterator();
            }
            return this.f3051f;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (c().hasNext()) {
                entry = c().next();
            } else {
                List list = q1.this.f3044f;
                int r12 = this.f3050e - 1;
                this.f3050e = r12;
                entry = (Map.Entry<K, V>) list.get(r12);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int r02 = this.f3050e;
            return (r02 > 0 && r02 <= q1.this.f3044f.size()) || c().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class c extends q1<K, V>.g {
        private c() {
            super(q1.this, null);
        }

        /* synthetic */ c(q1 q1Var, a aVar) {
            this();
        }

        @Override // com.google.protobuf.q1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(q1.this, null);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f3054a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f3055b = new b();

        static class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f3054a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f3055b;
        }
    }

    private class e implements Map.Entry<K, V>, Comparable<q1<K, V>.e> {

        /* renamed from: e, reason: collision with root package name */
        private final K f3056e;

        /* renamed from: f, reason: collision with root package name */
        private V f3057f;

        e(K k4, V v4) {
            this.f3056e = k4;
            this.f3057f = v4;
        }

        e(q1 q1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean g(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(q1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return g(this.f3056e, entry.getKey()) && g(this.f3057f, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f3057f;
        }

        @Override // java.util.Map.Entry
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f3056e;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k4 = this.f3056e;
            int hashCode = k4 == null ? 0 : k4.hashCode();
            V v4 = this.f3057f;
            return hashCode ^ (v4 != null ? v4.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            q1.this.g();
            V v5 = this.f3057f;
            this.f3057f = v4;
            return v5;
        }

        public String toString() {
            return this.f3056e + "=" + this.f3057f;
        }
    }

    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: e, reason: collision with root package name */
        private int f3059e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3060f;

        /* renamed from: g, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f3061g;

        private f() {
            this.f3059e = -1;
        }

        /* synthetic */ f(q1 q1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> c() {
            if (this.f3061g == null) {
                this.f3061g = q1.this.f3045g.entrySet().iterator();
            }
            return this.f3061g;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f3060f = true;
            int r12 = this.f3059e + 1;
            this.f3059e = r12;
            return r12 < q1.this.f3044f.size() ? (Map.Entry<K, V>) q1.this.f3044f.get(this.f3059e) : c().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3059e + 1 >= q1.this.f3044f.size()) {
                return !q1.this.f3045g.isEmpty() && c().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3060f) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f3060f = false;
            q1.this.g();
            if (this.f3059e >= q1.this.f3044f.size()) {
                c().remove();
                return;
            }
            q1 q1Var = q1.this;
            int r12 = this.f3059e;
            this.f3059e = r12 - 1;
            q1Var.s(r12);
        }
    }

    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(q1 q1Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            q1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = q1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            q1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(q1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            q1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return q1.this.size();
        }
    }

    private q1(int r12) {
        this.f3043e = r12;
        this.f3044f = Collections.emptyList();
        this.f3045g = Collections.emptyMap();
        this.f3048j = Collections.emptyMap();
    }

    /* synthetic */ q1(int r12, a aVar) {
        this(r12);
    }

    private int f(K k4) {
        int size = this.f3044f.size() - 1;
        if (size >= 0) {
            int compareTo = k4.compareTo(this.f3044f.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int r12 = 0;
        while (r12 <= size) {
            int r22 = (r12 + size) / 2;
            int compareTo2 = k4.compareTo(this.f3044f.get(r22).getKey());
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
    public void g() {
        if (this.f3046h) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f3044f.isEmpty() || (this.f3044f instanceof ArrayList)) {
            return;
        }
        this.f3044f = new ArrayList(this.f3043e);
    }

    private SortedMap<K, V> n() {
        g();
        if (this.f3045g.isEmpty() && !(this.f3045g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3045g = treeMap;
            this.f3048j = treeMap.descendingMap();
        }
        return (SortedMap) this.f3045g;
    }

    static <FieldDescriptorType extends w.b<FieldDescriptorType>> q1<FieldDescriptorType, Object> q(int r12) {
        return new a(r12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V s(int r5) {
        g();
        V value = this.f3044f.remove(r5).getValue();
        if (!this.f3045g.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.f3044f.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f3044f.isEmpty()) {
            this.f3044f.clear();
        }
        if (this.f3045g.isEmpty()) {
            return;
        }
        this.f3045g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f3045g.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f3047i == null) {
            this.f3047i = new g(this, null);
        }
        return this.f3047i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return super.equals(obj);
        }
        q1 q1Var = (q1) obj;
        int size = size();
        if (size != q1Var.size()) {
            return false;
        }
        int k4 = k();
        if (k4 != q1Var.k()) {
            return entrySet().equals(q1Var.entrySet());
        }
        for (int r4 = 0; r4 < k4; r4++) {
            if (!j(r4).equals(q1Var.j(r4))) {
                return false;
            }
        }
        if (k4 != size) {
            return this.f3045g.equals(q1Var.f3045g);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f5 = f(comparable);
        return f5 >= 0 ? this.f3044f.get(f5).getValue() : this.f3045g.get(comparable);
    }

    Set<Map.Entry<K, V>> h() {
        if (this.f3049k == null) {
            this.f3049k = new c(this, null);
        }
        return this.f3049k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int k4 = k();
        int r22 = 0;
        for (int r12 = 0; r12 < k4; r12++) {
            r22 += this.f3044f.get(r12).hashCode();
        }
        return l() > 0 ? r22 + this.f3045g.hashCode() : r22;
    }

    public Map.Entry<K, V> j(int r22) {
        return this.f3044f.get(r22);
    }

    public int k() {
        return this.f3044f.size();
    }

    public int l() {
        return this.f3045g.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f3045g.isEmpty() ? d.b() : this.f3045g.entrySet();
    }

    public boolean o() {
        return this.f3046h;
    }

    public void p() {
        if (this.f3046h) {
            return;
        }
        this.f3045g = this.f3045g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3045g);
        this.f3048j = this.f3048j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3048j);
        this.f3046h = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public V put(K k4, V v4) {
        g();
        int f5 = f(k4);
        if (f5 >= 0) {
            return this.f3044f.get(f5).setValue(v4);
        }
        i();
        int r02 = -(f5 + 1);
        if (r02 >= this.f3043e) {
            return n().put(k4, v4);
        }
        int size = this.f3044f.size();
        int r22 = this.f3043e;
        if (size == r22) {
            q1<K, V>.e remove = this.f3044f.remove(r22 - 1);
            n().put(remove.getKey(), remove.getValue());
        }
        this.f3044f.add(r02, new e(k4, v4));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f5 = f(comparable);
        if (f5 >= 0) {
            return (V) s(f5);
        }
        if (this.f3045g.isEmpty()) {
            return null;
        }
        return this.f3045g.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f3044f.size() + this.f3045g.size();
    }
}
