package n0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        int r12 = 0;
        Intent intent = null;
        int r22 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                r12 = x.b.p(parcel, n4);
            } else if (k4 == 2) {
                r22 = x.b.p(parcel, n4);
            } else if (k4 != 3) {
                x.b.t(parcel, n4);
            } else {
                intent = (Intent) x.b.d(parcel, n4, Intent.CREATOR);
            }
        }
        x.b.j(parcel, u4);
        return new b(r12, r22, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int r12) {
        return new b[r12];
    }
}
