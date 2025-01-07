package e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends e<K, V> implements Map<K, V> {

    /* renamed from: l, reason: collision with root package name */
    d<K, V> f3433l;

    /* renamed from: e.a$a, reason: collision with other inner class name */
    class C0031a extends d<K, V> {
        C0031a() {
        }

        @Override // e.d
        protected void a() {
            a.this.clear();
        }

        @Override // e.d
        protected Object b(int r22, int r32) {
            return a.this.f3469f[(r22 << 1) + r32];
        }

        @Override // e.d
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // e.d
        protected int d() {
            return a.this.f3470g;
        }

        @Override // e.d
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // e.d
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // e.d
        protected void g(K k4, V v4) {
            a.this.put(k4, v4);
        }

        @Override // e.d
        protected void h(int r22) {
            a.this.j(r22);
        }

        @Override // e.d
        protected V i(int r22, V v4) {
            return a.this.k(r22, v4);
        }
    }

    public a() {
    }

    public a(int r12) {
        super(r12);
    }

    private d<K, V> m() {
        if (this.f3433l == null) {
            this.f3433l = new C0031a();
        }
        return this.f3433l;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m().m();
    }

    public boolean n(Collection<?> collection) {
        return d.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f3470g + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m().n();
    }
}
