package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.y0;
import x.b;

/* loaded from: classes.dex */
public final class ji implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        y0 y0Var = null;
        String str = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            int k4 = b.k(n4);
            if (k4 == 1) {
                y0Var = (y0) b.d(parcel, n4, y0.CREATOR);
            } else if (k4 != 2) {
                b.t(parcel, n4);
            } else {
                str = b.e(parcel, n4);
            }
        }
        b.j(parcel, u4);
        return new ii(y0Var, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new ii[r12];
    }
}
