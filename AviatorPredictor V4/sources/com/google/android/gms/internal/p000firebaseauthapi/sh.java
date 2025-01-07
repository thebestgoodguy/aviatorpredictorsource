package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class sh extends a {
    public static final Parcelable.Creator<sh> CREATOR = new th();

    /* renamed from: e, reason: collision with root package name */
    private final String f2131e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2132f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2133g;

    public sh(String str, String str2, String str3) {
        this.f2131e = str;
        this.f2132f = str2;
        this.f2133g = str3;
    }

    public final String a() {
        return this.f2131e;
    }

    public final String j0() {
        return this.f2132f;
    }

    public final String k0() {
        return this.f2133g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f2131e, false);
        c.m(parcel, 2, this.f2132f, false);
        c.m(parcel, 3, this.f2133g, false);
        c.b(parcel, a5);
    }
}
