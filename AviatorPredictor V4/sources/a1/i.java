package a1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        ArrayList arrayList = null;
        j jVar = null;
        String str = null;
        com.google.firebase.auth.n1 n1Var = null;
        m1 m1Var = null;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                arrayList = x.b.i(parcel, n4, com.google.firebase.auth.s0.CREATOR);
            } else if (k4 == 2) {
                jVar = (j) x.b.d(parcel, n4, j.CREATOR);
            } else if (k4 == 3) {
                str = x.b.e(parcel, n4);
            } else if (k4 == 4) {
                n1Var = (com.google.firebase.auth.n1) x.b.d(parcel, n4, com.google.firebase.auth.n1.CREATOR);
            } else if (k4 != 5) {
                x.b.t(parcel, n4);
            } else {
                m1Var = (m1) x.b.d(parcel, n4, m1.CREATOR);
            }
        }
        x.b.j(parcel, u4);
        return new h(arrayList, jVar, str, n1Var, m1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new h[r12];
    }
}
