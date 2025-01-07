package com.my.aviator.predictor.v8;

import java.util.TimerTask;

/* loaded from: classes62.dex */
class cq extends TimerTask {
    final /* synthetic */ GoogleActivity a;

    cq(GoogleActivity googleActivity) {
        this.a = googleActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.a.runOnUiThread(new cr(this));
    }
}
