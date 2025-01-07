package w;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class p0 extends x.a {
    public static final Parcelable.Creator<p0> CREATOR = new q0();

    /* renamed from: e, reason: collision with root package name */
    final int f8041e;

    /* renamed from: f, reason: collision with root package name */
    private final Account f8042f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8043g;

    /* renamed from: h, reason: collision with root package name */
    private final GoogleSignInAccount f8044h;

    p0(int r12, Account account, int r32, GoogleSignInAccount googleSignInAccount) {
        this.f8041e = r12;
        this.f8042f = account;
        this.f8043g = r32;
        this.f8044h = googleSignInAccount;
    }

    public p0(Account account, int r32, GoogleSignInAccount googleSignInAccount) {
        this(2, account, r32, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.h(parcel, 1, this.f8041e);
        x.c.l(parcel, 2, this.f8042f, r6, false);
        x.c.h(parcel, 3, this.f8043g);
        x.c.l(parcel, 4, this.f8044h, r6, false);
        x.c.b(parcel, a5);
    }
}
