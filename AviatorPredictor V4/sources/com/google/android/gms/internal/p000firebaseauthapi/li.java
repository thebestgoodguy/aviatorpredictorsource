package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.e;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class li extends a {
    public static final Parcelable.Creator<li> CREATOR = new mi();

    /* renamed from: e, reason: collision with root package name */
    private final String f1882e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1883f;

    /* renamed from: g, reason: collision with root package name */
    private final e f1884g;

    public li(String str, String str2, e eVar) {
        this.f1882e = str;
        this.f1883f = str2;
        this.f1884g = eVar;
    }

    public final e j0() {
        return this.f1884g;
    }

    public final String k0() {
        return this.f1882e;
    }

    public final String l0() {
        return this.f1883f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1882e, false);
        c.m(parcel, 2, this.f1883f, false);
        c.l(parcel, 3, this.f1884g, r6, false);
        c.b(parcel, a5);
    }
}
