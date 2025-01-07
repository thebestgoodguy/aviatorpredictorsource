package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.b;

/* loaded from: classes.dex */
public final class ip implements Parcelable.Creator {
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
                default:
                    b.t(parcel, n4);
                    break;
            }
        }
        b.j(parcel, u4);
        return new hp(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new hp[r12];
    }
}
