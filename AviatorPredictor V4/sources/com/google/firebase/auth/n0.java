package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class n0 extends h implements Cloneable {
    public static final Parcelable.Creator<n0> CREATOR = new e1();

    /* renamed from: e, reason: collision with root package name */
    private String f2527e;

    /* renamed from: f, reason: collision with root package name */
    private String f2528f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2529g;

    /* renamed from: h, reason: collision with root package name */
    private String f2530h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2531i;

    /* renamed from: j, reason: collision with root package name */
    private String f2532j;

    /* renamed from: k, reason: collision with root package name */
    private String f2533k;

    n0(String str, String str2, boolean z4, String str3, boolean z5, String str4, String str5) {
        boolean z6 = false;
        if ((z4 && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || ((z4 && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))))) {
            z6 = true;
        }
        w.r.b(z6, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f2527e = str;
        this.f2528f = str2;
        this.f2529g = z4;
        this.f2530h = str3;
        this.f2531i = z5;
        this.f2532j = str4;
        this.f2533k = str5;
    }

    public static n0 o0(String str, String str2) {
        return new n0(str, str2, false, null, true, null, null);
    }

    public static n0 p0(String str, String str2) {
        return new n0(null, null, false, str, true, str2, null);
    }

    @Override // com.google.firebase.auth.h
    public String j0() {
        return "phone";
    }

    @Override // com.google.firebase.auth.h
    public String k0() {
        return "phone";
    }

    @Override // com.google.firebase.auth.h
    public final h l0() {
        return clone();
    }

    public String m0() {
        return this.f2528f;
    }

    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final n0 clone() {
        return new n0(this.f2527e, m0(), this.f2529g, this.f2530h, this.f2531i, this.f2532j, this.f2533k);
    }

    public final n0 q0(boolean z4) {
        this.f2531i = false;
        return this;
    }

    public final String r0() {
        return this.f2530h;
    }

    public final String s0() {
        return this.f2527e;
    }

    public final String t0() {
        return this.f2532j;
    }

    public final boolean u0() {
        return this.f2531i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, this.f2527e, false);
        x.c.m(parcel, 2, m0(), false);
        x.c.c(parcel, 3, this.f2529g);
        x.c.m(parcel, 4, this.f2530h, false);
        x.c.c(parcel, 5, this.f2531i);
        x.c.m(parcel, 6, this.f2532j, false);
        x.c.m(parcel, 7, this.f2533k, false);
        x.c.b(parcel, a5);
    }
}
