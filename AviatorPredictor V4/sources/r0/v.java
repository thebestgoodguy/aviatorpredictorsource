package r0;

/* loaded from: classes.dex */
final class v<E> extends j<E> {

    /* renamed from: g, reason: collision with root package name */
    final transient E f7430g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f7431h;

    v(E e5) {
        this.f7430g = (E) q0.l.n(e5);
    }

    v(E e5, int r22) {
        this.f7430g = e5;
        this.f7431h = r22;
    }

    @Override // r0.g, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f7430g.equals(obj);
    }

    @Override // r0.j, java.util.Collection, java.util.Set
    public final int hashCode() {
        int r02 = this.f7431h;
        if (r02 != 0) {
            return r02;
        }
        int hashCode = this.f7430g.hashCode();
        this.f7431h = hashCode;
        return hashCode;
    }

    @Override // r0.g
    int i(Object[] objArr, int r32) {
        objArr[r32] = this.f7430g;
        return r32 + 1;
    }

    @Override // r0.g
    boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // r0.j, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: t */
    public x<E> iterator() {
        return k.b(this.f7430g);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f7430g.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // r0.j
    h<E> y() {
        return h.A(this.f7430g);
    }

    @Override // r0.j
    boolean z() {
        return this.f7431h != 0;
    }
}
