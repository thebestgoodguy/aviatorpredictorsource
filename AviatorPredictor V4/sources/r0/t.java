package r0;

/* loaded from: classes.dex */
final class t<E> extends j<E> {

    /* renamed from: l, reason: collision with root package name */
    static final t<Object> f7424l = new t<>(new Object[0], 0, null, 0, 0);

    /* renamed from: g, reason: collision with root package name */
    final transient Object[] f7425g;

    /* renamed from: h, reason: collision with root package name */
    final transient Object[] f7426h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f7427i;

    /* renamed from: j, reason: collision with root package name */
    private final transient int f7428j;

    /* renamed from: k, reason: collision with root package name */
    private final transient int f7429k;

    t(Object[] objArr, int r22, Object[] objArr2, int r4, int r5) {
        this.f7425g = objArr;
        this.f7426h = objArr2;
        this.f7427i = r4;
        this.f7428j = r22;
        this.f7429k = r5;
    }

    @Override // r0.g, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f7426h;
        if (obj == null || objArr == null) {
            return false;
        }
        int b5 = f.b(obj);
        while (true) {
            int r22 = b5 & this.f7427i;
            Object obj2 = objArr[r22];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b5 = r22 + 1;
        }
    }

    @Override // r0.j, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f7428j;
    }

    @Override // r0.g
    int i(Object[] objArr, int r5) {
        System.arraycopy(this.f7425g, 0, objArr, r5, this.f7429k);
        return r5 + this.f7429k;
    }

    @Override // r0.g
    Object[] p() {
        return this.f7425g;
    }

    @Override // r0.g
    int q() {
        return this.f7429k;
    }

    @Override // r0.g
    int r() {
        return 0;
    }

    @Override // r0.g
    boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f7429k;
    }

    @Override // r0.j, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: t */
    public x<E> iterator() {
        return u().iterator();
    }

    @Override // r0.j
    h<E> y() {
        return h.v(this.f7425g, this.f7429k);
    }

    @Override // r0.j
    boolean z() {
        return true;
    }
}
