package w;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z implements Parcelable.Creator<v> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ v createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        int r12 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                r12 = x.b.p(parcel, n4);
            } else if (k4 != 2) {
                x.b.t(parcel, n4);
            } else {
                arrayList = x.b.i(parcel, n4, o.CREATOR);
            }
        }
        x.b.j(parcel, u4);
        return new v(r12, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v[] newArray(int r12) {
        return new v[r12];
    }
}
