package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.b;

/* loaded from: classes.dex */
public final class eh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            if (b.k(n4) != 1) {
                b.t(parcel, n4);
            } else {
                str = b.e(parcel, n4);
            }
        }
        b.j(parcel, u4);
        return new dh(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new dh[r12];
    }
}
