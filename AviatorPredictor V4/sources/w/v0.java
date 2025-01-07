package w;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class v0 implements m {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f8072a;

    v0(IBinder iBinder) {
        this.f8072a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8072a;
    }

    @Override // w.m
    public final void n(l lVar, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                i1.a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f8072a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
