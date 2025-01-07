package com.my.aviator.predictor.v8;

import android.view.View;

/* loaded from: classes62.dex */
class dt implements Runnable {
    final /* synthetic */ ds a;
    private final /* synthetic */ View b;

    dt(ds dsVar, View view) {
        this.a = dsVar;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        dr drVar;
        MainActivity mainActivity;
        dr drVar2;
        MainActivity mainActivity2;
        dr drVar3;
        MainActivity mainActivity3;
        drVar = this.a.a;
        mainActivity = drVar.a;
        mainActivity.a(this.b, "elevation", 1.0d, 100.0d);
        drVar2 = this.a.a;
        mainActivity2 = drVar2.a;
        mainActivity2.a(this.b, "scaleX", 0.88d, 100.0d);
        drVar3 = this.a.a;
        mainActivity3 = drVar3.a;
        mainActivity3.a(this.b, "scaleY", 0.88d, 100.0d);
    }
}
