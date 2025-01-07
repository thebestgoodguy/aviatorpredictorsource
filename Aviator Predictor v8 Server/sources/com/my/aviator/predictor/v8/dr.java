package com.my.aviator.predictor.v8;

import android.view.MotionEvent;
import android.view.View;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes62.dex */
class dr implements View.OnTouchListener {
    final /* synthetic */ MainActivity a;
    private final /* synthetic */ View b;

    dr(MainActivity mainActivity, View view) {
        this.a = mainActivity;
        this.b = view;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Timer timer;
        TimerTask timerTask;
        long j;
        TimerTask timerTask2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.a(this.b, "elevation", 5.0d, 70.0d);
            this.a.a(this.b, "scaleX", 0.9d, 70.0d);
            this.a.a(this.b, "scaleY", 0.9d, 70.0d);
            this.a.z = new ds(this, this.b);
            timer = this.a.a;
            timerTask = this.a.z;
            j = 70;
        } else {
            if (action != 1) {
                return false;
            }
            timerTask2 = this.a.z;
            timerTask2.cancel();
            this.a.a(this.b, "elevation", 40.0d, 100.0d);
            this.a.a(this.b, "scaleX", 1.1d, 100.0d);
            this.a.a(this.b, "scaleY", 1.1d, 100.0d);
            this.a.z = new du(this, this.b);
            timer = this.a.a;
            timerTask = this.a.z;
            j = 100;
        }
        timer.schedule(timerTask, j);
        return false;
    }
}
