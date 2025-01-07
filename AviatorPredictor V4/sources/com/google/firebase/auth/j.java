package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new p1();

    /* renamed from: e, reason: collision with root package name */
    private String f2513e;

    /* renamed from: f, reason: collision with root package name */
    private String f2514f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2515g;

    /* renamed from: h, reason: collision with root package name */
    private String f2516h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2517i;

    j(String str, String str2, String str3, String str4, boolean z4) {
        this.f2513e = w.r.e(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f2514f = str2;
        this.f2515g = str3;
        this.f2516h = str4;
        this.f2517i = z4;
    }

    public static boolean t0(String str) {
        f c5;
        return (TextUtils.isEmpty(str) || (c5 = f.c(str)) == null || c5.b() != 4) ? false : true;
    }

    @Override // com.google.firebase.auth.h
    public String j0() {
        return "password";
    }

    @Override // com.google.firebase.auth.h
    public String k0() {
        return !TextUtils.isEmpty(this.f2514f) ? "password" : "emailLink";
    }

    @Override // com.google.firebase.auth.h
    public final h l0() {
        return new j(this.f2513e, this.f2514f, this.f2515g, this.f2516h, this.f2517i);
    }

    public final j m0(z zVar) {
        this.f2516h = zVar.H0();
        this.f2517i = true;
        return this;
    }

    public final String n0() {
        return this.f2516h;
    }

    public final String o0() {
        return this.f2513e;
    }

    public final String p0() {
        return this.f2514f;
    }

    public final String q0() {
        return this.f2515g;
    }

    public final boolean r0() {
        return !TextUtils.isEmpty(this.f2515g);
    }

    public final boolean s0() {
        return this.f2517i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, this.f2513e, false);
        x.c.m(parcel, 2, this.f2514f, false);
        x.c.m(parcel, 3, this.f2515g, false);
        x.c.m(parcel, 4, this.f2516h, false);
        x.c.c(parcel, 5, this.f2517i);
        x.c.b(parcel, a5);
    }
}
