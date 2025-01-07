package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.n1;
import x.b;

/* loaded from: classes.dex */
public final class oi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        Status status = null;
        n1 n1Var = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            int k4 = b.k(n4);
            if (k4 == 1) {
                status = (Status) b.d(parcel, n4, Status.CREATOR);
            } else if (k4 == 2) {
                n1Var = (n1) b.d(parcel, n4, n1.CREATOR);
            } else if (k4 == 3) {
                str = b.e(parcel, n4);
            } else if (k4 != 4) {
                b.t(parcel, n4);
            } else {
                str2 = b.e(parcel, n4);
            }
        }
        b.j(parcel, u4);
        return new ni(status, n1Var, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new ni[r12];
    }
}
