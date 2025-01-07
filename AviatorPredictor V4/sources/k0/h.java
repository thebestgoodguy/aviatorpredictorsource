package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String str = null;
        byte[] bArr = null;
        int r32 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 2) {
                str = x.b.e(parcel, n4);
            } else if (k4 == 3) {
                bArr = x.b.b(parcel, n4);
            } else if (k4 != 4) {
                x.b.t(parcel, n4);
            } else {
                r32 = x.b.p(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new a(str, bArr, r32);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int r12) {
        return new a[r12];
    }
}
