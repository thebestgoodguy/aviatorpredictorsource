package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* loaded from: classes.dex */
final class qf extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ rf f2061a;

    qf(rf rfVar) {
        this.f2061a = rfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            cf cfVar = cf.f1456f;
            str = this.f2061a.f2085b;
            Mac mac = (Mac) cfVar.a(str);
            key = this.f2061a.f2086c;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e5) {
            throw new IllegalStateException(e5);
        }
    }
}
