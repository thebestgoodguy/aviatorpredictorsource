package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.s0;
import x.b;
import x1.x;

/* loaded from: classes.dex */
public final class bi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        s0 s0Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j4 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            switch (b.k(n4)) {
                case 1:
                    s0Var = (s0) b.d(parcel, n4, s0.CREATOR);
                    break;
                case 2:
                    str = b.e(parcel, n4);
                    break;
                case 3:
                    str2 = b.e(parcel, n4);
                    break;
                case 4:
                    j4 = b.q(parcel, n4);
                    break;
                case 5:
                    z4 = b.l(parcel, n4);
                    break;
                case 6:
                    z5 = b.l(parcel, n4);
                    break;
                case 7:
                    str3 = b.e(parcel, n4);
                    break;
                case 8:
                    str4 = b.e(parcel, n4);
                    break;
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    z6 = b.l(parcel, n4);
                    break;
                default:
                    b.t(parcel, n4);
                    break;
            }
        }
        b.j(parcel, u4);
        return new ai(s0Var, str, str2, j4, z4, z5, str3, str4, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new ai[r12];
    }
}
