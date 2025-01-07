package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.interfaces.ECPrivateKey;

/* loaded from: classes.dex */
public final class we implements r2 {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f2267g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final ECPrivateKey f2268a;

    /* renamed from: b, reason: collision with root package name */
    private final ye f2269b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2270c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f2271d;

    /* renamed from: e, reason: collision with root package name */
    private final ve f2272e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2273f;

    public we(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int r5, ve veVar) {
        this.f2268a = eCPrivateKey;
        this.f2269b = new ye(eCPrivateKey);
        this.f2271d = bArr;
        this.f2270c = str;
        this.f2273f = r5;
        this.f2272e = veVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(byte[] r10, byte[] r11) {
        /*
            r9 = this;
            java.security.interfaces.ECPrivateKey r11 = r9.f2268a
            java.security.spec.ECParameterSpec r11 = r11.getParams()
            java.security.spec.EllipticCurve r11 = r11.getCurve()
            int r0 = r9.f2273f
            int r11 = com.google.android.gms.internal.p000firebaseauthapi.af.a(r11)
            int r0 = r0 + (-1)
            if (r0 == 0) goto L1a
            r1 = 2
            if (r0 == r1) goto L18
            goto L1b
        L18:
            int r11 = r11 + r11
            goto L1d
        L1a:
            int r11 = r11 + r11
        L1b:
            int r11 = r11 + 1
        L1d:
            int r0 = r10.length
            if (r0 < r11) goto L49
            r1 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r10, r1, r11)
            com.google.android.gms.internal.firebase-auth-api.ye r2 = r9.f2269b
            java.lang.String r4 = r9.f2270c
            byte[] r5 = r9.f2271d
            com.google.android.gms.internal.firebase-auth-api.ve r1 = r9.f2272e
            int r7 = r1.a()
            int r8 = r9.f2273f
            r6 = 0
            byte[] r1 = r2.a(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.firebase-auth-api.ve r2 = r9.f2272e
            com.google.android.gms.internal.firebase-auth-api.g7 r1 = r2.b(r1)
            byte[] r10 = java.util.Arrays.copyOfRange(r10, r11, r0)
            byte[] r11 = com.google.android.gms.internal.p000firebaseauthapi.we.f2267g
            byte[] r10 = r1.a(r10, r11)
            return r10
        L49:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.we.a(byte[], byte[]):byte[]");
    }
}
