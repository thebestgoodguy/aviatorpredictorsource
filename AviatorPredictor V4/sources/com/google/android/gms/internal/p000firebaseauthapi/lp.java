package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class lp {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f1892a = Logger.getLogger(lp.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final ko f1893b = new ko(null);

    private lp() {
    }

    static ki a(String str) {
        return new hl(Pattern.compile("[.-]"));
    }

    static String b(String str) {
        return str == null ? "" : str;
    }

    static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
