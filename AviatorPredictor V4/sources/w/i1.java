package w;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class i1 implements Parcelable.Creator<f> {
    static void a(f fVar, Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.h(parcel, 1, fVar.f7970e);
        x.c.h(parcel, 2, fVar.f7971f);
        x.c.h(parcel, 3, fVar.f7972g);
        x.c.m(parcel, 4, fVar.f7973h, false);
        x.c.g(parcel, 5, fVar.f7974i, false);
        x.c.p(parcel, 6, fVar.f7975j, r6, false);
        x.c.e(parcel, 7, fVar.f7976k, false);
        x.c.l(parcel, 8, fVar.f7977l, r6, false);
        x.c.p(parcel, 10, fVar.f7978m, r6, false);
        x.c.p(parcel, 11, fVar.f7979n, r6, false);
        x.c.c(parcel, 12, fVar.f7980o);
        x.c.h(parcel, 13, fVar.f7981p);
        x.c.c(parcel, 14, fVar.f7982q);
        x.c.m(parcel, 15, fVar.a(), false);
        x.c.b(parcel, a5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
        int u4 = x.b.u(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        s.c[] cVarArr = null;
        s.c[] cVarArr2 = null;
        String str2 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        boolean z4 = false;
        int r16 = 0;
        boolean z5 = false;
        while (parcel.dataPosition() < u4) {
            int n4 = x.b.n(parcel);
            switch (x.b.k(n4)) {
                case 1:
                    r5 = x.b.p(parcel, n4);
                    break;
                case 2:
                    r6 = x.b.p(parcel, n4);
                    break;
                case 3:
                    r7 = x.b.p(parcel, n4);
                    break;
                case 4:
                    str = x.b.e(parcel, n4);
                    break;
                case 5:
                    iBinder = x.b.o(parcel, n4);
                    break;
                case 6:
                    scopeArr = (Scope[]) x.b.h(parcel, n4, Scope.CREATOR);
                    break;
                case 7:
                    bundle = x.b.a(parcel, n4);
                    break;
                case 8:
                    account = (Account) x.b.d(parcel, n4, Account.CREATOR);
                    break;
                case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                default:
                    x.b.t(parcel, n4);
                    break;
                case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    cVarArr = (s.c[]) x.b.h(parcel, n4, s.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (s.c[]) x.b.h(parcel, n4, s.c.CREATOR);
                    break;
                case 12:
                    z4 = x.b.l(parcel, n4);
                    break;
                case 13:
                    r16 = x.b.p(parcel, n4);
                    break;
                case 14:
                    z5 = x.b.l(parcel, n4);
                    break;
                case 15:
                    str2 = x.b.e(parcel, n4);
                    break;
            }
        }
        x.b.j(parcel, u4);
        return new f(r5, r6, r7, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z4, r16, z5, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int r12) {
        return new f[r12];
    }
}
