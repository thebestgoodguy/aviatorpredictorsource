package o1;

import i1.n;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class r0 {

    /* renamed from: a, reason: collision with root package name */
    private int f6896a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Map<l1.l, n.a> f6897b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private boolean f6898c = true;

    /* renamed from: d, reason: collision with root package name */
    private com.google.protobuf.j f6899d = com.google.protobuf.j.f2914f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6900e = false;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6901a;

        static {
            int[] r02 = new int[n.a.values().length];
            f6901a = r02;
            try {
                r02[n.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6901a[n.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6901a[n.a.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    r0() {
    }

    void a(l1.l lVar, n.a aVar) {
        this.f6898c = true;
        this.f6897b.put(lVar, aVar);
    }

    void b() {
        this.f6898c = false;
        this.f6897b.clear();
    }

    boolean c() {
        return this.f6898c;
    }

    boolean d() {
        return this.f6900e;
    }

    boolean e() {
        return this.f6896a != 0;
    }

    void f() {
        this.f6898c = true;
        this.f6900e = true;
    }

    void g() {
        this.f6896a++;
    }

    void h() {
        this.f6896a--;
    }

    void i(l1.l lVar) {
        this.f6898c = true;
        this.f6897b.remove(lVar);
    }

    q0 j() {
        c1.e<l1.l> i4 = l1.l.i();
        c1.e<l1.l> i5 = l1.l.i();
        c1.e<l1.l> i6 = l1.l.i();
        c1.e<l1.l> eVar = i4;
        c1.e<l1.l> eVar2 = i5;
        c1.e<l1.l> eVar3 = i6;
        for (Map.Entry<l1.l, n.a> entry : this.f6897b.entrySet()) {
            l1.l key = entry.getKey();
            n.a value = entry.getValue();
            int r22 = a.f6901a[value.ordinal()];
            if (r22 == 1) {
                eVar = eVar.q(key);
            } else if (r22 == 2) {
                eVar2 = eVar2.q(key);
            } else {
                if (r22 != 3) {
                    throw p1.b.a("Encountered invalid change type: %s", value);
                }
                eVar3 = eVar3.q(key);
            }
        }
        return new q0(this.f6899d, this.f6900e, eVar, eVar2, eVar3);
    }

    void k(com.google.protobuf.j jVar) {
        if (jVar.isEmpty()) {
            return;
        }
        this.f6898c = true;
        this.f6899d = jVar;
    }
}
