package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    private final m2 f1674a;

    /* renamed from: b, reason: collision with root package name */
    private final q2 f1675b;

    public g7(m2 m2Var) {
        this.f1674a = m2Var;
        this.f1675b = null;
    }

    public g7(q2 q2Var) {
        this.f1674a = null;
        this.f1675b = q2Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        m2 m2Var = this.f1674a;
        return m2Var != null ? m2Var.a(bArr, bArr2) : this.f1675b.a(bArr, bArr2);
    }
}
