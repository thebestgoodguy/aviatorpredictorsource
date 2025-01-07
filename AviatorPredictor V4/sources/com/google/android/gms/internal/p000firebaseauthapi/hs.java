package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.hs;
import com.google.android.gms.internal.p000firebaseauthapi.ks;

/* loaded from: classes.dex */
public class hs<MessageType extends ks<MessageType, BuilderType>, BuilderType extends hs<MessageType, BuilderType>> extends qq<MessageType, BuilderType> {

    /* renamed from: e, reason: collision with root package name */
    private final ks f1743e;

    /* renamed from: f, reason: collision with root package name */
    protected ks f1744f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f1745g = false;

    protected hs(MessageType messagetype) {
        this.f1743e = messagetype;
        this.f1744f = (ks) messagetype.r(4, null, null);
    }

    private static final void c(ks ksVar, ks ksVar2) {
        m0.a().b(ksVar.getClass()).f(ksVar, ksVar2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f0
    public final /* synthetic */ e0 a() {
        return this.f1743e;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.qq
    protected final /* synthetic */ qq b(rq rqVar) {
        e((ks) rqVar);
        return this;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final hs clone() {
        hs hsVar = (hs) this.f1743e.r(5, null, null);
        hsVar.e(i());
        return hsVar;
    }

    public final hs e(ks ksVar) {
        if (this.f1745g) {
            o();
            this.f1745g = false;
        }
        c(this.f1744f, ksVar);
        return this;
    }

    public final MessageType f() {
        MessageType i4 = i();
        if (i4.o()) {
            return i4;
        }
        throw new h1(i4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public MessageType i() {
        if (this.f1745g) {
            return (MessageType) this.f1744f;
        }
        ks ksVar = this.f1744f;
        m0.a().b(ksVar.getClass()).b(ksVar);
        this.f1745g = true;
        return (MessageType) this.f1744f;
    }

    protected void o() {
        ks ksVar = (ks) this.f1744f.r(4, null, null);
        c(ksVar, this.f1744f);
        this.f1744f = ksVar;
    }
}
