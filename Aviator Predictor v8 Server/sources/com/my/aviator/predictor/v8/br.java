package com.my.aviator.predictor.v8;

import java.util.TimerTask;

/* loaded from: classes62.dex */
class br extends TimerTask {
    final /* synthetic */ AviatorActivity a;

    br(AviatorActivity aviatorActivity) {
        this.a = aviatorActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.a.runOnUiThread(new bs(this));
    }
}
