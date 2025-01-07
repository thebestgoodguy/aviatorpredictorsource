package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import x.b;
import x1.x;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j4 = 0;
        int r7 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = b.n(parcel);
            switch (b.k(n4)) {
                case 1:
                    r7 = b.p(parcel, n4);
                    break;
                case 2:
                    str = b.e(parcel, n4);
                    break;
                case 3:
                    str2 = b.e(parcel, n4);
                    break;
                case 4:
                    str3 = b.e(parcel, n4);
                    break;
                case 5:
                    str4 = b.e(parcel, n4);
                    break;
                case 6:
                    uri = (Uri) b.d(parcel, n4, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.e(parcel, n4);
                    break;
                case 8:
                    j4 = b.q(parcel, n4);
                    break;
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    str6 = b.e(parcel, n4);
                    break;
                case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    arrayList = b.i(parcel, n4, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.e(parcel, n4);
                    break;
                case 12:
                    str8 = b.e(parcel, n4);
                    break;
                default:
                    b.t(parcel, n4);
                    break;
            }
        }
        b.j(parcel, u4);
        return new GoogleSignInAccount(r7, str, str2, str3, str4, uri, str5, j4, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int r12) {
        return new GoogleSignInAccount[r12];
    }
}
