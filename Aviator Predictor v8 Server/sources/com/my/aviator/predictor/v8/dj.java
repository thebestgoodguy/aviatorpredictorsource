package com.my.aviator.predictor.v8;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/* loaded from: classes62.dex */
class dj implements DialogInterface.OnClickListener {
    final /* synthetic */ dg a;
    private final /* synthetic */ EditText b;

    dj(dg dgVar, EditText editText) {
        this.a = dgVar;
        this.b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int r2) {
        MainActivity mainActivity;
        MainActivity mainActivity2;
        String str;
        MainActivity mainActivity3;
        String str2;
        MainActivity mainActivity4;
        MainActivity mainActivity5;
        Button button;
        MainActivity mainActivity6;
        MainActivity mainActivity7;
        MainActivity mainActivity8;
        LinearLayout linearLayout;
        mainActivity = this.a.a;
        mainActivity.i = this.b.getText().toString();
        mainActivity2 = this.a.a;
        str = mainActivity2.i;
        mainActivity3 = this.a.a;
        str2 = mainActivity3.h;
        if (!str.equals(str2)) {
            mainActivity4 = this.a.a;
            ej.a(mainActivity4.getApplicationContext(), "WRONG PASSWORD");
            return;
        }
        mainActivity5 = this.a.a;
        button = mainActivity5.o;
        button.setText("ACTIVE AVIATOR V8");
        mainActivity6 = this.a.a;
        ej.a(mainActivity6.getApplicationContext(), "CLICK THE BUTTON AGAIN");
        mainActivity7 = this.a.a;
        mainActivity7.g = true;
        mainActivity8 = this.a.a;
        linearLayout = mainActivity8.n;
        linearLayout.setVisibility(0);
    }
}
