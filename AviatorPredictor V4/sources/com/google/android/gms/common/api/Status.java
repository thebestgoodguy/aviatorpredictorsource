package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import t.d;
import t.k;
import w.p;
import x.c;

/* loaded from: classes.dex */
public final class Status extends x.a implements k, ReflectedParcelable {

    /* renamed from: e, reason: collision with root package name */
    final int f1210e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1211f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1212g;

    /* renamed from: h, reason: collision with root package name */
    private final PendingIntent f1213h;

    /* renamed from: i, reason: collision with root package name */
    private final s.a f1214i;

    /* renamed from: j, reason: collision with root package name */
    public static final Status f1203j = new Status(0);

    /* renamed from: k, reason: collision with root package name */
    public static final Status f1204k = new Status(14);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f1205l = new Status(8);

    /* renamed from: m, reason: collision with root package name */
    public static final Status f1206m = new Status(15);

    /* renamed from: n, reason: collision with root package name */
    public static final Status f1207n = new Status(16);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f1209p = new Status(17);

    /* renamed from: o, reason: collision with root package name */
    public static final Status f1208o = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    public Status(int r22) {
        this(r22, (String) null);
    }

    Status(int r7, int r8, String str, PendingIntent pendingIntent) {
        this(r7, r8, str, pendingIntent, null);
    }

    Status(int r12, int r22, String str, PendingIntent pendingIntent, s.a aVar) {
        this.f1210e = r12;
        this.f1211f = r22;
        this.f1212g = str;
        this.f1213h = pendingIntent;
        this.f1214i = aVar;
    }

    public Status(int r32, String str) {
        this(1, r32, str, null);
    }

    public Status(int r22, String str, PendingIntent pendingIntent) {
        this(1, r22, str, pendingIntent);
    }

    public Status(s.a aVar, String str) {
        this(aVar, str, 17);
    }

    @Deprecated
    public Status(s.a aVar, String str, int r9) {
        this(1, r9, str, aVar.l0(), aVar);
    }

    public final String a() {
        String str = this.f1212g;
        return str != null ? str : d.a(this.f1211f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f1210e == status.f1210e && this.f1211f == status.f1211f && p.a(this.f1212g, status.f1212g) && p.a(this.f1213h, status.f1213h) && p.a(this.f1214i, status.f1214i);
    }

    public int hashCode() {
        return p.b(Integer.valueOf(this.f1210e), Integer.valueOf(this.f1211f), this.f1212g, this.f1213h, this.f1214i);
    }

    @Override // t.k
    public Status i0() {
        return this;
    }

    public s.a j0() {
        return this.f1214i;
    }

    public int k0() {
        return this.f1211f;
    }

    public String l0() {
        return this.f1212g;
    }

    public boolean m0() {
        return this.f1213h != null;
    }

    public boolean n0() {
        return this.f1211f <= 0;
    }

    public String toString() {
        p.a c5 = p.c(this);
        c5.a("statusCode", a());
        c5.a("resolution", this.f1213h);
        return c5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.h(parcel, 1, k0());
        c.m(parcel, 2, l0(), false);
        c.l(parcel, 3, this.f1213h, r6, false);
        c.l(parcel, 4, j0(), r6, false);
        c.h(parcel, 1000, this.f1210e);
        c.b(parcel, a5);
    }
}
