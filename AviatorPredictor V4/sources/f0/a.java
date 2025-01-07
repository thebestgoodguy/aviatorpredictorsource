package f0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a extends Binder implements IInterface {
    protected a(String str) {
        attachInterface(this, str);
    }

    protected boolean a(int r12, Parcel parcel, Parcel parcel2, int r4) {
        throw null;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int r22, Parcel parcel, Parcel parcel2, int r5) {
        boolean z4;
        if (r22 > 16777215) {
            z4 = super.onTransact(r22, parcel, parcel2, r5);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return a(r22, parcel, parcel2, r5);
    }
}
