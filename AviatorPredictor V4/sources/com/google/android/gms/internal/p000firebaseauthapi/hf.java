package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class hf implements lf {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.lf
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
