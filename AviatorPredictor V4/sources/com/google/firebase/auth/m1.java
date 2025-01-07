package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.p0;

/* loaded from: classes.dex */
public final class m1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            x.b.k(n4);
            x.b.t(parcel, n4);
        }
        x.b.j(parcel, u4);
        return new p0.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new p0.a[r12];
    }
}
