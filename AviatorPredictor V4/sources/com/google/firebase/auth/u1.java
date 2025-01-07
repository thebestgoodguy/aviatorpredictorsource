package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class u1 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f2576e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ s1.b f2577f;

    u1(FirebaseAuth firebaseAuth, s1.b bVar) {
        this.f2576e = firebaseAuth;
        this.f2577f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        list = this.f2576e.f2450c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a1.a) it.next()).a(this.f2577f);
        }
        list2 = this.f2576e.f2449b;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a(this.f2576e);
        }
    }
}
