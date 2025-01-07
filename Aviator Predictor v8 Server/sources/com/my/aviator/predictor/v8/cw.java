package com.my.aviator.predictor.v8;

import android.view.View;

/* loaded from: classes62.dex */
class cw implements Runnable {
    final /* synthetic */ cv a;
    private final /* synthetic */ View b;

    cw(cv cvVar, View view) {
        this.a = cvVar;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        cs csVar;
        GoogleActivity googleActivity;
        cs csVar2;
        GoogleActivity googleActivity2;
        cs csVar3;
        GoogleActivity googleActivity3;
        csVar = this.a.a;
        googleActivity = csVar.a;
        googleActivity.a(this.b, "elevation", 25.0d, 100.0d);
        csVar2 = this.a.a;
        googleActivity2 = csVar2.a;
        googleActivity2.a(this.b, "scaleX", 1.0d, 100.0d);
        csVar3 = this.a.a;
        googleActivity3 = csVar3.a;
        googleActivity3.a(this.b, "svaleY", 1.0d, 100.0d);
    }
}
