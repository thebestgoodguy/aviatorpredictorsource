package a1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.bp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m1 extends com.google.firebase.auth.z {
    public static final Parcelable.Creator<m1> CREATOR = new n1();

    /* renamed from: e, reason: collision with root package name */
    private bp f82e;

    /* renamed from: f, reason: collision with root package name */
    private i1 f83f;

    /* renamed from: g, reason: collision with root package name */
    private final String f84g;

    /* renamed from: h, reason: collision with root package name */
    private String f85h;

    /* renamed from: i, reason: collision with root package name */
    private List f86i;

    /* renamed from: j, reason: collision with root package name */
    private List f87j;

    /* renamed from: k, reason: collision with root package name */
    private String f88k;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f89l;

    /* renamed from: m, reason: collision with root package name */
    private o1 f90m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f91n;

    /* renamed from: o, reason: collision with root package name */
    private com.google.firebase.auth.n1 f92o;

    /* renamed from: p, reason: collision with root package name */
    private f0 f93p;

    m1(bp bpVar, i1 i1Var, String str, String str2, List list, List list2, String str3, Boolean bool, o1 o1Var, boolean z4, com.google.firebase.auth.n1 n1Var, f0 f0Var) {
        this.f82e = bpVar;
        this.f83f = i1Var;
        this.f84g = str;
        this.f85h = str2;
        this.f86i = list;
        this.f87j = list2;
        this.f88k = str3;
        this.f89l = bool;
        this.f90m = o1Var;
        this.f91n = z4;
        this.f92o = n1Var;
        this.f93p = f0Var;
    }

    public m1(x0.e eVar, List list) {
        w.r.i(eVar);
        this.f84g = eVar.q();
        this.f85h = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f88k = "2";
        E0(list);
    }

    @Override // com.google.firebase.auth.z
    public final x0.e C0() {
        return x0.e.p(this.f84g);
    }

    @Override // com.google.firebase.auth.z
    public final /* bridge */ /* synthetic */ com.google.firebase.auth.z D0() {
        N0();
        return this;
    }

    @Override // com.google.firebase.auth.z
    public final synchronized com.google.firebase.auth.z E0(List list) {
        w.r.i(list);
        this.f86i = new ArrayList(list.size());
        this.f87j = new ArrayList(list.size());
        for (int r12 = 0; r12 < list.size(); r12++) {
            com.google.firebase.auth.x0 x0Var = (com.google.firebase.auth.x0) list.get(r12);
            if (x0Var.h().equals("firebase")) {
                this.f83f = (i1) x0Var;
            } else {
                this.f87j.add(x0Var.h());
            }
            this.f86i.add((i1) x0Var);
        }
        if (this.f83f == null) {
            this.f83f = (i1) this.f86i.get(0);
        }
        return this;
    }

    @Override // com.google.firebase.auth.x0
    public final boolean F() {
        return this.f83f.F();
    }

    @Override // com.google.firebase.auth.z
    public final bp F0() {
        return this.f82e;
    }

    @Override // com.google.firebase.auth.z
    public final String G0() {
        return this.f82e.m0();
    }

    @Override // com.google.firebase.auth.z
    public final String H0() {
        return this.f82e.p0();
    }

    @Override // com.google.firebase.auth.z
    public final List I0() {
        return this.f87j;
    }

    @Override // com.google.firebase.auth.z
    public final void J0(bp bpVar) {
        this.f82e = (bp) w.r.i(bpVar);
    }

    @Override // com.google.firebase.auth.z
    public final void K0(List list) {
        Parcelable.Creator<f0> creator = f0.CREATOR;
        f0 f0Var = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.firebase.auth.i0 i0Var = (com.google.firebase.auth.i0) it.next();
                if (i0Var instanceof com.google.firebase.auth.s0) {
                    arrayList.add((com.google.firebase.auth.s0) i0Var);
                }
            }
            f0Var = new f0(arrayList);
        }
        this.f93p = f0Var;
    }

    public final com.google.firebase.auth.n1 L0() {
        return this.f92o;
    }

    public final m1 M0(String str) {
        this.f88k = str;
        return this;
    }

    public final m1 N0() {
        this.f89l = Boolean.FALSE;
        return this;
    }

    public final List O0() {
        f0 f0Var = this.f93p;
        return f0Var != null ? f0Var.j0() : new ArrayList();
    }

    public final List P0() {
        return this.f86i;
    }

    public final void Q0(com.google.firebase.auth.n1 n1Var) {
        this.f92o = n1Var;
    }

    @Override // com.google.firebase.auth.z, com.google.firebase.auth.x0
    public final String R() {
        return this.f83f.R();
    }

    public final void R0(boolean z4) {
        this.f91n = z4;
    }

    public final void S0(o1 o1Var) {
        this.f90m = o1Var;
    }

    public final boolean T0() {
        return this.f91n;
    }

    @Override // com.google.firebase.auth.z, com.google.firebase.auth.x0
    public final String X() {
        return this.f83f.X();
    }

    @Override // com.google.firebase.auth.z, com.google.firebase.auth.x0
    public final String e() {
        return this.f83f.e();
    }

    @Override // com.google.firebase.auth.x0
    public final String h() {
        return this.f83f.h();
    }

    @Override // com.google.firebase.auth.z, com.google.firebase.auth.x0
    public final Uri l() {
        return this.f83f.l();
    }

    @Override // com.google.firebase.auth.z
    public final com.google.firebase.auth.a0 l0() {
        return this.f90m;
    }

    @Override // com.google.firebase.auth.z
    public final /* synthetic */ com.google.firebase.auth.g0 m0() {
        return new f(this);
    }

    @Override // com.google.firebase.auth.z, com.google.firebase.auth.x0
    public final String n() {
        return this.f83f.n();
    }

    @Override // com.google.firebase.auth.z
    public final List<? extends com.google.firebase.auth.x0> n0() {
        return this.f86i;
    }

    @Override // com.google.firebase.auth.z
    public final String o0() {
        Map map;
        bp bpVar = this.f82e;
        if (bpVar == null || bpVar.m0() == null || (map = (Map) b0.a(bpVar.m0()).b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.z
    public final boolean p0() {
        Boolean bool = this.f89l;
        if (bool == null || bool.booleanValue()) {
            bp bpVar = this.f82e;
            String e5 = bpVar != null ? b0.a(bpVar.m0()).e() : "";
            boolean z4 = false;
            if (this.f86i.size() <= 1 && (e5 == null || !e5.equals("custom"))) {
                z4 = true;
            }
            this.f89l = Boolean.valueOf(z4);
        }
        return this.f89l.booleanValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.l(parcel, 1, this.f82e, r6, false);
        x.c.l(parcel, 2, this.f83f, r6, false);
        x.c.m(parcel, 3, this.f84g, false);
        x.c.m(parcel, 4, this.f85h, false);
        x.c.q(parcel, 5, this.f86i, false);
        x.c.o(parcel, 6, this.f87j, false);
        x.c.m(parcel, 7, this.f88k, false);
        x.c.d(parcel, 8, Boolean.valueOf(p0()), false);
        x.c.l(parcel, 9, this.f90m, r6, false);
        x.c.c(parcel, 10, this.f91n);
        x.c.l(parcel, 11, this.f92o, r6, false);
        x.c.l(parcel, 12, this.f93p, r6, false);
        x.c.b(parcel, a5);
    }
}
