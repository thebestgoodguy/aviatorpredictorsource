package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.qq;
import com.google.android.gms.internal.p000firebaseauthapi.rq;

/* loaded from: classes.dex */
public abstract class qq<MessageType extends rq<MessageType, BuilderType>, BuilderType extends qq<MessageType, BuilderType>> implements d0 {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.d0
    public final /* bridge */ /* synthetic */ d0 M(e0 e0Var) {
        if (a().getClass().isInstance(e0Var)) {
            return b((rq) e0Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract qq b(rq rqVar);
}
