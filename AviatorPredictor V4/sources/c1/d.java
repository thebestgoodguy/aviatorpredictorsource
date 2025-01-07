package c1;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class d<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<j<K, V>> f1104e = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1105f;

    d(h<K, V> hVar, K k4, Comparator<K> comparator, boolean z4) {
        int r02;
        this.f1105f = z4;
        while (!hVar.isEmpty()) {
            if (k4 != null) {
                K key = hVar.getKey();
                r02 = z4 ? comparator.compare(k4, key) : comparator.compare(key, k4);
            } else {
                r02 = 1;
            }
            if (r02 < 0) {
                hVar = z4 ? hVar.b() : hVar.a();
            } else if (r02 == 0) {
                this.f1104e.push((j) hVar);
                return;
            } else {
                this.f1104e.push((j) hVar);
                if (z4) {
                }
            }
        }
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        try {
            j<K, V> pop = this.f1104e.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.getKey(), pop.getValue());
            if (this.f1105f) {
                for (h<K, V> b5 = pop.b(); !b5.isEmpty(); b5 = b5.a()) {
                    this.f1104e.push((j) b5);
                }
            } else {
                for (h<K, V> a5 = pop.a(); !a5.isEmpty(); a5 = a5.b()) {
                    this.f1104e.push((j) a5);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1104e.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
