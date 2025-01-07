package com.my.aviator.predictor.v8;

import android.content.Intent;

/* loaded from: classes62.dex */
class cr implements Runnable {
    final /* synthetic */ cq a;

    cr(cq cqVar) {
        this.a = cqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        GoogleActivity googleActivity;
        Intent intent;
        GoogleActivity googleActivity2;
        GoogleActivity googleActivity3;
        GoogleActivity googleActivity4;
        Intent intent2;
        GoogleActivity googleActivity5;
        googleActivity = this.a.a;
        intent = googleActivity.h;
        googleActivity2 = this.a.a;
        intent.setClass(googleActivity2.getApplicationContext(), MainActivity.class);
        googleActivity3 = this.a.a;
        googleActivity4 = this.a.a;
        intent2 = googleActivity4.h;
        googleActivity3.startActivity(intent2);
        googleActivity5 = this.a.a;
        googleActivity5.finish();
    }
}
