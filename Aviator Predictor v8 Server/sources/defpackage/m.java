package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes61.dex */
public abstract class m extends r implements n {
    public static n a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return queryLocalInterface instanceof n ? (n) queryLocalInterface : new l(iBinder);
    }
}
