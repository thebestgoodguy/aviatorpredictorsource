package w;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h1 implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        t tVar = null;
        int[] r7 = null;
        int[] r9 = null;
        boolean z4 = false;
        boolean z5 = false;
        int r8 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            switch (x.b.k(n4)) {
                case 1:
                    tVar = (t) x.b.d(parcel, n4, t.CREATOR);
                    break;
                case 2:
                    z4 = x.b.l(parcel, n4);
                    break;
                case 3:
                    z5 = x.b.l(parcel, n4);
                    break;
                case 4:
                    r7 = x.b.c(parcel, n4);
                    break;
                case 5:
                    r8 = x.b.p(parcel, n4);
                    break;
                case 6:
                    r9 = x.b.c(parcel, n4);
                    break;
                default:
                    x.b.t(parcel, n4);
                    break;
            }
        }
        x.b.j(parcel, u4);
        return new e(tVar, z4, z5, r7, r8, r9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int r12) {
        return new e[r12];
    }
}
