package com.my.aviator.predictor.v8;

import android.view.View;

/* loaded from: classes62.dex */
class cu implements Runnable {
    final /* synthetic */ ct a;
    private final /* synthetic */ View b;

    cu(ct ctVar, View view) {
        this.a = ctVar;
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
        googleActivity.a(this.b, "elevation", 1.0d, 100.0d);
        csVar2 = this.a.a;
        googleActivity2 = csVar2.a;
        googleActivity2.a(this.b, "scaleX", 0.88d, 100.0d);
        csVar3 = this.a.a;
        googleActivity3 = csVar3.a;
        googleActivity3.a(this.b, "scaleY", 0.88d, 100.0d);
    }
}
