package n0;

import android.os.Parcel;
import x1.x;

/* loaded from: classes.dex */
public abstract class e extends g0.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // g0.b
    protected final boolean w(int r12, Parcel parcel, Parcel parcel2, int r4) {
        switch (r12) {
            case 3:
                break;
            case 4:
            case 6:
                break;
            case 5:
            default:
                return false;
            case 7:
                break;
            case 8:
                v((l) g0.c.a(parcel, l.CREATOR));
                break;
            case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
