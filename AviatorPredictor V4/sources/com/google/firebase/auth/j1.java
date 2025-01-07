package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        boolean z4 = false;
        String str = null;
        String str2 = null;
        boolean z5 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 2) {
                str = x.b.e(parcel, n4);
            } else if (k4 == 3) {
                str2 = x.b.e(parcel, n4);
            } else if (k4 == 4) {
                z4 = x.b.l(parcel, n4);
            } else if (k4 != 5) {
                x.b.t(parcel, n4);
            } else {
                z5 = x.b.l(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new y0(str, str2, z4, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new y0[r12];
    }
}
