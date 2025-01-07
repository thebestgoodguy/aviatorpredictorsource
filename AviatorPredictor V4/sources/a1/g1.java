package a1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class g1 implements com.google.firebase.auth.i {
    public static final Parcelable.Creator<g1> CREATOR = new h1();

    /* renamed from: e, reason: collision with root package name */
    private m1 f41e;

    /* renamed from: f, reason: collision with root package name */
    private e1 f42f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.firebase.auth.n1 f43g;

    public g1(m1 m1Var) {
        m1 m1Var2 = (m1) w.r.i(m1Var);
        this.f41e = m1Var2;
        List P0 = m1Var2.P0();
        this.f42f = null;
        for (int r12 = 0; r12 < P0.size(); r12++) {
            if (!TextUtils.isEmpty(((i1) P0.get(r12)).a())) {
                this.f42f = new e1(((i1) P0.get(r12)).h(), ((i1) P0.get(r12)).a(), m1Var.T0());
            }
        }
        if (this.f42f == null) {
            this.f42f = new e1(m1Var.T0());
        }
        this.f43g = m1Var.L0();
    }

    g1(m1 m1Var, e1 e1Var, com.google.firebase.auth.n1 n1Var) {
        this.f41e = m1Var;
        this.f42f = e1Var;
        this.f43g = n1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.i
    public final com.google.firebase.auth.g f0() {
        return this.f42f;
    }

    @Override // com.google.firebase.auth.i
    public final com.google.firebase.auth.z k() {
        return this.f41e;
    }

    @Override // com.google.firebase.auth.i
    public final com.google.firebase.auth.h r() {
        return this.f43g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.l(parcel, 1, this.f41e, r6, false);
        x.c.l(parcel, 2, this.f42f, r6, false);
        x.c.l(parcel, 3, this.f43g, r6, false);
        x.c.b(parcel, a5);
    }
}
