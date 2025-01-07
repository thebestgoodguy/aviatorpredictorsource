package k0;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator<b> {
    static void a(b bVar, Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 2, bVar.m0(), false);
        x.c.l(parcel, 3, bVar.j0(), r6, false);
        x.c.l(parcel, 4, bVar.k0(), r6, false);
        x.c.j(parcel, 5, bVar.l0());
        x.c.f(parcel, 6, bVar.n0(), false);
        x.c.b(parcel, a5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j4 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 2) {
                str = x.b.e(parcel, n4);
            } else if (k4 == 3) {
                dataHolder = (DataHolder) x.b.d(parcel, n4, DataHolder.CREATOR);
            } else if (k4 == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) x.b.d(parcel, n4, ParcelFileDescriptor.CREATOR);
            } else if (k4 == 5) {
                j4 = x.b.q(parcel, n4);
            } else if (k4 != 6) {
                x.b.t(parcel, n4);
            } else {
                bArr = x.b.b(parcel, n4);
            }
        }
        x.b.j(parcel, u4);
        return new b(str, dataHolder, parcelFileDescriptor, j4, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int r12) {
        return new b[r12];
    }
}
