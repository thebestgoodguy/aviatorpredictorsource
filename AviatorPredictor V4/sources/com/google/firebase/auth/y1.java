package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.yl;
import com.google.firebase.auth.p0;

/* loaded from: classes.dex */
final class y1 implements o0.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o0 f2603a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f2604b;

    y1(FirebaseAuth firebaseAuth, o0 o0Var) {
        this.f2604b = firebaseAuth;
        this.f2603a = o0Var;
    }

    @Override // o0.d
    public final void a(o0.h hVar) {
        String a5;
        String str;
        p0.b S;
        yl ylVar;
        String str2;
        yl ylVar2;
        String str3;
        if (hVar.p()) {
            String b5 = ((a1.t0) hVar.m()).b();
            a5 = ((a1.t0) hVar.m()).a();
            str = b5;
        } else {
            Log.e("FirebaseAuth", hVar.l() != null ? "Error while validating application identity: ".concat(String.valueOf(hVar.l().getMessage())) : "Error while validating application identity: ");
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str = null;
            a5 = null;
        }
        long longValue = this.f2603a.g().longValue();
        S = this.f2604b.S(this.f2603a.h(), this.f2603a.e());
        a1.j jVar = (a1.j) w.r.i(this.f2603a.c());
        if (jVar.n0()) {
            ylVar2 = this.f2604b.f2452e;
            String str4 = (String) w.r.i(this.f2603a.h());
            str3 = this.f2604b.f2456i;
            ylVar2.e(jVar, str4, str3, longValue, this.f2603a.d() != null, this.f2603a.j(), str, a5, this.f2604b.R(), S, this.f2603a.i(), this.f2603a.a());
            return;
        }
        ylVar = this.f2604b.f2452e;
        s0 s0Var = (s0) w.r.i(this.f2603a.f());
        str2 = this.f2604b.f2456i;
        ylVar.f(jVar, s0Var, str2, longValue, this.f2603a.d() != null, this.f2603a.j(), str, a5, this.f2604b.R(), S, this.f2603a.i(), this.f2603a.a());
    }
}
