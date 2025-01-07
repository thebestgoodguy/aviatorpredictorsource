package com.google.android.gms.internal.p000firebaseauthapi;

import b0.c;
import java.io.UnsupportedEncodingException;
import java.util.List;
import w.r;

/* loaded from: classes.dex */
public final class dp {
    public static long a(String str) {
        r.e(str);
        List d5 = c2.b('.').d(str);
        if (d5.size() < 2) {
            throw new RuntimeException("Invalid idToken ".concat(String.valueOf(str)));
        }
        try {
            ep a5 = ep.a(new String(c.b((String) d5.get(1)), "UTF-8"));
            return a5.b().longValue() - a5.c().longValue();
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("Unable to decode token", e5);
        }
    }
}
