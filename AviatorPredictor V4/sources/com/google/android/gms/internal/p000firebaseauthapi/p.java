package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class p extends r {
    /* synthetic */ p(o oVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r
    final List a(Object obj, long j4) {
        e eVar = (e) s1.k(obj, j4);
        if (eVar.c()) {
            return eVar;
        }
        int size = eVar.size();
        e e5 = eVar.e(size == 0 ? 10 : size + size);
        s1.x(obj, j4, e5);
        return e5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r
    final void b(Object obj, long j4) {
        ((e) s1.k(obj, j4)).b();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r
    final void c(Object obj, Object obj2, long j4) {
        e eVar = (e) s1.k(obj, j4);
        e eVar2 = (e) s1.k(obj2, j4);
        int size = eVar.size();
        int size2 = eVar2.size();
        if (size > 0 && size2 > 0) {
            if (!eVar.c()) {
                eVar = eVar.e(size2 + size);
            }
            eVar.addAll(eVar2);
        }
        if (size > 0) {
            eVar2 = eVar;
        }
        s1.x(obj, j4, eVar2);
    }
}
