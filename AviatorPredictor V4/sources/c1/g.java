package c1;

import c1.h;
import java.util.Comparator;

/* loaded from: classes.dex */
public class g<K, V> implements h<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private static final g f1109a = new g();

    private g() {
    }

    public static <K, V> g<K, V> i() {
        return f1109a;
    }

    @Override // c1.h
    public h<K, V> a() {
        return this;
    }

    @Override // c1.h
    public h<K, V> b() {
        return this;
    }

    @Override // c1.h
    public h<K, V> c(K k4, V v4, Comparator<K> comparator) {
        return new i(k4, v4);
    }

    @Override // c1.h
    public h<K, V> d(K k4, Comparator<K> comparator) {
        return this;
    }

    @Override // c1.h
    public h<K, V> e(K k4, V v4, h.a aVar, h<K, V> hVar, h<K, V> hVar2) {
        return this;
    }

    @Override // c1.h
    public h<K, V> f() {
        return this;
    }

    @Override // c1.h
    public boolean g() {
        return false;
    }

    @Override // c1.h
    public K getKey() {
        return null;
    }

    @Override // c1.h
    public V getValue() {
        return null;
    }

    @Override // c1.h
    public h<K, V> h() {
        return this;
    }

    @Override // c1.h
    public boolean isEmpty() {
        return true;
    }

    @Override // c1.h
    public int size() {
        return 0;
    }
}
