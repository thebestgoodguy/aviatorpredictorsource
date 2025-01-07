package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.interfaces.ECPublicKey;

/* loaded from: classes.dex */
public final class xe implements s2 {

    /* renamed from: a, reason: collision with root package name */
    private final ze f2324a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2325b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f2326c;

    /* renamed from: d, reason: collision with root package name */
    private final ve f2327d;

    public xe(ECPublicKey eCPublicKey, byte[] bArr, String str, int r5, ve veVar) {
        af.d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f2324a = new ze(eCPublicKey);
        this.f2326c = bArr;
        this.f2325b = str;
        this.f2327d = veVar;
    }
}
