package com.my.aviator.predictor.v8;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/* loaded from: classes62.dex */
public class DebugActivity extends Activity {
    private String[] a = {"StringIndexOutOfBoundsException", "IndexOutOfBoundsException", "ArithmeticException", "NumberFormatException", "ActivityNotFoundException"};
    private String[] b = {"Invalid string operation\n", "Invalid list operation\n", "Invalid arithmetical operation\n", "Invalid toNumber block operation\n", "Invalid intent operation"};

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = "";
        if (intent != null) {
            String stringExtra = intent.getStringExtra("error");
            String[] split = stringExtra.split("\n");
            int r3 = 0;
            while (true) {
                try {
                    String[] strArr = this.a;
                    if (r3 >= strArr.length) {
                        break;
                    }
                    if (split[0].contains(strArr[r3])) {
                        String str2 = this.b[r3];
                        int indexOf = split[0].indexOf(this.a[r3]) + this.a[r3].length();
                        StringBuilder sb = new StringBuilder(String.valueOf(str2));
                        String str3 = split[0];
                        sb.append(str3.substring(indexOf, str3.length()));
                        str = String.valueOf(sb.toString()) + "\n\nDetailed error message:\n" + stringExtra;
                        break;
                    }
                    r3++;
                } catch (Exception e) {
                    str = String.valueOf(str) + "\n\nError while getting error: " + Log.getStackTraceString(e);
                }
            }
            if (str.isEmpty()) {
                str = stringExtra;
            }
        }
        AlertDialog create = new AlertDialog.Builder(this).setTitle("An error occurred").setMessage(str).setPositiveButton("End Application", new cp(this)).create();
        create.show();
        ((TextView) create.findViewById(android.R.id.message)).setTextIsSelectable(true);
    }
}
