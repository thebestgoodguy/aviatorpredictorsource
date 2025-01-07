package f0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class c implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f3645a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3646b;

    protected c(IBinder iBinder, String str) {
        this.f3645a = iBinder;
        this.f3646b = str;
    }

    protected final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3646b);
        return obtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f3645a;
    }

    protected final void f(int r4, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3645a.transact(r4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
