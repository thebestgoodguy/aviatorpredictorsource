package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class j2 extends i2 {

    /* renamed from: h, reason: collision with root package name */
    static final i2 f1796h = new j2(new Object[0], 0);

    /* renamed from: g, reason: collision with root package name */
    final transient Object[] f1797g;

    j2(Object[] objArr, int r22) {
        this.f1797g = objArr;
    }

    @Override // java.util.List
    public final Object get(int r32) {
        mq.a(r32, 0, "index");
        Object obj = this.f1797g[r32];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i2, com.google.android.gms.internal.p000firebaseauthapi.f2
    final int i(Object[] objArr, int r32) {
        System.arraycopy(this.f1797g, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f2
    final int p() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f2
    final int q() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f2
    final Object[] r() {
        return this.f1797g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
