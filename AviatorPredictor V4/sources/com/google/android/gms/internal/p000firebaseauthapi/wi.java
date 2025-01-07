package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import b0.c;
import java.util.ArrayList;
import java.util.List;
import w.r;

/* loaded from: classes.dex */
final class wi implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ sp f2278a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ uo f2279b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f2280c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bp f2281d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ gn f2282e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ik f2283f;

    wi(ik ikVar, sp spVar, uo uoVar, am amVar, bp bpVar, gn gnVar) {
        this.f2283f = ikVar;
        this.f2278a = spVar;
        this.f2279b = uoVar;
        this.f2280c = amVar;
        this.f2281d = bpVar;
        this.f2282e = gnVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        tp tpVar = (tp) obj;
        if (this.f2278a.n("EMAIL")) {
            this.f2279b.p0(null);
        } else {
            sp spVar = this.f2278a;
            if (spVar.k() != null) {
                this.f2279b.p0(spVar.k());
            }
        }
        if (this.f2278a.n("DISPLAY_NAME")) {
            this.f2279b.o0(null);
        } else {
            sp spVar2 = this.f2278a;
            if (spVar2.j() != null) {
                this.f2279b.o0(spVar2.j());
            }
        }
        if (this.f2278a.n("PHOTO_URL")) {
            this.f2279b.s0(null);
        } else {
            sp spVar3 = this.f2278a;
            if (spVar3.m() != null) {
                this.f2279b.s0(spVar3.m());
            }
        }
        if (!TextUtils.isEmpty(this.f2278a.l())) {
            this.f2279b.r0(c.c("redacted".getBytes()));
        }
        List f5 = tpVar.f();
        if (f5 == null) {
            f5 = new ArrayList();
        }
        this.f2279b.t0(f5);
        am amVar = this.f2280c;
        bp bpVar = this.f2281d;
        r.i(bpVar);
        r.i(tpVar);
        String c5 = tpVar.c();
        String e5 = tpVar.e();
        if (!TextUtils.isEmpty(c5) && !TextUtils.isEmpty(e5)) {
            bpVar = new bp(e5, c5, Long.valueOf(tpVar.a()), bpVar.o0());
        }
        amVar.i(bpVar, this.f2279b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2282e.d(str);
    }
}
