package w;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class u0 extends h0.b implements l {
    public u0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // h0.b
    protected final boolean a(int r32, Parcel parcel, Parcel parcel2, int r6) {
        if (r32 == 1) {
            u(parcel.readInt(), parcel.readStrongBinder(), (Bundle) h0.c.a(parcel, Bundle.CREATOR));
        } else if (r32 == 2) {
            k(parcel.readInt(), (Bundle) h0.c.a(parcel, Bundle.CREATOR));
        } else {
            if (r32 != 3) {
                return false;
            }
            t(parcel.readInt(), parcel.readStrongBinder(), (f1) h0.c.a(parcel, f1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
