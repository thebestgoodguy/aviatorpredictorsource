package b;

import b.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: i, reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f585i = new HashMap<>();

    public boolean contains(K k4) {
        return this.f585i.containsKey(k4);
    }

    @Override // b.b
    protected b.c<K, V> p(K k4) {
        return this.f585i.get(k4);
    }

    @Override // b.b
    public V t(K k4) {
        V v4 = (V) super.t(k4);
        this.f585i.remove(k4);
        return v4;
    }

    public Map.Entry<K, V> u(K k4) {
        if (contains(k4)) {
            return this.f585i.get(k4).f593h;
        }
        return null;
    }

    public V v(K k4, V v4) {
        b.c<K, V> p4 = p(k4);
        if (p4 != null) {
            return p4.f591f;
        }
        this.f585i.put(k4, s(k4, v4));
        return null;
    }
}
