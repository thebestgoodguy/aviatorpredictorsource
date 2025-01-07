package com.my.aviator.predictor.v8;

import java.util.TimerTask;

/* loaded from: classes62.dex */
class dc extends TimerTask {
    final /* synthetic */ db a;

    dc(db dbVar) {
        this.a = dbVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        da daVar;
        Ibooo2Activity ibooo2Activity;
        daVar = this.a.a;
        ibooo2Activity = daVar.a;
        ibooo2Activity.runOnUiThread(new dd(this));
    }
}
