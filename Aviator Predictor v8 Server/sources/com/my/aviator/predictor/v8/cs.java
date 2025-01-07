package com.my.aviator.predictor.v8;

import android.view.MotionEvent;
import android.view.View;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes62.dex */
class cs implements View.OnTouchListener {
    final /* synthetic */ GoogleActivity a;
    private final /* synthetic */ View b;

    cs(GoogleActivity googleActivity, View view) {
        this.a = googleActivity;
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
            this.a.i = new ct(this, this.b);
            timer = this.a.a;
            timerTask = this.a.i;
            j = 70;
        } else {
            if (action != 1) {
                return false;
            }
            timerTask2 = this.a.i;
            timerTask2.cancel();
            this.a.a(this.b, "elevation", 40.0d, 100.0d);
            this.a.a(this.b, "scaleX", 1.1d, 100.0d);
            this.a.a(this.b, "scaleY", 1.1d, 100.0d);
            this.a.i = new cv(this, this.b);
            timer = this.a.a;
            timerTask = this.a.i;
            j = 100;
        }
        timer.schedule(timerTask, j);
        return false;
    }
}
