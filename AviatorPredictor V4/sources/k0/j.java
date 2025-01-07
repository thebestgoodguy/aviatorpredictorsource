package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        long j4 = 0;
        a[] aVarArr = null;
        int r9 = 0;
        boolean z4 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 2) {
                j4 = x.b.q(parcel, n4);
            } else if (k4 == 3) {
                aVarArr = (a[]) x.b.h(parcel, n4, a.CREATOR);
            } else if (k4 == 4) {
                r9 = x.b.p(parcel, n4);
            } else if (k4 != 5) {
                x.b.t(parcel, n4);
            } else {
                z4 = x.b.l(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new i(j4, aVarArr, r9, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int r12) {
        return new i[r12];
    }
}
