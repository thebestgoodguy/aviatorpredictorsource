package w;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class r1 extends h0.a implements j {
    r1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // w.j
    public final Account b() {
        Parcel a5 = a(2, f());
        Account account = (Account) h0.c.a(a5, Account.CREATOR);
        a5.recycle();
        return account;
    }
}
