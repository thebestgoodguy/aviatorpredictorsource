package w;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import w.j;

/* loaded from: classes.dex */
public class f extends x.a {
    public static final Parcelable.Creator<f> CREATOR = new i1();

    /* renamed from: e, reason: collision with root package name */
    final int f7970e;

    /* renamed from: f, reason: collision with root package name */
    final int f7971f;

    /* renamed from: g, reason: collision with root package name */
    int f7972g;

    /* renamed from: h, reason: collision with root package name */
    String f7973h;

    /* renamed from: i, reason: collision with root package name */
    IBinder f7974i;

    /* renamed from: j, reason: collision with root package name */
    Scope[] f7975j;

    /* renamed from: k, reason: collision with root package name */
    Bundle f7976k;

    /* renamed from: l, reason: collision with root package name */
    Account f7977l;

    /* renamed from: m, reason: collision with root package name */
    s.c[] f7978m;

    /* renamed from: n, reason: collision with root package name */
    s.c[] f7979n;

    /* renamed from: o, reason: collision with root package name */
    boolean f7980o;

    /* renamed from: p, reason: collision with root package name */
    int f7981p;

    /* renamed from: q, reason: collision with root package name */
    boolean f7982q;

    /* renamed from: r, reason: collision with root package name */
    private String f7983r;

    f(int r12, int r22, int r32, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, s.c[] cVarArr, s.c[] cVarArr2, boolean z4, int r122, boolean z5, String str2) {
        this.f7970e = r12;
        this.f7971f = r22;
        this.f7972g = r32;
        if ("com.google.android.gms".equals(str)) {
            this.f7973h = "com.google.android.gms";
        } else {
            this.f7973h = str;
        }
        if (r12 < 2) {
            this.f7977l = iBinder != null ? a.h(j.a.f(iBinder)) : null;
        } else {
            this.f7974i = iBinder;
            this.f7977l = account;
        }
        this.f7975j = scopeArr;
        this.f7976k = bundle;
        this.f7978m = cVarArr;
        this.f7979n = cVarArr2;
        this.f7980o = z4;
        this.f7981p = r122;
        this.f7982q = z5;
        this.f7983r = str2;
    }

    public f(int r22, String str) {
        this.f7970e = 6;
        this.f7972g = s.e.f7489a;
        this.f7971f = r22;
        this.f7980o = true;
        this.f7983r = str;
    }

    public final String a() {
        return this.f7983r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r22) {
        i1.a(this, parcel, r22);
    }
}
