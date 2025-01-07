package j1;

import com.google.auto.value.AutoValue;
import l1.l;
import p1.g0;

@AutoValue
/* loaded from: classes.dex */
public abstract class e implements Comparable<e> {
    public static e g(int r12, l lVar, byte[] bArr, byte[] bArr2) {
        return new a(r12, lVar, bArr, bArr2);
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        int compare = Integer.compare(n(), eVar.n());
        if (compare != 0) {
            return compare;
        }
        int compareTo = k().compareTo(eVar.k());
        if (compareTo != 0) {
            return compareTo;
        }
        int h5 = g0.h(h(), eVar.h());
        return h5 != 0 ? h5 : g0.h(i(), eVar.i());
    }

    public abstract byte[] h();

    public abstract byte[] i();

    public abstract l k();

    public abstract int n();
}
