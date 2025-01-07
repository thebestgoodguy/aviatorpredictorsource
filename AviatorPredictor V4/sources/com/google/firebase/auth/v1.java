package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class v1 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f2580e;

    v1(FirebaseAuth firebaseAuth) {
        this.f2580e = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        list = this.f2580e.f2451d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a(this.f2580e);
        }
    }
}
