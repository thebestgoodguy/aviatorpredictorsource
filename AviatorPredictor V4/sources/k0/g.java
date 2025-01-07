package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String str = null;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            if (x.b.k(n4) != 2) {
                x.b.t(parcel, n4);
            } else {
                str = x.b.e(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new f(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int r12) {
        return new f[r12];
    }
}
