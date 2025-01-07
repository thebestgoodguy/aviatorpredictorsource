package b3;

import b3.l;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    static final q0.g f917c = q0.g.e(',');

    /* renamed from: d, reason: collision with root package name */
    private static final v f918d = a().f(new l.a(), true).f(l.b.f836a, false);

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f919a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f920b;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final u f921a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f922b;

        a(u uVar, boolean z4) {
            this.f921a = (u) q0.l.o(uVar, "decompressor");
            this.f922b = z4;
        }
    }

    private v() {
        this.f919a = new LinkedHashMap(0);
        this.f920b = new byte[0];
    }

    private v(u uVar, boolean z4, v vVar) {
        String a5 = uVar.a();
        q0.l.e(!a5.contains(","), "Comma is currently not allowed in message encoding");
        int size = vVar.f919a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(vVar.f919a.containsKey(uVar.a()) ? size : size + 1);
        for (a aVar : vVar.f919a.values()) {
            String a6 = aVar.f921a.a();
            if (!a6.equals(a5)) {
                linkedHashMap.put(a6, new a(aVar.f921a, aVar.f922b));
            }
        }
        linkedHashMap.put(a5, new a(uVar, z4));
        this.f919a = Collections.unmodifiableMap(linkedHashMap);
        this.f920b = f917c.c(b()).getBytes(StandardCharsets.US_ASCII);
    }

    public static v a() {
        return new v();
    }

    public static v c() {
        return f918d;
    }

    public Set<String> b() {
        HashSet hashSet = new HashSet(this.f919a.size());
        for (Map.Entry<String, a> entry : this.f919a.entrySet()) {
            if (entry.getValue().f922b) {
                hashSet.add(entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    byte[] d() {
        return this.f920b;
    }

    public u e(String str) {
        a aVar = this.f919a.get(str);
        if (aVar != null) {
            return aVar.f921a;
        }
        return null;
    }

    public v f(u uVar, boolean z4) {
        return new v(uVar, z4, this);
    }
}
