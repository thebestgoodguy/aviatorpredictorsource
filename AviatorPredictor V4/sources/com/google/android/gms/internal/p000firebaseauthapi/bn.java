package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.h;
import o0.i;
import w.r;

/* loaded from: classes.dex */
public final class bn {

    /* renamed from: a, reason: collision with root package name */
    private final cn f1433a;

    /* renamed from: b, reason: collision with root package name */
    private final i f1434b;

    public bn(cn cnVar, i iVar) {
        this.f1433a = cnVar;
        this.f1434b = iVar;
    }

    public final void a(Object obj, Status status) {
        r.j(this.f1434b, "completion source cannot be null");
        if (status == null) {
            this.f1434b.c(obj);
            return;
        }
        cn cnVar = this.f1433a;
        if (cnVar.f1488r != null) {
            i iVar = this.f1434b;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(cnVar.f1473c);
            cn cnVar2 = this.f1433a;
            iVar.b(cm.c(firebaseAuth, cnVar2.f1488r, ("reauthenticateWithCredential".equals(cnVar2.a()) || "reauthenticateWithCredentialWithData".equals(this.f1433a.a())) ? this.f1433a.f1474d : null));
            return;
        }
        h hVar = cnVar.f1485o;
        if (hVar != null) {
            this.f1434b.b(cm.b(status, hVar, cnVar.f1486p, cnVar.f1487q));
        } else {
            this.f1434b.b(cm.a(status));
        }
    }
}
