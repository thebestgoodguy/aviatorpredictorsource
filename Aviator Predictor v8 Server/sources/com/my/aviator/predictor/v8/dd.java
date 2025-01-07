package com.my.aviator.predictor.v8;

import android.content.Intent;

/* loaded from: classes62.dex */
class dd implements Runnable {
    final /* synthetic */ dc a;

    dd(dc dcVar) {
        this.a = dcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        db dbVar;
        da daVar;
        Ibooo2Activity ibooo2Activity;
        Intent intent;
        db dbVar2;
        da daVar2;
        Ibooo2Activity ibooo2Activity2;
        db dbVar3;
        da daVar3;
        Ibooo2Activity ibooo2Activity3;
        db dbVar4;
        da daVar4;
        Ibooo2Activity ibooo2Activity4;
        Intent intent2;
        db dbVar5;
        da daVar5;
        Ibooo2Activity ibooo2Activity5;
        dbVar = this.a.a;
        daVar = dbVar.a;
        ibooo2Activity = daVar.a;
        intent = ibooo2Activity.w;
        dbVar2 = this.a.a;
        daVar2 = dbVar2.a;
        ibooo2Activity2 = daVar2.a;
        intent.setClass(ibooo2Activity2.getApplicationContext(), AviatorActivity.class);
        dbVar3 = this.a.a;
        daVar3 = dbVar3.a;
        ibooo2Activity3 = daVar3.a;
        dbVar4 = this.a.a;
        daVar4 = dbVar4.a;
        ibooo2Activity4 = daVar4.a;
        intent2 = ibooo2Activity4.w;
        ibooo2Activity3.startActivity(intent2);
        dbVar5 = this.a.a;
        daVar5 = dbVar5.a;
        ibooo2Activity5 = daVar5.a;
        ibooo2Activity5.finish();
    }
}
