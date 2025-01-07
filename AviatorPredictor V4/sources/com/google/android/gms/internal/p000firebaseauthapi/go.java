package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import x.b;

/* loaded from: classes.dex */
public final class go implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        String str2 = null;
        aq aqVar = null;
        ArrayList<String> arrayList = null;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            switch (b.k(n4)) {
                case 2:
                    str = b.e(parcel, n4);
                    break;
                case 3:
                    z4 = b.l(parcel, n4);
                    break;
                case 4:
                    str2 = b.e(parcel, n4);
                    break;
                case 5:
                    z5 = b.l(parcel, n4);
                    break;
                case 6:
                    aqVar = (aq) b.d(parcel, n4, aq.CREATOR);
                    break;
                case 7:
                    arrayList = b.g(parcel, n4);
                    break;
                default:
                    b.t(parcel, n4);
                    break;
            }
        }
        b.j(parcel, u4);
        return new fo(str, z4, str2, z5, aqVar, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new fo[r12];
    }
}
