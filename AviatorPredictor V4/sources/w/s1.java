package w;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class s1 extends h0.b implements t1 {
    public s1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // h0.b
    protected final boolean a(int r12, Parcel parcel, Parcel parcel2, int r4) {
        if (r12 == 1) {
            d0.a e5 = e();
            parcel2.writeNoException();
            h0.c.c(parcel2, e5);
        } else {
            if (r12 != 2) {
                return false;
            }
            int c5 = c();
            parcel2.writeNoException();
            parcel2.writeInt(c5);
        }
        return true;
    }
}
