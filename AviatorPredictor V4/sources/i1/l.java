package i1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class l extends r {

    /* renamed from: a, reason: collision with root package name */
    private final List<r> f4135a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4136b;

    /* renamed from: c, reason: collision with root package name */
    private List<q> f4137c;

    public enum a {
        AND("and"),
        OR("or");


        /* renamed from: e, reason: collision with root package name */
        private final String f4141e;

        a(String str) {
            this.f4141e = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f4141e;
        }
    }

    public l(List<r> list, a aVar) {
        this.f4135a = list;
        this.f4136b = aVar;
    }

    private q g(p1.t<q, Boolean> tVar) {
        for (q qVar : d()) {
            if (tVar.d(qVar).booleanValue()) {
                return qVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean m(q qVar) {
        return Boolean.valueOf(qVar.j());
    }

    @Override // i1.r
    public String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4136b.toString() + "(");
        sb.append(TextUtils.join(",", this.f4135a));
        sb.append(")");
        return sb.toString();
    }

    @Override // i1.r
    public List<r> b() {
        return this.f4135a;
    }

    @Override // i1.r
    public l1.r c() {
        q g5 = g(new p1.t() { // from class: i1.k
            @Override // p1.t
            public final Object d(Object obj) {
                Boolean m4;
                m4 = l.m((q) obj);
                return m4;
            }
        });
        if (g5 != null) {
            return g5.g();
        }
        return null;
    }

    @Override // i1.r
    public List<q> d() {
        List<q> list = this.f4137c;
        if (list != null) {
            return list;
        }
        this.f4137c = new ArrayList();
        Iterator<r> it = this.f4135a.iterator();
        while (it.hasNext()) {
            this.f4137c.addAll(it.next().d());
        }
        return this.f4137c;
    }

    @Override // i1.r
    public boolean e(l1.i iVar) {
        if (i()) {
            Iterator<r> it = this.f4135a.iterator();
            while (it.hasNext()) {
                if (!it.next().e(iVar)) {
                    return false;
                }
            }
            return true;
        }
        Iterator<r> it2 = this.f4135a.iterator();
        while (it2.hasNext()) {
            if (it2.next().e(iVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f4136b == lVar.f4136b && this.f4135a.equals(lVar.f4135a);
    }

    public a h() {
        return this.f4136b;
    }

    public int hashCode() {
        return ((1147 + this.f4136b.hashCode()) * 31) + this.f4135a.hashCode();
    }

    public boolean i() {
        return this.f4136b == a.AND;
    }

    public boolean j() {
        return this.f4136b == a.OR;
    }

    public boolean k() {
        Iterator<r> it = this.f4135a.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof l) {
                return false;
            }
        }
        return true;
    }

    public boolean l() {
        return k() && i();
    }

    public l n(List<r> list) {
        ArrayList arrayList = new ArrayList(this.f4135a);
        arrayList.addAll(list);
        return new l(arrayList, this.f4136b);
    }

    public String toString() {
        return a();
    }
}
