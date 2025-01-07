package i0;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class i extends a implements h {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    @Override // i0.h
    public final void s(f fVar, byte[] bArr, String str) {
        Parcel a5 = a();
        c.b(a5, fVar);
        a5.writeByteArray(bArr);
        a5.writeString(str);
        f(7, a5);
    }
}
