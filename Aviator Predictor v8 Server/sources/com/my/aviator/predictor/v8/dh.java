package com.my.aviator.predictor.v8;

import java.util.TimerTask;

/* loaded from: classes62.dex */
class dh extends TimerTask {
    final /* synthetic */ dg a;

    dh(dg dgVar) {
        this.a = dgVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        MainActivity mainActivity;
        mainActivity = this.a.a;
        mainActivity.runOnUiThread(new di(this));
    }
}
