package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class gg extends a {
    public static final Parcelable.Creator<gg> CREATOR = new hg();

    /* renamed from: e, reason: collision with root package name */
    private final String f1676e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1677f;

    public gg(String str, String str2) {
        this.f1676e = str;
        this.f1677f = str2;
    }

    public final String a() {
        return this.f1676e;
    }

    public final String j0() {
        return this.f1677f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1676e, false);
        c.m(parcel, 2, this.f1677f, false);
        c.b(parcel, a5);
    }
}
