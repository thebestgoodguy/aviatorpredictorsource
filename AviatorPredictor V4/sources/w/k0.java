package w;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k0 implements Parcelable.Creator<o> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ o createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String str = null;
        String str2 = null;
        long j4 = 0;
        long j5 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r17 = 0;
        int r18 = -1;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            switch (x.b.k(n4)) {
                case 1:
                    r8 = x.b.p(parcel, n4);
                    break;
                case 2:
                    r9 = x.b.p(parcel, n4);
                    break;
                case 3:
                    r10 = x.b.p(parcel, n4);
                    break;
                case 4:
                    j4 = x.b.q(parcel, n4);
                    break;
                case 5:
                    j5 = x.b.q(parcel, n4);
                    break;
                case 6:
                    str = x.b.e(parcel, n4);
                    break;
                case 7:
                    str2 = x.b.e(parcel, n4);
                    break;
                case 8:
                    r17 = x.b.p(parcel, n4);
                    break;
                case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    r18 = x.b.p(parcel, n4);
                    break;
                default:
                    x.b.t(parcel, n4);
                    break;
            }
        }
        x.b.j(parcel, u4);
        return new o(r8, r9, r10, j4, j5, str, str2, r17, r18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o[] newArray(int r12) {
        return new o[r12];
    }
}
