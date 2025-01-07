package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class tg extends a {
    public static final Parcelable.Creator<tg> CREATOR = new ug();

    /* renamed from: e, reason: collision with root package name */
    private final String f2156e;

    public tg(String str) {
        this.f2156e = str;
    }

    public final String a() {
        return this.f2156e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f2156e, false);
        c.b(parcel, a5);
    }
}
