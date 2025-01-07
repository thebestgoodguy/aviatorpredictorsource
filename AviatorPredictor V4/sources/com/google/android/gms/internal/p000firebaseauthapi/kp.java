package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import x.b;

/* loaded from: classes.dex */
public final class kp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            if (b.k(n4) != 2) {
                b.t(parcel, n4);
            } else {
                arrayList = b.i(parcel, n4, hp.CREATOR);
            }
        }
        b.j(parcel, u4);
        return new jp(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new jp[r12];
    }
}
