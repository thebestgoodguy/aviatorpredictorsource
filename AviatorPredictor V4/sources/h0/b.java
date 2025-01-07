package h0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class b extends Binder implements IInterface {
    protected b(String str) {
        attachInterface(this, str);
    }

    protected boolean a(int r12, Parcel parcel, Parcel parcel2, int r4) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r22, Parcel parcel, Parcel parcel2, int r5) {
        if (r22 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(r22, parcel, parcel2, r5)) {
            return true;
        }
        return a(r22, parcel, parcel2, r5);
    }
}
