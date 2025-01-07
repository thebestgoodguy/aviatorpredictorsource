package com.google.android.gms.internal.p000firebaseauthapi;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class p1 extends r1 {
    p1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r1
    public final double a(Object obj, long j4) {
        return Double.longBitsToDouble(k(obj, j4));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r1
    public final float b(Object obj, long j4) {
        return Float.intBitsToFloat(j(obj, j4));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r1
    public final void c(Object obj, long j4, boolean z4) {
        if (s1.f2121h) {
            s1.d(obj, j4, r3 ? (byte) 1 : (byte) 0);
        } else {
            s1.e(obj, j4, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r1
    public final void d(Object obj, long j4, byte b5) {
        if (s1.f2121h) {
            s1.d(obj, j4, b5);
        } else {
            s1.e(obj, j4, b5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r1
    public final void e(Object obj, long j4, double d5) {
        o(obj, j4, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r1
    public final void f(Object obj, long j4, float f5) {
        n(obj, j4, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r1
    public final boolean g(Object obj, long j4) {
        return s1.f2121h ? s1.y(obj, j4) : s1.z(obj, j4);
    }
}
