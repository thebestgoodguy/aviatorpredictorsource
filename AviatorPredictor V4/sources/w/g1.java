package w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g1 implements Parcelable.Creator<f1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f1 createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        Bundle bundle = null;
        s.c[] cVarArr = null;
        e eVar = null;
        int r4 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                bundle = x.b.a(parcel, n4);
            } else if (k4 == 2) {
                cVarArr = (s.c[]) x.b.h(parcel, n4, s.c.CREATOR);
            } else if (k4 == 3) {
                r4 = x.b.p(parcel, n4);
            } else if (k4 != 4) {
                x.b.t(parcel, n4);
            } else {
                eVar = (e) x.b.d(parcel, n4, e.CREATOR);
            }
        }
        x.b.j(parcel, u4);
        return new f1(bundle, cVarArr, r4, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f1[] newArray(int r12) {
        return new f1[r12];
    }
}
