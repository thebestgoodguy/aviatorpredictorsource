package n0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                arrayList = x.b.g(parcel, n4);
            } else if (k4 != 2) {
                x.b.t(parcel, n4);
            } else {
                str = x.b.e(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int r12) {
        return new h[r12];
    }
}
