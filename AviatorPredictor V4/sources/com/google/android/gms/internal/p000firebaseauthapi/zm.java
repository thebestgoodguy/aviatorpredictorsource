package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;
import a1.r;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.h;
import com.google.firebase.auth.n0;

/* loaded from: classes.dex */
final class zm implements zl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cn f2443a;

    zm(cn cnVar) {
        this.f2443a = cnVar;
    }

    private final void o(an anVar) {
        this.f2443a.f1478h.execute(new ym(this, anVar));
    }

    private final void p(Status status, h hVar, String str, String str2) {
        cn.k(this.f2443a, status);
        cn cnVar = this.f2443a;
        cnVar.f1485o = hVar;
        cnVar.f1486p = str;
        cnVar.f1487q = str2;
        r rVar = cnVar.f1476f;
        if (rVar != null) {
            rVar.b(status);
        }
        this.f2443a.l(status);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void a(np npVar) {
        int r02 = this.f2443a.f1471a;
        w.r.l(r02 == 4, "Unexpected response type " + r02);
        cn cnVar = this.f2443a;
        cnVar.f1482l = npVar;
        cn.j(cnVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void b(Status status, n0 n0Var) {
        int r02 = this.f2443a.f1471a;
        w.r.l(r02 == 2, "Unexpected response type " + r02);
        p(status, n0Var, null, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void c(fo foVar) {
        int r02 = this.f2443a.f1471a;
        w.r.l(r02 == 3, "Unexpected response type " + r02);
        cn cnVar = this.f2443a;
        cnVar.f1481k = foVar;
        cn.j(cnVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void d(String str) {
        int r02 = this.f2443a.f1471a;
        w.r.l(r02 == 8, "Unexpected response type " + r02);
        cn cnVar = this.f2443a;
        cnVar.f1484n = str;
        cnVar.f1489s = true;
        o(new wm(this, str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void e() {
        int r02 = this.f2443a.f1471a;
        w.r.l(r02 == 5, "Unexpected response type " + r02);
        cn.j(this.f2443a);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void f(String str) {
        int r02 = this.f2443a.f1471a;
        w.r.l(r02 == 8, "Unexpected response type " + r02);
        this.f2443a.f1484n = str;
        o(new um(this, str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void g(n0 n0Var) {
        int r02 = this.f2443a.f1471a;
        w.r.l(r02 == 8, "Unexpected response type " + r02);
        this.f2443a.f1489s = true;
        o(new vm(this, n0Var));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void h() {
        int r02 = this.f2443a.f1471a;
        w.r.l(r02 == 6, "Unexpected response type " + r02);
        cn.j(this.f2443a);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void i(String str) {
        int r02 = this.f2443a.f1471a;
        w.r.l(r02 == 7, "Unexpected response type " + r02);
        cn cnVar = this.f2443a;
        cnVar.f1483m = str;
        cn.j(cnVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void j(ni niVar) {
        p(niVar.j0(), niVar.k0(), niVar.l0(), niVar.m0());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void k(bp bpVar) {
        int r02 = this.f2443a.f1471a;
        w.r.l(r02 == 1, "Unexpected response type: " + r02);
        cn cnVar = this.f2443a;
        cnVar.f1479i = bpVar;
        cn.j(cnVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void l(bp bpVar, uo uoVar) {
        int r02 = this.f2443a.f1471a;
        w.r.l(r02 == 2, "Unexpected response type: " + r02);
        cn cnVar = this.f2443a;
        cnVar.f1479i = bpVar;
        cnVar.f1480j = uoVar;
        cn.j(cnVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void m(Status status) {
        String l02 = status.l0();
        if (l02 != null) {
            if (l02.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (l02.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (l02.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (l02.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (l02.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (l02.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (l02.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (l02.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (l02.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (l02.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        cn cnVar = this.f2443a;
        if (cnVar.f1471a == 8) {
            cnVar.f1489s = true;
            o(new xm(this, status));
        } else {
            cn.k(cnVar, status);
            this.f2443a.l(status);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zl
    public final void n(pi piVar) {
        cn cnVar = this.f2443a;
        cnVar.f1488r = piVar;
        cnVar.l(l.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }
}
