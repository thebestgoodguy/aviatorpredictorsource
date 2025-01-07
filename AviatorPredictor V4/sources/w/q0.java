package w;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class q0 implements Parcelable.Creator<p0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p0 createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int r32 = 0;
        int r4 = 0;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            int k4 = x.b.k(n4);
            if (k4 == 1) {
                r32 = x.b.p(parcel, n4);
            } else if (k4 == 2) {
                account = (Account) x.b.d(parcel, n4, Account.CREATOR);
            } else if (k4 == 3) {
                r4 = x.b.p(parcel, n4);
            } else if (k4 != 4) {
                x.b.t(parcel, n4);
            } else {
                googleSignInAccount = (GoogleSignInAccount) x.b.d(parcel, n4, GoogleSignInAccount.CREATOR);
            }
        }
        x.b.j(parcel, u4);
        return new p0(r32, account, r4, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p0[] newArray(int r12) {
        return new p0[r12];
    }
}
