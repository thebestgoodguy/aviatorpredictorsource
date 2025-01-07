package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.firebase.auth.n0;
import com.google.firebase.auth.p0;
import x0.k;

/* loaded from: classes.dex */
final class pn extends p0.b {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p0.b f2033b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f2034c;

    pn(p0.b bVar, String str) {
        this.f2033b = bVar;
        this.f2034c = str;
    }

    @Override // com.google.firebase.auth.p0.b
    public final void a(String str) {
        rn.f2102a.remove(this.f2034c);
        this.f2033b.a(str);
    }

    @Override // com.google.firebase.auth.p0.b
    public final void b(String str, p0.a aVar) {
        this.f2033b.b(str, aVar);
    }

    @Override // com.google.firebase.auth.p0.b
    public final void c(n0 n0Var) {
        rn.f2102a.remove(this.f2034c);
        this.f2033b.c(n0Var);
    }

    @Override // com.google.firebase.auth.p0.b
    public final void d(k kVar) {
        rn.f2102a.remove(this.f2034c);
        this.f2033b.d(kVar);
    }
}
