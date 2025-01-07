package com.my.aviator.predictor.v8;

import android.content.Intent;

/* loaded from: classes62.dex */
class di implements Runnable {
    final /* synthetic */ dh a;

    di(dh dhVar) {
        this.a = dhVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dg dgVar;
        MainActivity mainActivity;
        Intent intent;
        dg dgVar2;
        MainActivity mainActivity2;
        dg dgVar3;
        MainActivity mainActivity3;
        dg dgVar4;
        MainActivity mainActivity4;
        Intent intent2;
        dgVar = this.a.a;
        mainActivity = dgVar.a;
        intent = mainActivity.C;
        dgVar2 = this.a.a;
        mainActivity2 = dgVar2.a;
        intent.setClass(mainActivity2.getApplicationContext(), IbooActivity.class);
        dgVar3 = this.a.a;
        mainActivity3 = dgVar3.a;
        dgVar4 = this.a.a;
        mainActivity4 = dgVar4.a;
        intent2 = mainActivity4.C;
        mainActivity3.startActivity(intent2);
    }
}
