package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class nr extends a2 {

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ b f1980k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    nr(b bVar, c2 c2Var, CharSequence charSequence) {
        super(c2Var, charSequence);
        this.f1980k = bVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a2
    final int e(int r12) {
        return r12 + 1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a2
    final int f(int r5) {
        CharSequence charSequence = this.f1370g;
        int length = charSequence.length();
        mq.b(r5, length, "index");
        while (r5 < length) {
            if (charSequence.charAt(r5) == '.') {
                return r5;
            }
            r5++;
        }
        return -1;
    }
}
