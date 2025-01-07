package com.google.android.gms.internal.p000firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.n1;
import java.util.ArrayList;
import java.util.List;
import w.r;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class uo extends a {
    public static final Parcelable.Creator<uo> CREATOR = new vo();

    /* renamed from: e, reason: collision with root package name */
    private String f2202e;

    /* renamed from: f, reason: collision with root package name */
    private String f2203f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2204g;

    /* renamed from: h, reason: collision with root package name */
    private String f2205h;

    /* renamed from: i, reason: collision with root package name */
    private String f2206i;

    /* renamed from: j, reason: collision with root package name */
    private jp f2207j;

    /* renamed from: k, reason: collision with root package name */
    private String f2208k;

    /* renamed from: l, reason: collision with root package name */
    private String f2209l;

    /* renamed from: m, reason: collision with root package name */
    private long f2210m;

    /* renamed from: n, reason: collision with root package name */
    private long f2211n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f2212o;

    /* renamed from: p, reason: collision with root package name */
    private n1 f2213p;

    /* renamed from: q, reason: collision with root package name */
    private List f2214q;

    public uo() {
        this.f2207j = new jp();
    }

    public uo(String str, String str2, boolean z4, String str3, String str4, jp jpVar, String str5, String str6, long j4, long j5, boolean z5, n1 n1Var, List list) {
        this.f2202e = str;
        this.f2203f = str2;
        this.f2204g = z4;
        this.f2205h = str3;
        this.f2206i = str4;
        this.f2207j = jpVar == null ? new jp() : jp.k0(jpVar);
        this.f2208k = str5;
        this.f2209l = str6;
        this.f2210m = j4;
        this.f2211n = j5;
        this.f2212o = z5;
        this.f2213p = n1Var;
        this.f2214q = list == null ? new ArrayList() : list;
    }

    public final List A0() {
        return this.f2207j.l0();
    }

    public final boolean B0() {
        return this.f2204g;
    }

    public final boolean C0() {
        return this.f2212o;
    }

    public final long j0() {
        return this.f2210m;
    }

    public final long k0() {
        return this.f2211n;
    }

    public final Uri l0() {
        if (TextUtils.isEmpty(this.f2206i)) {
            return null;
        }
        return Uri.parse(this.f2206i);
    }

    public final n1 m0() {
        return this.f2213p;
    }

    public final uo n0(n1 n1Var) {
        this.f2213p = n1Var;
        return this;
    }

    public final uo o0(String str) {
        this.f2205h = str;
        return this;
    }

    public final uo p0(String str) {
        this.f2203f = str;
        return this;
    }

    public final uo q0(boolean z4) {
        this.f2212o = z4;
        return this;
    }

    public final uo r0(String str) {
        r.e(str);
        this.f2208k = str;
        return this;
    }

    public final uo s0(String str) {
        this.f2206i = str;
        return this;
    }

    public final uo t0(List list) {
        r.i(list);
        jp jpVar = new jp();
        this.f2207j = jpVar;
        jpVar.l0().addAll(list);
        return this;
    }

    public final jp u0() {
        return this.f2207j;
    }

    public final String v0() {
        return this.f2205h;
    }

    public final String w0() {
        return this.f2203f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r7) {
        int a5 = c.a(parcel);
        c.m(parcel, 2, this.f2202e, false);
        c.m(parcel, 3, this.f2203f, false);
        c.c(parcel, 4, this.f2204g);
        c.m(parcel, 5, this.f2205h, false);
        c.m(parcel, 6, this.f2206i, false);
        c.l(parcel, 7, this.f2207j, r7, false);
        c.m(parcel, 8, this.f2208k, false);
        c.m(parcel, 9, this.f2209l, false);
        c.j(parcel, 10, this.f2210m);
        c.j(parcel, 11, this.f2211n);
        c.c(parcel, 12, this.f2212o);
        c.l(parcel, 13, this.f2213p, r7, false);
        c.q(parcel, 14, this.f2214q, false);
        c.b(parcel, a5);
    }

    public final String x0() {
        return this.f2202e;
    }

    public final String y0() {
        return this.f2209l;
    }

    public final List z0() {
        return this.f2214q;
    }
}
