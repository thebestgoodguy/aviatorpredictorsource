package com.google.protobuf;

import com.google.protobuf.v0;

/* loaded from: classes.dex */
public abstract class b<MessageType extends v0> implements f1<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final r f2796a = r.b();

    private MessageType d(MessageType messagetype) {
        if (messagetype == null || messagetype.j()) {
            return messagetype;
        }
        throw e(messagetype).a().k(messagetype);
    }

    private u1 e(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).p() : new u1(messagetype);
    }

    @Override // com.google.protobuf.f1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public MessageType a(j jVar, r rVar) {
        return d(h(jVar, rVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.f1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType b(k kVar, r rVar) {
        return (MessageType) d((v0) c(kVar, rVar));
    }

    public MessageType h(j jVar, r rVar) {
        try {
            k H = jVar.H();
            MessageType messagetype = (MessageType) c(H, rVar);
            try {
                H.a(0);
                return messagetype;
            } catch (e0 e5) {
                throw e5.k(messagetype);
            }
        } catch (e0 e6) {
            throw e6;
        }
    }
}
