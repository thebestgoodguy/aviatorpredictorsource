package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.SecureRandom;

/* loaded from: classes.dex */
final class tf extends ThreadLocal {
    tf() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
