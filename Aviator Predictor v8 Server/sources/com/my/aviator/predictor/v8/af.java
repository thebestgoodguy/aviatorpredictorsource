package com.my.aviator.predictor.v8;

import java.util.TimerTask;

/* loaded from: classes62.dex */
class af extends TimerTask {
    final /* synthetic */ AviatorActivity a;

    af(AviatorActivity aviatorActivity) {
        this.a = aviatorActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.a.runOnUiThread(new ag(this));
    }
}
