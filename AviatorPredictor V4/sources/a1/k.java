package a1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                str = x.b.e(parcel, n4);
            } else if (k4 == 2) {
                str2 = x.b.e(parcel, n4);
            } else if (k4 != 3) {
                x.b.t(parcel, n4);
            } else {
                arrayList = x.b.i(parcel, n4, com.google.firebase.auth.s0.CREATOR);
            }
        }
        x.b.j(parcel, u4);
        return new j(str, str2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new j[r12];
    }
}
