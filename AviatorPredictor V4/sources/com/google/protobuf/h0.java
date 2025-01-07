package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class h0 extends i0 {

    /* renamed from: f, reason: collision with root package name */
    private final v0 f2900f;

    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: e, reason: collision with root package name */
        private Map.Entry<K, h0> f2901e;

        private b(Map.Entry<K, h0> entry) {
            this.f2901e = entry;
        }

        public h0 a() {
            return this.f2901e.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2901e.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            h0 value = this.f2901e.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof v0) {
                return this.f2901e.getValue().d((v0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: e, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f2902e;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f2902e = it;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f2902e.next();
            return next.getValue() instanceof h0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2902e.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f2902e.remove();
        }
    }

    @Override // com.google.protobuf.i0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public v0 f() {
        return c(this.f2900f);
    }

    @Override // com.google.protobuf.i0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
