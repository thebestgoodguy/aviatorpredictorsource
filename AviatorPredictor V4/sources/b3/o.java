package b3;

import b3.l;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    private static final o f868b = new o(new l.a(), l.b.f836a);

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<String, n> f869a = new ConcurrentHashMap();

    o(n... nVarArr) {
        for (n nVar : nVarArr) {
            this.f869a.put(nVar.a(), nVar);
        }
    }

    public static o a() {
        return f868b;
    }

    public n b(String str) {
        return this.f869a.get(str);
    }
}
