package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class dh extends a {
    public static final Parcelable.Creator<dh> CREATOR = new eh();

    /* renamed from: e, reason: collision with root package name */
    private final String f1516e;

    public dh(String str) {
        this.f1516e = str;
    }

    public final String a() {
        return this.f1516e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1516e, false);
        c.b(parcel, a5);
    }
}
