package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class b0 extends a2 {

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ lh f1403k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b0(c1 c1Var, c2 c2Var, CharSequence charSequence, lh lhVar) {
        super(c2Var, charSequence);
        this.f1403k = lhVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a2
    public final int e(int r12) {
        return ((lk) this.f1403k).f1885a.end();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a2
    public final int f(int r22) {
        if (((lk) this.f1403k).f1885a.find(r22)) {
            return ((lk) this.f1403k).f1885a.start();
        }
        return -1;
    }
}
