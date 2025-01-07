package i0;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class g extends b implements f {
    public g() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override // i0.b
    protected final boolean a(int r12, Parcel parcel, Parcel parcel2, int r4) {
        if (r12 == 1) {
            q((Status) c.a(parcel, Status.CREATOR), (k0.f) c.a(parcel, k0.f.CREATOR));
        } else if (r12 == 2) {
            d(parcel.readString());
        } else if (r12 == 3) {
            j((Status) c.a(parcel, Status.CREATOR), (k0.b) c.a(parcel, k0.b.CREATOR));
        } else if (r12 == 4) {
            r((Status) c.a(parcel, Status.CREATOR), c.c(parcel));
        } else if (r12 == 6) {
            o((Status) c.a(parcel, Status.CREATOR), (k0.k) c.a(parcel, k0.k.CREATOR));
        } else if (r12 == 8) {
            p((Status) c.a(parcel, Status.CREATOR), (k0.i) c.a(parcel, k0.i.CREATOR));
        } else if (r12 == 15) {
            m((Status) c.a(parcel, Status.CREATOR), (k0.m) c.a(parcel, k0.m.CREATOR));
        } else if (r12 == 10) {
            i((Status) c.a(parcel, Status.CREATOR), c.c(parcel));
        } else {
            if (r12 != 11) {
                return false;
            }
            g((Status) c.a(parcel, Status.CREATOR));
        }
        return true;
    }
}
