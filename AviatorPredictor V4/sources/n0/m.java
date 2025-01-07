package n0;

import android.os.Parcel;
import android.os.Parcelable;
import w.r0;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        s.a aVar = null;
        r0 r0Var = null;
        int r32 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                r32 = x.b.p(parcel, n4);
            } else if (k4 == 2) {
                aVar = (s.a) x.b.d(parcel, n4, s.a.CREATOR);
            } else if (k4 != 3) {
                x.b.t(parcel, n4);
            } else {
                r0Var = (r0) x.b.d(parcel, n4, r0.CREATOR);
            }
        }
        x.b.j(parcel, u4);
        return new l(r32, aVar, r0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int r12) {
        return new l[r12];
    }
}
