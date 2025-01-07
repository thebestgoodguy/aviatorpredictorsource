package w;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s0 implements Parcelable.Creator<r0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r0 createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        IBinder iBinder = null;
        s.a aVar = null;
        int r4 = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                r4 = x.b.p(parcel, n4);
            } else if (k4 == 2) {
                iBinder = x.b.o(parcel, n4);
            } else if (k4 == 3) {
                aVar = (s.a) x.b.d(parcel, n4, s.a.CREATOR);
            } else if (k4 == 4) {
                z4 = x.b.l(parcel, n4);
            } else if (k4 != 5) {
                x.b.t(parcel, n4);
            } else {
                z5 = x.b.l(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new r0(r4, iBinder, aVar, z4, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r0[] newArray(int r12) {
        return new r0[r12];
    }
}
