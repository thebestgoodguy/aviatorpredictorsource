package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class n extends r {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f1947c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ n(m mVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List f(Object obj, long j4, int r6) {
        k kVar;
        List list = (List) s1.k(obj, j4);
        if (list.isEmpty()) {
            List kVar2 = list instanceof l ? new k(r6) : ((list instanceof l0) && (list instanceof e)) ? ((e) list).e(r6) : new ArrayList(r6);
            s1.x(obj, j4, kVar2);
            return kVar2;
        }
        if (f1947c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + r6);
            arrayList.addAll(list);
            kVar = arrayList;
        } else {
            if (!(list instanceof n1)) {
                if (!(list instanceof l0) || !(list instanceof e)) {
                    return list;
                }
                e eVar = (e) list;
                if (eVar.c()) {
                    return list;
                }
                e e5 = eVar.e(list.size() + r6);
                s1.x(obj, j4, e5);
                return e5;
            }
            k kVar3 = new k(list.size() + r6);
            kVar3.addAll(kVar3.size(), (n1) list);
            kVar = kVar3;
        }
        s1.x(obj, j4, kVar);
        return kVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r
    final List a(Object obj, long j4) {
        return f(obj, j4, 10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r
    final void b(Object obj, long j4) {
        Object unmodifiableList;
        List list = (List) s1.k(obj, j4);
        if (list instanceof l) {
            unmodifiableList = ((l) list).d();
        } else {
            if (f1947c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof l0) && (list instanceof e)) {
                e eVar = (e) list;
                if (eVar.c()) {
                    eVar.b();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        s1.x(obj, j4, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r
    final void c(Object obj, Object obj2, long j4) {
        List list = (List) s1.k(obj2, j4);
        List f5 = f(obj, j4, list.size());
        int size = f5.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f5.addAll(list);
        }
        if (size > 0) {
            list = f5;
        }
        s1.x(obj, j4, list);
    }
}
