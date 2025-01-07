package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Map;

/* loaded from: classes.dex */
final class x0 implements Map.Entry, Comparable {

    /* renamed from: e, reason: collision with root package name */
    private final Comparable f2312e;

    /* renamed from: f, reason: collision with root package name */
    private Object f2313f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e1 f2314g;

    x0(e1 e1Var, Comparable comparable, Object obj) {
        this.f2314g = e1Var;
        this.f2312e = comparable;
        this.f2313f = obj;
    }

    private static final boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f2312e.compareTo(((x0) obj).f2312e);
    }

    public final Comparable d() {
        return this.f2312e;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return g(this.f2312e, entry.getKey()) && g(this.f2313f, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f2312e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2313f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2312e;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2313f;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2314g.n();
        Object obj2 = this.f2313f;
        this.f2313f = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f2312e) + "=" + String.valueOf(this.f2313f);
    }
}
