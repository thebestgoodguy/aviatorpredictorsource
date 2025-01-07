package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String str = null;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            if (x.b.k(n4) != 1) {
                x.b.t(parcel, n4);
            } else {
                str = x.b.e(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new t0(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new t0[r12];
    }
}
