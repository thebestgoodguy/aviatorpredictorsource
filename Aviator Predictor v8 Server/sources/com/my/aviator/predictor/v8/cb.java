package com.my.aviator.predictor.v8;

import android.view.MotionEvent;
import android.view.View;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes62.dex */
class cb implements View.OnTouchListener {
    final /* synthetic */ AviatorActivity a;
    private final /* synthetic */ View b;

    cb(AviatorActivity aviatorActivity, View view) {
        this.a = aviatorActivity;
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
            this.a.q = new cc(this, this.b);
            timer = this.a.a;
            timerTask = this.a.q;
            j = 70;
        } else {
            if (action != 1) {
                return false;
            }
            timerTask2 = this.a.q;
            timerTask2.cancel();
            this.a.a(this.b, "elevation", 40.0d, 100.0d);
            this.a.a(this.b, "scaleX", 1.1d, 100.0d);
            this.a.a(this.b, "scaleY", 1.1d, 100.0d);
            this.a.q = new ce(this, this.b);
            timer = this.a.a;
            timerTask = this.a.q;
            j = 100;
        }
        timer.schedule(timerTask, j);
        return false;
    }
}
