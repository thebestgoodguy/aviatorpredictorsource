package a1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        long j4 = 0;
        long j5 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                j4 = x.b.q(parcel, n4);
            } else if (k4 != 2) {
                x.b.t(parcel, n4);
            } else {
                j5 = x.b.q(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new o1(j4, j5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new o1[r12];
    }
}
