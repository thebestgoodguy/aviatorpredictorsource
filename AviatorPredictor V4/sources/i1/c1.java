package i1;

import android.util.Pair;
import i1.q;
import i1.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l1.q;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    private String f4060a;

    /* renamed from: b, reason: collision with root package name */
    private final List<w0> f4061b;

    /* renamed from: c, reason: collision with root package name */
    private final List<r> f4062c;

    /* renamed from: d, reason: collision with root package name */
    private final l1.u f4063d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4064e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4065f;

    /* renamed from: g, reason: collision with root package name */
    private final i f4066g;

    /* renamed from: h, reason: collision with root package name */
    private final i f4067h;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4068a;

        static {
            int[] r02 = new int[q.b.values().length];
            f4068a = r02;
            try {
                r02[q.b.ARRAY_CONTAINS_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4068a[q.b.ARRAY_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4068a[q.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4068a[q.b.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4068a[q.b.NOT_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4068a[q.b.NOT_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4068a[q.b.LESS_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4068a[q.b.LESS_THAN_OR_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4068a[q.b.GREATER_THAN_OR_EQUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4068a[q.b.GREATER_THAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public c1(l1.u uVar, String str, List<r> list, List<w0> list2, long j4, i iVar, i iVar2) {
        this.f4063d = uVar;
        this.f4064e = str;
        this.f4061b = list2;
        this.f4062c = list;
        this.f4065f = j4;
        this.f4066g = iVar;
        this.f4067h = iVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Pair<x1.x, Boolean> b(q.c cVar, i iVar) {
        x1.x xVar = l1.y.f6591c;
        Iterator<q> it = g(cVar.h()).iterator();
        boolean z4 = true;
        while (true) {
            int r5 = 0;
            boolean z5 = false;
            if (!it.hasNext()) {
                if (iVar != null) {
                    while (true) {
                        if (r5 < this.f4061b.size()) {
                            if (this.f4061b.get(r5).c().equals(cVar.h())) {
                                x1.x xVar2 = iVar.b().get(r5);
                                if (l1.y.C(xVar, z4, xVar2, iVar.c()) < 0) {
                                    z4 = iVar.c();
                                    xVar = xVar2;
                                }
                            } else {
                                r5++;
                            }
                        }
                    }
                }
                return new Pair<>(xVar, Boolean.valueOf(z4));
            }
            q next = it.next();
            x1.x xVar3 = l1.y.f6591c;
            switch (a.f4068a[next.h().ordinal()]) {
                case 3:
                case 4:
                case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    xVar3 = next.i();
                    z5 = true;
                    break;
                case 5:
                case 6:
                default:
                    z5 = true;
                    break;
                case 7:
                case 8:
                    xVar3 = l1.y.r(next.i().q0());
                    z5 = true;
                    break;
                case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    xVar3 = next.i();
                    break;
            }
            if (l1.y.C(xVar, z4, xVar3, z5) < 0) {
                z4 = z5;
                xVar = xVar3;
            }
        }
    }

    private Pair<x1.x, Boolean> e(q.c cVar, i iVar) {
        x1.x xVar = l1.y.f6593e;
        Iterator<q> it = g(cVar.h()).iterator();
        boolean z4 = true;
        while (true) {
            int r5 = 0;
            r5 = false;
            boolean z5 = false;
            if (!it.hasNext()) {
                if (iVar != null) {
                    while (true) {
                        if (r5 < this.f4061b.size()) {
                            if (this.f4061b.get(r5).c().equals(cVar.h())) {
                                x1.x xVar2 = iVar.b().get(r5);
                                if (l1.y.H(xVar, z4, xVar2, iVar.c()) > 0) {
                                    z4 = iVar.c();
                                    xVar = xVar2;
                                }
                            } else {
                                r5++;
                            }
                        }
                    }
                }
                return new Pair<>(xVar, Boolean.valueOf(z4));
            }
            q next = it.next();
            x1.x xVar3 = l1.y.f6593e;
            switch (a.f4068a[next.h().ordinal()]) {
                case 3:
                case 4:
                case 8:
                    xVar3 = next.i();
                case 5:
                case 6:
                default:
                    z5 = true;
                    break;
                case 7:
                    xVar3 = next.i();
                    break;
                case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    xVar3 = l1.y.s(next.i().q0());
                    break;
            }
            if (l1.y.H(xVar, z4, xVar3, z5) > 0) {
                z4 = z5;
                xVar = xVar3;
            }
        }
    }

    private List<q> g(l1.r rVar) {
        ArrayList arrayList = new ArrayList();
        for (r rVar2 : this.f4062c) {
            if (rVar2 instanceof q) {
                q qVar = (q) rVar2;
                if (qVar.g().equals(rVar)) {
                    arrayList.add(qVar);
                }
            }
        }
        return arrayList;
    }

    public List<x1.x> a(l1.q qVar) {
        q.c c5 = qVar.c();
        if (c5 == null) {
            return null;
        }
        for (q qVar2 : g(c5.h())) {
            int r22 = a.f4068a[qVar2.h().ordinal()];
            if (r22 == 1) {
                return qVar2.i().f0().k();
            }
            if (r22 == 2) {
                return Collections.singletonList(qVar2.i());
            }
        }
        return null;
    }

    public String c() {
        String str = this.f4060a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n().h());
        if (this.f4064e != null) {
            sb.append("|cg:");
            sb.append(this.f4064e);
        }
        sb.append("|f:");
        Iterator<r> it = h().iterator();
        while (it.hasNext()) {
            sb.append(it.next().a());
        }
        sb.append("|ob:");
        for (w0 w0Var : m()) {
            sb.append(w0Var.c().h());
            sb.append(w0Var.b().equals(w0.a.ASCENDING) ? "asc" : "desc");
        }
        if (r()) {
            sb.append("|l:");
            sb.append(j());
        }
        if (this.f4066g != null) {
            sb.append("|lb:");
            sb.append(this.f4066g.c() ? "b:" : "a:");
            sb.append(this.f4066g.d());
        }
        if (this.f4067h != null) {
            sb.append("|ub:");
            sb.append(this.f4067h.c() ? "a:" : "b:");
            sb.append(this.f4067h.d());
        }
        String sb2 = sb.toString();
        this.f4060a = sb2;
        return sb2;
    }

    public String d() {
        return this.f4064e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = this.f4064e;
        if (str == null ? c1Var.f4064e != null : !str.equals(c1Var.f4064e)) {
            return false;
        }
        if (this.f4065f != c1Var.f4065f || !this.f4061b.equals(c1Var.f4061b) || !this.f4062c.equals(c1Var.f4062c) || !this.f4063d.equals(c1Var.f4063d)) {
            return false;
        }
        i iVar = this.f4066g;
        if (iVar == null ? c1Var.f4066g != null : !iVar.equals(c1Var.f4066g)) {
            return false;
        }
        i iVar2 = this.f4067h;
        i iVar3 = c1Var.f4067h;
        return iVar2 != null ? iVar2.equals(iVar3) : iVar3 == null;
    }

    public i f() {
        return this.f4067h;
    }

    public List<r> h() {
        return this.f4062c;
    }

    public int hashCode() {
        int hashCode = this.f4061b.hashCode() * 31;
        String str = this.f4064e;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f4062c.hashCode()) * 31) + this.f4063d.hashCode()) * 31;
        long j4 = this.f4065f;
        int r02 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        i iVar = this.f4066g;
        int hashCode3 = (r02 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        i iVar2 = this.f4067h;
        return hashCode3 + (iVar2 != null ? iVar2.hashCode() : 0);
    }

    public w0.a i() {
        return this.f4061b.get(r0.size() - 1).b();
    }

    public long j() {
        return this.f4065f;
    }

    public i k(l1.q qVar) {
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (q.c cVar : qVar.e()) {
            Pair<x1.x, Boolean> b5 = cVar.i().equals(q.c.a.ASCENDING) ? b(cVar, this.f4066g) : e(cVar, this.f4066g);
            arrayList.add((x1.x) b5.first);
            z4 &= ((Boolean) b5.second).booleanValue();
        }
        return new i(arrayList, z4);
    }

    public Collection<x1.x> l(l1.q qVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (q.c cVar : qVar.e()) {
            for (q qVar2 : g(cVar.h())) {
                int r4 = a.f4068a[qVar2.h().ordinal()];
                if (r4 == 3 || r4 == 4) {
                    linkedHashMap.put(cVar.h(), qVar2.i());
                } else if (r4 == 5 || r4 == 6) {
                    linkedHashMap.put(cVar.h(), qVar2.i());
                    return linkedHashMap.values();
                }
            }
        }
        return null;
    }

    public List<w0> m() {
        return this.f4061b;
    }

    public l1.u n() {
        return this.f4063d;
    }

    public int o() {
        HashSet hashSet = new HashSet();
        Iterator<r> it = this.f4062c.iterator();
        int r22 = 0;
        while (it.hasNext()) {
            for (q qVar : it.next().d()) {
                if (!qVar.g().z()) {
                    if (qVar.h().equals(q.b.ARRAY_CONTAINS) || qVar.h().equals(q.b.ARRAY_CONTAINS_ANY)) {
                        r22 = 1;
                    } else {
                        hashSet.add(qVar.g());
                    }
                }
            }
        }
        for (w0 w0Var : this.f4061b) {
            if (!w0Var.c().z()) {
                hashSet.add(w0Var.c());
            }
        }
        return hashSet.size() + r22;
    }

    public i p() {
        return this.f4066g;
    }

    public i q(l1.q qVar) {
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (q.c cVar : qVar.e()) {
            Pair<x1.x, Boolean> e5 = cVar.i().equals(q.c.a.ASCENDING) ? e(cVar, this.f4067h) : b(cVar, this.f4067h);
            arrayList.add((x1.x) e5.first);
            z4 &= ((Boolean) e5.second).booleanValue();
        }
        return new i(arrayList, z4);
    }

    public boolean r() {
        return this.f4065f != -1;
    }

    public boolean s() {
        return l1.l.v(this.f4063d) && this.f4064e == null && this.f4062c.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Query(");
        sb.append(this.f4063d.h());
        if (this.f4064e != null) {
            sb.append(" collectionGroup=");
            sb.append(this.f4064e);
        }
        if (!this.f4062c.isEmpty()) {
            sb.append(" where ");
            for (int r12 = 0; r12 < this.f4062c.size(); r12++) {
                if (r12 > 0) {
                    sb.append(" and ");
                }
                sb.append(this.f4062c.get(r12));
            }
        }
        if (!this.f4061b.isEmpty()) {
            sb.append(" order by ");
            for (int r22 = 0; r22 < this.f4061b.size(); r22++) {
                if (r22 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f4061b.get(r22));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
