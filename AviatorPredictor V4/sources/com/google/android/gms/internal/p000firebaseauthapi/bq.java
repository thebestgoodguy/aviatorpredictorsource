package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import x.b;

/* loaded from: classes.dex */
public final class bq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        int r12 = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            int k4 = b.k(n4);
            if (k4 == 1) {
                r12 = b.p(parcel, n4);
            } else if (k4 != 2) {
                b.t(parcel, n4);
            } else {
                arrayList = b.g(parcel, n4);
            }
        }
        b.j(parcel, u4);
        return new aq(r12, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new aq[r12];
    }
}
