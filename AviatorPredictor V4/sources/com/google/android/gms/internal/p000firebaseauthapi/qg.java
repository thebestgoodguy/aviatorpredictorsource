package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.n0;
import x.b;

/* loaded from: classes.dex */
public final class qg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        n0 n0Var = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            int k4 = b.k(n4);
            if (k4 == 1) {
                n0Var = (n0) b.d(parcel, n4, n0.CREATOR);
            } else if (k4 == 2) {
                str = b.e(parcel, n4);
            } else if (k4 != 3) {
                b.t(parcel, n4);
            } else {
                str2 = b.e(parcel, n4);
            }
        }
        b.j(parcel, u4);
        return new pg(n0Var, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new pg[r12];
    }
}
