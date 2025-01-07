package c1;

import c1.h;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class j<K, V> implements h<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final K f1113a;

    /* renamed from: b, reason: collision with root package name */
    private final V f1114b;

    /* renamed from: c, reason: collision with root package name */
    private h<K, V> f1115c;

    /* renamed from: d, reason: collision with root package name */
    private final h<K, V> f1116d;

    j(K k4, V v4, h<K, V> hVar, h<K, V> hVar2) {
        this.f1113a = k4;
        this.f1114b = v4;
        this.f1115c = hVar == null ? g.i() : hVar;
        this.f1116d = hVar2 == null ? g.i() : hVar2;
    }

    private j<K, V> i() {
        h<K, V> hVar = this.f1115c;
        h<K, V> e5 = hVar.e(null, null, p(hVar), null, null);
        h<K, V> hVar2 = this.f1116d;
        return e(null, null, p(this), e5, hVar2.e(null, null, p(hVar2), null, null));
    }

    private j<K, V> l() {
        j<K, V> r4 = (!this.f1116d.g() || this.f1115c.g()) ? this : r();
        if (r4.f1115c.g() && ((j) r4.f1115c).f1115c.g()) {
            r4 = r4.s();
        }
        return (r4.f1115c.g() && r4.f1116d.g()) ? r4.i() : r4;
    }

    private j<K, V> n() {
        j<K, V> i4 = i();
        return i4.a().b().g() ? i4.k(null, null, null, ((j) i4.a()).s()).r().i() : i4;
    }

    private j<K, V> o() {
        j<K, V> i4 = i();
        return i4.b().b().g() ? i4.s().i() : i4;
    }

    private static h.a p(h hVar) {
        return hVar.g() ? h.a.BLACK : h.a.RED;
    }

    private h<K, V> q() {
        if (this.f1115c.isEmpty()) {
            return g.i();
        }
        j<K, V> n4 = (b().g() || b().b().g()) ? this : n();
        return n4.k(null, null, ((j) n4.f1115c).q(), null).l();
    }

    private j<K, V> r() {
        return (j) this.f1116d.e(null, null, m(), e(null, null, h.a.RED, null, ((j) this.f1116d).f1115c), null);
    }

    private j<K, V> s() {
        return (j) this.f1115c.e(null, null, m(), null, e(null, null, h.a.RED, ((j) this.f1115c).f1116d, null));
    }

    @Override // c1.h
    public h<K, V> a() {
        return this.f1116d;
    }

    @Override // c1.h
    public h<K, V> b() {
        return this.f1115c;
    }

    @Override // c1.h
    public h<K, V> c(K k4, V v4, Comparator<K> comparator) {
        int compare = comparator.compare(k4, this.f1113a);
        return (compare < 0 ? k(null, null, this.f1115c.c(k4, v4, comparator), null) : compare == 0 ? k(k4, v4, null, null) : k(null, null, null, this.f1116d.c(k4, v4, comparator))).l();
    }

    @Override // c1.h
    public h<K, V> d(K k4, Comparator<K> comparator) {
        j<K, V> k5;
        if (comparator.compare(k4, this.f1113a) < 0) {
            j<K, V> n4 = (this.f1115c.isEmpty() || this.f1115c.g() || ((j) this.f1115c).f1115c.g()) ? this : n();
            k5 = n4.k(null, null, n4.f1115c.d(k4, comparator), null);
        } else {
            j<K, V> s4 = this.f1115c.g() ? s() : this;
            if (!s4.f1116d.isEmpty() && !s4.f1116d.g() && !((j) s4.f1116d).f1115c.g()) {
                s4 = s4.o();
            }
            if (comparator.compare(k4, s4.f1113a) == 0) {
                if (s4.f1116d.isEmpty()) {
                    return g.i();
                }
                h<K, V> f5 = s4.f1116d.f();
                s4 = s4.k(f5.getKey(), f5.getValue(), null, ((j) s4.f1116d).q());
            }
            k5 = s4.k(null, null, null, s4.f1116d.d(k4, comparator));
        }
        return k5.l();
    }

    @Override // c1.h
    public h<K, V> f() {
        return this.f1115c.isEmpty() ? this : this.f1115c.f();
    }

    @Override // c1.h
    public K getKey() {
        return this.f1113a;
    }

    @Override // c1.h
    public V getValue() {
        return this.f1114b;
    }

    @Override // c1.h
    public h<K, V> h() {
        return this.f1116d.isEmpty() ? this : this.f1116d.h();
    }

    @Override // c1.h
    public boolean isEmpty() {
        return false;
    }

    @Override // c1.h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public j<K, V> e(K k4, V v4, h.a aVar, h<K, V> hVar, h<K, V> hVar2) {
        if (k4 == null) {
            k4 = this.f1113a;
        }
        if (v4 == null) {
            v4 = this.f1114b;
        }
        if (hVar == null) {
            hVar = this.f1115c;
        }
        if (hVar2 == null) {
            hVar2 = this.f1116d;
        }
        return aVar == h.a.RED ? new i(k4, v4, hVar, hVar2) : new f(k4, v4, hVar, hVar2);
    }

    protected abstract j<K, V> k(K k4, V v4, h<K, V> hVar, h<K, V> hVar2);

    protected abstract h.a m();

    void t(h<K, V> hVar) {
        this.f1115c = hVar;
    }
}
