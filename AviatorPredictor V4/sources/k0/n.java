package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        int r12 = 0;
        boolean z4 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 2) {
                r12 = x.b.p(parcel, n4);
            } else if (k4 != 3) {
                x.b.t(parcel, n4);
            } else {
                z4 = x.b.l(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new m(r12, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int r12) {
        return new m[r12];
    }
}
