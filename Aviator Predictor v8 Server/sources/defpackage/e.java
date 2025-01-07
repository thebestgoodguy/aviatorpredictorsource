package defpackage;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes61.dex */
final class e extends ah {
    private final transient ag a;
    private final transient ad b;

    e(ag agVar, ad adVar) {
        this.a = agVar;
        this.b = adVar;
    }

    @Override // defpackage.aa
    final int a(Object[] objArr, int r3) {
        return this.b.a(objArr, 0);
    }

    @Override // defpackage.aa, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.ah, defpackage.aa
    /* renamed from: e */
    public final i iterator() {
        return this.b.listIterator(0);
    }

    @Override // defpackage.ah, defpackage.aa
    public final ad f() {
        return this.b;
    }

    @Override // defpackage.ah, defpackage.aa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.b.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
