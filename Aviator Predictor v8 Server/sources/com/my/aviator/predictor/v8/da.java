package com.my.aviator.predictor.v8;

import android.app.AlertDialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/* loaded from: classes62.dex */
class da implements View.OnClickListener {
    final /* synthetic */ Ibooo2Activity a;

    da(Ibooo2Activity ibooo2Activity) {
        this.a = ibooo2Activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        EditText editText;
        AlertDialog alertDialog;
        AlertDialog alertDialog2;
        AlertDialog alertDialog3;
        AlertDialog alertDialog4;
        EditText editText2;
        editText = this.a.r;
        if (editText.getText().toString().equals("")) {
            editText2 = this.a.r;
            editText2.setError("you didn't follow the rules");
            return;
        }
        this.a.x = new AlertDialog.Builder(this.a).create();
        View inflate = this.a.getLayoutInflater().inflate(R.layout.succes, (ViewGroup) null);
        alertDialog = this.a.x;
        alertDialog.setView(inflate);
        Button button = (Button) inflate.findViewById(R.id.bn);
        alertDialog2 = this.a.x;
        alertDialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        alertDialog3 = this.a.x;
        alertDialog3.setCancelable(false);
        alertDialog4 = this.a.x;
        alertDialog4.show();
        button.setOnClickListener(new db(this));
    }
}
