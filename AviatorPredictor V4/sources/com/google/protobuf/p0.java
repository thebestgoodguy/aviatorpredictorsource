package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class p0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private static final p0 f3036f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3037e;

    static {
        p0 p0Var = new p0();
        f3036f = p0Var;
        p0Var.j();
    }

    private p0() {
        this.f3037e = true;
    }

    private p0(Map<K, V> map) {
        super(map);
        this.f3037e = true;
    }

    static <K, V> int a(Map<K, V> map) {
        int r02 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            r02 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return r02;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return d0.d((byte[]) obj);
        }
        if (obj instanceof d0.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            d0.a(obj);
            d0.a(map.get(obj));
        }
    }

    public static <K, V> p0<K, V> d() {
        return f3036f;
    }

    private void e() {
        if (!h()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean f(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static <K, V> boolean g(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !f(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        e();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && g(this, (Map) obj);
    }

    public boolean h() {
        return this.f3037e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public void j() {
        this.f3037e = false;
    }

    public void k(p0<K, V> p0Var) {
        e();
        if (p0Var.isEmpty()) {
            return;
        }
        putAll(p0Var);
    }

    public p0<K, V> l() {
        return isEmpty() ? new p0<>() : new p0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k4, V v4) {
        e();
        d0.a(k4);
        d0.a(v4);
        return (V) super.put(k4, v4);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        e();
        c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e();
        return (V) super.remove(obj);
    }
}
