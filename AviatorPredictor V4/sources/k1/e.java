package k1;

import java.util.Comparator;

/* loaded from: classes.dex */
class e {

    /* renamed from: c, reason: collision with root package name */
    static final Comparator<e> f6062c = new Comparator() { // from class: k1.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int e5;
            e5 = e.e((e) obj, (e) obj2);
            return e5;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    static final Comparator<e> f6063d = new Comparator() { // from class: k1.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int f5;
            f5 = e.f((e) obj, (e) obj2);
            return f5;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final l1.l f6064a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6065b;

    public e(l1.l lVar, int r22) {
        this.f6064a = lVar;
        this.f6065b = r22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(e eVar, e eVar2) {
        int compareTo = eVar.f6064a.compareTo(eVar2.f6064a);
        return compareTo != 0 ? compareTo : p1.g0.k(eVar.f6065b, eVar2.f6065b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f(e eVar, e eVar2) {
        int k4 = p1.g0.k(eVar.f6065b, eVar2.f6065b);
        return k4 != 0 ? k4 : eVar.f6064a.compareTo(eVar2.f6064a);
    }

    int c() {
        return this.f6065b;
    }

    l1.l d() {
        return this.f6064a;
    }
}
