package h0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f3895a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3896b;

    protected a(IBinder iBinder, String str) {
        this.f3895a = iBinder;
        this.f3896b = str;
    }

    protected final Parcel a(int r4, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f3895a.transact(r4, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e5) {
                obtain.recycle();
                throw e5;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3895a;
    }

    protected final Parcel f() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3896b);
        return obtain;
    }
}
