package f0;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class g extends a implements h {
    public g() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // f0.a
    protected final boolean a(int r12, Parcel parcel, Parcel parcel2, int r4) {
        if (r12 != 1) {
            return false;
        }
        g((Status) d.a(parcel, Status.CREATOR));
        return true;
    }
}
