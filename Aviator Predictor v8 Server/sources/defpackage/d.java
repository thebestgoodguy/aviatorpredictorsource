package defpackage;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes61.dex */
final class d extends ah {
    private final transient ag a;
    private final transient Object[] b;
    private final transient int c;

    d(ag agVar, Object[] objArr, int r3, int r4) {
        this.a = agVar;
        this.b = objArr;
        this.c = r4;
    }

    @Override // defpackage.aa
    final int a(Object[] objArr, int r3) {
        return f().a(objArr, 0);
    }

    @Override // defpackage.aa, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.a.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ah
    final ad d() {
        return new c(this);
    }

    @Override // defpackage.ah, defpackage.aa
    /* renamed from: e */
    public final i iterator() {
        return f().listIterator(0);
    }

    @Override // defpackage.ah, defpackage.aa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }
}
