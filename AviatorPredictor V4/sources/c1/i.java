package c1;

import c1.h;

/* loaded from: classes.dex */
public class i<K, V> extends j<K, V> {
    i(K k4, V v4) {
        super(k4, v4, g.i(), g.i());
    }

    i(K k4, V v4, h<K, V> hVar, h<K, V> hVar2) {
        super(k4, v4, hVar, hVar2);
    }

    @Override // c1.h
    public boolean g() {
        return true;
    }

    @Override // c1.j
    protected j<K, V> k(K k4, V v4, h<K, V> hVar, h<K, V> hVar2) {
        if (k4 == null) {
            k4 = getKey();
        }
        if (v4 == null) {
            v4 = getValue();
        }
        if (hVar == null) {
            hVar = b();
        }
        if (hVar2 == null) {
            hVar2 = a();
        }
        return new i(k4, v4, hVar, hVar2);
    }

    @Override // c1.j
    protected h.a m() {
        return h.a.RED;
    }

    @Override // c1.h
    public int size() {
        return b().size() + 1 + a().size();
    }
}
