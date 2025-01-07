package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class eg extends a {
    public static final Parcelable.Creator<eg> CREATOR = new fg();

    /* renamed from: e, reason: collision with root package name */
    private final String f1555e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1556f;

    public eg(String str, String str2) {
        this.f1555e = str;
        this.f1556f = str2;
    }

    public final String a() {
        return this.f1555e;
    }

    public final String j0() {
        return this.f1556f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1555e, false);
        c.m(parcel, 2, this.f1556f, false);
        c.b(parcel, a5);
    }
}
