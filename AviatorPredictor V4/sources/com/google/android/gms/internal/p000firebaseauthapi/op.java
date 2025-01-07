package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.b;

/* loaded from: classes.dex */
public final class op implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        fp fpVar = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            int k4 = b.k(n4);
            if (k4 == 2) {
                str = b.e(parcel, n4);
            } else if (k4 == 3) {
                str2 = b.e(parcel, n4);
            } else if (k4 == 4) {
                str3 = b.e(parcel, n4);
            } else if (k4 != 5) {
                b.t(parcel, n4);
            } else {
                fpVar = (fp) b.d(parcel, n4, fp.CREATOR);
            }
        }
        b.j(parcel, u4);
        return new np(str, str2, str3, fpVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new np[r12];
    }
}
