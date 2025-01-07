package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.b;
import x1.x;

/* loaded from: classes.dex */
public final class dq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            switch (b.k(n4)) {
                case 2:
                    str = b.e(parcel, n4);
                    break;
                case 3:
                    str2 = b.e(parcel, n4);
                    break;
                case 4:
                    str3 = b.e(parcel, n4);
                    break;
                case 5:
                    str4 = b.e(parcel, n4);
                    break;
                case 6:
                    str5 = b.e(parcel, n4);
                    break;
                case 7:
                    str6 = b.e(parcel, n4);
                    break;
                case 8:
                    str7 = b.e(parcel, n4);
                    break;
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    str8 = b.e(parcel, n4);
                    break;
                case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    z4 = b.l(parcel, n4);
                    break;
                case 11:
                    z5 = b.l(parcel, n4);
                    break;
                case 12:
                    str9 = b.e(parcel, n4);
                    break;
                case 13:
                    str10 = b.e(parcel, n4);
                    break;
                case 14:
                    str11 = b.e(parcel, n4);
                    break;
                case 15:
                    str12 = b.e(parcel, n4);
                    break;
                case 16:
                    z6 = b.l(parcel, n4);
                    break;
                case x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    str13 = b.e(parcel, n4);
                    break;
                default:
                    b.t(parcel, n4);
                    break;
            }
        }
        b.j(parcel, u4);
        return new cq(str, str2, str3, str4, str5, str6, str7, str8, z4, z5, str9, str10, str11, str12, z6, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new cq[r12];
    }
}
