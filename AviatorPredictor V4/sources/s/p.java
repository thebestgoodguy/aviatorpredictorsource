package s;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String str = null;
        int r22 = 0;
        long j4 = -1;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                str = x.b.e(parcel, n4);
            } else if (k4 == 2) {
                r22 = x.b.p(parcel, n4);
            } else if (k4 != 3) {
                x.b.t(parcel, n4);
            } else {
                j4 = x.b.q(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new c(str, r22, j4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int r12) {
        return new c[r12];
    }
}
