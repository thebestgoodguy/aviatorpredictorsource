package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1915a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f1916b;

    /* renamed from: c, reason: collision with root package name */
    private final t2 f1917c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1918d;

    m3(Object obj, byte[] bArr, int r32, int r4, int r5, t2 t2Var) {
        this.f1915a = obj;
        this.f1916b = Arrays.copyOf(bArr, bArr.length);
        this.f1918d = r4;
        this.f1917c = t2Var;
    }

    public final Object a() {
        return this.f1915a;
    }

    public final byte[] b() {
        byte[] bArr = this.f1916b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int c() {
        return this.f1918d;
    }
}
