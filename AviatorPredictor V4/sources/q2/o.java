package q2;

import java.util.HashMap;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final r2.a<Object> f7319a;

    public o(f2.a aVar) {
        this.f7319a = new r2.a<>(aVar, "flutter/system", r2.e.f7453a);
    }

    public void a() {
        e2.b.e("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f7319a.c(hashMap);
    }
}
