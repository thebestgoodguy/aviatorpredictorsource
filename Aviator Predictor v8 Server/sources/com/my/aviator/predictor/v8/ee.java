package com.my.aviator.predictor.v8;

import java.io.IOException;

/* loaded from: classes62.dex */
class ee implements Runnable {
    final /* synthetic */ ed a;
    private final /* synthetic */ dz b;
    private final /* synthetic */ String c;
    private final /* synthetic */ IOException d;

    ee(ed edVar, dz dzVar, String str, IOException iOException) {
        this.a = edVar;
        this.b = dzVar;
        this.c = str;
        this.d = iOException;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.a(this.c, this.d.getMessage());
    }
}
