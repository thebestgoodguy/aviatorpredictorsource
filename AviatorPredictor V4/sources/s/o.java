package s;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int r32 = 0;
        int r4 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                r32 = x.b.p(parcel, n4);
            } else if (k4 == 2) {
                r4 = x.b.p(parcel, n4);
            } else if (k4 == 3) {
                pendingIntent = (PendingIntent) x.b.d(parcel, n4, PendingIntent.CREATOR);
            } else if (k4 != 4) {
                x.b.t(parcel, n4);
            } else {
                str = x.b.e(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new a(r32, r4, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int r12) {
        return new a[r12];
    }
}
