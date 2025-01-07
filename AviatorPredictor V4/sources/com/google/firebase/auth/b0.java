package com.google.firebase.auth;

import java.util.Map;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private String f2466a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f2467b;

    public b0(String str, Map<String, Object> map) {
        this.f2466a = str;
        this.f2467b = map;
    }

    private final long h(String str) {
        Integer num = (Integer) this.f2467b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public long a() {
        return h("auth_time");
    }

    public Map<String, Object> b() {
        return this.f2467b;
    }

    public long c() {
        return h("exp");
    }

    public long d() {
        return h("iat");
    }

    public String e() {
        Map map = (Map) this.f2467b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public String f() {
        Map map = (Map) this.f2467b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    public String g() {
        return this.f2466a;
    }
}
