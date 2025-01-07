package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class t4 extends q7 {
    t4() {
        super(z9.class, new r4(m2.class));
    }

    public static void k(boolean z4) {
        if (m()) {
            x3.n(new t4(), true);
        }
    }

    static /* bridge */ /* synthetic */ o7 l(int r12, int r22) {
        ba A = ca.A();
        A.p(r12);
        return new o7((ca) A.f(), r22);
    }

    private static boolean m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new s4(this, ca.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return z9.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        z9 z9Var = (z9) e0Var;
        wf.c(z9Var.z(), 0);
        wf.b(z9Var.D().q());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 3;
    }
}
