package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

/* loaded from: classes.dex */
public final class h7 {

    /* renamed from: e, reason: collision with root package name */
    private f3 f1717e;

    /* renamed from: f, reason: collision with root package name */
    private m7 f1718f = null;

    /* renamed from: a, reason: collision with root package name */
    private g3 f1713a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f1714b = null;

    /* renamed from: c, reason: collision with root package name */
    private m2 f1715c = null;

    /* renamed from: d, reason: collision with root package name */
    private c3 f1716d = null;

    private final m2 h() {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w(j7.f1800d, "Android Keystore requires at least Android M");
            return null;
        }
        l7 l7Var = new l7();
        boolean a5 = l7Var.a(this.f1714b);
        if (!a5) {
            try {
                String str = this.f1714b;
                if (new l7().a(str)) {
                    throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
                }
                String a6 = wf.a("android-keystore://", str);
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder(a6, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                keyGenerator.generateKey();
            } catch (GeneralSecurityException | ProviderException e5) {
                Log.w(j7.f1800d, "cannot use Android Keystore, it'll be disabled", e5);
                return null;
            }
        }
        try {
            return l7Var.d(this.f1714b);
        } catch (GeneralSecurityException | ProviderException e6) {
            if (a5) {
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f1714b), e6);
            }
            Log.w(j7.f1800d, "cannot use Android Keystore, it'll be disabled", e6);
            return null;
        }
    }

    private final f3 i() {
        m2 m2Var = this.f1715c;
        if (m2Var != null) {
            try {
                return f3.f(e3.h(this.f1718f, m2Var));
            } catch (h | GeneralSecurityException e5) {
                Log.w(j7.f1800d, "cannot decrypt keyset: ", e5);
            }
        }
        return f3.f(o2.b(this.f1718f));
    }

    @Deprecated
    public final h7 d(xc xcVar) {
        String D = xcVar.D();
        byte[] G = xcVar.C().G();
        int G2 = xcVar.G();
        int r22 = j7.f1801e;
        int r7 = G2 - 2;
        int r23 = 4;
        if (r7 == 1) {
            r23 = 1;
        } else if (r7 == 2) {
            r23 = 2;
        } else if (r7 == 3) {
            r23 = 3;
        } else if (r7 != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        this.f1716d = c3.e(D, G, r23);
        return this;
    }

    public final h7 e(String str) {
        if (!str.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        this.f1714b = str;
        return this;
    }

    public final h7 f(Context context, String str, String str2) {
        if (context == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        this.f1718f = new m7(context, "GenericIdpKeyset", str2);
        this.f1713a = new n7(context, "GenericIdpKeyset", str2);
        return this;
    }

    public final synchronized j7 g() {
        f3 e5;
        if (this.f1714b != null) {
            this.f1715c = h();
        }
        try {
            e5 = i();
        } catch (FileNotFoundException e6) {
            if (Log.isLoggable(j7.f1800d, 4)) {
                Log.i(j7.f1800d, String.format("keyset not found, will generate a new one. %s", e6.getMessage()));
            }
            if (this.f1716d == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            e5 = f3.e();
            e5.c(this.f1716d);
            e5.d(e5.b().d().A(0).z());
            if (this.f1715c != null) {
                e5.b().f(this.f1713a, this.f1715c);
            } else {
                o2.a(e5.b(), this.f1713a);
            }
        }
        this.f1717e = e5;
        return new j7(this, null);
    }
}
