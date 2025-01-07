package com.my.aviator.predictor.v8;

import android.view.View;
import java.util.TimerTask;

/* loaded from: classes62.dex */
class ds extends TimerTask {
    final /* synthetic */ dr a;
    private final /* synthetic */ View b;

    ds(dr drVar, View view) {
        this.a = drVar;
        this.b = view;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        MainActivity mainActivity;
        mainActivity = this.a.a;
        mainActivity.runOnUiThread(new dt(this, this.b));
    }
}
