package a1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        m1 m1Var = null;
        e1 e1Var = null;
        com.google.firebase.auth.n1 n1Var = null;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                m1Var = (m1) x.b.d(parcel, n4, m1.CREATOR);
            } else if (k4 == 2) {
                e1Var = (e1) x.b.d(parcel, n4, e1.CREATOR);
            } else if (k4 != 3) {
                x.b.t(parcel, n4);
            } else {
                n1Var = (com.google.firebase.auth.n1) x.b.d(parcel, n4, com.google.firebase.auth.n1.CREATOR);
            }
        }
        x.b.j(parcel, u4);
        return new g1(m1Var, e1Var, n1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new g1[r12];
    }
}
