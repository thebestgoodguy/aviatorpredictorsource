package n0;

import android.os.Parcel;
import android.os.Parcelable;
import w.p0;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        int r12 = 0;
        p0 p0Var = null;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                r12 = x.b.p(parcel, n4);
            } else if (k4 != 2) {
                x.b.t(parcel, n4);
            } else {
                p0Var = (p0) x.b.d(parcel, n4, p0.CREATOR);
            }
        }
        x.b.j(parcel, u4);
        return new j(r12, p0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int r12) {
        return new j[r12];
    }
}
