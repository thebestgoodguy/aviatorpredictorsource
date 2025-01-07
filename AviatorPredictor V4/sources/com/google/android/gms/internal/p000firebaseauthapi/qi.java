package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.n1;
import java.util.ArrayList;
import x.b;

/* loaded from: classes.dex */
public final class qi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        ArrayList arrayList = null;
        n1 n1Var = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            int k4 = b.k(n4);
            if (k4 == 1) {
                str = b.e(parcel, n4);
            } else if (k4 == 2) {
                arrayList = b.i(parcel, n4, fp.CREATOR);
            } else if (k4 != 3) {
                b.t(parcel, n4);
            } else {
                n1Var = (n1) b.d(parcel, n4, n1.CREATOR);
            }
        }
        b.j(parcel, u4);
        return new pi(str, arrayList, n1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new pi[r12];
    }
}
