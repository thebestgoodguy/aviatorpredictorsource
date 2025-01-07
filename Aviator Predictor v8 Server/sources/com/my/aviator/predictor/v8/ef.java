package com.my.aviator.predictor.v8;

import java.util.HashMap;
import okhttp3.Headers;
import okhttp3.Response;

/* loaded from: classes62.dex */
class ef implements Runnable {
    final /* synthetic */ ed a;
    private final /* synthetic */ Response b;
    private final /* synthetic */ dz c;
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;

    ef(ed edVar, Response response, dz dzVar, String str, String str2) {
        this.a = edVar;
        this.b = response;
        this.c = dzVar;
        this.d = str;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Headers headers = this.b.headers();
        HashMap<String, Object> hashMap = new HashMap<>();
        for (String str : headers.names()) {
            hashMap.put(str, headers.get(str) != null ? headers.get(str) : "null");
        }
        this.c.a(this.d, this.e, hashMap);
    }
}
