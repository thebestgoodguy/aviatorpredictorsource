package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.cq;

/* loaded from: classes.dex */
public final class o1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        cq cqVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    cqVar = (cq) x.b.d(parcel, n4, cq.CREATOR);
                    break;
                case 5:
                    str4 = x.b.e(parcel, n4);
                    break;
                case 6:
                    str5 = x.b.e(parcel, n4);
                    break;
                case 7:
                    str6 = x.b.e(parcel, n4);
                    break;
                default:
                    x.b.t(parcel, n4);
                    break;
            }
        }
        x.b.j(parcel, u4);
        return new n1(str, str2, str3, cqVar, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new n1[r12];
    }
}
