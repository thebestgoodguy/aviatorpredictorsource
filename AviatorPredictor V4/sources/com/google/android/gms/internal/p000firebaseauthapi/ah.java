package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.b;

/* loaded from: classes.dex */
public final class ah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        cq cqVar = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            int k4 = b.k(n4);
            if (k4 == 1) {
                str = b.e(parcel, n4);
            } else if (k4 != 2) {
                b.t(parcel, n4);
            } else {
                cqVar = (cq) b.d(parcel, n4, cq.CREATOR);
            }
        }
        b.j(parcel, u4);
        return new zg(str, cqVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new zg[r12];
    }
}
