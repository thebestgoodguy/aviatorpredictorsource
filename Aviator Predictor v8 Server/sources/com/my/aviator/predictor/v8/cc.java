package com.my.aviator.predictor.v8;

import android.view.View;
import java.util.TimerTask;

/* loaded from: classes62.dex */
class cc extends TimerTask {
    final /* synthetic */ cb a;
    private final /* synthetic */ View b;

    cc(cb cbVar, View view) {
        this.a = cbVar;
        this.b = view;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        AviatorActivity aviatorActivity;
        aviatorActivity = this.a.a;
        aviatorActivity.runOnUiThread(new cd(this, this.b));
    }
}
