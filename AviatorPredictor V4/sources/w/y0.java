package w;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y0 implements Parcelable.Creator<t> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        int r32 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int r6 = 0;
        int r7 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                r32 = x.b.p(parcel, n4);
            } else if (k4 == 2) {
                z4 = x.b.l(parcel, n4);
            } else if (k4 == 3) {
                z5 = x.b.l(parcel, n4);
            } else if (k4 == 4) {
                r6 = x.b.p(parcel, n4);
            } else if (k4 != 5) {
                x.b.t(parcel, n4);
            } else {
                r7 = x.b.p(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new t(r32, z4, z5, r6, r7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t[] newArray(int r12) {
        return new t[r12];
    }
}
