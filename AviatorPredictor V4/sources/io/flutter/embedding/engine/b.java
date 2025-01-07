package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f4510b;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f4511a = new HashMap();

    b() {
    }

    public static b b() {
        if (f4510b == null) {
            f4510b = new b();
        }
        return f4510b;
    }

    public a a(String str) {
        return this.f4511a.get(str);
    }

    public void c(String str, a aVar) {
        if (aVar != null) {
            this.f4511a.put(str, aVar);
        } else {
            this.f4511a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
