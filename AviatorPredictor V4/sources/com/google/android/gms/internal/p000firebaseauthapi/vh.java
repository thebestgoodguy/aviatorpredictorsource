package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.j;
import x.b;

/* loaded from: classes.dex */
public final class vh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        j jVar = null;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            if (b.k(n4) != 1) {
                b.t(parcel, n4);
            } else {
                jVar = (j) b.d(parcel, n4, j.CREATOR);
            }
        }
        b.j(parcel, u4);
        return new uh(jVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new uh[r12];
    }
}
