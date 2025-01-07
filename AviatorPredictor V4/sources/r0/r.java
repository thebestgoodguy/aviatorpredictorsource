package r0;

/* loaded from: classes.dex */
class r<E> extends h<E> {

    /* renamed from: i, reason: collision with root package name */
    static final h<Object> f7407i = new r(new Object[0], 0);

    /* renamed from: g, reason: collision with root package name */
    final transient Object[] f7408g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f7409h;

    r(Object[] objArr, int r22) {
        this.f7408g = objArr;
        this.f7409h = r22;
    }

    @Override // java.util.List
    public E get(int r22) {
        q0.l.l(r22, this.f7409h);
        return (E) this.f7408g[r22];
    }

    @Override // r0.h, r0.g
    int i(Object[] objArr, int r5) {
        System.arraycopy(this.f7408g, 0, objArr, r5, this.f7409h);
        return r5 + this.f7409h;
    }

    @Override // r0.g
    Object[] p() {
        return this.f7408g;
    }

    @Override // r0.g
    int q() {
        return this.f7409h;
    }

    @Override // r0.g
    int r() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7409h;
    }
}
