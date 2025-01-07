package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f1765a = new CopyOnWriteArrayList();

    public static h3 a(String str) {
        Iterator it = f1765a.iterator();
        while (it.hasNext()) {
            h3 h3Var = (h3) it.next();
            if (h3Var.f(str)) {
                return h3Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
