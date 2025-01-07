package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int r4 = 0;
        int r7 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                strArr = x.b.f(parcel, n4);
            } else if (k4 == 2) {
                cursorWindowArr = (CursorWindow[]) x.b.h(parcel, n4, CursorWindow.CREATOR);
            } else if (k4 == 3) {
                r7 = x.b.p(parcel, n4);
            } else if (k4 == 4) {
                bundle = x.b.a(parcel, n4);
            } else if (k4 != 1000) {
                x.b.t(parcel, n4);
            } else {
                r4 = x.b.p(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        DataHolder dataHolder = new DataHolder(r4, strArr, cursorWindowArr, r7, bundle);
        dataHolder.m0();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int r12) {
        return new DataHolder[r12];
    }
}
