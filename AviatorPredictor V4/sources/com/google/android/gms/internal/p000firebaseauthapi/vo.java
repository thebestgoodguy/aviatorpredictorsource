package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.n1;
import java.util.ArrayList;
import x.b;
import x1.x;

/* loaded from: classes.dex */
public final class vo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        jp jpVar = null;
        String str5 = null;
        String str6 = null;
        n1 n1Var = null;
        ArrayList arrayList = null;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            switch (b.k(n4)) {
                case 2:
                    str = b.e(parcel, n4);
                    break;
                case 3:
                    str2 = b.e(parcel, n4);
                    break;
                case 4:
                    z4 = b.l(parcel, n4);
                    break;
                case 5:
                    str3 = b.e(parcel, n4);
                    break;
                case 6:
                    str4 = b.e(parcel, n4);
                    break;
                case 7:
                    jpVar = (jp) b.d(parcel, n4, jp.CREATOR);
                    break;
                case 8:
                    str5 = b.e(parcel, n4);
                    break;
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    str6 = b.e(parcel, n4);
                    break;
                case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    j4 = b.q(parcel, n4);
                    break;
                case 11:
                    j5 = b.q(parcel, n4);
                    break;
                case 12:
                    z5 = b.l(parcel, n4);
                    break;
                case 13:
                    n1Var = (n1) b.d(parcel, n4, n1.CREATOR);
                    break;
                case 14:
                    arrayList = b.i(parcel, n4, fp.CREATOR);
                    break;
                default:
                    b.t(parcel, n4);
                    break;
            }
        }
        b.j(parcel, u4);
        return new uo(str, str2, z4, str3, str4, jpVar, str5, str6, j4, j5, z5, n1Var, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new uo[r12];
    }
}
