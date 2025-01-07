package com.my.aviator.predictor.v8;

import android.app.AlertDialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes62.dex */
class dg implements View.OnClickListener {
    final /* synthetic */ MainActivity a;

    dg(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z;
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2;
        AlertDialog.Builder builder3;
        AlertDialog.Builder builder4;
        AlertDialog.Builder builder5;
        Timer timer;
        TimerTask timerTask;
        z = this.a.g;
        if (z) {
            this.a.B = new dh(this);
            timer = this.a.a;
            timerTask = this.a.B;
            timer.schedule(timerTask, 1000L);
            return;
        }
        builder = this.a.D;
        builder.setIcon(R.drawable.aaaaaaa);
        builder2 = this.a.D;
        builder2.setTitle("AVIATOR PREDICTOR V8");
        LinearLayout linearLayout = new LinearLayout(this.a);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        EditText editText = new EditText(this.a);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        editText.setHint("Enter the Password");
        TextInputLayout textInputLayout = new TextInputLayout(this.a);
        textInputLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textInputLayout.setPadding(32, 8, 32, 8);
        textInputLayout.addView(editText);
        linearLayout.addView(textInputLayout);
        builder3 = this.a.D;
        builder3.setView(linearLayout);
        builder4 = this.a.D;
        builder4.setPositiveButton("ok", new dj(this, editText));
        builder5 = this.a.D;
        builder5.create().show();
    }
}
