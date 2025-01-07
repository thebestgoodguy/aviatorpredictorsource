package defpackage;

/* loaded from: classes61.dex */
final class b extends ad {
    static final ad a = new b(new Object[0], 0);
    final transient Object[] b;
    private final transient int c;

    b(Object[] objArr, int r2) {
        this.b = objArr;
        this.c = r2;
    }

    @Override // defpackage.aa
    final int a() {
        return this.c;
    }

    @Override // defpackage.ad, defpackage.aa
    final int a(Object[] objArr, int r4) {
        System.arraycopy(this.b, 0, objArr, 0, this.c);
        return this.c;
    }

    @Override // defpackage.aa
    final int b() {
        return 0;
    }

    @Override // defpackage.aa
    final Object[] c() {
        return this.b;
    }

    @Override // java.util.List
    public final Object get(int r3) {
        v.a(r3, this.c, "index");
        Object obj = this.b[r3];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
