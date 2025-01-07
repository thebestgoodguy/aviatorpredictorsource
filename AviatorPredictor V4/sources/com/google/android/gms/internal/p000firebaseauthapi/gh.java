package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.e;
import x.b;

/* loaded from: classes.dex */
public final class gh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        e eVar = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            int k4 = b.k(n4);
            if (k4 == 1) {
                str = b.e(parcel, n4);
            } else if (k4 != 2) {
                b.t(parcel, n4);
            } else {
                eVar = (e) b.d(parcel, n4, e.CREATOR);
            }
        }
        b.j(parcel, u4);
        return new fh(str, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new fh[r12];
    }
}
