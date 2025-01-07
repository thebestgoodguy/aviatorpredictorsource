package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.b;

/* loaded from: classes.dex */
public final class kh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        pp ppVar = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            if (b.k(n4) != 1) {
                b.t(parcel, n4);
            } else {
                ppVar = (pp) b.d(parcel, n4, pp.CREATOR);
            }
        }
        b.j(parcel, u4);
        return new jh(ppVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new jh[r12];
    }
}
