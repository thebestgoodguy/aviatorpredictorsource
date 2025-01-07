package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Iterator;
import t.d;
import z.a;

/* loaded from: classes.dex */
final class un extends am {

    /* renamed from: c, reason: collision with root package name */
    private final String f2200c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ xn f2201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(xn xnVar, am amVar, String str) {
        super(amVar);
        this.f2201d = xnVar;
        this.f2200c = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.am
    public final void b(String str) {
        a aVar;
        HashMap hashMap;
        aVar = xn.f2343d;
        aVar.a("onCodeSent", new Object[0]);
        hashMap = this.f2201d.f2346c;
        wn wnVar = (wn) hashMap.get(this.f2200c);
        if (wnVar == null) {
            return;
        }
        Iterator it = wnVar.f2291b.iterator();
        while (it.hasNext()) {
            ((am) it.next()).b(str);
        }
        wnVar.f2296g = true;
        wnVar.f2293d = str;
        if (wnVar.f2290a <= 0) {
            this.f2201d.h(this.f2200c);
        } else if (!wnVar.f2292c) {
            this.f2201d.n(this.f2200c);
        } else {
            if (d2.d(wnVar.f2294e)) {
                return;
            }
            xn.e(this.f2201d, this.f2200c);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.am
    public final void h(Status status) {
        a aVar;
        HashMap hashMap;
        aVar = xn.f2343d;
        aVar.c("SMS verification code request failed: " + d.a(status.k0()) + " " + status.l0(), new Object[0]);
        hashMap = this.f2201d.f2346c;
        wn wnVar = (wn) hashMap.get(this.f2200c);
        if (wnVar == null) {
            return;
        }
        Iterator it = wnVar.f2291b.iterator();
        while (it.hasNext()) {
            ((am) it.next()).h(status);
        }
        this.f2201d.j(this.f2200c);
    }
}
