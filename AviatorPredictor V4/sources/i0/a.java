package i0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f4022a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4023b;

    protected a(IBinder iBinder, String str) {
        this.f4022a = iBinder;
        this.f4023b = str;
    }

    protected final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4023b);
        return obtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f4022a;
    }

    protected final void f(int r4, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4022a.transact(r4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
