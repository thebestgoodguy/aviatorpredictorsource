package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class gi extends a {
    public static final Parcelable.Creator<gi> CREATOR = new hi();

    /* renamed from: e, reason: collision with root package name */
    private final String f1678e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1679f;

    public gi(String str, String str2) {
        this.f1678e = str;
        this.f1679f = str2;
    }

    public final String a() {
        return this.f1679f;
    }

    public final String j0() {
        return this.f1678e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1678e, false);
        c.m(parcel, 2, this.f1679f, false);
        c.b(parcel, a5);
    }
}
