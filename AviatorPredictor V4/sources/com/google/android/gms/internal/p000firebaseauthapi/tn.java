package com.google.android.gms.internal.p000firebaseauthapi;

import o0.e;
import z.a;

/* loaded from: classes.dex */
final class tn implements e {
    tn(xn xnVar) {
    }

    @Override // o0.e
    public final void c(Exception exc) {
        a aVar;
        aVar = xn.f2343d;
        aVar.c("SmsRetrieverClient failed to start: ".concat(String.valueOf(exc.getMessage())), new Object[0]);
    }
}
