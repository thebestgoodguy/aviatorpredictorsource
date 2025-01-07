package a1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.bp;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        bp bpVar = null;
        i1 i1Var = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        o1 o1Var = null;
        com.google.firebase.auth.n1 n1Var = null;
        f0 f0Var = null;
        boolean z4 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            switch (x.b.k(n4)) {
                case 1:
                    bpVar = (bp) x.b.d(parcel, n4, bp.CREATOR);
                    break;
                case 2:
                    i1Var = (i1) x.b.d(parcel, n4, i1.CREATOR);
                    break;
                case 3:
                    str = x.b.e(parcel, n4);
                    break;
                case 4:
                    str2 = x.b.e(parcel, n4);
                    break;
                case 5:
                    arrayList = x.b.i(parcel, n4, i1.CREATOR);
                    break;
                case 6:
                    arrayList2 = x.b.g(parcel, n4);
                    break;
                case 7:
                    str3 = x.b.e(parcel, n4);
                    break;
                case 8:
                    bool = x.b.m(parcel, n4);
                    break;
                case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    o1Var = (o1) x.b.d(parcel, n4, o1.CREATOR);
                    break;
                case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    z4 = x.b.l(parcel, n4);
                    break;
                case 11:
                    n1Var = (com.google.firebase.auth.n1) x.b.d(parcel, n4, com.google.firebase.auth.n1.CREATOR);
                    break;
                case 12:
                    f0Var = (f0) x.b.d(parcel, n4, f0.CREATOR);
                    break;
                default:
                    x.b.t(parcel, n4);
                    break;
            }
        }
        x.b.j(parcel, u4);
        return new m1(bpVar, i1Var, str, str2, arrayList, arrayList2, str3, bool, o1Var, z4, n1Var, f0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new m1[r12];
    }
}
