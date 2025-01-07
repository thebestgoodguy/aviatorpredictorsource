package i1;

import i1.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: k, reason: collision with root package name */
    private static final w0 f4277k;

    /* renamed from: l, reason: collision with root package name */
    private static final w0 f4278l;

    /* renamed from: a, reason: collision with root package name */
    private final List<w0> f4279a;

    /* renamed from: b, reason: collision with root package name */
    private List<w0> f4280b;

    /* renamed from: c, reason: collision with root package name */
    private c1 f4281c;

    /* renamed from: d, reason: collision with root package name */
    private final List<r> f4282d;

    /* renamed from: e, reason: collision with root package name */
    private final l1.u f4283e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4284f;

    /* renamed from: g, reason: collision with root package name */
    private final long f4285g;

    /* renamed from: h, reason: collision with root package name */
    private final a f4286h;

    /* renamed from: i, reason: collision with root package name */
    private final i f4287i;

    /* renamed from: j, reason: collision with root package name */
    private final i f4288j;

    public enum a {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    private static class b implements Comparator<l1.i> {

        /* renamed from: e, reason: collision with root package name */
        private final List<w0> f4292e;

        b(List<w0> list) {
            boolean z4;
            Iterator<w0> it = list.iterator();
            loop0: while (true) {
                while (it.hasNext()) {
                    z4 = z4 || it.next().c().equals(l1.r.f6563f);
                }
            }
            if (!z4) {
                throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
            }
            this.f4292e = list;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(l1.i iVar, l1.i iVar2) {
            Iterator<w0> it = this.f4292e.iterator();
            while (it.hasNext()) {
                int a5 = it.next().a(iVar, iVar2);
                if (a5 != 0) {
                    return a5;
                }
            }
            return 0;
        }
    }

    static {
        w0.a aVar = w0.a.ASCENDING;
        l1.r rVar = l1.r.f6563f;
        f4277k = w0.d(aVar, rVar);
        f4278l = w0.d(w0.a.DESCENDING, rVar);
    }

    public x0(l1.u uVar, String str) {
        this(uVar, str, Collections.emptyList(), Collections.emptyList(), -1L, a.LIMIT_TO_FIRST, null, null);
    }

    public x0(l1.u uVar, String str, List<r> list, List<w0> list2, long j4, a aVar, i iVar, i iVar2) {
        this.f4283e = uVar;
        this.f4284f = str;
        this.f4279a = list2;
        this.f4282d = list;
        this.f4285g = j4;
        this.f4286h = aVar;
        this.f4287i = iVar;
        this.f4288j = iVar2;
    }

    private boolean A(l1.i iVar) {
        l1.u t4 = iVar.getKey().t();
        return this.f4284f != null ? iVar.getKey().u(this.f4284f) && this.f4283e.r(t4) : l1.l.v(this.f4283e) ? this.f4283e.equals(t4) : this.f4283e.r(t4) && this.f4283e.s() == t4.s() - 1;
    }

    public static x0 b(l1.u uVar) {
        return new x0(uVar, null);
    }

    private boolean x(l1.i iVar) {
        i iVar2 = this.f4287i;
        if (iVar2 != null && !iVar2.f(m(), iVar)) {
            return false;
        }
        i iVar3 = this.f4288j;
        return iVar3 == null || iVar3.e(m(), iVar);
    }

    private boolean y(l1.i iVar) {
        Iterator<r> it = this.f4282d.iterator();
        while (it.hasNext()) {
            if (!it.next().e(iVar)) {
                return false;
            }
        }
        return true;
    }

    private boolean z(l1.i iVar) {
        for (w0 w0Var : m()) {
            if (!w0Var.c().equals(l1.r.f6563f) && iVar.f(w0Var.f4270b) == null) {
                return false;
            }
        }
        return true;
    }

    public x0 B(w0 w0Var) {
        l1.r q4;
        p1.b.d(!s(), "No ordering is allowed for document query", new Object[0]);
        if (this.f4279a.isEmpty() && (q4 = q()) != null && !q4.equals(w0Var.f4270b)) {
            throw p1.b.a("First orderBy must match inequality field", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f4279a);
        arrayList.add(w0Var);
        return new x0(this.f4283e, this.f4284f, this.f4282d, arrayList, this.f4285g, this.f4286h, this.f4287i, this.f4288j);
    }

    public x0 C(i iVar) {
        return new x0(this.f4283e, this.f4284f, this.f4282d, this.f4279a, this.f4285g, this.f4286h, iVar, this.f4288j);
    }

    public c1 D() {
        if (this.f4281c == null) {
            if (this.f4286h == a.LIMIT_TO_FIRST) {
                this.f4281c = new c1(n(), f(), i(), m(), this.f4285g, o(), g());
            } else {
                ArrayList arrayList = new ArrayList();
                for (w0 w0Var : m()) {
                    w0.a b5 = w0Var.b();
                    w0.a aVar = w0.a.DESCENDING;
                    if (b5 == aVar) {
                        aVar = w0.a.ASCENDING;
                    }
                    arrayList.add(w0.d(aVar, w0Var.c()));
                }
                i iVar = this.f4288j;
                i iVar2 = iVar != null ? new i(iVar.b(), this.f4288j.c()) : null;
                i iVar3 = this.f4287i;
                this.f4281c = new c1(n(), f(), i(), arrayList, this.f4285g, iVar2, iVar3 != null ? new i(iVar3.b(), this.f4287i.c()) : null);
            }
        }
        return this.f4281c;
    }

    public x0 a(l1.u uVar) {
        return new x0(uVar, null, this.f4282d, this.f4279a, this.f4285g, this.f4286h, this.f4287i, this.f4288j);
    }

    public Comparator<l1.i> c() {
        return new b(m());
    }

    public x0 d(i iVar) {
        return new x0(this.f4283e, this.f4284f, this.f4282d, this.f4279a, this.f4285g, this.f4286h, this.f4287i, iVar);
    }

    public x0 e(r rVar) {
        boolean z4 = true;
        p1.b.d(!s(), "No filter is allowed for document query", new Object[0]);
        l1.r c5 = rVar.c();
        l1.r q4 = q();
        p1.b.d(q4 == null || c5 == null || q4.equals(c5), "Query must only have one inequality field", new Object[0]);
        if (!this.f4279a.isEmpty() && c5 != null && !this.f4279a.get(0).f4270b.equals(c5)) {
            z4 = false;
        }
        p1.b.d(z4, "First orderBy must match inequality field", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f4282d);
        arrayList.add(rVar);
        return new x0(this.f4283e, this.f4284f, arrayList, this.f4279a, this.f4285g, this.f4286h, this.f4287i, this.f4288j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f4286h != x0Var.f4286h) {
            return false;
        }
        return D().equals(x0Var.D());
    }

    public String f() {
        return this.f4284f;
    }

    public i g() {
        return this.f4288j;
    }

    public List<w0> h() {
        return this.f4279a;
    }

    public int hashCode() {
        return (D().hashCode() * 31) + this.f4286h.hashCode();
    }

    public List<r> i() {
        return this.f4282d;
    }

    public l1.r j() {
        if (this.f4279a.isEmpty()) {
            return null;
        }
        return this.f4279a.get(0).c();
    }

    public long k() {
        return this.f4285g;
    }

    public a l() {
        return this.f4286h;
    }

    public List<w0> m() {
        List<w0> arrayList;
        w0.a aVar;
        if (this.f4280b == null) {
            l1.r q4 = q();
            l1.r j4 = j();
            boolean z4 = false;
            if (q4 == null || j4 != null) {
                arrayList = new ArrayList<>();
                for (w0 w0Var : this.f4279a) {
                    arrayList.add(w0Var);
                    if (w0Var.c().equals(l1.r.f6563f)) {
                        z4 = true;
                    }
                }
                if (!z4) {
                    if (this.f4279a.size() > 0) {
                        List<w0> list = this.f4279a;
                        aVar = list.get(list.size() - 1).b();
                    } else {
                        aVar = w0.a.ASCENDING;
                    }
                    arrayList.add(aVar.equals(w0.a.ASCENDING) ? f4277k : f4278l);
                }
            } else {
                arrayList = q4.z() ? Collections.singletonList(f4277k) : Arrays.asList(w0.d(w0.a.ASCENDING, q4), f4277k);
            }
            this.f4280b = arrayList;
        }
        return this.f4280b;
    }

    public l1.u n() {
        return this.f4283e;
    }

    public i o() {
        return this.f4287i;
    }

    public boolean p() {
        return this.f4285g != -1;
    }

    public l1.r q() {
        Iterator<r> it = this.f4282d.iterator();
        while (it.hasNext()) {
            l1.r c5 = it.next().c();
            if (c5 != null) {
                return c5;
            }
        }
        return null;
    }

    public boolean r() {
        return this.f4284f != null;
    }

    public boolean s() {
        return l1.l.v(this.f4283e) && this.f4284f == null && this.f4282d.isEmpty();
    }

    public x0 t(long j4) {
        return new x0(this.f4283e, this.f4284f, this.f4282d, this.f4279a, j4, a.LIMIT_TO_FIRST, this.f4287i, this.f4288j);
    }

    public String toString() {
        return "Query(target=" + D().toString() + ";limitType=" + this.f4286h.toString() + ")";
    }

    public x0 u(long j4) {
        return new x0(this.f4283e, this.f4284f, this.f4282d, this.f4279a, j4, a.LIMIT_TO_LAST, this.f4287i, this.f4288j);
    }

    public boolean v(l1.i iVar) {
        return iVar.b() && A(iVar) && z(iVar) && y(iVar) && x(iVar);
    }

    public boolean w() {
        if (this.f4282d.isEmpty() && this.f4285g == -1 && this.f4287i == null && this.f4288j == null) {
            if (h().isEmpty()) {
                return true;
            }
            if (h().size() == 1 && j().z()) {
                return true;
            }
        }
        return false;
    }
}
