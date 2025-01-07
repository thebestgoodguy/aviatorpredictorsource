package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l7 implements h3 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f1873b = "l7";

    /* renamed from: a, reason: collision with root package name */
    private KeyStore f1874a;

    public l7() {
        if (Build.VERSION.SDK_INT < 23) {
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f1874a = keyStore;
        } catch (IOException | GeneralSecurityException e5) {
            throw new IllegalStateException(e5);
        }
    }

    final synchronized boolean a(String str) {
        String a5;
        a5 = wf.a("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(f1873b, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f1874a = keyStore;
                keyStore.load(null);
            } catch (IOException e5) {
                throw new GeneralSecurityException(e5);
            } catch (InterruptedException unused2) {
            }
            return this.f1874a.containsAlias(a5);
        }
        return this.f1874a.containsAlias(a5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h3
    public final synchronized m2 d(String str) {
        k7 k7Var;
        k7Var = new k7(wf.a("android-keystore://", str), this.f1874a);
        byte[] a5 = uf.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a5, k7Var.a(k7Var.b(a5, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return k7Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h3
    public final synchronized boolean f(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
