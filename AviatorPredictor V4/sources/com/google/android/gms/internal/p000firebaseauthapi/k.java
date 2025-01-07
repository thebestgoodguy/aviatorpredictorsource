package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class k extends sq implements RandomAccess, l {

    /* renamed from: g, reason: collision with root package name */
    private static final k f1838g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f1839h;

    /* renamed from: f, reason: collision with root package name */
    private final List f1840f;

    static {
        k kVar = new k(10);
        f1838g = kVar;
        kVar.b();
        f1839h = kVar;
    }

    public k() {
        this(10);
    }

    public k(int r22) {
        this.f1840f = new ArrayList(r22);
    }

    private k(ArrayList arrayList) {
        this.f1840f = arrayList;
    }

    private static String q(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof hr ? ((hr) obj).E(f.f1632b) : f.h((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int r22, Object obj) {
        i();
        this.f1840f.add(r22, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.List
    public final boolean addAll(int r22, Collection collection) {
        i();
        if (collection instanceof l) {
            collection = ((l) collection).f();
        }
        boolean addAll = this.f1840f.addAll(r22, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        this.f1840f.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l
    public final l d() {
        return c() ? new n1(this) : this;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e
    public final /* bridge */ /* synthetic */ e e(int r22) {
        if (r22 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(r22);
        arrayList.addAll(this.f1840f);
        return new k(arrayList);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l
    public final List f() {
        return Collections.unmodifiableList(this.f1840f);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l
    public final void g(hr hrVar) {
        i();
        this.f1840f.add(hrVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l
    public final Object o(int r22) {
        return this.f1840f.get(r22);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final String get(int r32) {
        Object obj = this.f1840f.get(r32);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof hr) {
            hr hrVar = (hr) obj;
            String E = hrVar.E(f.f1632b);
            if (hrVar.x()) {
                this.f1840f.set(r32, E);
            }
            return E;
        }
        byte[] bArr = (byte[]) obj;
        String h5 = f.h(bArr);
        if (f.i(bArr)) {
            this.f1840f.set(r32, h5);
        }
        return h5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r22) {
        i();
        Object remove = this.f1840f.remove(r22);
        ((AbstractList) this).modCount++;
        return q(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r22, Object obj) {
        i();
        return q(this.f1840f.set(r22, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1840f.size();
    }
}
