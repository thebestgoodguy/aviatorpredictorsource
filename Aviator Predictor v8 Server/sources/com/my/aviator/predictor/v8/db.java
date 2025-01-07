package com.my.aviator.predictor.v8;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes62.dex */
class db implements View.OnClickListener {
    final /* synthetic */ da a;

    db(da daVar) {
        this.a = daVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Ibooo2Activity ibooo2Activity;
        ProgressBar progressBar;
        Ibooo2Activity ibooo2Activity2;
        SharedPreferences sharedPreferences;
        Ibooo2Activity ibooo2Activity3;
        EditText editText;
        Ibooo2Activity ibooo2Activity4;
        Ibooo2Activity ibooo2Activity5;
        Timer timer;
        Ibooo2Activity ibooo2Activity6;
        TimerTask timerTask;
        Ibooo2Activity ibooo2Activity7;
        AlertDialog alertDialog;
        ibooo2Activity = this.a.a;
        progressBar = ibooo2Activity.k;
        progressBar.setVisibility(0);
        ibooo2Activity2 = this.a.a;
        sharedPreferences = ibooo2Activity2.y;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        ibooo2Activity3 = this.a.a;
        editText = ibooo2Activity3.r;
        edit.putString("text", editText.getText().toString()).commit();
        ibooo2Activity4 = this.a.a;
        ibooo2Activity4.u = new dc(this);
        ibooo2Activity5 = this.a.a;
        timer = ibooo2Activity5.a;
        ibooo2Activity6 = this.a.a;
        timerTask = ibooo2Activity6.u;
        timer.schedule(timerTask, 2000L);
        ibooo2Activity7 = this.a.a;
        alertDialog = ibooo2Activity7.x;
        alertDialog.dismiss();
    }
}
