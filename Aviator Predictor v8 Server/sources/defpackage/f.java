package defpackage;

/* loaded from: classes61.dex */
final class f extends ad {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    f(Object[] objArr, int r2, int r3) {
        this.a = objArr;
        this.b = r2;
        this.c = r3;
    }

    @Override // java.util.List
    public final Object get(int r3) {
        v.a(r3, this.c, "index");
        Object obj = this.a[r3 + r3 + this.b];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
