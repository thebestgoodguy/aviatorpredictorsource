package i1;

import i1.w0;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4100a;

    /* renamed from: b, reason: collision with root package name */
    private final List<x1.x> f4101b;

    public i(List<x1.x> list, boolean z4) {
        this.f4101b = list;
        this.f4100a = z4;
    }

    private int a(List<w0> list, l1.i iVar) {
        int i4;
        p1.b.d(this.f4101b.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int r12 = 0;
        for (int r02 = 0; r02 < this.f4101b.size(); r02++) {
            w0 w0Var = list.get(r02);
            x1.x xVar = this.f4101b.get(r02);
            if (w0Var.f4270b.equals(l1.r.f6563f)) {
                p1.b.d(l1.y.B(xVar), "Bound has a non-key value where the key path is being used %s", xVar);
                i4 = l1.l.k(xVar.n0()).compareTo(iVar.getKey());
            } else {
                x1.x f5 = iVar.f(w0Var.c());
                p1.b.d(f5 != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                i4 = l1.y.i(xVar, f5);
            }
            if (w0Var.b().equals(w0.a.DESCENDING)) {
                i4 *= -1;
            }
            r12 = i4;
            if (r12 != 0) {
                break;
            }
        }
        return r12;
    }

    public List<x1.x> b() {
        return this.f4101b;
    }

    public boolean c() {
        return this.f4100a;
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        boolean z4 = true;
        for (x1.x xVar : this.f4101b) {
            if (!z4) {
                sb.append(",");
            }
            z4 = false;
            sb.append(l1.y.b(xVar));
        }
        return sb.toString();
    }

    public boolean e(List<w0> list, l1.i iVar) {
        int a5 = a(list, iVar);
        if (this.f4100a) {
            if (a5 >= 0) {
                return true;
            }
        } else if (a5 > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f4100a == iVar.f4100a && this.f4101b.equals(iVar.f4101b);
    }

    public boolean f(List<w0> list, l1.i iVar) {
        int a5 = a(list, iVar);
        if (this.f4100a) {
            if (a5 <= 0) {
                return true;
            }
        } else if (a5 < 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4100a ? 1 : 0) * 31) + this.f4101b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bound(inclusive=");
        sb.append(this.f4100a);
        sb.append(", position=");
        for (int r12 = 0; r12 < this.f4101b.size(); r12++) {
            if (r12 > 0) {
                sb.append(" and ");
            }
            sb.append(l1.y.b(this.f4101b.get(r12)));
        }
        sb.append(")");
        return sb.toString();
    }
}
