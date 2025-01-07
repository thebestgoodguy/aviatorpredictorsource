package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class xr {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2349a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2350b;

    xr(Object obj, int r22) {
        this.f2349a = obj;
        this.f2350b = r22;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xr)) {
            return false;
        }
        xr xrVar = (xr) obj;
        return this.f2349a == xrVar.f2349a && this.f2350b == xrVar.f2350b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f2349a) * 65535) + this.f2350b;
    }
}
