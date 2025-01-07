package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import w.r;
import x.c;

/* loaded from: classes.dex */
public final class Scope extends x.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    final int f1201e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1202f;

    Scope(int r22, String str) {
        r.f(str, "scopeUri must not be null or empty");
        this.f1201e = r22;
        this.f1202f = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f1202f.equals(((Scope) obj).f1202f);
        }
        return false;
    }

    public int hashCode() {
        return this.f1202f.hashCode();
    }

    public String j0() {
        return this.f1202f;
    }

    public String toString() {
        return this.f1202f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.h(parcel, 1, this.f1201e);
        c.m(parcel, 2, j0(), false);
        c.b(parcel, a5);
    }
}
