package a1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends com.google.firebase.auth.j0 {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: e, reason: collision with root package name */
    private final List f44e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final j f45f;

    /* renamed from: g, reason: collision with root package name */
    private final String f46g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.auth.n1 f47h;

    /* renamed from: i, reason: collision with root package name */
    private final m1 f48i;

    public h(List list, j jVar, String str, com.google.firebase.auth.n1 n1Var, m1 m1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.i0 i0Var = (com.google.firebase.auth.i0) it.next();
            if (i0Var instanceof com.google.firebase.auth.s0) {
                this.f44e.add((com.google.firebase.auth.s0) i0Var);
            }
        }
        this.f45f = (j) w.r.i(jVar);
        this.f46g = w.r.e(str);
        this.f47h = n1Var;
        this.f48i = m1Var;
    }

    @Override // com.google.firebase.auth.j0
    public final List<com.google.firebase.auth.i0> j0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f44e.iterator();
        while (it.hasNext()) {
            arrayList.add((com.google.firebase.auth.s0) it.next());
        }
        return arrayList;
    }

    @Override // com.google.firebase.auth.j0
    public final com.google.firebase.auth.k0 k0() {
        return this.f45f;
    }

    @Override // com.google.firebase.auth.j0
    public final o0.h<com.google.firebase.auth.i> l0(com.google.firebase.auth.h0 h0Var) {
        return FirebaseAuth.getInstance(x0.e.p(this.f46g)).a0(h0Var, this.f45f, this.f48i).k(new g(this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.q(parcel, 1, this.f44e, false);
        x.c.l(parcel, 2, this.f45f, r6, false);
        x.c.m(parcel, 3, this.f46g, false);
        x.c.l(parcel, 4, this.f47h, r6, false);
        x.c.l(parcel, 5, this.f48i, r6, false);
        x.c.b(parcel, a5);
    }
}
