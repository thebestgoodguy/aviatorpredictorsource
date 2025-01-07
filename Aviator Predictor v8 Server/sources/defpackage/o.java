package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes61.dex */
public abstract class o extends r implements p {
    public o() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // defpackage.r
    protected final boolean a(int r1, Parcel parcel, Parcel parcel2, int r4) {
        if (r1 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) s.a(parcel, Bundle.CREATOR);
        s.a(parcel);
        a(bundle);
        parcel2.writeNoException();
        return true;
    }
}
