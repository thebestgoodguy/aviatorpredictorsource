package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l1 implements Parcelable.Creator {
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
        boolean z5 = false;
        int r12 = 0;
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
                    str3 = x.b.e(parcel, n4);
                    break;
                case 4:
                    str4 = x.b.e(parcel, n4);
                    break;
                case 5:
                    z4 = x.b.l(parcel, n4);
                    break;
                case 6:
                    str5 = x.b.e(parcel, n4);
                    break;
                case 7:
                    z5 = x.b.l(parcel, n4);
                    break;
                case 8:
                    str6 = x.b.e(parcel, n4);
                    break;
                case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    r12 = x.b.p(parcel, n4);
                    break;
                case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    str7 = x.b.e(parcel, n4);
                    break;
                default:
                    x.b.t(parcel, n4);
                    break;
            }
        }
        x.b.j(parcel, u4);
        return new e(str, str2, str3, str4, z4, str5, z5, str6, r12, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new e[r12];
    }
}
