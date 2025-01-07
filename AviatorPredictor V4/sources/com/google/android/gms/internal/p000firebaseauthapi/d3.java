package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class d3 {
    public static c3 a(String str) {
        if (x3.l().containsKey(str)) {
            return (c3) x3.l().get(str);
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
