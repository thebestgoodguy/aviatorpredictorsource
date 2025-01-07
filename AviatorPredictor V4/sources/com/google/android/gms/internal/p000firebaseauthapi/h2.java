package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class h2 extends i2 {

    /* renamed from: g, reason: collision with root package name */
    final transient int f1710g;

    /* renamed from: h, reason: collision with root package name */
    final transient int f1711h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ i2 f1712i;

    h2(i2 i2Var, int r22, int r32) {
        this.f1712i = i2Var;
        this.f1710g = r22;
        this.f1711h = r32;
    }

    @Override // java.util.List
    public final Object get(int r32) {
        mq.a(r32, this.f1711h, "index");
        return this.f1712i.get(r32 + this.f1710g);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f2
    final int p() {
        return this.f1712i.q() + this.f1710g + this.f1711h;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f2
    final int q() {
        return this.f1712i.q() + this.f1710g;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f2
    final Object[] r() {
        return this.f1712i.r();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i2
    /* renamed from: s */
    public final i2 subList(int r32, int r4) {
        mq.c(r32, r4, this.f1711h);
        i2 i2Var = this.f1712i;
        int r12 = this.f1710g;
        return i2Var.subList(r32 + r12, r4 + r12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1711h;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i2, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int r12, int r22) {
        return subList(r12, r22);
    }
}
