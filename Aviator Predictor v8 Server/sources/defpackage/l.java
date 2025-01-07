package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes61.dex */
public final class l extends q implements n {
    l(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // defpackage.n
    public final int a(int r2, String str, String str2) {
        Parcel a = a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        Parcel a2 = a(5, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // defpackage.n
    public final int a(int r2, String str, String str2, Bundle bundle) {
        Parcel a = a();
        a.writeInt(r2);
        a.writeString(str);
        a.writeString(str2);
        s.a(a, bundle);
        Parcel a2 = a(10, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // defpackage.n
    public final Bundle a(int r2, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel a = a();
        a.writeInt(r2);
        a.writeString(str);
        a.writeString(str2);
        s.a(a, bundle);
        s.a(a, bundle2);
        Parcel a2 = a(TypedValues.Custom.TYPE_FLOAT, a);
        Bundle bundle3 = (Bundle) s.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle3;
    }

    @Override // defpackage.n
    public final Bundle a(int r2, String str, String str2, String str3) {
        Parcel a = a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        Parcel a2 = a(4, a);
        Bundle bundle = (Bundle) s.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // defpackage.n
    public final Bundle a(int r2, String str, String str2, String str3, Bundle bundle) {
        Parcel a = a();
        a.writeInt(6);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        s.a(a, bundle);
        Parcel a2 = a(9, a);
        Bundle bundle2 = (Bundle) s.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }

    @Override // defpackage.n
    public final Bundle a(int r1, String str, String str2, String str3, String str4) {
        Parcel a = a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        a.writeString(null);
        Parcel a2 = a(3, a);
        Bundle bundle = (Bundle) s.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // defpackage.n
    public final Bundle a(int r1, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel a = a();
        a.writeInt(r1);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        a.writeString(null);
        s.a(a, bundle);
        Parcel a2 = a(8, a);
        Bundle bundle2 = (Bundle) s.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }

    @Override // defpackage.n
    public final void a(int r2, String str, Bundle bundle, p pVar) {
        Parcel a = a();
        a.writeInt(12);
        a.writeString(str);
        s.a(a, bundle);
        s.a(a, pVar);
        b(1201, a);
    }

    @Override // defpackage.n
    public final int b(int r2, String str, String str2) {
        Parcel a = a();
        a.writeInt(r2);
        a.writeString(str);
        a.writeString(str2);
        Parcel a2 = a(1, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // defpackage.n
    public final Bundle b(int r2, String str, String str2, Bundle bundle) {
        Parcel a = a();
        a.writeInt(9);
        a.writeString(str);
        a.writeString(str2);
        s.a(a, bundle);
        Parcel a2 = a(TypedValues.Custom.TYPE_COLOR, a);
        Bundle bundle2 = (Bundle) s.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }

    @Override // defpackage.n
    public final Bundle b(int r2, String str, String str2, String str3, Bundle bundle) {
        Parcel a = a();
        a.writeInt(9);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        s.a(a, bundle);
        Parcel a2 = a(11, a);
        Bundle bundle2 = (Bundle) s.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }

    @Override // defpackage.n
    public final Bundle c(int r2, String str, String str2, Bundle bundle) {
        Parcel a = a();
        a.writeInt(9);
        a.writeString(str);
        a.writeString(str2);
        s.a(a, bundle);
        Parcel a2 = a(12, a);
        Bundle bundle2 = (Bundle) s.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }

    @Override // defpackage.n
    public final Bundle c(int r1, String str, String str2, String str3, Bundle bundle) {
        Parcel a = a();
        a.writeInt(8);
        a.writeString(str);
        a.writeString(str2);
        a.writeString("subs");
        s.a(a, bundle);
        Parcel a2 = a(801, a);
        Bundle bundle2 = (Bundle) s.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }

    @Override // defpackage.n
    public final Bundle d(int r2, String str, String str2, Bundle bundle) {
        Parcel a = a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        s.a(a, bundle);
        Parcel a2 = a(2, a);
        Bundle bundle2 = (Bundle) s.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }
}
