package com.my.aviator.predictor.v8;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* loaded from: classes62.dex */
class ec implements HostnameVerifier {
    final /* synthetic */ ea a;

    ec(ea eaVar) {
        this.a = eaVar;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
