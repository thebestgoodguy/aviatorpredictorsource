package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import w.r;
import x0.e;

/* loaded from: classes.dex */
final class qm extends in implements ao {

    /* renamed from: a, reason: collision with root package name */
    private km f2067a;

    /* renamed from: b, reason: collision with root package name */
    private lm f2068b;

    /* renamed from: c, reason: collision with root package name */
    private on f2069c;

    /* renamed from: d, reason: collision with root package name */
    private final pm f2070d;

    /* renamed from: e, reason: collision with root package name */
    private final e f2071e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2072f;

    /* renamed from: g, reason: collision with root package name */
    rm f2073g;

    qm(e eVar, pm pmVar, on onVar, km kmVar, lm lmVar) {
        this.f2071e = eVar;
        String b5 = eVar.r().b();
        this.f2072f = b5;
        this.f2070d = (pm) r.i(pmVar);
        v(null, null, null);
        bo.e(b5, this);
    }

    private final rm u() {
        if (this.f2073g == null) {
            e eVar = this.f2071e;
            this.f2073g = new rm(eVar.m(), eVar, this.f2070d.b());
        }
        return this.f2073g;
    }

    private final void v(on onVar, km kmVar, lm lmVar) {
        this.f2069c = null;
        this.f2067a = null;
        this.f2068b = null;
        String a5 = yn.a("firebear.secureToken");
        if (TextUtils.isEmpty(a5)) {
            a5 = bo.d(this.f2072f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(a5)));
        }
        if (this.f2069c == null) {
            this.f2069c = new on(a5, u());
        }
        String a6 = yn.a("firebear.identityToolkit");
        if (TextUtils.isEmpty(a6)) {
            a6 = bo.b(this.f2072f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(a6)));
        }
        if (this.f2067a == null) {
            this.f2067a = new km(a6, u());
        }
        String a7 = yn.a("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(a7)) {
            a7 = bo.c(this.f2072f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(a7)));
        }
        if (this.f2068b == null) {
            this.f2068b = new lm(a7, u());
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void a(eo eoVar, hn hnVar) {
        r.i(eoVar);
        r.i(hnVar);
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/createAuthUri", this.f2072f), eoVar, hnVar, fo.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void b(ho hoVar, hn hnVar) {
        r.i(hoVar);
        r.i(hnVar);
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/deleteAccount", this.f2072f), hoVar, hnVar, Void.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void c(io ioVar, hn hnVar) {
        r.i(ioVar);
        r.i(hnVar);
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/emailLinkSignin", this.f2072f), ioVar, hnVar, jo.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void d(lo loVar, hn hnVar) {
        r.i(loVar);
        r.i(hnVar);
        lm lmVar = this.f2068b;
        ln.a(lmVar.a("/mfaEnrollment:finalize", this.f2072f), loVar, hnVar, mo.class, lmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void e(no noVar, hn hnVar) {
        r.i(noVar);
        r.i(hnVar);
        lm lmVar = this.f2068b;
        ln.a(lmVar.a("/mfaSignIn:finalize", this.f2072f), noVar, hnVar, oo.class, lmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void f(qo qoVar, hn hnVar) {
        r.i(qoVar);
        r.i(hnVar);
        on onVar = this.f2069c;
        ln.a(onVar.a("/token", this.f2072f), qoVar, hnVar, bp.class, onVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void g(ro roVar, hn hnVar) {
        r.i(roVar);
        r.i(hnVar);
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/getAccountInfo", this.f2072f), roVar, hnVar, so.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void h(yo yoVar, hn hnVar) {
        r.i(yoVar);
        r.i(hnVar);
        if (yoVar.b() != null) {
            u().b(yoVar.b().u0());
        }
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/getOobConfirmationCode", this.f2072f), yoVar, hnVar, zo.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void i(mp mpVar, hn hnVar) {
        r.i(mpVar);
        r.i(hnVar);
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/resetPassword", this.f2072f), mpVar, hnVar, np.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ao
    public final void j() {
        v(null, null, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void k(pp ppVar, hn hnVar) {
        r.i(ppVar);
        r.i(hnVar);
        if (!TextUtils.isEmpty(ppVar.k0())) {
            u().b(ppVar.k0());
        }
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/sendVerificationCode", this.f2072f), ppVar, hnVar, rp.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void l(sp spVar, hn hnVar) {
        r.i(spVar);
        r.i(hnVar);
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/setAccountInfo", this.f2072f), spVar, hnVar, tp.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void m(up upVar, hn hnVar) {
        r.i(upVar);
        r.i(hnVar);
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/signupNewUser", this.f2072f), upVar, hnVar, vp.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void n(wp wpVar, hn hnVar) {
        r.i(wpVar);
        r.i(hnVar);
        if (!TextUtils.isEmpty(wpVar.c())) {
            u().b(wpVar.c());
        }
        lm lmVar = this.f2068b;
        ln.a(lmVar.a("/mfaEnrollment:start", this.f2072f), wpVar, hnVar, xp.class, lmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void o(yp ypVar, hn hnVar) {
        r.i(ypVar);
        r.i(hnVar);
        if (!TextUtils.isEmpty(ypVar.c())) {
            u().b(ypVar.c());
        }
        lm lmVar = this.f2068b;
        ln.a(lmVar.a("/mfaSignIn:start", this.f2072f), ypVar, hnVar, zp.class, lmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void p(cq cqVar, hn hnVar) {
        r.i(cqVar);
        r.i(hnVar);
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/verifyAssertion", this.f2072f), cqVar, hnVar, eq.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void q(fq fqVar, hn hnVar) {
        r.i(fqVar);
        r.i(hnVar);
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/verifyCustomToken", this.f2072f), fqVar, hnVar, gq.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void r(iq iqVar, hn hnVar) {
        r.i(iqVar);
        r.i(hnVar);
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/verifyPassword", this.f2072f), iqVar, hnVar, jq.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void s(kq kqVar, hn hnVar) {
        r.i(kqVar);
        r.i(hnVar);
        km kmVar = this.f2067a;
        ln.a(kmVar.a("/verifyPhoneNumber", this.f2072f), kqVar, hnVar, lq.class, kmVar.f1811b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.in
    public final void t(nq nqVar, hn hnVar) {
        r.i(nqVar);
        r.i(hnVar);
        lm lmVar = this.f2068b;
        ln.a(lmVar.a("/mfaEnrollment:withdraw", this.f2072f), nqVar, hnVar, oq.class, lmVar.f1811b);
    }
}
