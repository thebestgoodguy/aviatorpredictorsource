package com.google.android.gms.internal.p000firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class hp extends a {
    public static final Parcelable.Creator<hp> CREATOR = new ip();

    /* renamed from: e, reason: collision with root package name */
    private String f1732e;

    /* renamed from: f, reason: collision with root package name */
    private String f1733f;

    /* renamed from: g, reason: collision with root package name */
    private String f1734g;

    /* renamed from: h, reason: collision with root package name */
    private String f1735h;

    /* renamed from: i, reason: collision with root package name */
    private String f1736i;

    /* renamed from: j, reason: collision with root package name */
    private String f1737j;

    /* renamed from: k, reason: collision with root package name */
    private String f1738k;

    public hp() {
    }

    hp(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f1732e = str;
        this.f1733f = str2;
        this.f1734g = str3;
        this.f1735h = str4;
        this.f1736i = str5;
        this.f1737j = str6;
        this.f1738k = str7;
    }

    public final Uri j0() {
        if (TextUtils.isEmpty(this.f1734g)) {
            return null;
        }
        return Uri.parse(this.f1734g);
    }

    public final String k0() {
        return this.f1733f;
    }

    public final String l0() {
        return this.f1738k;
    }

    public final String m0() {
        return this.f1732e;
    }

    public final String n0() {
        return this.f1737j;
    }

    public final String o0() {
        return this.f1735h;
    }

    public final String p0() {
        return this.f1736i;
    }

    public final void q0(String str) {
        this.f1736i = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 2, this.f1732e, false);
        c.m(parcel, 3, this.f1733f, false);
        c.m(parcel, 4, this.f1734g, false);
        c.m(parcel, 5, this.f1735h, false);
        c.m(parcel, 6, this.f1736i, false);
        c.m(parcel, 7, this.f1737j, false);
        c.m(parcel, 8, this.f1738k, false);
        c.b(parcel, a5);
    }
}
