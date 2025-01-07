package a1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            if (x.b.k(n4) != 1) {
                x.b.t(parcel, n4);
            } else {
                arrayList = x.b.i(parcel, n4, com.google.firebase.auth.s0.CREATOR);
            }
        }
        x.b.j(parcel, u4);
        return new f0(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new f0[r12];
    }
}
