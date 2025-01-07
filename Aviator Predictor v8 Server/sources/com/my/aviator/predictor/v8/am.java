package com.my.aviator.predictor.v8;

import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes62.dex */
class am implements Runnable {
    final /* synthetic */ al a;

    am(al alVar) {
        this.a = alVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        AviatorActivity aviatorActivity;
        TextView textView;
        AviatorActivity aviatorActivity2;
        ProgressBar progressBar;
        AviatorActivity aviatorActivity3;
        double d;
        AviatorActivity aviatorActivity4;
        ProgressBar progressBar2;
        aviatorActivity = this.a.a;
        textView = aviatorActivity.o;
        textView.setText("1.32x");
        aviatorActivity2 = this.a.a;
        progressBar = aviatorActivity2.p;
        aviatorActivity3 = this.a.a;
        d = aviatorActivity3.e;
        progressBar.setProgress((int) d);
        aviatorActivity4 = this.a.a;
        progressBar2 = aviatorActivity4.p;
        progressBar2.setVisibility(8);
    }
}
