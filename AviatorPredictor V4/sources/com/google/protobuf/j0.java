package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class j0 extends c<String> implements k0, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final j0 f2926g;

    /* renamed from: h, reason: collision with root package name */
    public static final k0 f2927h;

    /* renamed from: f, reason: collision with root package name */
    private final List<Object> f2928f;

    static {
        j0 j0Var = new j0();
        f2926g = j0Var;
        j0Var.h();
        f2927h = j0Var;
    }

    public j0() {
        this(10);
    }

    public j0(int r22) {
        this((ArrayList<Object>) new ArrayList(r22));
    }

    private j0(ArrayList<Object> arrayList) {
        this.f2928f = arrayList;
    }

    private static String q(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof j ? ((j) obj).R() : d0.j((byte[]) obj);
    }

    @Override // com.google.protobuf.k0
    public k0 a() {
        return n() ? new y1(this) : this;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int r22, Collection<? extends String> collection) {
        i();
        if (collection instanceof k0) {
            collection = ((k0) collection).m();
        }
        boolean addAll = this.f2928f.addAll(r22, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        i();
        this.f2928f.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.k0
    public Object j(int r22) {
        return this.f2928f.get(r22);
    }

    @Override // com.google.protobuf.k0
    public void l(j jVar) {
        i();
        this.f2928f.add(jVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.k0
    public List<?> m() {
        return Collections.unmodifiableList(this.f2928f);
    }

    @Override // com.google.protobuf.c, com.google.protobuf.d0.i
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void add(int r22, String str) {
        i();
        this.f2928f.add(r22, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String get(int r32) {
        Object obj = this.f2928f.get(r32);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            String R = jVar.R();
            if (jVar.E()) {
                this.f2928f.set(r32, R);
            }
            return R;
        }
        byte[] bArr = (byte[]) obj;
        String j4 = d0.j(bArr);
        if (d0.g(bArr)) {
            this.f2928f.set(r32, j4);
        }
        return j4;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.protobuf.d0.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public j0 k(int r22) {
        if (r22 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(r22);
        arrayList.addAll(this.f2928f);
        return new j0((ArrayList<Object>) arrayList);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2928f.size();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public String remove(int r22) {
        i();
        Object remove = this.f2928f.remove(r22);
        ((AbstractList) this).modCount++;
        return q(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public String set(int r22, String str) {
        i();
        return q(this.f2928f.set(r22, str));
    }
}
