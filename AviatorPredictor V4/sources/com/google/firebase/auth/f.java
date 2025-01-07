package com.google.firebase.auth;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    private static final Map f2492g;

    /* renamed from: a, reason: collision with root package name */
    private final String f2493a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2494b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2495c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2496d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2497e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2498f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f2492g = Collections.unmodifiableMap(hashMap);
    }

    private f(String str) {
        String e5 = e(str, "apiKey");
        String e6 = e(str, "oobCode");
        String e7 = e(str, "mode");
        if (e5 == null || e6 == null || e7 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f2493a = w.r.e(e5);
        this.f2494b = w.r.e(e6);
        this.f2495c = w.r.e(e7);
        this.f2496d = e(str, "continueUrl");
        this.f2497e = e(str, "languageCode");
        this.f2498f = e(str, "tenantId");
    }

    public static f c(String str) {
        w.r.e(str);
        try {
            return new f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(w.r.e(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String a() {
        return this.f2494b;
    }

    public int b() {
        Map map = f2492g;
        if (map.containsKey(this.f2495c)) {
            return ((Integer) map.get(this.f2495c)).intValue();
        }
        return 3;
    }

    public final String d() {
        return this.f2498f;
    }
}
