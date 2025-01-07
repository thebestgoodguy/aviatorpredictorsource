package com.my.aviator.predictor.v8;

import android.view.View;

/* loaded from: classes62.dex */
class cd implements Runnable {
    final /* synthetic */ cc a;
    private final /* synthetic */ View b;

    cd(cc ccVar, View view) {
        this.a = ccVar;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        cb cbVar;
        AviatorActivity aviatorActivity;
        cb cbVar2;
        AviatorActivity aviatorActivity2;
        cb cbVar3;
        AviatorActivity aviatorActivity3;
        cbVar = this.a.a;
        aviatorActivity = cbVar.a;
        aviatorActivity.a(this.b, "elevation", 1.0d, 100.0d);
        cbVar2 = this.a.a;
        aviatorActivity2 = cbVar2.a;
        aviatorActivity2.a(this.b, "scaleX", 0.88d, 100.0d);
        cbVar3 = this.a.a;
        aviatorActivity3 = cbVar3.a;
        aviatorActivity3.a(this.b, "scaleY", 0.88d, 100.0d);
    }
}
