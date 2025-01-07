package com.my.aviator.predictor.v8;

import android.view.View;
import java.util.TimerTask;

/* loaded from: classes62.dex */
class cv extends TimerTask {
    final /* synthetic */ cs a;
    private final /* synthetic */ View b;

    cv(cs csVar, View view) {
        this.a = csVar;
        this.b = view;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        GoogleActivity googleActivity;
        googleActivity = this.a.a;
        googleActivity.runOnUiThread(new cw(this, this.b));
    }
}
