package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class ag extends a {
    public static final Parcelable.Creator<ag> CREATOR = new bg();

    /* renamed from: e, reason: collision with root package name */
    private final String f1382e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1383f;

    public ag(String str, String str2) {
        this.f1382e = str;
        this.f1383f = str2;
    }

    public final String a() {
        return this.f1382e;
    }

    public final String j0() {
        return this.f1383f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1382e, false);
        c.m(parcel, 2, this.f1383f, false);
        c.b(parcel, a5);
    }
}
