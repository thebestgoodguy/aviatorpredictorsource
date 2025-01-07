package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class q3 extends t2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f2051a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2052b;

    /* synthetic */ q3(String str, int r22, p3 p3Var) {
        this.f2051a = str;
        this.f2052b = r22;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f2051a;
        int r22 = this.f2052b - 2;
        objArr[1] = r22 != 1 ? r22 != 2 ? r22 != 3 ? r22 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
