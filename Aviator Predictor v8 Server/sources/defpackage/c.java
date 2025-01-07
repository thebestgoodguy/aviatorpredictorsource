package defpackage;

import java.util.AbstractMap;

/* loaded from: classes61.dex */
final class c extends ad {
    final /* synthetic */ d a;

    c(d dVar) {
        this.a = dVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int r3) {
        int r0;
        Object[] objArr;
        Object[] objArr2;
        r0 = this.a.c;
        v.a(r3, r0, "index");
        d dVar = this.a;
        int r32 = r3 + r3;
        objArr = dVar.b;
        Object obj = objArr[r32];
        obj.getClass();
        objArr2 = dVar.b;
        Object obj2 = objArr2[r32 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int r0;
        r0 = this.a.c;
        return r0;
    }
}
