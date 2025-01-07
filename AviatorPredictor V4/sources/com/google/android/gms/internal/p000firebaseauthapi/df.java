package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class df implements lf {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.lf
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
