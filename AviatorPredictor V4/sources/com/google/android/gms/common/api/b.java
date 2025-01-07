package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        s.a aVar = null;
        int r4 = 0;
        int r5 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                r5 = x.b.p(parcel, n4);
            } else if (k4 == 2) {
                str = x.b.e(parcel, n4);
            } else if (k4 == 3) {
                pendingIntent = (PendingIntent) x.b.d(parcel, n4, PendingIntent.CREATOR);
            } else if (k4 == 4) {
                aVar = (s.a) x.b.d(parcel, n4, s.a.CREATOR);
            } else if (k4 != 1000) {
                x.b.t(parcel, n4);
            } else {
                r4 = x.b.p(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new Status(r4, r5, str, pendingIntent, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int r12) {
        return new Status[r12];
    }
}
