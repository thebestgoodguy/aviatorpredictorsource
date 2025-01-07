package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class x extends LinkedHashMap {

    /* renamed from: f, reason: collision with root package name */
    private static final x f2310f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2311e;

    static {
        x xVar = new x();
        f2310f = xVar;
        xVar.f2311e = false;
    }

    private x() {
        this.f2311e = true;
    }

    private x(Map map) {
        super(map);
        this.f2311e = true;
    }

    public static x a() {
        return f2310f;
    }

    private static int f(Object obj) {
        return obj instanceof byte[] ? f.b((byte[]) obj) : obj.hashCode();
    }

    private final void g() {
        if (!this.f2311e) {
            throw new UnsupportedOperationException();
        }
    }

    public final x b() {
        return isEmpty() ? new x() : new x(this);
    }

    public final void c() {
        this.f2311e = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final void d(x xVar) {
        g();
        if (xVar.isEmpty()) {
            return;
        }
        putAll(xVar);
    }

    public final boolean e() {
        return this.f2311e;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int r12 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r12 += f(entry.getValue()) ^ f(entry.getKey());
        }
        return r12;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        f.e(obj);
        f.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        g();
        for (Object obj : map.keySet()) {
            f.e(obj);
            f.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        return super.remove(obj);
    }
}
