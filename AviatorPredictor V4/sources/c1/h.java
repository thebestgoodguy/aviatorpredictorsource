package c1;

import java.util.Comparator;

/* loaded from: classes.dex */
public interface h<K, V> {

    public enum a {
        RED,
        BLACK
    }

    h<K, V> a();

    h<K, V> b();

    h<K, V> c(K k4, V v4, Comparator<K> comparator);

    h<K, V> d(K k4, Comparator<K> comparator);

    h<K, V> e(K k4, V v4, a aVar, h<K, V> hVar, h<K, V> hVar2);

    h<K, V> f();

    boolean g();

    K getKey();

    V getValue();

    h<K, V> h();

    boolean isEmpty();

    int size();
}
