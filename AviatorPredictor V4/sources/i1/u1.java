package i1;

import i1.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    private final x0 f4246a;

    /* renamed from: b, reason: collision with root package name */
    private final l1.n f4247b;

    /* renamed from: c, reason: collision with root package name */
    private final l1.n f4248c;

    /* renamed from: d, reason: collision with root package name */
    private final List<n> f4249d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4250e;

    /* renamed from: f, reason: collision with root package name */
    private final c1.e<l1.l> f4251f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4252g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4253h;

    public enum a {
        NONE,
        LOCAL,
        SYNCED
    }

    public u1(x0 x0Var, l1.n nVar, l1.n nVar2, List<n> list, boolean z4, c1.e<l1.l> eVar, boolean z5, boolean z6) {
        this.f4246a = x0Var;
        this.f4247b = nVar;
        this.f4248c = nVar2;
        this.f4249d = list;
        this.f4250e = z4;
        this.f4251f = eVar;
        this.f4252g = z5;
        this.f4253h = z6;
    }

    public static u1 c(x0 x0Var, l1.n nVar, c1.e<l1.l> eVar, boolean z4, boolean z5) {
        ArrayList arrayList = new ArrayList();
        Iterator<l1.i> it = nVar.iterator();
        while (it.hasNext()) {
            arrayList.add(n.a(n.a.ADDED, it.next()));
        }
        return new u1(x0Var, nVar, l1.n.q(x0Var.c()), arrayList, z4, eVar, true, z5);
    }

    public boolean a() {
        return this.f4252g;
    }

    public boolean b() {
        return this.f4253h;
    }

    public List<n> d() {
        return this.f4249d;
    }

    public l1.n e() {
        return this.f4247b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (this.f4250e == u1Var.f4250e && this.f4252g == u1Var.f4252g && this.f4253h == u1Var.f4253h && this.f4246a.equals(u1Var.f4246a) && this.f4251f.equals(u1Var.f4251f) && this.f4247b.equals(u1Var.f4247b) && this.f4248c.equals(u1Var.f4248c)) {
            return this.f4249d.equals(u1Var.f4249d);
        }
        return false;
    }

    public c1.e<l1.l> f() {
        return this.f4251f;
    }

    public l1.n g() {
        return this.f4248c;
    }

    public x0 h() {
        return this.f4246a;
    }

    public int hashCode() {
        return (((((((((((((this.f4246a.hashCode() * 31) + this.f4247b.hashCode()) * 31) + this.f4248c.hashCode()) * 31) + this.f4249d.hashCode()) * 31) + this.f4251f.hashCode()) * 31) + (this.f4250e ? 1 : 0)) * 31) + (this.f4252g ? 1 : 0)) * 31) + (this.f4253h ? 1 : 0);
    }

    public boolean i() {
        return !this.f4251f.isEmpty();
    }

    public boolean j() {
        return this.f4250e;
    }

    public String toString() {
        return "ViewSnapshot(" + this.f4246a + ", " + this.f4247b + ", " + this.f4248c + ", " + this.f4249d + ", isFromCache=" + this.f4250e + ", mutatedKeys=" + this.f4251f.size() + ", didSyncStateChange=" + this.f4252g + ", excludesMetadataChanges=" + this.f4253h + ")";
    }
}
