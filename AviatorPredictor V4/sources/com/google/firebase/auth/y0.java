package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class y0 extends x.a {
    public static final Parcelable.Creator<y0> CREATOR = new j1();

    /* renamed from: e, reason: collision with root package name */
    private String f2594e;

    /* renamed from: f, reason: collision with root package name */
    private String f2595f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2596g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2597h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f2598i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f2599a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f2600b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2601c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2602d;

        public y0 a() {
            String str = this.f2599a;
            Uri uri = this.f2600b;
            return new y0(str, uri == null ? null : uri.toString(), this.f2601c, this.f2602d);
        }

        public a b(String str) {
            if (str == null) {
                this.f2601c = true;
            } else {
                this.f2599a = str;
            }
            return this;
        }

        public a c(Uri uri) {
            if (uri == null) {
                this.f2602d = true;
            } else {
                this.f2600b = uri;
            }
            return this;
        }
    }

    y0(String str, String str2, boolean z4, boolean z5) {
        this.f2594e = str;
        this.f2595f = str2;
        this.f2596g = z4;
        this.f2597h = z5;
        this.f2598i = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public String R() {
        return this.f2594e;
    }

    public final String a() {
        return this.f2595f;
    }

    public Uri j0() {
        return this.f2598i;
    }

    public final boolean k0() {
        return this.f2596g;
    }

    public final boolean l0() {
        return this.f2597h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 2, R(), false);
        x.c.m(parcel, 3, this.f2595f, false);
        x.c.c(parcel, 4, this.f2596g);
        x.c.c(parcel, 5, this.f2597h);
        x.c.b(parcel, a5);
    }
}
