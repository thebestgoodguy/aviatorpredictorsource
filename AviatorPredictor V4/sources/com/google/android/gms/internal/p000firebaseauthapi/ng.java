package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class ng extends a {
    public static final Parcelable.Creator<ng> CREATOR = new og();

    /* renamed from: e, reason: collision with root package name */
    private final String f1959e;

    public ng(String str) {
        this.f1959e = str;
    }

    public final String a() {
        return this.f1959e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1959e, false);
        c.b(parcel, a5);
    }
}
