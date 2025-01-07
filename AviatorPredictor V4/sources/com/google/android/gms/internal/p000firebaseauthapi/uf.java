package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class uf {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f2191a = new tf();

    public static byte[] a(int r12) {
        byte[] bArr = new byte[r12];
        ((SecureRandom) f2191a.get()).nextBytes(bArr);
        return bArr;
    }
}
