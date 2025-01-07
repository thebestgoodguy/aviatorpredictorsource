package c1;

import c1.h;

/* loaded from: classes.dex */
public class f<K, V> extends j<K, V> {

    /* renamed from: e, reason: collision with root package name */
    private int f1108e;

    f(K k4, V v4, h<K, V> hVar, h<K, V> hVar2) {
        super(k4, v4, hVar, hVar2);
        this.f1108e = -1;
    }

    @Override // c1.h
    public boolean g() {
        return false;
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
        return new f(k4, v4, hVar, hVar2);
    }

    @Override // c1.j
    protected h.a m() {
        return h.a.BLACK;
    }

    @Override // c1.h
    public int size() {
        if (this.f1108e == -1) {
            this.f1108e = b().size() + 1 + a().size();
        }
        return this.f1108e;
    }

    @Override // c1.j
    void t(h<K, V> hVar) {
        if (this.f1108e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.t(hVar);
    }
}
