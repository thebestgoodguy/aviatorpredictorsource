package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.ExecutorService;
import o0.h;
import o0.i;

/* loaded from: classes.dex */
public class fn {

    /* renamed from: a, reason: collision with root package name */
    bm f1652a;

    /* renamed from: b, reason: collision with root package name */
    ExecutorService f1653b;

    public final h a(final en enVar) {
        final i iVar = new i();
        this.f1653b.execute(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.dn
            @Override // java.lang.Runnable
            public final void run() {
                enVar.b(iVar, fn.this.f1652a);
            }
        });
        return iVar.a();
    }
}
