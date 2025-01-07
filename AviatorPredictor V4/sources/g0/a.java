package g0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f3861a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3862b;

    protected a(IBinder iBinder, String str) {
        this.f3861a = iBinder;
        this.f3862b = str;
    }

    protected final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3862b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3861a;
    }

    protected final void f(int r4, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3861a.transact(r4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final void h(int r32, Parcel parcel) {
        try {
            this.f3861a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
