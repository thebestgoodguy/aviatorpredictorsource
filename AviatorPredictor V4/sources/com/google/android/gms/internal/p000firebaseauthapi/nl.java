package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.firebase.auth.s0;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class nl extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final ai f1968w;

    public nl(s0 s0Var, String str, String str2, long j4, boolean z4, boolean z5, String str3, String str4, boolean z6) {
        super(8);
        r.i(s0Var);
        r.e(str);
        this.f1968w = new ai(s0Var, str, str2, j4, z4, z5, str3, str4, z6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.a(this.f1968w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
    }
}
