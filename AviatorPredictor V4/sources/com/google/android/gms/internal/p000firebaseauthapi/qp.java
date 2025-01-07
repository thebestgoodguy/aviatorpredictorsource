package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.b;

/* loaded from: classes.dex */
public final class qp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j4 = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            switch (b.k(n4)) {
                case 1:
                    str = b.e(parcel, n4);
                    break;
                case 2:
                    j4 = b.q(parcel, n4);
                    break;
                case 3:
                    z4 = b.l(parcel, n4);
                    break;
                case 4:
                    str2 = b.e(parcel, n4);
                    break;
                case 5:
                    str3 = b.e(parcel, n4);
                    break;
                case 6:
                    str4 = b.e(parcel, n4);
                    break;
                case 7:
                    z5 = b.l(parcel, n4);
                    break;
                case 8:
                    str5 = b.e(parcel, n4);
                    break;
                default:
                    b.t(parcel, n4);
                    break;
            }
        }
        b.j(parcel, u4);
        return new pp(str, j4, z4, str2, str3, str4, z5, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new pp[r12];
    }
}
