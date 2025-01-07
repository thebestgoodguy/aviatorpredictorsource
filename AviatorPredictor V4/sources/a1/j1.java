package a1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z4 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            switch (x.b.k(n4)) {
                case 1:
                    str = x.b.e(parcel, n4);
                    break;
                case 2:
                    str2 = x.b.e(parcel, n4);
                    break;
                case 3:
                    str5 = x.b.e(parcel, n4);
                    break;
                case 4:
                    str4 = x.b.e(parcel, n4);
                    break;
                case 5:
                    str3 = x.b.e(parcel, n4);
                    break;
                case 6:
                    str6 = x.b.e(parcel, n4);
                    break;
                case 7:
                    z4 = x.b.l(parcel, n4);
                    break;
                case 8:
                    str7 = x.b.e(parcel, n4);
                    break;
                default:
                    x.b.t(parcel, n4);
                    break;
            }
        }
        x.b.j(parcel, u4);
        return new i1(str, str2, str3, str4, str5, str6, z4, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new i1[r12];
    }
}
