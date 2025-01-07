package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class e extends x.a {
    public static final Parcelable.Creator<e> CREATOR = new l1();

    /* renamed from: e, reason: collision with root package name */
    private final String f2472e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2473f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2474g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2475h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2476i;

    /* renamed from: j, reason: collision with root package name */
    private final String f2477j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f2478k;

    /* renamed from: l, reason: collision with root package name */
    private String f2479l;

    /* renamed from: m, reason: collision with root package name */
    private int f2480m;

    /* renamed from: n, reason: collision with root package name */
    private String f2481n;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f2482a;

        /* renamed from: b, reason: collision with root package name */
        private String f2483b;

        /* renamed from: c, reason: collision with root package name */
        private String f2484c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2485d;

        /* renamed from: e, reason: collision with root package name */
        private String f2486e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2487f = false;

        /* renamed from: g, reason: collision with root package name */
        private String f2488g;

        /* synthetic */ a(z0 z0Var) {
        }

        public e a() {
            if (this.f2482a != null) {
                return new e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public a b(String str, boolean z4, String str2) {
            this.f2484c = str;
            this.f2485d = z4;
            this.f2486e = str2;
            return this;
        }

        public a c(String str) {
            this.f2488g = str;
            return this;
        }

        public a d(boolean z4) {
            this.f2487f = z4;
            return this;
        }

        public a e(String str) {
            this.f2483b = str;
            return this;
        }

        public a f(String str) {
            this.f2482a = str;
            return this;
        }
    }

    private e(a aVar) {
        this.f2472e = aVar.f2482a;
        this.f2473f = aVar.f2483b;
        this.f2474g = null;
        this.f2475h = aVar.f2484c;
        this.f2476i = aVar.f2485d;
        this.f2477j = aVar.f2486e;
        this.f2478k = aVar.f2487f;
        this.f2481n = aVar.f2488g;
    }

    e(String str, String str2, String str3, String str4, boolean z4, String str5, boolean z5, String str6, int r9, String str7) {
        this.f2472e = str;
        this.f2473f = str2;
        this.f2474g = str3;
        this.f2475h = str4;
        this.f2476i = z4;
        this.f2477j = str5;
        this.f2478k = z5;
        this.f2479l = str6;
        this.f2480m = r9;
        this.f2481n = str7;
    }

    public static a p0() {
        return new a(null);
    }

    public static e r0() {
        return new e(new a(null));
    }

    public boolean j0() {
        return this.f2478k;
    }

    public boolean k0() {
        return this.f2476i;
    }

    public String l0() {
        return this.f2477j;
    }

    public String m0() {
        return this.f2475h;
    }

    public String n0() {
        return this.f2473f;
    }

    public String o0() {
        return this.f2472e;
    }

    public final int q0() {
        return this.f2480m;
    }

    public final String s0() {
        return this.f2481n;
    }

    public final String t0() {
        return this.f2474g;
    }

    public final String u0() {
        return this.f2479l;
    }

    public final void v0(String str) {
        this.f2479l = str;
    }

    public final void w0(int r12) {
        this.f2480m = r12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, o0(), false);
        x.c.m(parcel, 2, n0(), false);
        x.c.m(parcel, 3, this.f2474g, false);
        x.c.m(parcel, 4, m0(), false);
        x.c.c(parcel, 5, k0());
        x.c.m(parcel, 6, l0(), false);
        x.c.c(parcel, 7, j0());
        x.c.m(parcel, 8, this.f2479l, false);
        x.c.h(parcel, 9, this.f2480m);
        x.c.m(parcel, 10, this.f2481n, false);
        x.c.b(parcel, a5);
    }
}
