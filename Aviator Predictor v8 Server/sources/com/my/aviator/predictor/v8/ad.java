package com.my.aviator.predictor.v8;

import java.util.TimerTask;

/* loaded from: classes62.dex */
class ad extends TimerTask {
    final /* synthetic */ AviatorActivity a;

    ad(AviatorActivity aviatorActivity) {
        this.a = aviatorActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.a.runOnUiThread(new ae(this));
    }
}
